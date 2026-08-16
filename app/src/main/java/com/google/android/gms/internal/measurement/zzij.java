package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;
import p000.C1313UP;

/* JADX INFO: loaded from: classes.dex */
final class zzij implements Serializable, zzii {
    final zzii zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzij(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.zzb) {
            obj = "<supplier that returned " + this.zzc + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(C1313UP.f3459l);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
