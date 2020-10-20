package android.media.audio;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.media.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;

public class AudioRecorderActivity2 extends Activity implements OnClickListener {

    private AudioRecord mAudioInput;
    private int         mReadSize;
    private boolean     mRunFlag;
    private ProgressBar mProgressBar;
    private final int   MAX_PROGRESSBAR = 50000;
    private int         mCurrentFrequency;
    private Handler     mHandler;

    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiorecorder2);
        
        readyAudioDevie();
        loadWidget();
    }
    
    private void loadWidget(){
        findViewById(R.id.BT_start).setOnClickListener(this);
        findViewById(R.id.BT_stop).setOnClickListener(this);
        
        mProgressBar = (ProgressBar)findViewById(R.id.PB_output_sound);
        
        /* ProgressBar의 가로 최고치의 값을 설정한다. 
         * 이 값은 정확한 값이 아니며 어느정도 단말기의 통계를 수집해서 측정할 것
         * 이어마이크를 장착한경우, 블루투스, 일반 상태등의 경우를 고려해 볼 것*/
        mProgressBar.setMax(MAX_PROGRESSBAR);
        
        /* 음이 감지되면 ProgressBar를 변경 시킨다. */
        mHandler    = new Handler();
        
    }

    private void readyAudioDevie(){
        int sampleRate = 8000;//8000 44100, 22050 and 11025 
        int channelConfig = AudioFormat.CHANNEL_CONFIGURATION_MONO; 
        int audioFormat = AudioFormat.ENCODING_PCM_16BIT;
        
        mReadSize = AudioRecord.getMinBufferSize(
                sampleRate, 
                channelConfig,
                audioFormat);
        mAudioInput = new AudioRecord(
                MediaRecorder.AudioSource.MIC, 
                sampleRate,
                channelConfig,
                audioFormat, 
                mReadSize);
        
    }
    
    /* 쓰레드 사용을 좀더 효율적으로 변경할 필요는 있음 예를 Looper thread등으로 (안드로이드 정복책 참조요)*/
    private void startSensingAudioInput(){
        
        final short[] buffer = new short[mReadSize];
        mAudioInput.startRecording();
        mRunFlag = true;
        
        new Thread( new Runnable( ) 
        {
            public void run( )
            {               
                while( mRunFlag )
                {
                    // Audio 입력된 것을 읽는다. buffer의 값이 소리 db 출력이 된다. 양수 음수 나온다. 
                    mAudioInput.read(buffer, 0, mReadSize); // record data from mic into buffer
                    for(int i=0;i<buffer.length;i++){
                        /*소리 DB가 어느 일정량 이상일 때 원하는 소리로 정의하고  프로그래스바에 값을 넣어 준다.*/
                        if(buffer[i] > 10000)
                        {
                            mCurrentFrequency = buffer[i];
                            Log.d("","Audio Input "+i+": "+buffer[i]);
                            
                        }else{
                            mCurrentFrequency = 0;
                        }
                        
                        mHandler.post(new Runnable() {
                            
                            @Override
                            public void run() {
                                mProgressBar.setProgress(mCurrentFrequency);
                                
                            }
                        });

                        
                    }
//                  SystemClock.sleep(600);
                    
                }     
                // mAudioInput.stop();
            }
        } ).start();
    }

    private void stopSensingAudioInput(){
        mRunFlag = false;
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
        case R.id.BT_start:
            startSensingAudioInput();
            break;
        case R.id.BT_stop:
            stopSensingAudioInput();
            break;
        }
        
    }


    @Override
    protected void onDestroy() {
        if(mAudioInput != null){
            if(mAudioInput.getRecordingState() == AudioRecord.RECORDSTATE_RECORDING){
                stopSensingAudioInput();
            }
            mAudioInput.release();
        }
        super.onDestroy();
    }
    
    
    

}

