package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class test7_Loading extends AppCompatActivity {

    private TextView loadingTextView1;
    private int randomNo;
    private String[] loadingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7__loading);

        randomNo = ((int)(Math.random()*10));
        String[] loadingText = {
                "준비 중...",
                "레고 삼키는 중...",
                "병찬이 때리는 중...",
                "용준이 때리는 중...",
                "종희가 코딩 가르쳐 주는 중...",
                "밥 먹는 중...",
                "닭가슴살 삶는 중...",
                "게임 준비 중...",
                "점수 업데이트 중...",
                "구성 중...",
        };

        loadingTextView1 = (TextView) findViewById(R.id.loadingTextView1);
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
                Intent mainIntent = new Intent(test7_Loading.this, MainActivity.class);
                startActivity(mainIntent);
                test7_Loading.this.finish();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}