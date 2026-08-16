package com.google.android.gms.internal.measurement;

import p000.C2998bp;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
final class zziy extends zzjb {
    private final int zzc;

    public zziy(byte[] bArr, int i, int i2) {
        super(bArr);
        zzje.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C5630w2.m29215a("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C2998bp.m14684a("Index > length: ", i, ", ", i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final int zzd() {
        return this.zzc;
    }
}
