package com.google.android.gms.internal.measurement;

import java.util.List;
import p000.c70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzap zzapVarZzb = zzgVar.zzb((zzap) c70.m16439a(zzbl.AND, 2, list, 0));
            if (!zzapVarZzb.zzg().booleanValue()) {
                return zzapVarZzb;
            }
        } else {
            if (iOrdinal == 47) {
                return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) c70.m16439a(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
            }
            if (iOrdinal != 50) {
                return zzb(str);
            }
            zzap zzapVarZzb2 = zzgVar.zzb((zzap) c70.m16439a(zzbl.OR, 2, list, 0));
            if (zzapVarZzb2.zzg().booleanValue()) {
                return zzapVarZzb2;
            }
        }
        return zzgVar.zzb((zzap) list.get(1));
    }
}
