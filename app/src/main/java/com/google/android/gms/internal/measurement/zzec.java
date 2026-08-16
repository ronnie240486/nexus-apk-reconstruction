package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzec extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzee zzeeVar, Activity activity, zzbz zzbzVar) {
        super(zzeeVar.zza, true);
        this.zzc = zzeeVar;
        this.zza = activity;
        this.zzb = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzc.zza.zzj)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zza), this.zzb, this.zzi);
    }
}
