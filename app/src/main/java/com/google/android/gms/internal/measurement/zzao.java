package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends zzai implements zzal {
    protected final List zza;
    protected final List zzb;
    protected zzg zzc;

    private zzao(zzao zzaoVar) {
        super(zzaoVar.zzd);
        ArrayList arrayList = new ArrayList(zzaoVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzaoVar.zza);
        ArrayList arrayList2 = new ArrayList(zzaoVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzaoVar.zzb);
        this.zzc = zzaoVar.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        String str;
        zzap zzapVarZzb;
        zzg zzgVarZza = this.zzc.zza();
        for (int i = 0; i < this.zza.size(); i++) {
            if (i < list.size()) {
                str = (String) this.zza.get(i);
                zzapVarZzb = zzgVar.zzb((zzap) list.get(i));
            } else {
                str = (String) this.zza.get(i);
                zzapVarZzb = zzap.zzf;
            }
            zzgVarZza.zze(str, zzapVarZzb);
        }
        for (zzap zzapVar : this.zzb) {
            zzap zzapVarZzb2 = zzgVarZza.zzb(zzapVar);
            if (zzapVarZzb2 instanceof zzaq) {
                zzapVarZzb2 = zzgVarZza.zzb(zzapVar);
            }
            if (zzapVarZzb2 instanceof zzag) {
                return ((zzag) zzapVarZzb2).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((zzap) it.next()).zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
