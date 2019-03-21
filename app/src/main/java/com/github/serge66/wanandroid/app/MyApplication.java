package com.github.serge66.wanandroid.app;

import android.app.Application;

import com.github.serge66.wanandroid.BuildConfig;
import com.github.serge66.wanandroid.utils.ContextUtil;
import com.github.serge66.wanandroid.utils.KLog;

public class MyApplication extends Application {
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        ContextUtil.init(this);
        KLog.init(BuildConfig.DEBUG);
    }

    /**
     * 获得当前app运行的Application
     */
    public static Application getInstance() {
        if (mInstance == null) {
            throw new NullPointerException("NullPointerException... at MyApplication");
        }
        return mInstance;
    }
}
