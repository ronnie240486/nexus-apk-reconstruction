package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;
import p000.C5630w2;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzah {
    @CanIgnoreReturnValue
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(C5630w2.m29215a("at index ", i2));
            }
        }
        return objArr;
    }
}
