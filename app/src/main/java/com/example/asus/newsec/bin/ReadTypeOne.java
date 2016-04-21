package com.example.asus.newsec.bin;

import com.example.asus.newsec.adapter.MyReadAdapter;

/**
 * Created by Asus on 2016/4/19.
 */
public class ReadTypeOne implements Type {
        private int image;
    private String title;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ReadTypeOne(int image, String title, String adress) {
        this.image = image;
        this.title = title;
        this.adress = adress;
    }

    @Override
    public int getType() {
        return MyReadAdapter.FIRSTTYPE;
    }
}
