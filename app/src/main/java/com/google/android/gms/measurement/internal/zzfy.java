package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzfy implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgj zzd;

    public zzfy(zzgj zzgjVar, String str, String str2, String str3) {
        this.zzd = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzA();
        return this.zzd.zza.zzi().zzs(this.zza, this.zzb, this.zzc);
    }
}
