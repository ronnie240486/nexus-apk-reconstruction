package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    @CanIgnoreReturnValue
    public final zzad zzb(Object obj) {
        zza(obj);
        return this;
    }

    @CanIgnoreReturnValue
    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            zza(it.next());
        }
        return this;
    }

    public zzad(int i) {
        super(4);
    }
}
