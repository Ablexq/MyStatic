package com.xq.mystatic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xq.mystatic.util.SingleInstanceToastUtil;
import com.xq.mystatic.util.ToastUtil;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*不泄漏*/
//        ToastUtil.showToast("我是application上下文");


        /*会泄露*/
//        ContextToastUtil.showToast(SecondActivity.this, "我是传入的second上下文");

        /*会泄露*/
        SingleInstanceToastUtil.getInstance().showToast(SecondActivity.this, "我是单例类的toast");

    }
}
