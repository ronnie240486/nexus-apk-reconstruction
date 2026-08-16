package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import p000.C1052QI;
import p000.C4378ft;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjt {
    private final Context zza;

    public zzjt(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzeh zzk() {
        return zzfr.zzp(this.zza, null, null).zzay();
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzehVarZzay = zzfrVarZzp.zzay();
        if (intent == null) {
            zzehVarZzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(i2, zzehVarZzay, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgj(zzkt.zzt(this.zza), null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i, zzeh zzehVar, Intent intent) {
        if (((zzjs) this.zza).zzc(i)) {
            zzehVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzjs) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzeh zzehVar, JobParameters jobParameters) {
        zzehVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjs) this.zza).zzb(jobParameters, false);
    }

    @MainThread
    public final void zze() {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        zzeh zzehVarZzay = zzfrVarZzp.zzay();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        zzeh zzehVarZzay = zzfrVarZzp.zzay();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
        } else {
            zzk().zzj().zzb("onRebind called. action", intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzkt zzktVarZzt = zzkt.zzt(this.zza);
        zzktVarZzt.zzaz().zzp(new zzjr(this, zzktVarZzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzehVarZzay = zzfrVarZzp.zzay();
        String strM4619a = C1052QI.m4619a(C4378ft.m20685a(jobParameters), "action");
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zzb("Local AppMeasurementJobService called. action", strM4619a);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(strM4619a)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzehVarZzay, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
