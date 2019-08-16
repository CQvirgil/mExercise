package com.virgil.study.testleakcanary;

import android.content.Context;

public class TestSingleton {
    private static TestSingleton instance;

    private TestSingleton(Context context){

    }

    public static synchronized TestSingleton getInstance(Context context){
        if(instance==null){
            instance = new TestSingleton(context);
        }
        return instance;
    }
}
