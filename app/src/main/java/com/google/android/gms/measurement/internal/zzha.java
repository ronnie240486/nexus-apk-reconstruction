package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzha implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzhx zzb;

    public zzha(zzhx zzhxVar, long j) {
        this.zzb = zzhxVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
