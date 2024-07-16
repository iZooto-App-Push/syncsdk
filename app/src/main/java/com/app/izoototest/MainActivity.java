package com.app.izoototest;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import com.izooto.iZooto;


public class MainActivity extends AppCompatActivity {
    private static final String PREFS_NAME = "my_prefs";
    private static final String KEY_TOGGLE_STATE = "toggle_state";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchCompat toggle = findViewById(R.id.switch1);

        toggle.setChecked(loadToggleState());
        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
             iZooto.setSubscription(isChecked);
             saveToggleState(isChecked);
        });
    }
    private void saveToggleState(boolean isChecked) {
        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean(KEY_TOGGLE_STATE, isChecked);
        editor.apply();
    }

    private boolean loadToggleState() {
        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPrefs.getBoolean(KEY_TOGGLE_STATE, false);
    }

}











