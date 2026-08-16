package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzgf implements Runnable {
    final /* synthetic */ zzkw zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgj zzc;

    public zzgf(zzgj zzgjVar, zzkw zzkwVar, zzq zzqVar) {
        this.zzc = zzgjVar;
        this.zza = zzkwVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzP(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzW(this.zza, this.zzb);
        }
    }
}
