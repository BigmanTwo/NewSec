package com.example.asus.newsec.bin;

/**
 * Created by Asus on 2016/4/21.
 */
public class MainListNews {
    private int image;
    private String str;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MainListNews(int image, String str) {
        this.image = image;
        this.str = str;
    }
}
