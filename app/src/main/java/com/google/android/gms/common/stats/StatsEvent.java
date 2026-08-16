package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.C1026Pv;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {

        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    @NonNull
    public final String toString() {
        long jZzc = zzc();
        int iZza = zza();
        long jZzb = zzb();
        String strZzd = zzd();
        StringBuilder sb = new StringBuilder();
        sb.append(jZzc);
        sb.append("\t");
        sb.append(iZza);
        sb.append("\t");
        return C1026Pv.m4564a(sb, jZzb, strZzd);
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    @NonNull
    public abstract String zzd();
}
