package com.example.demo.app;

import android.app.Application;

import com.example.demo.BuildConfig;
import com.xin.common.init.CommonInitTask;

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        CommonInitTask.initByMainProcess(this, BuildConfig.DEBUG);
    }


}
