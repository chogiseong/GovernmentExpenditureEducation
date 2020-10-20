package android.media.audio;

import java.io.File;
import java.io.IOException;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Binder;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;

public class MediaPlayerService extends Service implements Runnable {

	MediaPlayer audio_play;
	MediaRecorder meR;
	File mMediafile;
	private IBinder binder = new IncrementBinder();
	private Thread thread;
	private boolean isRun = true;
	private int count;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		isRun = true;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void onDestroy() {
		isRun = false;

		super.onDestroy();

	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		Log.d("mycat", "날짜를 찾아서 보내주는 곳입니다.");
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		return START_NOT_STICKY;
	}

	class IncrementBinder extends Binder {

		public void Urimediaplay() {
			audio_play = new MediaPlayer();
			audio_play = MediaPlayer
					.create(getBaseContext(),
							Uri.parse("http://blog.magicboy.net/wp-content/uploads/2007/05/steve_jobs_stanford_commencement_speech.mp3"));
			audio_play.start();

		}

		public void assetmediaplay(String string) {
			// AssetFileDescriptor afd;
			audio_play = new MediaPlayer();
			try {

				// afd = getAssets().openFd("audio/"+string);
				File path = Environment.getExternalStorageDirectory();

				audio_play.setDataSource(path.getAbsolutePath() + "/" + string);
				audio_play.prepare();
				audio_play.start();

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		public void stopAudio() {
			if (audio_play != null) {
				audio_play.stop();
				audio_play.release();
			}
		}

		public void recordMedi() throws Exception {
			meR = new MediaRecorder();
			audio_play = new MediaPlayer();
			meR.setAudioSource(MediaRecorder.AudioSource.MIC);
			meR.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
			meR.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
			if (mMediafile == null) {
				File rootDir = Environment.getExternalStorageDirectory();
				mMediafile = File.createTempFile("Record", ".mp3", rootDir);
			}
			meR.setOutputFile(mMediafile.getAbsolutePath());
			meR.prepare();
			meR.start();

		}

		public void stopRecording() {
			if (meR != null) {
				meR.release();

			}
		}

		public void playRecording() throws IOException {
			File rootDir = Environment.getExternalStorageDirectory();
			String dr = "/Record.mp3";
			audio_play.setDataSource(rootDir + dr);
			audio_play.prepare();
			audio_play.start();

		}
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return binder;
	}

	public void run() {
		while (isRun) {
			try {
				Log.i("isRun", "Service is called : " + count);
				Thread.sleep(5000);
			} catch (Exception ex) {
				Log.e("isRunError", ex.getMessage());
			}
		}		
	}
}
