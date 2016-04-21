package com.example.asus.newsec.bin;

import com.example.asus.newsec.adapter.MyReadAdapter;

/**
 * Created by Asus on 2016/4/19.
 */
public class ReadTypeTwo implements Type {
    private String titleSec;
    private int image1;
    private int image2;
    private int image3;

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public String getTitleSec() {
        return titleSec;
    }

    public void setTitleSec(String titleSec) {
        this.titleSec = titleSec;
    }

    public ReadTypeTwo(String titleSec, int image1, int image2, int image3) {
        this.titleSec = titleSec;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    @Override
    public int getType() {
        return MyReadAdapter.SECENDTYPE;
    }
}
