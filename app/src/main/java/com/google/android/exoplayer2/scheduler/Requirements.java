package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.C1182SN;
import p000.C1247TN;
import p000.C1311UN;
import p000.C1379VN;
import p000.C1443WN;

/* JADX INFO: loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new Parcelable.Creator<Requirements>() { // from class: com.google.android.exoplayer2.scheduler.Requirements.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    };
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i) {
        this.requirements = (i & 2) != 0 ? i | 1 : i;
    }

    private int getNotMetNetworkRequirements(Context context) {
        if (!isNetworkRequired()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) Assertions.checkNotNull(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && isInternetConnectivityValidated(connectivityManager)) {
            return (isUnmeteredNetworkRequired() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.requirements & 3;
    }

    private boolean isDeviceCharging(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean isDeviceIdle(Context context) {
        PowerManager powerManager = (PowerManager) Assertions.checkNotNull(context.getSystemService("power"));
        int i = Util.SDK_INT;
        if (i >= 23) {
            return C1379VN.m6522a(powerManager);
        }
        return i < 20 ? !powerManager.isScreenOn() : !C1443WN.m6815a(powerManager);
    }

    private static boolean isInternetConnectivityValidated(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesM5830a;
        if (Util.SDK_INT < 24) {
            return true;
        }
        Network networkM5478a = C1182SN.m5478a(connectivityManager);
        return (networkM5478a == null || (networkCapabilitiesM5830a = C1247TN.m5830a(connectivityManager, networkM5478a)) == null || !C1311UN.m6261a(networkCapabilitiesM5830a, 16)) ? false : true;
    }

    public boolean checkRequirements(Context context) {
        return getNotMetRequirements(context) == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.requirements == ((Requirements) obj).requirements;
    }

    public int getNotMetRequirements(Context context) {
        int notMetNetworkRequirements = getNotMetNetworkRequirements(context);
        if (isChargingRequired() && !isDeviceCharging(context)) {
            notMetNetworkRequirements |= 8;
        }
        return (!isIdleRequired() || isDeviceIdle(context)) ? notMetNetworkRequirements : notMetNetworkRequirements | 4;
    }

    public int getRequirements() {
        return this.requirements;
    }

    public int hashCode() {
        return this.requirements;
    }

    public boolean isChargingRequired() {
        return (this.requirements & 8) != 0;
    }

    public boolean isIdleRequired() {
        return (this.requirements & 4) != 0;
    }

    public boolean isNetworkRequired() {
        return (this.requirements & 1) != 0;
    }

    public boolean isUnmeteredNetworkRequired() {
        return (this.requirements & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requirements);
    }
}
