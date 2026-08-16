package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzjl zza;

    public zzjk(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
