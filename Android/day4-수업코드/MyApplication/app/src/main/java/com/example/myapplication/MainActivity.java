package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.framelayout_practice);
////
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("My_Click", "버튼이 눌려졌어요.");
//
//                Toast t = Toast.makeText(MainActivity.this, "버튼을 클릭했어요", Toast.LENGTH_SHORT);
//                t.show();
//
//
//                Toast.makeText(MainActivity.this, "버튼을 클릭했어요", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//
//        Log.i("My_Test:", "MainActivity running....");
//        Log.d("My_Test:", "MainActivity Debugging...");
//        Log.w("My_Test:", "MianActivity Warning...");


    }

}