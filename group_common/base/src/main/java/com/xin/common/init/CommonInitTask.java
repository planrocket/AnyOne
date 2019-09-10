package com.xin.common.init;

import android.content.Context;

import com.blankj.utilcode.util.Utils;
import com.xin.common.config.GlobalConfig;

public class CommonInitTask {

    /**
     * @param appContext Application的context
     * @param isDebug    app是否debug模式
     */
    public static void initByMainProcess(Context appContext, boolean isDebug) {
        initUtilCode(appContext);
        initGlobalConfig(isDebug);
    }


    private static void initUtilCode(Context appContext) {
        Utils.init(appContext);
    }


    private static void initGlobalConfig(boolean isDebug) {
        GlobalConfig.Configer configer = new GlobalConfig.Configer();
        configer.withIsDebug(isDebug);
        configer.justConfigOnce();
    }
}
