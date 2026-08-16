package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zza implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    public zza(zzd zzdVar, String str, long j) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zza(this.zzc, this.zza, this.zzb);
    }
}
