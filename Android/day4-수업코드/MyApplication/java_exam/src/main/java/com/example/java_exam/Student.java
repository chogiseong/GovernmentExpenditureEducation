package com.example.java_exam;

public class Student {

    // member fields
    String name; //이름
    String code; //학번
    String address; // 주소

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }


    public Student(String name, String code, String addr) {
        this.name = name;
        this.code = code;
        this.address = addr;
    }

    // member methods
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getCode() {
        return this.code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setAddress(String addr) {
        this.address = addr;
    }
}
