package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzat implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzau zzb;

    public zzat(zzau zzauVar) {
        this.zzb = zzauVar;
        this.zza = zzauVar.zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.zza.next();
    }
}
