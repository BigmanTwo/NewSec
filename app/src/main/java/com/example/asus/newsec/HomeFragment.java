package com.example.asus.newsec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asus.newsec.adapter.MyChirldAdapter;
import com.example.asus.newsec.bin.TabFragment;
import com.example.asus.newsec.fagment.ListFragment;
import com.example.asus.newsec.fagment.ListFragmentFir;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/18.
 */
public class HomeFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<TabFragment> mList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home,null);
        mViewPager=(ViewPager)view.findViewById(R.id.view_pager);
        mTabLayout=(TabLayout)view.findViewById(R.id.tab_layout1);
        mList=new ArrayList<>();
        mList.add(new TabFragment(new ListFragmentFir(),"头条"));
        mList.add(new TabFragment(new ListFragment(),"科技"));
        mList.add(new TabFragment(new ListFragment(),"热点"));
        mList.add(new TabFragment(new ListFragment(),"娱乐"));
        mList.add(new TabFragment(new ListFragment(),"经济"));
        mList.add(new TabFragment(new ListFragment(),"历史"));
        mList.add(new TabFragment(new ListFragment(),"体育"));
        mList.add(new TabFragment(new ListFragment(),"搞笑"));
        mList.add(new TabFragment(new ListFragment(),"直播"));
        mList.add(new TabFragment(new ListFragment(),"看客"));
        MyChirldAdapter adapter=new MyChirldAdapter(getChildFragmentManager(),mList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
    @Override
        public void setMenuVisibility(boolean menuVisibile) {
                super.setMenuVisibility(menuVisibile);
                if (this.getView() != null) {
                         this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
                     }
            }
}
