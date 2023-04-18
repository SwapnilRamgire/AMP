// Create new project then, right click on Project -> java -> Com.example.<projectname> And add new class
package com.example.practical8b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (isAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context, "Airplane mode is on",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane mode is off", Toast.LENGTH_SHORT).show();
        }
    }

    private static boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}