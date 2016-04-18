package com.example.asus.newsec.bin;

/**
 * Created by Asus on 2016/4/18.
 */
public class NewsTxt {
    private int image;
    private String title;
    private String time;
    private String content;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NewsTxt(String content, String title, String time, int image, String adress) {
        this.content = content;
        this.title = title;
        this.time = time;
        this.image = image;
        this.adress = adress;
    }
}
