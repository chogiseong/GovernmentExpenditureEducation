package com.example.test10;

public class MyMemo {
    private String memotitle;
    private String memocontent;

    public MyMemo(String memotitle, String memocontent){
        this.memotitle = memotitle;
        this.memocontent = memocontent;
    }

    public String getMemotitle() {
        return memotitle;
    }

    public void setMemotitle(String memotitle) {
        this.memotitle = memotitle;
    }

    public String getMemocontent() {
        return memocontent;
    }

    public void setMemocontent(String memocontent) {
        this.memocontent = memocontent;
    }
}
