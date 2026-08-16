package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzht implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhx zzb;

    public zzht(zzhx zzhxVar, boolean z) {
        this.zzb = zzhxVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.zzb.zzt.zzJ();
        boolean zZzI = this.zzb.zzt.zzI();
        this.zzb.zzt.zzF(this.zza);
        if (zZzI == this.zza) {
            this.zzb.zzt.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzt.zzJ() == zZzJ || this.zzb.zzt.zzJ() != this.zzb.zzt.zzI()) {
            this.zzb.zzt.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zZzJ));
        }
        this.zzb.zzab();
    }
}
