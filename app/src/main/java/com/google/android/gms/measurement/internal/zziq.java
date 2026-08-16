package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import p000.C4327f4;

/* JADX INFO: loaded from: classes2.dex */
final class zziq implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjm zzb;

    public zziq(zzjm zzjmVar, zzq zzqVar) {
        this.zzb = zzjmVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zzb;
        zzdx zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            C4327f4.m20229a(zzjmVar.zzt, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzm(this.zza);
        } catch (RemoteException e) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.zzb.zzQ();
    }
}
