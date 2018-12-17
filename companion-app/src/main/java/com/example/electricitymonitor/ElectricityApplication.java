package com.example.electricitymonitor;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.jakewharton.threetenabp.AndroidThreeTen;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class ElectricityApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(
                new CalligraphyConfig.Builder().setDefaultFontPath("minyna.ttf").setFontAttrId(R.attr.fontPath)
                        .build());
        AndroidThreeTen.init(this);
        FirebaseApp.initializeApp(this);
        FirebaseMessaging.getInstance().subscribeToTopic("Power_Notifications");
    }

}
