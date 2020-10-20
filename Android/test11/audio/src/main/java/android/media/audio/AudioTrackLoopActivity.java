package android.media.audio;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.R;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * Single channel, 44.1khz sample rate, 16bit depth per sample
 */
public class AudioTrackLoopActivity extends AppCompatActivity {

    private static final int SAMPLE_RATE = 44100;
    byte[] byteData = null;
    int bufSize;
    AudioTrack mAudioTrack = null;
    Thread playThread = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiotrack_main);

        final View playButton = findViewById(R.id.button);
        final View stopButton = findViewById(R.id.button2);

        readBytesExternal();
        initialize();

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                playThread.start();
                v.setEnabled(false);
                stopButton.setEnabled(true);
            }
        });
        //
        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    v.setEnabled(false);
                    playButton.setEnabled(true);
                if (mAudioTrack.getPlayState() == AudioTrack.PLAYSTATE_PLAYING) {
                    mAudioTrack.stop();
                    playThread = null;
                    initialize();
                }
            }
        });
    }

    public static final String MEDIA_PATH    = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Music";
    void readBytesExternal() {
//        File file = new File(MEDIA_PATH.concat("/starwars.wav"));
        File file = new File(MEDIA_PATH.concat("/terminator.wav"));
        byteData = new byte[(int)file.length()];
        FileInputStream in = null;

        try {
            in = new FileInputStream(file);
            in.read(byteData);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readBytesRaw() {

        InputStream inputStream = getResources().openRawResource(R.raw.starwars);
        try {
            byteData = new byte[ inputStream.available()];

            inputStream.read(byteData);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void initialize() {

        bufSize = AudioTrack.getMinBufferSize(
                SAMPLE_RATE,
                AudioFormat.CHANNEL_OUT_STEREO,
                AudioFormat.ENCODING_PCM_16BIT);

        // If you use MODE_STREAM AudioTrack needs to be filled with new samples continuously.
        mAudioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                SAMPLE_RATE,
                AudioFormat.CHANNEL_OUT_STEREO,
                AudioFormat.ENCODING_PCM_16BIT,
                bufSize,
                AudioTrack.MODE_STREAM);

//        playThread = new Thread(new PlayRunner());
        playThread = new PlayThread();
    }


    class PlayThread extends Thread {

        @Override public void run() {
            if(!PlayThread.interrupted()) {
                if (mAudioTrack != null) {
                    mAudioTrack.write(byteData, 0, byteData.length);
                    mAudioTrack.play();
                    mAudioTrack.flush();
//                    mAudioTrack.setLoopPoints(0, byteData.length, 6);
                }
            }
        }
    }

    class PlayRunner implements Runnable {

        @Override public void run() {
            if (mAudioTrack != null) {
                mAudioTrack.setLoopPoints(0, byteData.length, 6);
                mAudioTrack.write(byteData, 0, byteData.length);
                mAudioTrack.play();
            }
        }
    }

}
