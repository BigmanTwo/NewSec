package com.example.asus.newsec.bin;

import android.support.v4.app.Fragment;

/**
 * Created by Asus on 2016/4/18.
 */
public class TabFragment {
    private Fragment fragment;
    private String list;

    public TabFragment(Fragment fragment, String list) {
        this.fragment = fragment;
        this.list = list;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
