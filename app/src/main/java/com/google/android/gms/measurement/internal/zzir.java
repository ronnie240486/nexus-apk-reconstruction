package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzir implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzjm zzc;

    public zzir(zzjm zzjmVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzjmVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    if (!this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                        this.zzc.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.zzc.zzt.zzq().zzO(null);
                        this.zzc.zzt.zzm().zze.zzb(null);
                        this.zza.set(null);
                        this.zza.notify();
                        return;
                    }
                    zzjm zzjmVar = this.zzc;
                    zzdx zzdxVar = zzjmVar.zzb;
                    if (zzdxVar == null) {
                        zzjmVar.zzt.zzay().zzd().zza("Failed to get app instance id");
                        this.zza.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzdxVar.zzd(this.zzb));
                    String str = (String) this.zza.get();
                    if (str != null) {
                        this.zzc.zzt.zzq().zzO(str);
                        this.zzc.zzt.zzm().zze.zzb(str);
                    }
                    this.zzc.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.zzc.zzt.zzay().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
