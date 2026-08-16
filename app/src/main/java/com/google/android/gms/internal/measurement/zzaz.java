package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p000.c70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz extends zzaw {
    public zzaz() {
        this.zza.add(zzbl.APPLY);
        this.zza.add(zzbl.BLOCK);
        this.zza.add(zzbl.BREAK);
        this.zza.add(zzbl.CASE);
        this.zza.add(zzbl.DEFAULT);
        this.zza.add(zzbl.CONTINUE);
        this.zza.add(zzbl.DEFINE_FUNCTION);
        this.zza.add(zzbl.FN);
        this.zza.add(zzbl.IF);
        this.zza.add(zzbl.QUOTE);
        this.zza.add(zzbl.RETURN);
        this.zza.add(zzbl.SWITCH);
        this.zza.add(zzbl.TERNARY);
    }

    private static zzap zzc(zzg zzgVar, List list) {
        zzh.zzi(zzbl.FN.name(), 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(1));
        if (!(zzapVarZzb2 instanceof zzae)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", zzapVarZzb2.getClass().getCanonicalName()));
        }
        List listZzm = ((zzae) zzapVarZzb2).zzm();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzao(zzapVarZzb.zzi(), listZzm, arrayList, zzgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r8.equals("continue") == false) goto L65;
     */
    @Override // com.google.android.gms.internal.measurement.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzap zzapVarZzb;
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 2) {
            zzap zzapVarZzb2 = zzgVar.zzb((zzap) c70.m16439a(zzbl.APPLY, 3, list, 0));
            String strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            zzap zzapVarZzb3 = zzgVar.zzb((zzap) list.get(2));
            if (!(zzapVarZzb3 instanceof zzae)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", zzapVarZzb3.getClass().getCanonicalName()));
            }
            if (strZzi.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zzapVarZzb2.zzbR(strZzi, zzgVar, ((zzae) zzapVarZzb3).zzm());
        }
        if (iOrdinal == 15) {
            zzh.zzh(zzbl.BREAK.name(), 0, list);
            return zzap.zzh;
        }
        if (iOrdinal == 25) {
            return zzc(zzgVar, list);
        }
        if (iOrdinal == 41) {
            zzh.zzi(zzbl.IF.name(), 2, list);
            zzap zzapVarZzb4 = zzgVar.zzb((zzap) list.get(0));
            zzap zzapVarZzb5 = zzgVar.zzb((zzap) list.get(1));
            zzap zzapVarZzb6 = list.size() > 2 ? zzgVar.zzb((zzap) list.get(2)) : null;
            zzap zzapVar = zzap.zzf;
            zzap zzapVarZzc = zzapVarZzb4.zzg().booleanValue() ? zzgVar.zzc((zzae) zzapVarZzb5) : zzapVarZzb6 != null ? zzgVar.zzc((zzae) zzapVarZzb6) : zzapVar;
            return zzapVarZzc instanceof zzag ? zzapVarZzc : zzapVar;
        }
        if (iOrdinal == 54) {
            return new zzae(list);
        }
        if (iOrdinal == 57) {
            return list.isEmpty() ? zzap.zzj : new zzag("return", zzgVar.zzb((zzap) c70.m16439a(zzbl.RETURN, 1, list, 0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                zzh.zzi(zzbl.DEFINE_FUNCTION.name(), 2, list);
                zzap zzapVarZzc2 = zzc(zzgVar, list);
                zzai zzaiVar = (zzai) zzapVarZzc2;
                zzgVar.zzg(zzaiVar.zzc() == null ? "" : zzaiVar.zzc(), zzapVarZzc2);
                return zzapVarZzc2;
            }
            if (iOrdinal == 60) {
                zzap zzapVarZzb7 = zzgVar.zzb((zzap) c70.m16439a(zzbl.SWITCH, 3, list, 0));
                zzap zzapVarZzb8 = zzgVar.zzb((zzap) list.get(1));
                zzap zzapVarZzb9 = zzgVar.zzb((zzap) list.get(2));
                if (!(zzapVarZzb8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzapVarZzb9 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zzapVarZzb8;
                zzae zzaeVar2 = (zzae) zzapVarZzb9;
                boolean z = false;
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    if (z || zzapVarZzb7.equals(zzgVar.zzb(zzaeVar.zze(i)))) {
                        zzapVarZzb = zzgVar.zzb(zzaeVar2.zze(i));
                        if (zzapVarZzb instanceof zzag) {
                            if (((zzag) zzapVarZzb).zzc().equals("break")) {
                                return zzap.zzf;
                            }
                            return zzapVarZzb;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.zzc() + 1 == zzaeVar2.zzc()) {
                    zzapVarZzb = zzgVar.zzb(zzaeVar2.zze(zzaeVar.zzc()));
                    if (zzapVarZzb instanceof zzag) {
                        String strZzc = ((zzag) zzapVarZzb).zzc();
                        if (!strZzc.equals("return")) {
                        }
                        return zzapVarZzb;
                    }
                }
                return zzap.zzf;
            }
            if (iOrdinal == 61) {
                return zzgVar.zzb((zzap) (zzgVar.zzb((zzap) c70.m16439a(zzbl.TERNARY, 3, list, 0)).zzg().booleanValue() ? list.get(1) : list.get(2)));
            }
            switch (iOrdinal) {
                case 11:
                    return zzgVar.zza().zzc(new zzae(list));
                case 12:
                    zzh.zzh(zzbl.BREAK.name(), 0, list);
                    return zzap.zzi;
                case 13:
                    break;
                default:
                    return zzb(str);
            }
        }
        if (!list.isEmpty()) {
            zzap zzapVarZzb10 = zzgVar.zzb((zzap) list.get(0));
            if (zzapVarZzb10 instanceof zzae) {
                return zzgVar.zzc((zzae) zzapVarZzb10);
            }
        }
        return zzap.zzf;
    }
}
