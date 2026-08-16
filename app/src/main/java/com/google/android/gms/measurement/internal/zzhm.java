package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzhm implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzhx zzb;

    public zzhm(zzhx zzhxVar, AtomicReference atomicReference) {
        this.zzb = zzhxVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(this.zzb.zzt.zzf().zzo(this.zzb.zzt.zzh().zzl(), zzdu.zzK));
                    this.zza.notify();
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
