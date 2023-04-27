package com.mahoa;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location, Promise promise) {
        String kq = "CalendarModule" + "Create event called with name: " + name
                + " and location: " + location;
        Log.i("TAG", "createCalendarEvent: ");
        promise.resolve(kq);
    }
    @ReactMethod
    public void onSum(int a,int b,Promise promise){
        promise.resolve(a+b);
    }

}
