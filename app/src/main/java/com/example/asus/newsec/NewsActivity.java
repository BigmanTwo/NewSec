package com.example.asus.newsec;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.example.asus.newsec.adapter.MyRecycleAdapter;
import com.example.asus.newsec.bin.NewsTxt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asus on 2016/4/18.
 */
public class NewsActivity extends AppCompatActivity {
    private List<NewsTxt> mList;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news_layout);
        mRecyclerView=(RecyclerView)findViewById(R.id.news_recyclerview);
        Date date=new Date(System.currentTimeMillis());
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH-mm");
        String time=format.format(date);
        mList=new ArrayList<>();
        mList.add(new NewsTxt("人社部副部长张义珍透露，4月13日" +
                "，国务院第129次常务会议研究通过了《关于阶段性降低社会保险费率的通知》" +
                "，执行时间从2016年5月1日起，为期两年" ,
                "官方：阶段性降低缴费费率不会影响职工社保待遇",time,R.mipmap.ph1,"新华网"));
        MyRecycleAdapter adapter=new MyRecycleAdapter(mList,this);
        LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(adapter);
    }
}
