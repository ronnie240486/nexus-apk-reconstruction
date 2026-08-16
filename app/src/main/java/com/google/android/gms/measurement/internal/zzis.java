package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzis implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjm zzc;

    public zzis(zzjm zzjmVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjmVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strZzd = null;
        try {
            try {
                if (this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzjm zzjmVar = this.zzc;
                    zzdx zzdxVar = zzjmVar.zzb;
                    if (zzdxVar == null) {
                        zzjmVar.zzt.zzay().zzd().zza("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        strZzd = zzdxVar.zzd(this.zza);
                        if (strZzd != null) {
                            this.zzc.zzt.zzq().zzO(strZzd);
                            this.zzc.zzt.zzm().zze.zzb(strZzd);
                        }
                        this.zzc.zzQ();
                    }
                } else {
                    this.zzc.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                }
            } catch (RemoteException e) {
                this.zzc.zzt.zzay().zzd().zzb("Failed to get app instance id", e);
            }
        } finally {
            this.zzc.zzt.zzv().zzV(this.zzb, null);
        }
    }
}
