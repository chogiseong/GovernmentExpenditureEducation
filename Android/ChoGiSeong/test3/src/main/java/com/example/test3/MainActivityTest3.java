package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivityTest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test3);

        CheckBox cb1 = findViewById(R.id.checkBox);
        CheckBox cb2 = findViewById(R.id.checkBox2);

        RadioGroup rg = findViewById(R.id.radioGroup);


        ToggleButton tg = findViewById(R.id.toggleButton);
        Switch sw = findViewById(R.id.switch2);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivityTest3.this, "췍", Toast.LENGTH_SHORT).show();
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivityTest3.this, "췍", Toast.LENGTH_SHORT).show();
                ImageView iv = findViewById(R.id.imageView);
                if( b ){
                    iv.setImageResource(R.drawable.cat);
                }else{
                    iv.setImageResource(R.drawable.ic_launcher_background);
                }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Toast.makeText(MainActivityTest3.this, "쎌렉티드", Toast.LENGTH_SHORT).show();
                if( i == R.id.radioButton4){
                    Toast.makeText(MainActivityTest3.this, "첫번째라디오븥은", Toast.LENGTH_SHORT).show();
                }else if ( i == R.id.radioButton5){
                    Toast.makeText(MainActivityTest3.this, "두번째라디오븥은", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivityTest3.this, "세번째라디오븥은", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
