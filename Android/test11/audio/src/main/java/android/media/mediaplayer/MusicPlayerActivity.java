package android.media.mediaplayer;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MusicPlayerActivity extends Activity {

    private static final String MEDIA_PATH = Environment
            .getExternalStorageDirectory().getAbsolutePath().concat("/Music/");

    ListView mListview;
    private ArrayList<FileItem> mAudioList;
    private MediaPlayer mPlayer;

    private boolean is_autoplay = false; //다음 곡 자동 재생
    private int currentPosition = 0;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer_songlist);
        setTitle("Audio player");

        final ActionBar bar = getActionBar();

        mListview = (ListView) findViewById(R.id.listView1);
        mListview.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                    int position, long arg3) {


                Intent intent = new Intent(MusicPlayerActivity.this,
                        PlayActivity.class);
                intent.putExtra("song", mAudioList.get(position).getFilepath());

                startActivity(intent);

            }
        });

        mAudioList = loadAudioFiles();
        MediaListAdapter adapter = new MediaListAdapter(this,
                android.R.layout.simple_list_item_1, mAudioList);
        mListview.setAdapter(adapter);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        stopAudio();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_musicplayer, menu);
        return true;
    }

    private void playAudio(String filepath) throws IllegalArgumentException,
            IllegalStateException, IOException {
        mPlayer = new MediaPlayer();
        mPlayer.setDataSource(filepath);
        mPlayer.prepare();
        mPlayer.start();

        mPlayer.setOnCompletionListener(new OnCompletionListener() {

            public void onCompletion(MediaPlayer arg0) {
                if(is_autoplay)
                    nextSong();
            }

        });
    }

    private void stopAudio() {
        if (mPlayer != null) {
            mPlayer.reset();
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void onClickPause(View v) {
        if (mPlayer != null) {
            if (mPlayer.isPlaying()) {
                mPlayer.pause();
                Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
            } else {
                mPlayer.start();
                Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClickStop(View v) {
        stopAudio();
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }

    private void nextSong() {
        if (++currentPosition >= mAudioList.size()) {
            currentPosition = 0;
        } else {
            try {
                playAudio(MEDIA_PATH + mAudioList.get(currentPosition));
            } catch (IllegalArgumentException | IllegalStateException
                    | IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    void playMusicItem(int position) {
        stopAudio();
        String filepath = mAudioList.get(position).getFilepath();

        try {
            playAudio(filepath);
        } catch (IllegalArgumentException | IllegalStateException
                | IOException e) {
            e.printStackTrace();
        }

    }

    private ArrayList<FileItem> loadAudioFiles() {
        ArrayList<FileItem> items = new ArrayList<FileItem>();

        String[] proj = { MediaStore.Audio.Media._ID,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Audio.Media.DATA };
        Cursor cursor = managedQuery(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, proj, null, null,
                null);

        int indexName = cursor
                .getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME);
        int indexData = cursor
                .getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);

        if (cursor.moveToFirst()) {
            do {
                items.add(new FileItem(cursor.getString(indexName), cursor
                        .getString(indexData)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return items;
    }

    public ArrayList<FileItem> updateSongList() {
        ArrayList<FileItem> items = new ArrayList<FileItem>();
        File home = new File(MEDIA_PATH);
        File[] fileLists = home.listFiles(new Mp3Filter());
        for (int i = 0; i < fileLists.length; i++) {
            items.add(new FileItem(String.valueOf(i), fileLists[i].getName()));
        }
        return items;
    }


    class Mp3Filter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            return (name.endsWith(".mp3"));
        }
    }
}
