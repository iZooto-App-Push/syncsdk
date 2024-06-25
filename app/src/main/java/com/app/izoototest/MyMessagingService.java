package com.app.izoototest;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.izooto.iZooto;

import org.json.JSONObject;

import java.util.Map;

public class MyMessagingService extends FirebaseMessagingService {

    private static final String FCM_TYPE = "fcm";
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        if (!message.getData().toString().isEmpty()) {
            try {
                Map<String, String> data = message.getData();
                JSONObject jsonObject = new JSONObject(data);
                if (jsonObject.has("t") || jsonObject.has("an")) {
                   // iZooto.iZootoHandleNotification(this, data);
                }
            } catch (Exception ex) {
                Log.e("ABC", "data");
            }
        }
        Log.d("onMessageReceived",message.getData().toString());
    }

//    @Override
//    public void onNewToken(@NonNull String token) {
//        super.onNewToken(token);
//        Log.d("onNewToken", token);
//    }
}
