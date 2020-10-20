package android.media.soundpool;



import android.app.Activity;
import android.content.Intent;
import android.media.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SoundManagerActivity2 extends Activity {
    private Button mChangeActivityButton;
	private Button mPlaySound1Button;
	private Button mPlaySound2Button;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundmanager2);
        
        
        mChangeActivityButton = (Button) this.findViewById(R.id.ChangeActivity);
        mChangeActivityButton.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  Intent StartGameIntent = new Intent(SoundManagerActivity2.this, SoundManagerActivity.class);
                  startActivity(StartGameIntent);
        	  }
        	});
        
        mPlaySound1Button = (Button) this.findViewById(R.id.PlaySound1);
        mPlaySound1Button.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  SoundManager.playSound(1, 1);
        	  }
        	});
        
        mPlaySound2Button = (Button) this.findViewById(R.id.PlaySound2);
        mPlaySound2Button.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  SoundManager.playSound(2, 1);
        	  }
        	});
        

    }
}