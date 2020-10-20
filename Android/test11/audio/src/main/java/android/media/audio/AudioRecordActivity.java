package android.media.audio;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.R;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AudioRecordActivity extends Activity {
    private MediaPlayer mPlayer = null;
    private MediaRecorder mRecorder = null;
    private Button mRecordButton;
    private TextView mStatusTextView;
    private Button mPlayButton;
    private String mFilepath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiorecord);
        setTitle("ch12 / Audio Record");

        mRecordButton = (Button) findViewById(R.id.recordButton);
        mRecordButton.setText("Start Recording");

        mPlayButton = (Button) findViewById(R.id.playButton);
        mPlayButton.setText("Play");
        mPlayButton.setEnabled(false);

        mStatusTextView = (TextView) findViewById(R.id.statusText);
        mStatusTextView.setText("status: none");

        mFilepath = new File(Environment.getExternalStorageDirectory(), "audio.3gp").toString();
    }

    @Override
    protected void onDestroy() {
        if (mRecorder != null) {
            mRecorder.stop();
            mRecorder.release();
        }
        if (mPlayer != null) {
            mPlayer.reset();
            mPlayer.release();
        }
        super.onDestroy();
    }

    public void onClickRecord(View v) throws IllegalStateException, IOException {
        if (mRecorder == null) {
            mRecorder = new MediaRecorder();
            mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            mRecorder.setOutputFile(mFilepath);
            mRecorder.prepare();
            mRecorder.start();

            mRecordButton.setText("Stop Recording");
            mStatusTextView.setText("status: Recording Now..");
            mPlayButton.setEnabled(false);
        } else {
            mRecorder.stop();
            mRecorder.release();
            mRecorder = null;

            mRecordButton.setText("Start Recording");
            mStatusTextView.setText("status: none");
            mPlayButton.setEnabled(true);
        }
    }

    public void onClickPlay(View v) throws IllegalArgumentException, IllegalStateException, IOException {
        if (mPlayer != null) {
            mPlayer.reset();
            mPlayer.release();
        }

        mPlayer = new MediaPlayer();
        mPlayer.setDataSource(mFilepath);
        mPlayer.prepare();
        mPlayer.start();
    }
}
