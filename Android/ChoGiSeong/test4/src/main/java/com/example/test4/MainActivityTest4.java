package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivityTest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test4);

        CheckBox cb1 = findViewById(R.id.checkBox);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if( b ){
                    TextView tv = findViewById(R.id.textView1);
                    RadioGroup rg = findViewById(R.id.radioGroup);
                    Button bt = findViewById(R.id.button1);
                    ImageView iv = findViewById(R.id.imageView1);

                    tv.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    bt.setVisibility(View.VISIBLE);
                    iv.setVisibility(View.VISIBLE);

                    bt.setOnClickListener(new View.OnClickListener() {

                        RadioGroup rg = findViewById(R.id.radioGroup);
                        ImageView iv = findViewById(R.id.imageView1);

                        @Override
                        public void onClick(View view) {
                            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                Button bt = findViewById(R.id.button1);
                                ImageView iv = findViewById(R.id.imageView1);

                                @Override
                                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                                    if( i == R.id.radioButton1){
                                        int a = 0;
                                    }else if( i == R.id.radioButton2){
                                        int a = 1;
                                    }else{
                                        int a = 2;
                                    }
                                }
                            });
                        }
                    });

                }
            }
        });
    }
}
