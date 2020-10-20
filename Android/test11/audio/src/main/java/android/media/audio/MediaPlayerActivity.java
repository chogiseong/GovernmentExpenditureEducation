package android.media.audio;

import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.R;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

/**
 * Android Sdk 21 이전의 방법으로 외부 자원 파일을 읽어 재생하는 예제이다.
 */
public class MediaPlayerActivity extends Activity {

    private AudioManager audioManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume = audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar volControl = (SeekBar) findViewById(R.id.seekbar);
        volControl.setMax(maxVolume);
        volControl.setProgress(curVolume);
        volControl
                .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // TODO Auto-generated method stub

                    }

                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // TODO Auto-generated method stub

                    }

                    public void onProgressChanged(SeekBar seekBar,
                            int progress, boolean fromUser) {
                        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                                progress, 0);
                    }
                });

        // Uri
        Button button = (Button) findViewById(R.id.btn_play);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(0);
            }
        });
        Button button_stop = (Button) findViewById(R.id.btn_play_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAudio();
            }
        });

        Button button1 = (Button) findViewById(R.id.btn_play1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(1);
            }
        });

        Button button_stop1 = (Button) findViewById(R.id.btn_play_stop1);
        button_stop1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAudio();
            }
        });

        Button button5 = (Button) findViewById(R.id.btn_play2);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(3);
            }
        });

        Button button_stop2 = (Button) findViewById(R.id.btn_play_stop2);
        button_stop2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAudio();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /*
     * 
     * 
     * @Override public boolean onKeyDown(int keyCode, KeyEvent event) { if
     * (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
     * 
     * audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,
     * AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI); return true; //
     * 미디어볼륨 팝업만 나오게 한다. }
     * 
     * if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
     * 
     * audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,
     * AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI); return true; //
     * 미디어볼륨 팝업만 나오게 한다. } return super.onKeyDown(keyCode, event); }
     */

    MediaPlayer audio_play = null;
    // Steve jobs:
    // String sampleMp3 =
    // "http://blog.magicboy.net/wp-content/uploads/2007/05/steve_jobs_stanford_commencement_speech.mp3";
    String sampleMp3 = "http://www.archive.org/download/SteveJobsSpeechAtStanfordUniversity/SteveJobsSpeech_64kb.mp3";

    /*
     * 사운드 재생
     */
    protected void playSound(int i) {
        switch (i) {
        case 0:
            // Uri 플레이
            audio_play = MediaPlayer.create(getBaseContext(),
                    Uri.parse(sampleMp3));
            if (!audio_play.isPlaying()) {
                audio_play.start();
            }
            break;
        case 1:
            // 패키지의 assets/audio플레이
            AssetFileDescriptor afd;
            audio_play = new MediaPlayer();

            if (!audio_play.isPlaying()) {

                try {
                    afd = getAssets().openFd("audio/three_bears.mp3");
                    audio_play.setDataSource(afd.getFileDescriptor(),
                            afd.getStartOffset(), afd.getLength());
                    audio_play.prepare();
                    audio_play.start();
                    afd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
        case 3:
            // 리소스 res/raw/oh.mp3 플레이
            audio_play = MediaPlayer
                    .create(getBaseContext(), R.raw.three_bears);
            if (!audio_play.isPlaying()) {

                audio_play.start();
            }
            break;
        case 4:
            // 파일시스템의 /data/oh.mp3 플레이
            // audio_play = new MediaPlayer();
            // audio_play.setDataSource("/data/oh.mp3");
            // audio_play.start();
            break;
        case 5:
            /*
             * This opens up to view all the files, but only plays one at a
             * time, without playlists or continuing to next track
             */
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("audio/*");
            // startActivity(intent);
            startActivity(Intent.createChooser(intent, "Select music"));

            break;
        case 6:
            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            intent2.setDataAndType(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                    "audio/*");
            startActivity(intent2);
            break;
        }

        // audio_play.release();
    }

    protected void stopAudio() {
        if (audio_play != null) {
            audio_play.stop();
            audio_play.release();
        }
    }
}
