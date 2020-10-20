package com.example.chogiseong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_main);


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int kor, eng, mat, total;

                TextView answer = findViewById(R.id.answer);

                EditText et = findViewById(R.id.inputText);
                Log.i("My_Test:", et.getText().toString());

                EditText et1 = findViewById(R.id.input_Kor_Score);
                Log.i("국어점수는", et1.getText().toString());
                String kor1 = et1.getText().toString();
                kor = Integer.parseInt(kor1);

                EditText et2 = findViewById(R.id.input_Eng_Score);
                Log.i("영어점수는", et2.getText().toString());
                String eng1 = et1.getText().toString();
                eng = Integer.parseInt(eng1);

                EditText et3 = findViewById(R.id.input_Mat_Score);
                Log.i("수학점수는", et3.getText().toString());
                String mat1 = et1.getText().toString();
                mat = Integer.parseInt(mat1);

                total = kor + eng + mat;

                String total1 = Integer.toString(total);
                Log.i("총점은", total1);

                answer = (TextView)findViewById(R.id.answer);
                answer.setText(total1);
            }
        });




    }
}