package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzof;

/* JADX INFO: loaded from: classes2.dex */
final class zzka {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzkc zzc;
    private final zzap zzd;

    public zzka(zzkc zzkcVar) {
        this.zzc = zzkcVar;
        this.zzd = new zzjz(this, zzkcVar.zzt);
        long jElapsedRealtime = zzkcVar.zzt.zzav().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    @WorkerThread
    public final void zzb(long j) {
        this.zzd.zzb();
    }

    @WorkerThread
    public final void zzc(long j) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j;
        this.zzb = j;
    }

    @WorkerThread
    public final boolean zzd(boolean z, boolean z2, long j) {
        this.zzc.zzg();
        this.zzc.zza();
        zzof.zzc();
        if (!this.zzc.zzt.zzf().zzs(null, zzdu.zzad) || this.zzc.zzt.zzJ()) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzav().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            this.zzc.zzt.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.zzb;
            this.zzb = j;
        }
        this.zzc.zzt.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzlb.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z2) {
            this.zzc.zzt.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
