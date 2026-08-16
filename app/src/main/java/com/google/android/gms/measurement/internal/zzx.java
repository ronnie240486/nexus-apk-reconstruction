package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zznz;
import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.impl.AndroidLoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzx extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzek zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, String str, int i, com.google.android.gms.internal.measurement.zzek zzekVar) {
        super(str, i);
        this.zza = zzaaVar;
        this.zzh = zzekVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02df  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:112:0x0306  */
    /* JADX WARN: Code duplicated, block: B:115:0x0312  */
    /* JADX WARN: Code duplicated, block: B:122:0x0374  */
    /* JADX WARN: Code duplicated, block: B:123:0x0397  */
    /* JADX WARN: Code duplicated, block: B:158:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b9 A[EDGE_INSN: B:170:0x03b9->B:125:0x03b9 BREAK  A[LOOP:0: B:40:0x0121->B:46:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x03b9 A[EDGE_INSN: B:172:0x03b9->B:125:0x03b9 BREAK  A[LOOP:0: B:40:0x0121->B:46:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x03b9 A[EDGE_INSN: B:181:0x03b9->B:125:0x03b9 BREAK  A[LOOP:0: B:40:0x0121->B:46:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156 A[LOOP:0: B:40:0x0121->B:46:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x0187  */
    /* JADX WARN: Code duplicated, block: B:56:0x0191  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a A[PHI: r12
      0x019a: PHI (r12v13 java.lang.String) = (r12v12 java.lang.String), (r12v15 java.lang.String) binds: [B:62:0x01ad, B:55:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x019f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01af  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x0204  */
    /* JADX WARN: Code duplicated, block: B:77:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x023f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0275  */
    /* JADX WARN: Code duplicated, block: B:89:0x0287  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c1  */
    public final boolean zzd(Long l, Long l2, com.google.android.gms.internal.measurement.zzft zzftVar, long j, zzas zzasVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        ArrayMap arrayMap;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzem zzemVar;
        boolean z2;
        String strZze;
        zzef zzefVarZzk;
        String strZzd;
        String str;
        Object obj;
        zzef zzefVarZzk2;
        String strZzd2;
        String strZze2;
        String str2;
        Boolean boolZzh;
        Boolean boolZzg;
        zzeh zzehVarZzay;
        String str3;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzfx zzfxVar;
        String strZzg;
        Object objZzh;
        com.google.android.gms.internal.measurement.zzem zzemVar2;
        zznz.zzc();
        boolean zZzs = this.zza.zzt.zzf().zzs(this.zzb, zzdu.zzW);
        long j2 = this.zzh.zzn() ? zzasVar.zze : j;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzt.zzay().zzq(), 2)) {
            this.zza.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzt.zzj().zzd(this.zzh.zzg()));
            this.zza.zzt.zzay().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzt.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeh.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        boolean z3 = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z && !z3) {
            this.zza.zzt.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzek zzekVar = this.zzh;
        String strZzh = zzftVar.zzh();
        if (!zzekVar.zzo()) {
            hashSet = new HashSet();
            it = zzekVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    arrayMap = new ArrayMap();
                    it2 = zzftVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzekVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzemVar = (com.google.android.gms.internal.measurement.zzem) it3.next();
                                if (zzemVar.zzh() || !zzemVar.zzg()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                strZze = zzemVar.zze();
                                if (strZze.isEmpty()) {
                                    zzefVarZzk = this.zza.zzt.zzay().zzk();
                                    strZzd = this.zza.zzt.zzj().zzd(strZzh);
                                    str = "Event has empty param name. event";
                                } else {
                                    obj = arrayMap.get(strZze);
                                    if (obj instanceof Long) {
                                        if (!zzemVar.zzi()) {
                                            boolZzh = zzy.zzh(((Long) obj).longValue(), zzemVar.zzc());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No number filter for long param. event, param";
                                        }
                                    } else if (obj instanceof Double) {
                                        if (!zzemVar.zzi()) {
                                            boolZzg = zzy.zzg(((Double) obj).doubleValue(), zzemVar.zzc());
                                            if (boolZzg != null) {
                                                break;
                                            }
                                            if (boolZzg.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No number filter for double param. event, param";
                                        }
                                    } else if (obj instanceof String) {
                                        if (zzemVar.zzk()) {
                                            boolZzi = zzy.zzf((String) obj, zzemVar.zzd(), this.zza.zzt.zzay());
                                        } else if (zzemVar.zzi()) {
                                            str3 = (String) obj;
                                            if (zzkv.zzx(str3)) {
                                                boolZzi = zzy.zzi(str3, zzemVar.zzc());
                                            } else {
                                                zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                                strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                                strZze2 = this.zza.zzt.zzj().zze(strZze);
                                                str2 = "Invalid param value for number filter. event, param";
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No filter for String param. event, param";
                                        }
                                        if (boolZzi != null) {
                                            break;
                                        }
                                        if (boolZzi.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else {
                                        zzehVarZzay = this.zza.zzt.zzay();
                                        if (obj == null) {
                                            zzehVarZzay.zzj().zzc("Missing param for filter. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        zzefVarZzk2 = zzehVarZzay.zzk();
                                        strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                        strZze2 = this.zza.zzt.zzj().zze(strZze);
                                        str2 = "Unknown param type. event, param";
                                    }
                                }
                            }
                        } else {
                            zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                            if (!hashSet.contains(zzfxVar.zzg())) {
                                if (zzfxVar.zzw()) {
                                    strZzg = zzfxVar.zzg();
                                    if (zzfxVar.zzw()) {
                                        objZzh = Long.valueOf(zzfxVar.zzd());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfxVar.zzu()) {
                                    strZzg = zzfxVar.zzg();
                                    if (zzfxVar.zzu()) {
                                        objZzh = Double.valueOf(zzfxVar.zza());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfxVar.zzy()) {
                                    strZzg = zzfxVar.zzg();
                                    objZzh = zzfxVar.zzh();
                                } else {
                                    zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                    strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                    strZze2 = this.zza.zzt.zzj().zze(zzfxVar.zzg());
                                    str2 = "Unknown value for param. event, param";
                                }
                                arrayMap.put(strZzg, objZzh);
                            }
                        }
                        zzefVarZzk2.zzc(str2, strZzd2, strZze2);
                        break;
                    }
                }
                zzemVar2 = (com.google.android.gms.internal.measurement.zzem) it.next();
                if (zzemVar2.zze().isEmpty()) {
                    zzefVarZzk = this.zza.zzt.zzay().zzk();
                    strZzd = this.zza.zzt.zzj().zzd(strZzh);
                    str = "null or empty param name in filter. event";
                } else {
                    hashSet.add(zzemVar2.zze());
                }
                zzefVarZzk.zzb(str, strZzd);
                break;
            }
        }
        Boolean boolZzh2 = zzy.zzh(j2, zzekVar.zzf());
        if (boolZzh2 != null) {
            if (!boolZzh2.booleanValue()) {
                bool = Boolean.FALSE;
                break;
            }
            hashSet = new HashSet();
            it = zzekVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    arrayMap = new ArrayMap();
                    it2 = zzftVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzekVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzemVar = (com.google.android.gms.internal.measurement.zzem) it3.next();
                                if (zzemVar.zzh()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strZze = zzemVar.zze();
                                if (strZze.isEmpty()) {
                                    zzefVarZzk = this.zza.zzt.zzay().zzk();
                                    strZzd = this.zza.zzt.zzj().zzd(strZzh);
                                    str = "Event has empty param name. event";
                                } else {
                                    obj = arrayMap.get(strZze);
                                    if (obj instanceof Long) {
                                        if (!zzemVar.zzi()) {
                                            boolZzh = zzy.zzh(((Long) obj).longValue(), zzemVar.zzc());
                                            if (boolZzh != null) {
                                                break;
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No number filter for long param. event, param";
                                        }
                                    } else if (obj instanceof Double) {
                                        if (!zzemVar.zzi()) {
                                            boolZzg = zzy.zzg(((Double) obj).doubleValue(), zzemVar.zzc());
                                            if (boolZzg != null) {
                                                break;
                                                break;
                                            }
                                            if (boolZzg.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No number filter for double param. event, param";
                                        }
                                    } else if (obj instanceof String) {
                                        if (zzemVar.zzk()) {
                                            boolZzi = zzy.zzf((String) obj, zzemVar.zzd(), this.zza.zzt.zzay());
                                        } else if (zzemVar.zzi()) {
                                            str3 = (String) obj;
                                            if (zzkv.zzx(str3)) {
                                                boolZzi = zzy.zzi(str3, zzemVar.zzc());
                                            } else {
                                                zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                                strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                                strZze2 = this.zza.zzt.zzj().zze(strZze);
                                                str2 = "Invalid param value for number filter. event, param";
                                            }
                                        } else {
                                            zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                            strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzt.zzj().zze(strZze);
                                            str2 = "No filter for String param. event, param";
                                        }
                                        if (boolZzi != null) {
                                            break;
                                            break;
                                        }
                                        if (boolZzi.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else {
                                        zzehVarZzay = this.zza.zzt.zzay();
                                        if (obj == null) {
                                            zzehVarZzay.zzj().zzc("Missing param for filter. event, param", this.zza.zzt.zzj().zzd(strZzh), this.zza.zzt.zzj().zze(strZze));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        zzefVarZzk2 = zzehVarZzay.zzk();
                                        strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                        strZze2 = this.zza.zzt.zzj().zze(strZze);
                                        str2 = "Unknown param type. event, param";
                                    }
                                }
                            }
                        } else {
                            zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                            if (!hashSet.contains(zzfxVar.zzg())) {
                                if (zzfxVar.zzw()) {
                                    strZzg = zzfxVar.zzg();
                                    if (zzfxVar.zzw()) {
                                        objZzh = Long.valueOf(zzfxVar.zzd());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfxVar.zzu()) {
                                    strZzg = zzfxVar.zzg();
                                    if (zzfxVar.zzu()) {
                                        objZzh = Double.valueOf(zzfxVar.zza());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfxVar.zzy()) {
                                    strZzg = zzfxVar.zzg();
                                    objZzh = zzfxVar.zzh();
                                } else {
                                    zzefVarZzk2 = this.zza.zzt.zzay().zzk();
                                    strZzd2 = this.zza.zzt.zzj().zzd(strZzh);
                                    strZze2 = this.zza.zzt.zzj().zze(zzfxVar.zzg());
                                    str2 = "Unknown value for param. event, param";
                                }
                                arrayMap.put(strZzg, objZzh);
                            }
                        }
                        zzefVarZzk2.zzc(str2, strZzd2, strZze2);
                        break;
                    }
                }
                zzemVar2 = (com.google.android.gms.internal.measurement.zzem) it.next();
                if (zzemVar2.zze().isEmpty()) {
                    zzefVarZzk = this.zza.zzt.zzay().zzk();
                    strZzd = this.zza.zzt.zzj().zzd(strZzh);
                    str = "null or empty param name in filter. event";
                } else {
                    hashSet.add(zzemVar2.zze());
                }
                zzefVarZzk.zzb(str, strZzd);
                break;
            }
        }
        this.zza.zzt.zzay().zzj().zzb("Event filter result", bool == null ? AndroidLoggerFactory.f17234b : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (z3 && zzftVar.zzu()) {
            Long lValueOf = Long.valueOf(zzftVar.zzd());
            if (this.zzh.zzm()) {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l;
                }
                this.zzg = lValueOf;
            } else {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l2;
                }
                this.zzf = lValueOf;
            }
        }
        return true;
    }
}
