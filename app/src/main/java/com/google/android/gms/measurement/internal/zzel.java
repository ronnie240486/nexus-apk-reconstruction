package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
final class zzel implements Runnable {
    private final zzej zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public /* synthetic */ zzel(String str, zzej zzejVar, int i, Throwable th, byte[] bArr, Map map, zzek zzekVar) {
        Preconditions.checkNotNull(zzejVar);
        this.zza = zzejVar;
        this.zzb = i;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
