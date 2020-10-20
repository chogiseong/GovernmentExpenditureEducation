package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityTest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test1);

        Button button1 = findViewById(R.id.plus);
        Button button2 = findViewById(R.id.minus);
        Button button3 = findViewById(R.id.multiple);
        Button button4 = findViewById(R.id.divide);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = findViewById(R.id.inputNo1);
                EditText et2 = findViewById(R.id.inputNo2);
                TextView tv = findViewById(R.id.calculatingResult);

                String StringEt1 = et1.getText().toString();
                String StringEt2 = et2.getText().toString();

                int IntEt1 = Integer.parseInt(StringEt1);
                int IntEt2 = Integer.parseInt(StringEt2);

                int Result = IntEt1 + IntEt2;

                String StringResult = Integer.toString(Result);

                tv.setText(StringResult);

                Toast.makeText(MainActivityTest1.this, "PLUS COMPLETE", Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = findViewById(R.id.inputNo1);
                EditText et2 = findViewById(R.id.inputNo2);
                TextView tv = findViewById(R.id.calculatingResult);

                String StringEt1 = et1.getText().toString();
                String StringEt2 = et2.getText().toString();

                int IntEt1 = Integer.parseInt(StringEt1);
                int IntEt2 = Integer.parseInt(StringEt2);

                int Result = IntEt1 - IntEt2;

                String StringResult = Integer.toString(Result);

                tv.setText(StringResult);

                Toast.makeText(MainActivityTest1.this, "MINUS COMPLETE", Toast.LENGTH_LONG).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = findViewById(R.id.inputNo1);
                EditText et2 = findViewById(R.id.inputNo2);
                TextView tv = findViewById(R.id.calculatingResult);

                String StringEt1 = et1.getText().toString();
                String StringEt2 = et2.getText().toString();

                int IntEt1 = Integer.parseInt(StringEt1);
                int IntEt2 = Integer.parseInt(StringEt2);

                int Result = IntEt1 * IntEt2;

                String StringResult = Integer.toString(Result);

                tv.setText(StringResult);

                Toast.makeText(MainActivityTest1.this, "MULTIPLE COMPLETE", Toast.LENGTH_LONG).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText et1 = findViewById(R.id.inputNo1);
                EditText et2 = findViewById(R.id.inputNo2);
                TextView tv = findViewById(R.id.calculatingResult);

                String StringEt1 = et1.getText().toString();
                String StringEt2 = et2.getText().toString();

                int IntEt1 = Integer.parseInt(StringEt1);
                int IntEt2 = Integer.parseInt(StringEt2);

                int Result = IntEt1 / IntEt2;

                String StringResult = Integer.toString(Result);

                tv.setText(StringResult);

                Toast.makeText(MainActivityTest1.this, "DIVIDE Answer is \" " + StringResult + " \" ", Toast.LENGTH_LONG).show();

            }
        });
    }
}
