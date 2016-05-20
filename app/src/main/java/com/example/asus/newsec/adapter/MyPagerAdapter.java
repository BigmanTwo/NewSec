package com.example.asus.newsec.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Asus on 2016/5/20.
 */
public class MyPagerAdapter extends PagerAdapter {
    private ImageView[] mImageView;
    private Context mContext;

    public MyPagerAdapter(ImageView[] mImageView, Context mContext) {
        this.mImageView = mImageView;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager)container).removeView(mImageView[position%mImageView.length]);
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager)container).addView(mImageView[position%mImageView.length]);
        return mImageView[position%mImageView.length];
    }
}
