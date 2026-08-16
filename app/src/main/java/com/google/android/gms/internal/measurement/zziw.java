package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
final class zziw implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzje zzjeVar = (zzje) obj;
        zzje zzjeVar2 = (zzje) obj2;
        zziv zzivVar = new zziv(zzjeVar);
        zziv zzivVar2 = new zziv(zzjeVar2);
        while (zzivVar.hasNext() && zzivVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzivVar.zza() & C1579YX.f3960d).compareTo(Integer.valueOf(zzivVar2.zza() & C1579YX.f3960d));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzjeVar.zzd()).compareTo(Integer.valueOf(zzjeVar2.zzd()));
    }
}
