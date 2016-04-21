package com.example.asus.newsec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Asus on 2016/4/18.
 */
public class MeFragment extends Fragment {
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_me,null);

        listView=(ListView)view.findViewById(R.id.list_view);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
