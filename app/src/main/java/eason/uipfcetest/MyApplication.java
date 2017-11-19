package eason.uipfcetest;

import android.app.Application;

/**
 * Created by easonzhang on 2017/11/19.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        BlockDetectByPrinter.start();
//        BlockDetectByChoreographer.start();
        BlockDetectByLooper.start();
    }
}
