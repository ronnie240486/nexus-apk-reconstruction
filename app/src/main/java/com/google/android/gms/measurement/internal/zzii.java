package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzim zza;

    public zzii(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim zzimVar = this.zza;
        zzimVar.zza = zzimVar.zzh;
    }
}
