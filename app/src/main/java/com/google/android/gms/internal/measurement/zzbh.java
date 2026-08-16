package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import p000.c70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzapVarZzc = zzbfVar.zza((zzap) it.next()).zzc((zzae) zzapVar);
                if (zzapVarZzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzapVarZzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x027e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262 A[EDGE_INSN: B:95:0x0262->B:74:0x0262 BREAK  A[LOOP:3: B:78:0x0270->B:88:0x02a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzap zzapVarZzc;
        zzag zzagVar;
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 65) {
            zzap zzapVar = (zzap) c70.m16439a(zzbl.WHILE, 4, list, 0);
            zzap zzapVar2 = (zzap) list.get(1);
            zzap zzapVar3 = (zzap) list.get(2);
            zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(3));
            if (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                zzap zzapVarZzc2 = zzgVar.zzc((zzae) zzapVarZzb);
                if (zzapVarZzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzapVarZzc2;
                    if (!"break".equals(zzagVar2.zzc())) {
                        if ("return".equals(zzagVar2.zzc())) {
                            return zzagVar2;
                        }
                        while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                            zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                            if (zzapVarZzc instanceof zzag) {
                                zzagVar = (zzag) zzapVarZzc;
                                if ("break".equals(zzagVar.zzc())) {
                                    break;
                                    break;
                                }
                                if ("return".equals(zzagVar.zzc())) {
                                    return zzagVar;
                                }
                            }
                            zzgVar.zzb(zzapVar2);
                        }
                    }
                } else {
                    while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                        zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                        if (zzapVarZzc instanceof zzag) {
                            zzagVar = (zzag) zzapVarZzc;
                            if ("break".equals(zzagVar.zzc())) {
                                break;
                                break;
                            }
                            if ("return".equals(zzagVar.zzc())) {
                                return zzagVar;
                            }
                        }
                        zzgVar.zzb(zzapVar2);
                    }
                }
            } else {
                while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                    zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                    if (zzapVarZzc instanceof zzag) {
                        zzagVar = (zzag) zzapVarZzc;
                        if ("break".equals(zzagVar.zzc())) {
                            break;
                        }
                        if ("return".equals(zzagVar.zzc())) {
                            return zzagVar;
                        }
                    }
                    zzgVar.zzb(zzapVar2);
                }
            }
            return zzap.zzf;
        }
        switch (iOrdinal) {
            case 26:
                if (!(c70.m16439a(zzbl.FOR_IN, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strZzi = ((zzap) list.get(0)).zzi();
                return zzd(new zzbg(zzgVar, strZzi), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 27:
                if (!(c70.m16439a(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String strZzi2 = ((zzap) list.get(0)).zzi();
                return zzd(new zzbd(zzgVar, strZzi2), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 28:
                if (!(c70.m16439a(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strZzi3 = ((zzap) list.get(0)).zzi();
                return zzd(new zzbe(zzgVar, strZzi3), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 29:
                zzap zzapVarZzb2 = zzgVar.zzb((zzap) c70.m16439a(zzbl.FOR_LET, 4, list, 0));
                if (!(zzapVarZzb2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzapVarZzb2;
                zzap zzapVar4 = (zzap) list.get(1);
                zzap zzapVar5 = (zzap) list.get(2);
                zzap zzapVarZzb3 = zzgVar.zzb((zzap) list.get(3));
                zzg zzgVarZza = zzgVar.zza();
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    String strZzi4 = zzaeVar.zze(i).zzi();
                    zzgVarZza.zzg(strZzi4, zzgVar.zzd(strZzi4));
                }
                while (zzgVar.zzb(zzapVar4).zzg().booleanValue()) {
                    zzap zzapVarZzc3 = zzgVar.zzc((zzae) zzapVarZzb3);
                    if (zzapVarZzc3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzapVarZzc3;
                        if ("break".equals(zzagVar3.zzc())) {
                            return zzap.zzf;
                        }
                        if ("return".equals(zzagVar3.zzc())) {
                            return zzagVar3;
                        }
                    }
                    zzg zzgVarZza2 = zzgVar.zza();
                    for (int i2 = 0; i2 < zzaeVar.zzc(); i2++) {
                        String strZzi5 = zzaeVar.zze(i2).zzi();
                        zzgVarZza2.zzg(strZzi5, zzgVarZza.zzd(strZzi5));
                    }
                    zzgVarZza2.zzb(zzapVar5);
                    zzgVarZza = zzgVarZza2;
                }
                return zzap.zzf;
            case 30:
                if (!(c70.m16439a(zzbl.FOR_OF, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String strZzi6 = ((zzap) list.get(0)).zzi();
                return zze(new zzbg(zzgVar, strZzi6), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 31:
                if (!(c70.m16439a(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String strZzi7 = ((zzap) list.get(0)).zzi();
                return zze(new zzbd(zzgVar, strZzi7), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 32:
                if (!(c70.m16439a(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String strZzi8 = ((zzap) list.get(0)).zzi();
                return zze(new zzbe(zzgVar, strZzi8), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            default:
                return zzb(str);
        }
    }
}
