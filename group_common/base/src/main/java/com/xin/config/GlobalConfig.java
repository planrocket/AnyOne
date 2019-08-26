package com.xin.config;


/**
 * 全局配置装填
 * 切勿添加业务信息
 * 主要是配置类信息，仅在Application onCreate完成配置
 */

public final class GlobalConfig {

    //BuildConfig替代
    private boolean mIsDebug;


    private GlobalConfig() {
    }

    public static final GlobalConfig get() {
        return SingletonHolder.INSTANCE;
    }

    private void init(Configer configer) {
        mIsDebug = configer.isDebug;
    }

    public boolean getIsDebug() {
        return mIsDebug;
    }

    private static class SingletonHolder {
        private static final GlobalConfig INSTANCE = new GlobalConfig();
    }

    public static final class Configer {
        private boolean isDebug;

        public Configer() {
        }


        public Configer withIsDebug(boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }

        public GlobalConfig justConfigOnce() {
            GlobalConfig globalConfig = GlobalConfig.get();
            globalConfig.init(this);
            return globalConfig;
        }
    }
}
