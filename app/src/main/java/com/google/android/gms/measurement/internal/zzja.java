package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import p000.C4327f4;

/* JADX INFO: loaded from: classes2.dex */
final class zzja implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjm zzb;

    public zzja(zzjm zzjmVar, zzq zzqVar) {
        this.zzb = zzjmVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm zzjmVar = this.zzb;
        zzdx zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            C4327f4.m20229a(zzjmVar.zzt, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}
