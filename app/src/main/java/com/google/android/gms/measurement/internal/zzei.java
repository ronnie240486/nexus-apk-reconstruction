package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzei {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzei(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzei zzb(zzaw zzawVar) {
        return new zzei(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.zzc(), zzawVar.zzd);
    }

    public final String toString() {
        return "origin=" + this.zzb + ",name=" + this.zza + ",params=" + this.zzd.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
