package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzfu implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzgj zzb;

    public zzfu(zzgj zzgjVar, zzac zzacVar) {
        this.zzb = zzgjVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzN(this.zza);
        } else {
            this.zzb.zza.zzT(this.zza);
        }
    }
}
