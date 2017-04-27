package com.sheatouk.selmy.temperatureconverter;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 27/04/2017.
 */

public class MyMockApplication extends Application {
    public static final List<String> list = new ArrayList<String>();
    @Override
    public void onCreate() {
        // do something important for your tests here
        super.onCreate();
    }
}
