package com.example.asus.newsec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asus.newsec.adapter.MyFragmentAdapter;
import com.example.asus.newsec.bin.TabFragment;
import com.example.asus.newsec.bin.Type;
import com.example.asus.newsec.fagment.ReadFragmentFirst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/18.
 */
public class ReadFragment extends Fragment {
        private ViewPager mViewPager;
    private List<TabFragment> mList;
    private RadioGroup mRadioGroup;
    private TabLayout mTabLayout;
//    static final int READNUM=2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_read,null);
        mViewPager=(ViewPager)view.findViewById(R.id.read_viewpager);
        mTabLayout=(TabLayout)view.findViewById(R.id.tab_read);
        mList=new ArrayList<>();
        mList.add(new TabFragment(new ReadFragmentFirst(),"推荐阅读"));
        mList.add(new TabFragment(new ReadFragmentFirst(),"我的阅读"));
        MyFragmentAdapter adapter=new MyFragmentAdapter(getChildFragmentManager(),mList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
//        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                int index=0;
//                switch(checkedId){
//                    case R.id.read_button_recommad:
//                        index=0;
//                        break;
//
//                    case R.id.read_button_own:
//                        index=1;
//                        break;
//                }
//                Fragment fragment= (Fragment) fragments.instantiateItem(mViewPager,index);
//                fragments.setPrimaryItem(mViewPager,0,fragment);
//                fragments.finishUpdate(mViewPager);
//
//            }
//        });
//
        return view;
    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        mRadioGroup.check(R.id.read_viewpager);
//    }
//
//    FragmentStatePagerAdapter fragments=new FragmentStatePagerAdapter(getChildFragmentManager()) {
//        @Override
//        public Fragment getItem(int position) {
//            Fragment fragment=null;
//            switch(position){
//                case 0:
//                    fragment=new ReadFragmentFirst();
//                    break;
//                case 1:
//                    break;
//            }
//            return fragment;
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//    };
    @Override
    public void setMenuVisibility(boolean menuVisibile) {
        super.setMenuVisibility(menuVisibile);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
        }
    }
}
