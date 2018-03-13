package com.coolweather.android.command;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by MChen on 2018/3/12.
 */

public class MyApplication extends Application{

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
