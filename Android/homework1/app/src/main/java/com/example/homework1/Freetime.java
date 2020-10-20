package com.example.homework1;

public class Freetime {
    int freetimeID; //기본키
    String  freetimeActive; //활동성/비활동성
    int freetimeYear; //년
    String freetimeTerm; //분기
    String freetimeArea; //실내실외
    String freetimeTitle;
    String freetimeName; //이름
    int freetimeCredit; //시간
    String freetimeMaster; //주최자
    String freetimeTime;
    String freetimePlace; //장소
    int freetimeLimit; //제한인원

    public Freetime(int freetimeID, String freetimeActive, int freetimeYear, String freetimeTerm, String freetimeArea, String freetimeTitle, String freetimeName, int freetimeCredit, String freetimeMaster, String freetimeTime, String freetimePlace, int freetimeLimit) {
        this.freetimeID = freetimeID;
        this.freetimeActive = freetimeActive;
        this.freetimeYear = freetimeYear;
        this.freetimeTerm = freetimeTerm;
        this.freetimeArea = freetimeArea;
        this.freetimeTitle = freetimeTitle;
        this.freetimeName = freetimeName;
        this.freetimeCredit = freetimeCredit;
        this.freetimeMaster = freetimeMaster;
        this.freetimeTime = freetimeTime;
        this.freetimePlace = freetimePlace;
        this.freetimeLimit = freetimeLimit;
    }

    public Freetime(int freetimeID, String freetimeTitle, String freetimeName, String freetimeMaster, String freetimeTime, String freetimePlace, int freetimeLimit) {
        this.freetimeID = freetimeID;
        this.freetimeTitle = freetimeTitle;
        this.freetimeName = freetimeName;
        this.freetimeMaster = freetimeMaster;
        this.freetimeTime = freetimeTime;
        this.freetimePlace = freetimePlace;
        this.freetimeLimit = freetimeLimit;
    }

    public String getFreetimeTime() {
        return freetimeTime;
    }

    public void setFreetimeTime(String freetimeTime) {
        this.freetimeTime = freetimeTime;
    }

    public String getFreetimeTitle() {
        return freetimeTitle;
    }

    public void setFreetimeTitle(String freetimeTitle) {
        this.freetimeTitle = freetimeTitle;
    }

    public int getFreetimeID() {
        return freetimeID;
    }

    public void setFreetimeID(int freetimeID) {
        this.freetimeID = freetimeID;
    }

    public String getFreetimeActive() {
        return freetimeActive;
    }

    public void setFreetimeActive(String freetimeActive) {
        this.freetimeActive = freetimeActive;
    }

    public int getFreetimeYear() {
        return freetimeYear;
    }

    public void setFreetimeYear(int freetimeYear) {
        this.freetimeYear = freetimeYear;
    }

    public String getFreetimeTerm() {
        return freetimeTerm;
    }

    public void setFreetimeTerm(String freetimeTerm) {
        this.freetimeTerm = freetimeTerm;
    }

    public String getFreetimeArea() {
        return freetimeArea;
    }

    public void setFreetimeArea(String freetimeArea) {
        this.freetimeArea = freetimeArea;
    }

    public String getFreetimeName() {
        return freetimeName;
    }

    public void setFreetimeName(String freetimeName) {
        this.freetimeName = freetimeName;
    }

    public int getFreetimeCredit() {
        return freetimeCredit;
    }

    public void setFreetimeCredit(int freetimeCredit) {
        this.freetimeCredit = freetimeCredit;
    }

    public String getFreetimeMaster() {
        return freetimeMaster;
    }

    public void setFreetimeMaster(String freetimeMaster) {
        this.freetimeMaster = freetimeMaster;
    }

    public String getFreetimePlace() {
        return freetimePlace;
    }

    public void setFreetimePlace(String freetimePlace) {
        this.freetimePlace = freetimePlace;
    }

    public int getFreetimeLimit() {
        return freetimeLimit;
    }

    public void setFreetimeLimit(int freetimeLimit) {
        this.freetimeLimit = freetimeLimit;
    }
}
