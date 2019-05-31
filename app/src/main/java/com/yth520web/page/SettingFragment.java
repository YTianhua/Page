package com.yth520web.page;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//下方的主页面
public class SettingFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle saveInstanceState){
        return inflater.inflate(R.layout.frame_setting,container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getView().findViewById(R.id.settingTextView1);
        tv.setText("设置页面");
    }
}
