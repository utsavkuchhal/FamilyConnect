package com.utsav.familyconnect;

import android.app.Application;

import com.backendless.Backendless;


public class TestActivity extends Application {

    public static final String APPLICATION_ID = "BAFCA83A-BA93-FC0D-FF21-54BB973EBE00";
    public static final String API_KEY = "8D05E504-2B3B-4EC5-BAE9-01BC3E236AB4";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL );
        Backendless.initApp( getApplicationContext(), APPLICATION_ID,
                API_KEY );
    }
}
