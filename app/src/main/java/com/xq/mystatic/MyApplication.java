package com.xq.mystatic;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by lenovo on 2019/3/7.
 */

public class MyApplication extends Application {

    private  static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication=this;

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    public  static MyApplication getMyApplication() {
        return myApplication;
    }
}
