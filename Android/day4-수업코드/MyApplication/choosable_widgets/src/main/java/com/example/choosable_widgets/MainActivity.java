package com.example.choosable_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox cb1 = findViewById(R.id.checkBox);
        CheckBox cb2 = findViewById(R.id.checkBox2);

        RadioGroup rg = findViewById(R.id.radioGroup);

        ToggleButton tg = findViewById(R.id.toggleButton);
        Switch sw = findViewById(R.id.switch1);

        // checkbox event
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "Checked: " + b, Toast.LENGTH_SHORT).show();
            }
        });
        cb2.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "이미지선택: " + b, Toast.LENGTH_SHORT).show();

                ImageView iv = findViewById(R.id.imageView);
                if( b ) { // 이미지 보기
                    iv.setVisibility(View.VISIBLE);
                    iv.setImageResource(R.drawable.gosumdochi);

                } else {
                    iv.setImageResource(R.drawable.ic_launcher_foreground);
                }
            }
        });

        // Radio Group
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Toast.makeText(MainActivity.this, "RG selected: " + i, Toast.LENGTH_SHORT).show();

                switch (i) {
                    case R.id.radioButton:
                        break;
                    case R.id.radioButton2:
                        break;
                }

                if( i == R.id.radioButton) {

                } else if( i == R.id.radioButton2) {

                }
            }
        });


    }
}
