package com.google.android.exoplayer2.util.net;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
public class Connectivity {
    private static Application getApplicationContext() throws Exception {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
    }

    public static NetworkInfo getNetworkInfo() throws Exception {
        return ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean isConnected() throws Exception {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isConnectedEthernet() throws Exception {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 9;
    }

    public static boolean isConnectedFast() throws Exception {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected() && isConnectionFast(networkInfo.getType(), networkInfo.getSubtype());
    }

    public static boolean isConnectedMobile() throws Exception {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
    }

    public static boolean isConnectedWifi() throws Exception {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    public static boolean isConnectionFast(int i, int i2) {
        if (i == 1) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        switch (i2) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }
}
