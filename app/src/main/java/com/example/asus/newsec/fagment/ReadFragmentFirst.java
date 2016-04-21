package com.example.asus.newsec.fagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.example.asus.newsec.R;
import com.example.asus.newsec.adapter.MyReadAdapter;
import com.example.asus.newsec.bin.ReadTypeOne;
import com.example.asus.newsec.bin.ReadTypeTwo;
import com.example.asus.newsec.bin.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/19.
 */
public class ReadFragmentFirst extends Fragment {
    private List<Type> mList;
    private ListView mListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_style,null);
        mListView=(ListView)view.findViewById(R.id.list_view);
        mList=new ArrayList<>();
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeTwo("台湾团参加国际会议被大陆代表团要求离场",R.mipmap.dahan,R.mipmap.mei,R.mipmap.xiaop));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeTwo("台湾团参加国际会议被大陆代表团要求离场",R.mipmap.dahan,R.mipmap.mei,R.mipmap.xiaop));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeTwo("台湾团参加国际会议被大陆代表团要求离场",R.mipmap.dahan,R.mipmap.mei,R.mipmap.xiaop));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeTwo("台湾团参加国际会议被大陆代表团要求离场",R.mipmap.dahan,R.mipmap.mei,R.mipmap.xiaop));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeOne(R.mipmap.caocao,"国家版权局：不付费使用音乐作品的时代过去了","新浪网"));
        mList.add(new ReadTypeTwo("台湾团参加国际会议被大陆代表团要求离场",R.mipmap.dahan,R.mipmap.mei,R.mipmap.xiaop));
        MyReadAdapter adapter=new MyReadAdapter(mList,getActivity());
        mListView.setAdapter(adapter);
        return view;
    }
}
