package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzpa;

/* JADX INFO: loaded from: classes2.dex */
final class zzhk implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzhx zzb;

    public zzhk(zzhx zzhxVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzhxVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        zzef zzefVarZzl;
        String str;
        Long lValueOf;
        zzkc zzkcVarZzu = this.zzb.zzt.zzu();
        zzpa.zzc();
        if (zzkcVarZzu.zzt.zzf().zzs(null, zzdu.zzau)) {
            if (zzkcVarZzu.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                lValueOf = (zzkcVarZzu.zzt.zzm().zzk(zzkcVarZzu.zzt.zzav().currentTimeMillis()) || zzkcVarZzu.zzt.zzm().zzk.zza() == 0) ? null : Long.valueOf(zzkcVarZzu.zzt.zzm().zzk.zza());
            } else {
                zzefVarZzl = zzkcVarZzu.zzt.zzay().zzl();
                str = "Analytics storage consent denied; will not get session id";
            }
            if (lValueOf != null) {
                this.zzb.zzt.zzv().zzU(this.zza, lValueOf.longValue());
            }
            try {
                this.zza.zze(null);
            } catch (RemoteException e) {
                this.zzb.zzt.zzay().zzd().zzb("getSessionId failed with exception", e);
                return;
            }
        }
        zzefVarZzl = zzkcVarZzu.zzt.zzay().zzl();
        str = "getSessionId has been disabled.";
        zzefVarZzl.zza(str);
        if (lValueOf != null) {
            this.zzb.zzt.zzv().zzU(this.zza, lValueOf.longValue());
        } else {
            this.zza.zze(null);
        }
    }
}
