package com.yth520web.page;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity  extends AppCompatActivity {
        //extends AppCompatActivity {


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager= (ViewPager)findViewById(R.id.viewpager);
        //创建Adapter对象，绑定ViewPager和pageAdapter
        ViewPager viewpager = (ViewPager)findViewById(R.id.viewpager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        //联系viewpager和pageAdapter
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.sliding_tabs);
        //绑定tabLayout和当前的viewPager,滑动后一起联动
        tabLayout.setupWithViewPager(viewPager);

    }
}
