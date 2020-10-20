package android.media.soundpool;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.R;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundPoolActivity extends Activity {
   SoundPool pool;
   int mStreamId;

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_soundpool);

      pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
      mStreamId = pool.load(this, R.raw.three_bears, 1);

      findViewById(R.id.play1).setOnClickListener(mClickListener);
      findViewById(R.id.play2).setOnClickListener(mClickListener);
      findViewById(R.id.play3).setOnClickListener(mClickListener);
      findViewById(R.id.play4).setOnClickListener(mClickListener);
      findViewById(R.id.play5).setOnClickListener(mClickListener);
      findViewById(R.id.play6).setOnClickListener(mClickListener);
   }
   
   @Override
   protected void onDestroy() {
       super.onDestroy();
       pool.stop(mStreamId);
       pool = null;
   };

   Button.OnClickListener mClickListener = new Button.OnClickListener() {
      public void onClick(View v) {
         switch (v.getId()) {
            case R.id.play1:
               pool.stop(mStreamId);
               pool.play( mStreamId, 1, 1, 0, 0, 1);
               break;
            case R.id.play2:
               pool.stop(mStreamId);
               pool.play( mStreamId, 0.5f, 0.5f, 0, 0, 1);
               break;
            case R.id.play3:
               pool.stop(mStreamId);
               pool.play( mStreamId, 1, 1, 0, 2, 1);
               break;
            case R.id.play4:
               pool.stop(mStreamId);
               pool.play( mStreamId, 1, 1, 0, 0, 0.5f);
               break;
            case R.id.play5:
               pool.stop(mStreamId);
               pool.play( mStreamId, 1, 1, 0, 0, 2);
               break;

            case R.id.play6:
               pool.stop(mStreamId);
               pool.play( mStreamId, 1, 1, 0, 0, 3);
               break;
         }

      }
   };

}