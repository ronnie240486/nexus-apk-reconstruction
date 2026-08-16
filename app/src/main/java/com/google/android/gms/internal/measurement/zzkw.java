package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzkw extends zzla {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzkw() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzmy.zzf(obj, j);
        if (list instanceof zzku) {
            objUnmodifiableList = ((zzku) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlt) && (list instanceof zzkm)) {
                zzkm zzkmVar = (zzkm) list;
                if (zzkmVar.zzc()) {
                    zzkmVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmy.zzs(obj, j, objUnmodifiableList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.zzla
    public final void zzb(Object obj, Object obj2, long j) {
        List list;
        List list2;
        int size;
        List listZzd;
        List list3 = (List) zzmy.zzf(obj2, j);
        int size2 = list3.size();
        List list4 = (List) zzmy.zzf(obj, j);
        if (!list4.isEmpty()) {
            if (!zza.isAssignableFrom(list4.getClass())) {
                if (list4 instanceof zzmt) {
                    zzkt zzktVar = new zzkt(list4.size() + size2);
                    zzktVar.addAll(zzktVar.size(), (zzmt) list4);
                    list = zzktVar;
                } else if ((list4 instanceof zzlt) && (list4 instanceof zzkm)) {
                    zzkm zzkmVar = (zzkm) list4;
                    if (!zzkmVar.zzc()) {
                        list2 = list4;
                        list2 = list4;
                        list2 = list4;
                        listZzd = zzkmVar.zzd(list4.size() + size2);
                    }
                }
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                size = list2.size();
                int size3 = list3.size();
                if (size > 0 && size3 > 0) {
                    list2.addAll(list3);
                }
                if (size > 0) {
                    list3 = list2;
                }
                zzmy.zzs(obj, j, list3);
            }
            ArrayList arrayList = new ArrayList(list4.size() + size2);
            arrayList.addAll(list4);
            list = arrayList;
            zzmy.zzs(obj, j, list);
            list2 = list;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            size = list2.size();
            int size4 = list3.size();
            if (size > 0) {
                list2.addAll(list3);
            }
            if (size > 0) {
                list3 = list2;
            }
            zzmy.zzs(obj, j, list3);
        }
        if (list4 instanceof zzku) {
            listZzd = new zzkt(size2);
        } else {
            listZzd = ((list4 instanceof zzlt) && (list4 instanceof zzkm)) ? ((zzkm) list4).zzd(size2) : new ArrayList(size2);
        }
        zzmy.zzs(obj, j, listZzd);
        list2 = listZzd;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        size = list2.size();
        int size5 = list3.size();
        if (size > 0) {
            list2.addAll(list3);
        }
        if (size > 0) {
            list3 = list2;
        }
        zzmy.zzs(obj, j, list3);
    }

    public /* synthetic */ zzkw(zzkv zzkvVar) {
        super(null);
    }
}
