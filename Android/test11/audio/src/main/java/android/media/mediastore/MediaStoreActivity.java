package android.media.mediastore;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.media.R;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MediaStoreActivity extends Activity implements
        MediaScannerConnectionClient {
    MediaRecorder mRecorder;
    File mSampleFile = null;
    static final String SAMPLE_PREFIX = "recording";
    static final String SAMPLE_EXTENSION = ".mp3"; // ".3gp"
    private static final String TAG = "media";

    Button play, delete;
    ImageView imgView;

    private OnCompletionListener completionListener = new OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            play.setText("Play Again...");
            mp.release();
        }
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediastore);
        mRecorder = new MediaRecorder();

        Button startRecording = (Button) findViewById(R.id.startrecording);
        play = (Button) findViewById(R.id.play);
        delete = (Button) findViewById(R.id.delete);
        Button startCapture = (Button) findViewById(R.id.startcapture);
        imgView = (ImageView) findViewById(R.id.image);

        startRecording.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startMediaStoreRecording();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playAudio();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                deleteAudio();
            }
        });

        startCapture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startMediaStoreCapture(v);
            }

        });
    }

    // MediaStore 를 이용한 Intent
    public void startMediaStoreRecording() {
        Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
        startActivityForResult(intent, 0);
    }

    // MediaStore를 이용한 이미지 캡쳐
    public void startMediaStoreCapture(View view) {
        ContentValues values = new ContentValues();
        values.put(Media.TITLE, "내 캡쳐 이미지");
        values.put(Media.DESCRIPTION, "내 캡쳐 이미지 by Camera via Intent");

        capturedImagePath = getContentResolver().insert(
                Media.EXTERNAL_CONTENT_URI, values);

        // 파일에서 작성되면 Media.TITLE 같은 부가적 정보를 지정 못한다.
        // capturedImagePath = Uri.fromFile( new File("/sdcard/mypicture.jpg"));
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, capturedImagePath);

        startActivityForResult(intent, 1);
    }

    private void deleteAudio() {
        // TODO 확인 창을 하나 띄우는 것도...
        if (getContentResolver().delete(recordedAudioPath, null, null) == 1) {
            Toast.makeText(this, "삭제 성공!!!", Toast.LENGTH_SHORT).show();
            play.setText("No Audio");
            // TODO animation을 주거나 TimerTask로 지연...
            delete.setVisibility(View.GONE);
        }
    }

    private void playAudio() {
        /*
         * Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
         * intent.setType("audio/*"); // startActivity(intent);
         * startActivity(Intent.createChooser(intent, "Select music"));
         */

        MediaPlayer audio_play = new MediaPlayer();
        audio_play.setOnCompletionListener(completionListener);
        try {
            audio_play.setDataSource(this, recordedAudioPath);
            audio_play.prepare();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        audio_play.start();
    }

    Uri recordedAudioPath, capturedImagePath;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        case 0:
            if (resultCode == RESULT_OK) {
                recordedAudioPath = data.getData();
                play.setText("Play audio!!!");
                delete.setVisibility(View.VISIBLE);
            }
            break;
        case 1:
            if (resultCode == RESULT_OK) {
                imgView.setVisibility(View.VISIBLE);
                imgView.setImageURI(capturedImagePath);

                // 만약 URI 를 인텐트에 전달하지 않고 카메라를 시작하면 Bitmap이 return 된다.
                // intent data로 50k size의 원래 이미지에서 scale down 되어 전달된다.
                // Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            }
        }
    }

    @Override
    public void onMediaScannerConnected() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onScanCompleted(String path, Uri uri) {
        // TODO Auto-generated method stub

    }

    /*
     * private MediaScannerConnection conn;
     * 
     * public void startScan(View view) { if(conn!=null) { conn.disconnect(); }
     * 
     * filename = editText.getText().toString();
     * 
     * File fileCheck = new File(filename); if(fileCheck.isFile()) { conn = new
     * MediaScannerConnection(this, this); conn.connect(); } else {
     * Toast.makeText(this, "That file does not exist",
     * Toast.LENGTH_SHORT).show(); } }
     * 
     * @Override public void onMediaScannerConnected() { conn.scanFile(filename,
     * null); }
     * 
     * @Override public void onScanCompleted(String path, Uri uri) { try { if
     * (uri != null) { Intent intent = new Intent(Intent.ACTION_VIEW);
     * intent.setData(uri); startActivity(intent); } else {
     * Log.e("MediaScannerDemo", "That file is no good"); } } finally {
     * conn.disconnect(); conn = null; } }
     */
}