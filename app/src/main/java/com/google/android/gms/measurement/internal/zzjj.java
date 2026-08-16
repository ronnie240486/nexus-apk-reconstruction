package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzjj implements Runnable {
    final /* synthetic */ zzjl zza;

    public zzjj(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zza.zza;
        Context contextZzau = zzjmVar.zzt.zzau();
        this.zza.zza.zzt.zzaw();
        zzjm.zzo(zzjmVar, new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
