package com.example.test9;

public class FavoritePicture {
    //이미지경로, 제목, 레이팅
    private int imgUri;
    private String title;
    private float rating;

    public FavoritePicture(String title, int uri, float rating){
        this.title = title;
        this.imgUri = uri;
        this.rating = rating;
    }

    public int getImgUri() {
        return imgUri;
    }

    public void setImgUri(int imgUri) {
        this.imgUri = imgUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
