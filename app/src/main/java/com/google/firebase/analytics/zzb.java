package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzb implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.zza.zzb.zzl();
    }
}
