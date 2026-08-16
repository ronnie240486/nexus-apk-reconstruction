package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzjf implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzq zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjm zzf;

    public zzjf(zzjm zzjmVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.zzf = zzjmVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List listZzi;
        synchronized (this.zza) {
            try {
                try {
                    zzjm zzjmVar = this.zzf;
                    zzdx zzdxVar = zzjmVar.zzb;
                    if (zzdxVar == null) {
                        zzjmVar.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                        this.zza.set(Collections.emptyList());
                        this.zza.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.zzd);
                        atomicReference2 = this.zza;
                        listZzi = zzdxVar.zzh(this.zzb, this.zzc, this.zze, this.zzd);
                    } else {
                        atomicReference2 = this.zza;
                        listZzi = zzdxVar.zzi(null, this.zzb, this.zzc, this.zze);
                    }
                    atomicReference2.set(listZzi);
                    this.zzf.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.zzf.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e);
                    this.zza.set(Collections.emptyList());
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
