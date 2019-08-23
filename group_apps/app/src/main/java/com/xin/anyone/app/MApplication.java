package com.xin.anyone.app;

import android.app.Application;

import com.xin.anyone.BuildConfig;
import com.xin.config.GlobalConfig;

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        injectGlobalConfig();
    }


    /**
     * 注入全局 配置信息
     * 仅支持部分全局参数（不含业务类逻辑）
     */
    private void injectGlobalConfig() {
        GlobalConfig.Configer configer = new GlobalConfig.Configer();
        configer.withIsDebug(BuildConfig.DEBUG);
        configer.justConfigOnce();
    }
}
