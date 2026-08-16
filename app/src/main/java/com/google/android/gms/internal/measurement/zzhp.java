package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhp {
    static volatile zzig zza = zzig.zzc();
    private static final Object zzb = new Object();

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (!zza.zzb()) {
            synchronized (zzb) {
                try {
                    if (zza.zzb()) {
                        return ((Boolean) zza.zza()).booleanValue();
                    }
                    try {
                        if (!"com.google.android.gms".equals(context.getPackageName())) {
                            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                            if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                            }
                            zza = zzig.zzd(Boolean.valueOf(z));
                        }
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    zza = zzig.zzd(Boolean.valueOf(z));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ((Boolean) zza.zza()).booleanValue();
    }
}
