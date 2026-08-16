package com.google.android.gms.measurement.internal;

import android.util.Log;
import p000.C0786MA;

/* JADX INFO: loaded from: classes2.dex */
final class zzee implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeh zzf;

    public zzee(zzeh zzehVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzehVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeh zzehVar;
        char c;
        zzew zzewVarZzm = this.zzf.zzt.zzm();
        if (!zzewVarZzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeh zzehVar2 = this.zzf;
        if (zzehVar2.zza == 0) {
            if (zzehVar2.zzt.zzf().zzy()) {
                zzehVar = this.zzf;
                zzehVar.zzt.zzaw();
                c = 'C';
            } else {
                zzehVar = this.zzf;
                zzehVar.zzt.zzaw();
                c = 'c';
            }
            zzehVar.zza = c;
        }
        zzeh zzehVar3 = this.zzf;
        if (zzehVar3.zzb < 0) {
            zzehVar3.zzt.zzf().zzh();
            zzehVar3.zzb = 74029L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        zzeh zzehVar4 = this.zzf;
        char c2 = zzehVar4.zza;
        long j = zzehVar4.zzb;
        String strZzo = zzeh.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j);
        String strM3668a = C0786MA.m3668a(sb, ":", strZzo);
        if (strM3668a.length() > 1024) {
            strM3668a = this.zzb.substring(0, 1024);
        }
        zzeu zzeuVar = zzewVarZzm.zzb;
        if (zzeuVar != null) {
            zzeuVar.zzb(strM3668a, 1L);
        }
    }
}
