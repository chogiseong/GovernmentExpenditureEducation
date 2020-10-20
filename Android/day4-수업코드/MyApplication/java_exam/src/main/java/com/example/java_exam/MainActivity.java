package com.example.java_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void runJavacode(View v) {
        TextView output = findViewById(R.id.output);
        output.setText("");

        Student st = new Student();
        st.setName("홍길동");
        st.setCode("12345");
        st.setAddress(("천안시"));

//        Toast.makeText(this, st.getName() + ", " + st.getAddress(), Toast.LENGTH_SHORT).show();


        Student st2 = new Student("안드로이드");
        Student st3 = new Student("안드로이드", "345678" ,"천안시 동북구...");


        output.setText(st.getName() + ", " + st.getAddress() + "\n"
                + st2.getName() + ", " + st2.getAddress() + "\n"
                + st3.getName() + ", " + st3.getAddress() + "\n"
        );
    }

    // Car button
    public void runCarCode(View v) {
        TextView output = findViewById(R.id.output);
        output.setText("");

        Car myCar1 = new Car("소나타", 100);
        Car myCar2 = new Car("아반테", 90);
        Car myCar3 = new Car("제네시스", 120);

        output.setText("생산된 차의 대수(필드): " + Car.carCount + "\n"
                + "생산된 차의 대수(메서드): " + Car.currentCarCount() + "\n"
                + "최고속도: " + Car.MAXSPEED);

        //
        ArrayList carList = new ArrayList();
        carList.add( new Car("손아타", 100));
        carList.add( new Car("너타타", 100));
        carList.add( new Student("홍당무", "1234", "서울" ));


        Car c1 = (Car)carList.get(0);
        Car c2 = (Car)carList.get(1);
        Student s1 = (Student) carList.get(2);

        output.setText("생산된 차의 대수(필드): " + Car.carCount + "\n"
                + "학생: " + s1.getName());

        //
        ArrayList<Car> carList2 = new ArrayList<Car>();
        carList2.add( new Car("손아타", 100));
        carList2.add( new Car("너타타", 100));

        c1 = carList2.get(0);















    }


}
