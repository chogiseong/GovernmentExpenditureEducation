package com.example.test6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private Button buttonDelete, buttonInput, buttonReset, buttonAnswer, buttonExit;

    private TextView textView1, textView2;
    private EditText edit1;

    private int a;
    private int where=0;

    private int count;
    private int randomNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonInput = (Button) findViewById(R.id.buttonInput);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonAnswer = (Button) findViewById(R.id.buttonAnswer);
        buttonExit = (Button) findViewById(R.id.buttonExit);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        edit1 = (EditText) findViewById(R.id.inputNo1);

        count = 0;
        randomNo = ((int)(Math.random()*10)+1);
        

        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if (v == button1) {
                        edit1.setText(edit1.getText().toString() + 1);
                    } else if (v == button2) {
                        edit1.setText(edit1.getText().toString() + 2);
                    } else if (v == button3) {
                        edit1.setText(edit1.getText().toString() + 3);
                    } else if (v == button4) {
                        edit1.setText(edit1.getText().toString() + 4);
                    } else if (v == button5) {
                        edit1.setText(edit1.getText().toString() + 5);
                    } else if (v == button6) {
                        edit1.setText(edit1.getText().toString() + 6);
                    } else if (v == button7) {
                        edit1.setText(edit1.getText().toString() + 7);
                    } else if (v == button8) {
                        edit1.setText(edit1.getText().toString() + 8);
                    } else if (v == button9) {
                        edit1.setText(edit1.getText().toString() + 9);
                    } else if (v == button0) {
                        edit1.setText(edit1.getText().toString() + 0);
                    }
                    else if (v == buttonInput) {
                        String stringED1 = (edit1.getText()).toString();
                        int intTV1 = Integer.parseInt(stringED1);
                        if (intTV1 == randomNo) {
                            textView2.setText("정답.");
                            randomNo = 0;
                            randomNo = ((int)(Math.random()*10));
                            edit1.setText("");
                        } else if (intTV1 > randomNo) {
                            textView2.setText("내가 생각한 수보다 크다.");
                            edit1.setText("");
                        } else if (intTV1 < randomNo) {
                            textView2.setText("내가 생각한 수보다 작다.");
                            edit1.setText("");
                        } else {
                            textView2.setText("그 수는 1 ~ 10 이 아니야!");
                            edit1.setText("");
                        }
                    }
                    else if (v == buttonDelete) {
                        edit1.setText("");
                    }
                    else if (v == buttonReset) {
                        Toast.makeText(MainActivity.this, "Reset Complete", Toast.LENGTH_SHORT).show();
                        randomNo = 0;
                        randomNo = ((int)(Math.random()*10));
                        edit1.setText("");
                    }
                    else if (v == buttonAnswer) {
                        textView2.setText("정답은 " + randomNo + " 였습니다~!");
                        randomNo = 0;
                        randomNo = ((int)(Math.random()*10));
                        edit1.setText("");
                    }
                    else if (v == buttonExit) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                }
        };
        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        button0.setOnClickListener(cl);
        buttonInput.setOnClickListener(cl);
        buttonDelete.setOnClickListener(cl);
        buttonReset.setOnClickListener(cl);
        buttonAnswer.setOnClickListener(cl);
        buttonExit.setOnClickListener(cl);
    }
}