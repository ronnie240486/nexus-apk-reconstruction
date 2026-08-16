package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzen extends zzkh {
    public zzen(zzkt zzktVar) {
        super(zzktVar);
    }

    public final boolean zza() {
        zzW();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zzt.zzau().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
