package android.media.audio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.R;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MediaPlayerServiceMain extends Activity implements
		OnClickListener, ServiceConnection {
	private Thread thread;
	private MediaPlayerService.IncrementBinder binder;

	String filename;
	int a = 0;
	int size = 0;
	int number = 0;

	ArrayList<String> items;

	TextView text;

	Button Uriaudioplay_btn1;
	Button Uriaudiostop_btn2;
	Button Assetaudioplay_btn3;
	Button AssetaudioPost_btn3;
	Button AssetaudioNext_btn4;
	Button Recording_btn5;
	Button stoprecording_btn6;
	Button playRecording_btn7;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mediaplayer_service);
		Intent intentService = new Intent(getBaseContext(),
				MediaPlayerService.class);
		// startService(intentService);

		// startService(intentService);
		ComponentName serviceName = startService(intentService);
		if (serviceName == null)
			Log.d("mycat", " serviceName ... NULL ...");
		else
			Log.d("mycat", " serviceName ... OK ...");


		Intent intene = new Intent(getBaseContext(), MediaPlayerService.class);
		bindService(intene, this, Context.BIND_AUTO_CREATE);

		Uriaudioplay_btn1 = new Button(this);
		Uriaudiostop_btn2 = new Button(this);
		Assetaudioplay_btn3 = new Button(this);
		AssetaudioPost_btn3 = new Button(this);
		AssetaudioNext_btn4 = new Button(this);
		Recording_btn5 = new Button(this);
		stoprecording_btn6 = new Button(this);
		playRecording_btn7 = new Button(this);

		items = new ArrayList<String>();
		text = (TextView) findViewById(R.id.textView1);

		Uriaudioplay_btn1 = (Button) findViewById(R.id.uri_audioplay);
		Uriaudiostop_btn2 = (Button) findViewById(R.id.uri_audiostop);
		Assetaudioplay_btn3 = (Button) findViewById(R.id.asset_audioplay);
		AssetaudioPost_btn3 = (Button) findViewById(R.id.button1);
		AssetaudioNext_btn4 = (Button) findViewById(R.id.asset_audiostop);
		Recording_btn5 = (Button) findViewById(R.id.Recording);
		stoprecording_btn6 = (Button) findViewById(R.id.stopRecording);
		playRecording_btn7 = (Button) findViewById(R.id.recordingplay);

		Uriaudioplay_btn1.setOnClickListener(this);
		Uriaudiostop_btn2.setOnClickListener(this);
		Assetaudioplay_btn3.setOnClickListener(this);
		AssetaudioPost_btn3.setOnClickListener(this);
		AssetaudioNext_btn4.setOnClickListener(this);
		Recording_btn5.setOnClickListener(this);
		stoprecording_btn6.setOnClickListener(this);
		playRecording_btn7.setOnClickListener(this);

		restview();
		size = items.size();

	}

	private void restview() {
		File f = new File(Environment.getExternalStorageDirectory()
				.getAbsolutePath());
		if (f != null) {
			items.clear();
			for (File fi : f.listFiles()) {
				items.add(fi.getName());

			}
		}
	}

	public String insertlist(int index) {
		filename = items.get(index).toString();
		return filename;
	}

	public void onClick(View v) {
		if (v == Uriaudioplay_btn1) {
			binder.Urimediaplay();
		} else if (v == Uriaudiostop_btn2) {
			binder.stopAudio();
		} else if (v == Assetaudioplay_btn3) {

			if (a == 0) {
				insertlist(number);
				binder.assetmediaplay(filename);
				a = 1;
			} else if (a == 1) {
				binder.stopAudio();
				a = 0;
			}
			text.setText(filename);
		} else if (v == AssetaudioNext_btn4) {

			if (number != items.size()) {
				if (a == 0) {
					number += 1;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 1;
				} else if (a == 1) {
					binder.stopAudio();
					number++;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 0;
				}
			} else if (number > items.size()) {

				if (a == 0) {
					binder.stopAudio();
					number = 0;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 1;
				} else if (a == 1) {
					binder.stopAudio();
					number++;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 0;
				}
			}

		} else if (v == AssetaudioPost_btn3) {

			if (number > 0) {
				if (a == 0) {
					binder.stopAudio();
					number -= 1;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 1;
				} else if (a == 1) {
					binder.stopAudio();
					number -= 1;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 0;
				}
			} else if (number < 0) {

				if (a == 0) {
					number = items.size();
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 1;
				} else if (a == 1) {
					binder.stopAudio();
					number -= 1;
					insertlist(number);
					binder.assetmediaplay(filename);
					text.setText(filename);
					a = 0;
				}
			}
		} else if (v == Recording_btn5) {
			try {
				binder.recordMedi();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (v == stoprecording_btn6) {
			binder.stopRecording();
		} else if (v == playRecording_btn7) {
			try {
				binder.playRecording();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onServiceConnected(ComponentName name, IBinder service) {
		Log.d("cat", "ServiceTest onService... ~~~~~~");
		binder = (MediaPlayerService.IncrementBinder) service;

	}

	public void onServiceDisconnected(ComponentName name) {
		Log.d("cat", "ServiceTest Disconnected... ~~~~~~");
		binder = null;
	}
}