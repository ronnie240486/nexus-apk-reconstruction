package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzju implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkc zzb;

    public zzju(zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzl(this.zzb, this.zza);
    }
}
