package com.github.contextdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/10/15.
 */

public class MyApplication extends Application {

    private static  Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();//获取全局context
    }
    public  static Context getContext(){
        return mContext;
    }
}
