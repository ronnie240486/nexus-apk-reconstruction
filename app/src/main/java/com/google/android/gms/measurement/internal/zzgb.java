package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzgb implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgj zzb;

    public zzgb(zzgj zzgjVar, zzq zzqVar) {
        this.zzb = zzgjVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        zzkt zzktVar = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzktVar.zzaz().zzg();
        zzktVar.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzaiVarZzb = zzai.zzb(zzqVar.zzv);
        zzai zzaiVarZzh = zzktVar.zzh(zzqVar.zza);
        zzktVar.zzay().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzaiVarZzb);
        zzktVar.zzV(zzqVar.zza, zzaiVarZzb);
        if (zzaiVarZzb.zzk(zzaiVarZzh)) {
            zzktVar.zzQ(zzqVar);
        }
    }
}
