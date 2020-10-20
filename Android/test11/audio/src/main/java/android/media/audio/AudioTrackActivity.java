package android.media.audio;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Sdk 23 이상에서 외부 SD Card 파일을 AudioTrack으로 재생하는 예제이다.
 * 오디오 채널은:
 *   - Single channel, 44.1khz sample rate, 16bit depth per sample
 */
public class AudioTrackActivity extends AppCompatActivity {

    private static String TAG = "AudioTrackActivity";
    private static final int SAMPLE_RATE = 44100;
    private static int REQUEST_READ_STORAGE_PERMISSION = 1;
    private static final String MEDIA_PATH =
            Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_MUSIC).getAbsolutePath();


    AudioTrack mAudioTrack = null;
    int MINBUFF_SIZE = AudioTrack.getMinBufferSize(
                        SAMPLE_RATE,
                        AudioFormat.CHANNEL_OUT_STEREO,
                        AudioFormat.ENCODING_PCM_16BIT);

    Thread playThread = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiotrack_main);

        final View playButton = findViewById(R.id.button);
        final View playStatic = findViewById(R.id.btnPlayStatic);
        final View stopButton = findViewById(R.id.button2);

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                v.setEnabled(false);

                // Need checkpermission above CompileSdkVersion = 23, Marshmallow.
                checkPermissionForReadExtertalStorage();
                streamFromFile();
//                playThread.start();
//                v.setEnabled(false);
                stopButton.setEnabled(true);
            }
        });
        //
        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    v.setEnabled(false);
                    playButton.setEnabled(true);

                    releaseAudioTrack();
            }
        });

        playStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Need checkpermission above CompileSdkVersion = 23, Marshmallow.
                checkPermissionForReadExtertalStorage();
                // play through static


            }
        });
    }

    private void releaseAudioTrack() {
        if(mAudioTrack != null) {
            mAudioTrack.flush();
            mAudioTrack.release();
        }
    }


    /*
     * There are two ways to feed data to AudioTrack's audio buffer
     * 1. Data feed type to Stream
     */
    private void streamFromFile() {
        byte[] byteData = new byte[512];
        File mediaFile = new File(MEDIA_PATH.concat("/starwars.wav"));
//        File mediaFile = new File(MEDIA_PATH.concat("/terminator.wav"));
        FileInputStream in = null;

        mAudioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                SAMPLE_RATE,
                AudioFormat.CHANNEL_OUT_STEREO,
                AudioFormat.ENCODING_PCM_16BIT,
                MINBUFF_SIZE,
                AudioTrack.MODE_STREAM);

        mAudioTrack.play();


        int i = 0;
        try {
            in = new FileInputStream(mediaFile);
            while( (i = in.read(byteData)) != -1) {
                mAudioTrack.write(byteData, 0, i);
                Log.d(getClass().getName(), i + " samples: " + Arrays.toString(byteData));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 2. Data feed type to static
     */
    private void staticFromFile() {
        File mediaFile = new File(MEDIA_PATH.concat("/starwars.wav"));
        FileInputStream fis = null;
        byte[] music = null;
        int FILE_BYTE_SIZE = 0;// command line: wc -c click.wav

        /*
         * WAV files always contain a header section of 44 bytes (11 frames)
         */
        try {
            fis = new FileInputStream(mediaFile);
            music = new byte[fis.available()-44];
            fis.read(music, 44*Byte.BYTES, music.length);
            fis.close();
        } catch ( Exception e) {
            e.printStackTrace();
        }
        mAudioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                SAMPLE_RATE,
                AudioFormat.CHANNEL_OUT_STEREO,
                AudioFormat.ENCODING_PCM_16BIT,
                FILE_BYTE_SIZE ,
                AudioTrack.MODE_STATIC);

        mAudioTrack.write(music, 0, music.length);
        mAudioTrack.play();
    }



//    String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE,
//        Manifest.permission.WRITE_EXTERNAL_STORAGE};

    // CompileSdkVersion = 23
    public boolean checkPermissionForReadExtertalStorage() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {

                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.READ_EXTERNAL_STORAGE)) {

                } else {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            REQUEST_READ_STORAGE_PERMISSION);
                }
            }
        }
        return false;
    }
    public void requestPermissionForReadExtertalStorage() throws Exception {
        try {
            ActivityCompat.requestPermissions( this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    REQUEST_READ_STORAGE_PERMISSION);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public  boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v(TAG,"Permission is granted");
                return true;
            } else {

                Log.v(TAG,"Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v(TAG,"Permission is granted");
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_READ_STORAGE_PERMISSION) {
            if (grantResults.length > 0 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.v(TAG, "Permission: " + permissions[0] + "was " + grantResults[0]);
                //resume tasks needing this permission
            }
        }
    }

    @Override
    protected void onDestroy() {
        releaseAudioTrack();
        super.onDestroy();
    }
}
