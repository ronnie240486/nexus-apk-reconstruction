package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {
    private final zzfr zza;

    public zzs(zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    @WorkerThread
    public final void zza(String str, Bundle bundle) {
        String string;
        this.zza.zzaz().zzg();
        if (this.zza.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.zza.zzm().zzq.zzb(string);
        this.zza.zzm().zzr.zzb(this.zza.zzav().currentTimeMillis());
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzaz().zzg();
        if (zzd()) {
            if (zze()) {
                this.zza.zzm().zzq.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.zza.zzq().zzG("auto", "_cmpx", bundle);
            } else {
                String strZza = this.zza.zzm().zzq.zza();
                if (TextUtils.isEmpty(strZza)) {
                    this.zza.zzay().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = ((this.zza.zzm().zzr.zza() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strZza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jZza);
                    Object obj = pair.first;
                    this.zza.zzq().zzG(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzm().zzq.zzb(null);
            }
            this.zza.zzm().zzr.zzb(0L);
        }
    }

    public final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzq.zzb(null);
        }
    }

    public final boolean zzd() {
        return this.zza.zzm().zzr.zza() > 0;
    }

    public final boolean zze() {
        return zzd() && this.zza.zzav().currentTimeMillis() - this.zza.zzm().zzr.zza() > this.zza.zzf().zzi(null, zzdu.zzQ);
    }
}
