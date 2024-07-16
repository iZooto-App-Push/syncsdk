package com.app.izoototest;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.izooto.NotificationHelperListener;
import com.izooto.NotificationWebViewListener;
import com.izooto.Payload;
import com.izooto.TokenReceivedListener;
import com.izooto.iZooto;

public class AppController extends Application implements NotificationHelperListener, NotificationWebViewListener {
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate() {
        super.onCreate();
        iZooto.initialize(this)
                .setNotificationReceiveListener(this)
                .setLandingURLListener(this)
                .setTokenReceivedListener(token -> {
                    Log.i("TokenReceived", token);
                }).build();

       iZooto.promptForPushNotifications();
     //  iZooto.setSubscription();



    }

    @Override
    public void onNotificationReceived(Payload payload) {
        Log.e("Notification", payload.getTitle());
        Log.e("NotificationMessage ", payload.getMessage());


    }

    @Override
    public void onNotificationOpened(String data) {
        Log.e("onNotificationOpened",data);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);

    }

    @Override
    public void onWebView(String landingUrl) {
        Log.e("onWebView",landingUrl);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);
    }

}