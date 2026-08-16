package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b A[Catch: all -> 0x009f, SQLiteException -> 0x00a1, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x00a1, blocks: (B:18:0x0085, B:20:0x008b, B:28:0x00a4, B:29:0x00b1, B:30:0x00c1, B:33:0x00ca), top: B:85:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v10, types: [long] */
    public final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzef zzefVarZzh;
        String str2;
        zzam zzamVarZzi;
        SQLiteException e;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        ?? LongValue;
        String strZzh = zzftVar.zzh();
        List listZzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzkv.zzC(zzftVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                strZzh = (String) zzkv.zzC(zzftVar, "_en");
                ?? r7 = 0;
                if (TextUtils.isEmpty(strZzh)) {
                    this.zza.zzt.zzay().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzamVarZzi = this.zza.zzf.zzi();
                    zzamVarZzi.zzg();
                    zzamVarZzi.zzW();
                    try {
                        try {
                            cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (!cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaC(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e2) {
                                        zzamVarZzi.zzt.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeh.zzn(str), l, e2);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                                        return null;
                                    }
                                    this.zzb = (com.google.android.gms.internal.measurement.zzft) obj;
                                    this.zzd = ((Long) pairCreate.second).longValue();
                                    this.zza.zzf.zzu();
                                    this.zzc = (Long) zzkv.zzC(this.zzb, "_eid");
                                } else {
                                    zzamVarZzi.zzt.zzay().zzj().zza("Main event not found");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                zzamVarZzi.zzt.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7 = LongValue;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r7 != 0) {
                            r7.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                    return null;
                }
                LongValue = l.longValue();
                if (LongValue != this.zzc.longValue()) {
                    zzamVarZzi = this.zza.zzf.zzi();
                    zzamVarZzi.zzg();
                    zzamVarZzi.zzW();
                    cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                    if (!cursorRawQuery.moveToFirst()) {
                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaC(), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        if (pairCreate != null) {
                        }
                        this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                        return null;
                    }
                    zzamVarZzi.zzt.zzay().zzj().zza("Main event not found");
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzt.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", strZzh, l);
                    return null;
                }
                long j = this.zzd - 1;
                this.zzd = j;
                zzkt zzktVar = this.zza.zzf;
                if (j <= 0) {
                    zzam zzamVarZzi2 = zzktVar.zzi();
                    zzamVarZzi2.zzg();
                    zzamVarZzi2.zzt.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzamVarZzi2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e5) {
                        zzamVarZzi2.zzt.zzay().zzd().zzb("Error clearing complex main event", e5);
                    }
                } else {
                    zzktVar.zzi().zzJ(str, l, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzkv.zzB(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzefVarZzh = this.zza.zzt.zzay().zzh();
                    str2 = "No unique parameters in main event. eventName";
                    zzefVarZzh.zzb(str2, strZzh);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
            } else {
                this.zzc = l;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object objZzC = zzkv.zzC(zzftVar, "_epc");
                long jLongValue = ((Long) (objZzC != null ? objZzC : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzefVarZzh = this.zza.zzt.zzay().zzh();
                    str2 = "Complex event with zero extra param count. eventName";
                    zzefVarZzh.zzb(str2, strZzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzby();
        zzfsVar.zzi(strZzh);
        zzfsVar.zzg();
        zzfsVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC();
    }
}
