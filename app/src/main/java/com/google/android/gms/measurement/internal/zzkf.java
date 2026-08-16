package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import p000.C5206pt;
import p000.C5512uJ;
import p000.e70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkf extends zzkh {
    private final AlarmManager zza;
    private zzap zzb;
    private Integer zzc;

    public zzkf(zzkt zzktVar) {
        super(zzktVar);
        this.zza = (AlarmManager) this.zzt.zzau().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzt.zzau().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context contextZzau = this.zzt.zzau();
        return PendingIntent.getBroadcast(contextZzau, 0, new Intent().setClassName(contextZzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzap zzi() {
        if (this.zzb == null) {
            this.zzb = new zzke(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobSchedulerM27562a = C5206pt.m27562a(this.zzt.zzau().getSystemService("jobscheduler"));
        if (jobSchedulerM27562a != null) {
            C5512uJ.m28599a(jobSchedulerM27562a, zzf());
        }
    }

    public final void zza() {
        zzW();
        e70.m20045a(this.zzt, "Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzj();
        return false;
    }

    public final void zzd(long j) {
        zzW();
        this.zzt.zzaw();
        Context contextZzau = this.zzt.zzau();
        if (!zzlb.zzaj(contextZzau)) {
            this.zzt.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlb.zzak(contextZzau, false)) {
            this.zzt.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzt.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long jElapsedRealtime = this.zzt.zzav().elapsedRealtime() + j;
        this.zzt.zzf();
        if (j < Math.max(0L, ((Long) zzdu.zzw.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j);
        }
        this.zzt.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.zza;
            if (alarmManager != null) {
                this.zzt.zzf();
                alarmManager.setInexactRepeating(2, jElapsedRealtime, Math.max(((Long) zzdu.zzr.zza(null)).longValue(), j), zzh());
                return;
            }
            return;
        }
        Context contextZzau2 = this.zzt.zzau();
        ComponentName componentName = new ComponentName(contextZzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(contextZzau2, new JobInfo.Builder(iZzf, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
