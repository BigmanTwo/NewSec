package com.example.asus.newsec;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton1, mRadioButton2, mRadioButton3, mRadioButton4, mRadioButton5;
    static final int NUM_ITEMS = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadioGroup = (RadioGroup) findViewById(R.id.group_button);
        mRadioButton1 = (RadioButton) findViewById(R.id.new_button);
        mRadioButton2 = (RadioButton) findViewById(R.id.read_button);
        mRadioButton3 = (RadioButton) findViewById(R.id.movie_button);
        mRadioButton4 = (RadioButton) findViewById(R.id.talk_button);
        mRadioButton5 = (RadioButton) findViewById(R.id.me_button);
        frameLayout = (FrameLayout) findViewById(R.id.mHomeContent);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = 0;
                switch (checkedId) {
                    case R.id.new_button:
                        index = 0;
                        break;
                    case R.id.read_button:
                        index = 1;
                        break;
                    case R.id.movie_button:
                        index = 2;
                        break;
                    case R.id.talk_button:
                        index = 3;
                        break;
                    case R.id.me_button:
                        index = 4;
                        break;
                }
                //通过fragments这个adapter还有index来替换帧布局中的内容
                Fragment fragment = (Fragment) fragments.instantiateItem(frameLayout, index);
                //一开始将帧布局中 的内容设置为第一个
                fragments.setPrimaryItem(frameLayout, 0, fragment);
                fragments.finishUpdate(frameLayout);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mRadioGroup.check(R.id.mHomeContent);
    }

    FragmentStatePagerAdapter fragments = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

        @Override
        public int getCount() {
            return NUM_ITEMS;//一共有五个Fragment
        }

        //进行Fragment的初始化
        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            switch (i) {
                case 0://首页
                    fragment = new HomeFragment();
                    break;
                case 1://阅读
                    fragment = new ReadFragment();
                    break;

                case 2://视频
                    fragment = new MovieFragment();
                    break;

                case 3://话题
                    fragment = new TalkFragment();
                    break;
                case 4://我的
                    fragment = new MeFragment();
                    break;
                default:
                    new HomeFragment();
                    break;
            }

            return fragment;
        }


    };
}




