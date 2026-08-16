package com.google.android.exoplayer2.util.rtp.rtcp;

import com.google.android.exoplayer2.util.net.Connectivity;
import com.google.android.exoplayer2.util.net.NetworkUtils;

/* JADX INFO: loaded from: classes2.dex */
public class RtcpSessionUtils {
    public static String CNAME() {
        String str = "eth0";
        try {
            if (!Connectivity.isConnectedEthernet()) {
                str = "wlan0";
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = NetworkUtils.getMACAddress(str).split(":");
        sb.append(strArrSplit[1]);
        sb.append(strArrSplit[2]);
        sb.append(strArrSplit[3]);
        sb.append('@');
        sb.append(strArrSplit[4]);
        return sb.toString();
    }

    public static long SSRC() {
        return (long) ((Math.random() * 65535.0d) + 1.0d);
    }
}
