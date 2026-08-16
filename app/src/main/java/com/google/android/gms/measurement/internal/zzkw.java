package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new zzkx();

    @SafeParcelable.Field(m17610id = 1)
    public final int zza;

    @SafeParcelable.Field(m17610id = 2)
    public final String zzb;

    @SafeParcelable.Field(m17610id = 3)
    public final long zzc;

    @Nullable
    @SafeParcelable.Field(m17610id = 4)
    public final Long zzd;

    @Nullable
    @SafeParcelable.Field(m17610id = 6)
    public final String zze;

    @SafeParcelable.Field(m17610id = 7)
    public final String zzf;

    @Nullable
    @SafeParcelable.Field(m17610id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzkw(@SafeParcelable.Param(m17611id = 1) int i, @SafeParcelable.Param(m17611id = 2) String str, @SafeParcelable.Param(m17611id = 3) long j, @Nullable @SafeParcelable.Param(m17611id = 4) Long l, @SafeParcelable.Param(m17611id = 5) Float f, @Nullable @SafeParcelable.Param(m17611id = 6) String str2, @SafeParcelable.Param(m17611id = 7) String str3, @Nullable @SafeParcelable.Param(m17611id = 8) Double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        if (i == 1) {
            this.zzg = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzg = d;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzkx.zza(this, parcel, i);
    }

    @Nullable
    public final Object zza() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzkw(zzky zzkyVar) {
        this(zzkyVar.zzc, zzkyVar.zzd, zzkyVar.zze, zzkyVar.zzb);
    }

    public zzkw(String str, long j, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        }
    }
}
