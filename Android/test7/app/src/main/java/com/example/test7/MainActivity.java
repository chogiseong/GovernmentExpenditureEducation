package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button
            button1, button2, button3, button4,
            button5, button6, button7, button8,
            button9, button10, button11, button12,
            button13, button14, button15, button16,
            button17, button18, button19, button20;

    private TextView textView1, textView2, textView3;

    private int count, randomNo;
    private String firstGame1[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        count = 0;
        randomNo = ((int)(Math.random()*10)+1);



    }
}