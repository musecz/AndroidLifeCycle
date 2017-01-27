package io.tailorweb.androidlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LoggingActivity extends AppCompatActivity {
    private static final String TAG = "LifeCycle" ;

    public void setActivityName(String activityName) {
        mActivityName = activityName;
    }

    private String mActivityName = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, mActivityName + " onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, mActivityName + " onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, mActivityName + " onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, mActivityName + " onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, mActivityName + " onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, mActivityName + " onDestroy");
        super.onDestroy();
    }
}
