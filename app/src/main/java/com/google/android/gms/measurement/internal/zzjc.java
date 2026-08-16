package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import p000.C4327f4;

/* JADX INFO: loaded from: classes2.dex */
final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzjm zze;

    public zzjc(zzjm zzjmVar, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zze;
        zzdx zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            C4327f4.m20229a(zzjmVar.zzt, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
