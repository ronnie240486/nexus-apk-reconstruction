package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class zzj<TResult> implements zzq<TResult> {
    private final Executor zza;
    private final Object zzb = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnCompleteListener<TResult> zzc;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zza = executor;
        this.zzc = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task<TResult> task) {
        synchronized (this.zzb) {
            try {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzi(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
