package com.example.asus.newsec.fagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.asus.newsec.R;
import com.example.asus.newsec.bin.MainListNews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/18.
 */
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener{
    private List<Map<String,Object>> list;
    private ListView listView;
    private List<MainListNews> listNews;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_style_two,null);
        listView=(ListView)view.findViewById(R.id.listView_style_two);
        listView.setOnItemClickListener(this);
        setListNews();
        list=new ArrayList<>();
        for(MainListNews listNew:listNews){
            Map map=new HashMap();
            map.put("image",listNew.getImage());
            map.put("text",listNew.getStr());
            list.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),list,R.layout.fragment_list,
                new String[]{"image","text"},
                new int[]{R.id.image_fragment_style, R.id.text_fragment1});

        listView.setAdapter(adapter);
        return view;
    }

    private void setListNews() {
        listNews=new ArrayList<>();
        listNews.add(new MainListNews(R.mipmap.chilli,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.duola,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.airplan,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.flower,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.cat,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.water,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.flower,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.login,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.ph1,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.xiaop,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.airplan,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.zhangfei,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.qq,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.mei,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
        listNews.add(new MainListNews(R.mipmap.dahan,"网络智能4核，4K超高清屏幕分辨率，超高清画质"));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
