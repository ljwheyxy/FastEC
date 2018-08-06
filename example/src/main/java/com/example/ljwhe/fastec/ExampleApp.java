package com.example.ljwhe.fastec;

import android.app.Application;

import com.example.latte.app.Latte;

/**
 * Created by ljwhe on 2018/8/6.
 */

public class ExampleApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
