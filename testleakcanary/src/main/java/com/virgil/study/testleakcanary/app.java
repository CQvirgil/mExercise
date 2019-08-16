package com.virgil.study.testleakcanary;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;


public class app extends Application {
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher = LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher(Context context){
        app application = (app) context.getApplicationContext();
        return application.refWatcher;
    }
}
