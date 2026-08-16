package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzcz extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzef zzefVar, String str) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).endAdUnitExposure(this.zza, this.zzi);
    }
}
