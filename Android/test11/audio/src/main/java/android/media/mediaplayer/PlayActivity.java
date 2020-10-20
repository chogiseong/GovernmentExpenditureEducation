package android.media.mediaplayer;

import java.io.IOException;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class PlayActivity extends Activity {
    private static final String MEDIA_PATH = Environment
            .getExternalStorageDirectory().getAbsolutePath().concat("/Music/");

    private int currentPosition = 0;
    private MediaPlayer mp = new MediaPlayer();

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer);

        //
//        final ActionBar bar = getActionBar();
//        if(bar != null) {
//            bar.setDisplayHomeAsUpEnabled(true);
//            // bar.setNavigationMode(ActionBar.DISPLAY_HOME_AS_UP);
//        }

        String song = getIntent().getStringExtra("song");

        playSong(MEDIA_PATH + song);

        TextView title = (TextView)findViewById(R.id.music_title);
        title.setText( song);
        //title.setText(song.substring( song.lastIndexOf("/") ));
        
    }

    @Override
    public void onDestroy() {
        stopAudio();

        super.onDestroy();
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {

        final int id = item.getItemId();
        switch (id) {
        case android.R.id.home:
            finish();
            break;
        }

        return super.onMenuItemSelected(featureId, item);
    }

    private void playSong(String songPath) {
        try {

            mp.reset();
            mp.setDataSource(songPath);
            mp.prepare();
            mp.start();

            // Setup listener so next song starts automatically
            mp.setOnCompletionListener(new OnCompletionListener() {

                public void onCompletion(MediaPlayer arg0) {
                    // nextSong();
                }

            });

        } catch (IOException e) {
            Log.v(getString(R.string.app_name), e.getMessage());
        }
    }

    //
    // private void nextSong() {
    // if (++currentPosition >= songs.size()) {
    // // Last song, just reset currentPosition
    // currentPosition = 0;
    // } else {
    // // Play next song
    // playSong(MEDIA_PATH + songs.get(currentPosition));
    // }
    // }

    protected void stopAudio() {
        if (mp != null) {
            mp.stop();
            mp.release();
        }
    }
}
