package com.example.custom_list;

public class User {
    String name;
    String address;
    int imgUri;

    public User(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.imgUri = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImgUri() {
        return imgUri;
    }

    public void setImgUri(int imgUri) {
        this.imgUri = imgUri;
    }
}
