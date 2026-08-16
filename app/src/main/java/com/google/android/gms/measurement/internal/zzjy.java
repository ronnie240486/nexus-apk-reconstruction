package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: loaded from: classes2.dex */
final class zzjy {
    final /* synthetic */ zzkc zza;
    private zzjx zzb;

    public zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    @WorkerThread
    public final void zza(long j) {
        this.zzb = new zzjx(this, this.zza.zzt.zzav().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            this.zza.zzd.removeCallbacks(zzjxVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
