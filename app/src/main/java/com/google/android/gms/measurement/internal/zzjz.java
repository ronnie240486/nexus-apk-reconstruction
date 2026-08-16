package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
final class zzjz extends zzap {
    final /* synthetic */ zzka zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjz(zzka zzkaVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzkaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    @WorkerThread
    public final void zzc() {
        zzka zzkaVar = this.zza;
        zzkaVar.zzc.zzg();
        zzkaVar.zzd(false, false, zzkaVar.zzc.zzt.zzav().elapsedRealtime());
        zzkaVar.zzc.zzt.zzd().zzf(zzkaVar.zzc.zzt.zzav().elapsedRealtime());
    }
}
