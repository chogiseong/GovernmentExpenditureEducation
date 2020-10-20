package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoadingActivity extends AppCompatActivity {

    private TextView loadingTextView1;
    private int randomNo;
    private String[] loadingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        randomNo = ((int)(Math.random()*10));
        String[] loadingText = {
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"노는게 제일 좋아\" \n" + "-Pororo-",
                "\"머선129\"\n"+"-2400-",
                "로딩 중...",
                "로딩 중...",
        };

        loadingTextView1 = (TextView) findViewById(R.id.loadingTextView);
        loadingTextView1.setText(loadingText[randomNo]);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Runnable runnable = new Runnable(){
            @Override public void run(){
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                Intent mainIntent = new Intent(LoadingActivity.this, LoginActivity.class);
                startActivity(mainIntent);
                LoadingActivity.this.finish();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}