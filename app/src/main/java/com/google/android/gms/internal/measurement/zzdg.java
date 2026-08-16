package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzdg extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzef zzefVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzefVar, false);
        this.zzc = zzefVar;
        this.zza = str;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzc.zzj)).logHealthData(5, this.zza, ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
