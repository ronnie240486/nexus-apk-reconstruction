package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C0370Fe;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z, boolean z2) {
        super(C0370Fe.f805a);
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        List listEmptyList;
        zzr zzrVar;
        zzh.zzi(C0370Fe.f805a, 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
        } else {
            int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
            if (iZzb == 2) {
                i = 4;
            } else if (iZzb == 3) {
                i = 1;
            } else if (iZzb != 5) {
                i = iZzb != 6 ? 3 : 2;
            } else {
                i = 5;
            }
            String strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                zzrVar = this.zzc.zza;
                listEmptyList = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(zzgVar.zzb((zzap) list.get(i2)).zzi());
                }
                zzrVar = this.zzc.zza;
                listEmptyList = arrayList;
            }
            zzrVar.zza(i, strZzi, listEmptyList, this.zza, this.zzb);
        }
        return zzap.zzf;
    }
}
