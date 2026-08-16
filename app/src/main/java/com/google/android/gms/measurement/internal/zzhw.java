package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
@MainThread
final class zzhw implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzhx zza;

    public /* synthetic */ zzhw(zzhx zzhxVar, zzhv zzhvVar) {
        this.zza = zzhxVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.zza.zzt.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.zza.zzt.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    this.zza.zzt.zzaz().zzp(new zzhu(this, bundle == null, data, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto", data.getQueryParameter("referrer")));
                }
            } catch (RuntimeException e) {
                this.zza.zzt.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.zza.zzt.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkc zzkcVarZzu = this.zza.zzt.zzu();
        zzkcVarZzu.zzt.zzaz().zzp(new zzjv(zzkcVarZzu, zzkcVarZzu.zzt.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzkc zzkcVarZzu = this.zza.zzt.zzu();
        zzkcVarZzu.zzt.zzaz().zzp(new zzju(zzkcVarZzu, zzkcVarZzu.zzt.zzav().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
