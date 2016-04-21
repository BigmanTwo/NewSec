package com.example.asus.newsec.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.asus.newsec.bin.TabFragment;

import java.util.List;

/**
 * Created by Asus on 2016/4/19.
 */
public class MyFragmentAdapter extends FragmentStatePagerAdapter {
    private List<TabFragment> list;
    public MyFragmentAdapter(FragmentManager fm, List<TabFragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getList();
    }
}
