package com.example.asus.newsec.fagment;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.asus.newsec.NewsActivity;
import com.example.asus.newsec.R;
import com.example.asus.newsec.adapter.MyPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/18.
 */
public class ListFragmentFir extends Fragment implements AdapterView.OnItemClickListener,ViewPager.OnPageChangeListener{
    private List<Map<String,Object>> list;
    private ListView listView;
    private int[] images={R.mipmap.apple,R.mipmap.grapefruit,R.mipmap.greenanpple,R.mipmap.kiwi,R.mipmap.orange};
    private ImageView[] mImageView,tips;
    private ViewPager mViewPager;
    private ViewGroup mViewGroup;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            int index=mViewPager.getCurrentItem();
            mViewPager.setCurrentItem(index+1);
            handler.sendEmptyMessageDelayed(1,5000);
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_style,null);
        listView=(ListView)view.findViewById(R.id.list_view);
        listView.setOnItemClickListener(this);
        mViewPager=(ViewPager)view.findViewById(R.id.scanner_pagers);
        mViewGroup=(ViewGroup)view.findViewById(R.id.viewgroup);
        list=new ArrayList<>();
        for(int i=0;i<20;i++){
            Map map=new HashMap();
            map.put("image",R.mipmap.carrot);
            map.put("text","在中国具有苏-30血统的战机，有多少？");
            list.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),list,R.layout.fragment_list,
                new String[]{"image","text"},
                new int[]{R.id.image_fragment_style, R.id.text_fragment1});
        listView.setAdapter(adapter);
        initImage();
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent();
        intent.setComponent(new ComponentName(getActivity(),NewsActivity.class));
        startActivity(intent);
    }
    private void initImage(){
        getImageView();
        getTips();
        MyPagerAdapter adapter=new MyPagerAdapter(mImageView,getActivity());
        mViewPager.setAdapter(adapter);
        mViewPager.setCurrentItem(mImageView.length*100);
        mViewPager.setOnPageChangeListener(this);
       handler.sendEmptyMessageDelayed(1,2000);
    }

    private void getTips() {
        tips=new ImageView[images.length];
        for (int i = 0; i < images.length; i++) {
            ImageView imageView=new ImageView(getContext());

            if (i == 0) {
                imageView.setBackgroundResource(R.mipmap.dui);
            }else {
                imageView.setBackgroundResource(R.mipmap.fu);
            }
            tips[i]=imageView;
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            params.rightMargin=5;
            params.leftMargin=5;
            mViewGroup.addView(tips[i],params);
        }
    }

    private void getImageView() {
        mImageView=new ImageView[images.length];
        for (int i = 0; i <images.length ; i++) {
            ImageView imageView=new ImageView(getContext());
            imageView.setBackgroundResource(images[i]);
            mImageView[i]=imageView;
        }
    }
    private void selectItems(int item){
        for (int i = 0; i <tips.length ; i++) {
            if (i == item) {
                tips[i].setBackgroundResource(R.mipmap.dui);
            }else{
                tips[i].setBackgroundResource(R.mipmap.fu);
            }

        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        selectItems(position%mImageView.length);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
