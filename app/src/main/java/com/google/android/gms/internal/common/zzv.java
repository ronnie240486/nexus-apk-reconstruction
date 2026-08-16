package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzv implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzx zzb;

    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceZza = zzq.zza(it.next(), ", ");
                while (true) {
                    sb.append(charSequenceZza);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    charSequenceZza = zzq.zza(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
