package com.cm.wingsdk;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class WingTest {

    public static void wing(Activity act) {

        Log.d("[WingSDK]", "My name is Wing");

        Intent intent = new Intent();
        intent.setAction("android.intent.action.Hello");
        act.startActivityForResult(intent, 0);
    }
}
