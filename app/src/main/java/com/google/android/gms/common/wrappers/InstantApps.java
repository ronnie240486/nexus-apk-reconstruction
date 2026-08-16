package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import p000.C5268qs;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class InstantApps {
    private static Context zza;

    @Nullable
    private static Boolean zzb;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@NonNull Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = zza;
        if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        zzb = null;
        if (!PlatformVersion.isAtLeastO()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                zzb = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                zzb = boolValueOf;
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
        boolValueOf = Boolean.valueOf(C5268qs.m27762a(applicationContext.getPackageManager()));
        zzb = boolValueOf;
        zza = applicationContext;
        return zzb.booleanValue();
    }
}
