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
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_style,null);
        listView=(ListView)view.findViewById(R.id.list_view);
        listView.setOnItemClickListener(this);
        list=new ArrayList<>();
        for(int i=0;i<20;i++){
            Map map=new HashMap();
            map.put("image",R.mipmap.chilli);
            map.put("text","网络智能4核，4K超高清屏幕分辨率，超高清画质");
            list.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),list,R.layout.fragment_list,
                new String[]{"image","text"},
                new int[]{R.id.image_fragment_style, R.id.text_fragment1});
        listView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
