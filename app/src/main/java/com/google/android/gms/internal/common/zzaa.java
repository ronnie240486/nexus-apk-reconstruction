package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i) {
    }

    private final void zzb(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int iHighestOneBit = Integer.highestOneBit(i - 1);
                i2 = iHighestOneBit + iHighestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i2);
        } else if (!this.zzc) {
            return;
        } else {
            this.zza = (Object[]) objArr.clone();
        }
        this.zzc = false;
    }

    @CanIgnoreReturnValue
    public final zzaa zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
