package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p000.C4327f4;

/* JADX INFO: loaded from: classes2.dex */
final class zzfm extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzfo zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfo zzfoVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.zzb = zzfoVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfo.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            C4327f4.m20229a(zzfoVar.zzt, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzfm zzfmVar = (zzfm) obj;
        boolean z = this.zza;
        if (z == zzfmVar.zza) {
            long j = this.zzc;
            long j2 = zzfmVar.zzc;
            if (j < j2) {
                return -1;
            }
            if (j <= j2) {
                this.zzb.zzt.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
                return 0;
            }
        } else if (z) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfk) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfo zzfoVar, Callable callable, boolean z, String str) {
        super(callable);
        this.zzb = zzfoVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfo.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            C4327f4.m20229a(zzfoVar.zzt, "Tasks index overflow");
        }
    }
}
