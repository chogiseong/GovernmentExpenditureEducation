package com.example.java_exam;

public class Car {

    // member fields
    String color; //
    int speed;      //

    static int carCount = 0;

    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;

    static int currentCarCount() {
        return carCount;
    }

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount++;
    }

    public Car(int speed) {

        this.speed = speed;
    }

    public Car() {

    }
}
