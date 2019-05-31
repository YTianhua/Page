package com.yth520web.page;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//下方的主页面
public class HomeFragment extends Fragment {
    int image_hashiqi_list[] = new int[]{R.drawable.image_hashiqi,R.drawable.image_hashiqi2
    ,R.drawable.image_hashiqi3};
    int COUNT_HASHIQI = 1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle saveInstanceState){
        return inflater.inflate(R.layout.frame_home,container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //介绍哈士奇词条的页面
        final ImageView image_hashiqi = (ImageView)getView().findViewById(R.id.image_hashiqi);
        image_hashiqi.setImageResource(R.drawable.image_hashiqi);

        image_hashiqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击图片切换图片
                image_hashiqi.setImageResource(image_hashiqi_list[COUNT_HASHIQI]);//点击时候切换到第二张哈士奇
                COUNT_HASHIQI =COUNT_HASHIQI +1;
                if (COUNT_HASHIQI ==image_hashiqi_list.length){
                    COUNT_HASHIQI=0;//切换到第一张哈士奇
                }
            }
        });
        //image_hashiqi.setImageURI(R.drawable.ima);
        TextView tv = (TextView)getView().findViewById(R.id.homeTextView1);
        tv.setText("   西伯利亚雪橇犬（俄语：Сибирский хаски，英语：Siberian husky）" +
                "，常见别名哈士奇，昵称为二哈。西伯利亚雪橇犬体重，雄犬介于20-27公斤，" +
                "雌犬16-23公斤，身高大约雄犬肩高53-58厘米，雌犬51-56厘米，是一种中型犬。\n" +
                "   西伯利亚雪橇犬是原始的古老犬种，在西伯利亚东北部、格陵兰南部生活。哈士奇名字的由来，" +
                "是源自其独特的嘶哑声。哈士奇性格多变，有的极端胆小，也有的极端暴力，" +
                "进入大陆和家庭的哈士奇，都已经没有了这种极端的性格，比较温顺，" +
                "是一种流行于全球的宠物犬。与金毛犬、拉布拉多并列为三大无攻击性犬类，被世界" +
                "各地人们广泛饲养，并在全球范围内有大量该犬种的赛事。");
    }
}
