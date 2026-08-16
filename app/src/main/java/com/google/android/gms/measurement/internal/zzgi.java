package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzgi implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgj zze;

    public zzgi(zzgj zzgjVar, String str, String str2, String str3, long j) {
        this.zze = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.zza;
        if (str == null) {
            this.zze.zza.zzR(this.zzb, null);
        } else {
            this.zze.zza.zzR(this.zzb, new zzie(this.zzc, str, this.zzd));
        }
    }
}
