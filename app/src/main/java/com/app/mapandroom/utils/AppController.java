package com.app.mapandroom.utils;

import android.app.Application;

import androidx.room.Room;

import com.app.mapandroom.database.MyAppDatabase;

public class AppController extends Application {

    public static final String TAG = AppController.class.getSimpleName();
    public static MyAppDatabase myAppDatabase;
    private static AppController instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "location.db").allowMainThreadQueries().build();
    }

    public static synchronized AppController getInstance() {
        return instance;
    }

    public static MyAppDatabase getMyAppDatabase() {
        return myAppDatabase;
    }

}