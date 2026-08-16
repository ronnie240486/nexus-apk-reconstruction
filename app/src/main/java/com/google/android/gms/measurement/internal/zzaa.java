package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0258  */
    /* JADX WARN: Code duplicated, block: B:101:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x026b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0297 A[Catch: all -> 0x02b2, SQLiteException -> 0x02b5, LOOP:11: B:107:0x0297->B:516:?, LOOP_START, TryCatch #8 {all -> 0x02b2, blocks: (B:105:0x0291, B:107:0x0297, B:109:0x02a8, B:115:0x02b7, B:118:0x02cc, B:126:0x02d9), top: B:448:0x0287 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02a8 A[Catch: all -> 0x02b2, SQLiteException -> 0x02b5, TryCatch #8 {all -> 0x02b2, blocks: (B:105:0x0291, B:107:0x0297, B:109:0x02a8, B:115:0x02b7, B:118:0x02cc, B:126:0x02d9), top: B:448:0x0287 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02cc A[Catch: all -> 0x02b2, SQLiteException -> 0x02b5, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x02b2, blocks: (B:105:0x0291, B:107:0x0297, B:109:0x02a8, B:115:0x02b7, B:118:0x02cc, B:126:0x02d9), top: B:448:0x0287 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0308  */
    /* JADX WARN: Code duplicated, block: B:135:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x032d  */
    /* JADX WARN: Code duplicated, block: B:178:0x044c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0450  */
    /* JADX WARN: Code duplicated, block: B:184:0x045d  */
    /* JADX WARN: Code duplicated, block: B:186:0x047e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0493  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:213:0x050f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0518  */
    /* JADX WARN: Code duplicated, block: B:218:0x0522  */
    /* JADX WARN: Code duplicated, block: B:220:0x0544  */
    /* JADX WARN: Code duplicated, block: B:221:0x0548  */
    /* JADX WARN: Code duplicated, block: B:226:0x0560 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x0606  */
    /* JADX WARN: Code duplicated, block: B:254:0x061b  */
    /* JADX WARN: Code duplicated, block: B:258:0x063f  */
    /* JADX WARN: Code duplicated, block: B:259:0x067e  */
    /* JADX WARN: Code duplicated, block: B:262:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:268:0x070f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0737  */
    /* JADX WARN: Code duplicated, block: B:281:0x0747  */
    /* JADX WARN: Code duplicated, block: B:290:0x0772 A[LOOP:8: B:269:0x0711->B:290:0x0772, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x0775  */
    /* JADX WARN: Code duplicated, block: B:293:0x077d A[PHI: r0 r5 r22 r26 r27
      0x077d: PHI (r0v99 java.util.Map) = (r0v101 java.util.Map), (r0v107 java.util.Map) binds: [B:305:0x07ab, B:292:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r5v29 android.database.Cursor) = (r5v30 android.database.Cursor), (r5v31 android.database.Cursor) binds: [B:305:0x07ab, B:292:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r22v11 com.google.android.gms.measurement.internal.zzas) = (r22v12 com.google.android.gms.measurement.internal.zzas), (r22v16 com.google.android.gms.measurement.internal.zzas) binds: [B:305:0x07ab, B:292:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r26v7 java.lang.String) = (r26v8 java.lang.String), (r26v11 java.lang.String) binds: [B:305:0x07ab, B:292:0x0779] A[DONT_GENERATE, DONT_INLINE]
      0x077d: PHI (r27v8 java.lang.String) = (r27v9 java.lang.String), (r27v11 java.lang.String) binds: [B:305:0x07ab, B:292:0x0779] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:315:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:321:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:323:0x082e A[LOOP:10: B:319:0x07f9->B:323:0x082e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x0846  */
    /* JADX WARN: Code duplicated, block: B:333:0x0864  */
    /* JADX WARN: Code duplicated, block: B:336:0x0873  */
    /* JADX WARN: Code duplicated, block: B:338:0x0886  */
    /* JADX WARN: Code duplicated, block: B:342:0x08c3 A[Catch: all -> 0x08f2, SQLiteException -> 0x08f4, LOOP:4: B:342:0x08c3->B:361:0x0921, LOOP_START, PHI: r3
      0x08c3: PHI (r3v65 java.util.Iterator) = (r3v58 java.util.Iterator), (r3v67 java.util.Iterator) binds: [B:341:0x08c1, B:361:0x0921] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {all -> 0x08f2, blocks: (B:340:0x08bd, B:342:0x08c3, B:343:0x08c8, B:345:0x08d9, B:347:0x08e9, B:353:0x08fa, B:358:0x0916, B:355:0x0901, B:357:0x090f, B:374:0x093b, B:365:0x0928), top: B:449:0x08bd }] */
    /* JADX WARN: Code duplicated, block: B:347:0x08e9 A[Catch: all -> 0x08f2, SQLiteException -> 0x08f4, TryCatch #9 {all -> 0x08f2, blocks: (B:340:0x08bd, B:342:0x08c3, B:343:0x08c8, B:345:0x08d9, B:347:0x08e9, B:353:0x08fa, B:358:0x0916, B:355:0x0901, B:357:0x090f, B:374:0x093b, B:365:0x0928), top: B:449:0x08bd }] */
    /* JADX WARN: Code duplicated, block: B:352:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:361:0x0921 A[LOOP:4: B:342:0x08c3->B:361:0x0921, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:364:0x0926  */
    /* JADX WARN: Code duplicated, block: B:381:0x095d  */
    /* JADX WARN: Code duplicated, block: B:385:0x0971  */
    /* JADX WARN: Code duplicated, block: B:389:0x0998  */
    /* JADX WARN: Code duplicated, block: B:392:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:394:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:396:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:397:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:402:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:411:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:412:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:416:0x0a72 A[PHI: r64
      0x0a72: PHI (r64v6 java.util.Map) = (r64v7 java.util.Map), (r0v128 java.util.Map) binds: [B:415:0x0a70, B:413:0x0a64] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:421:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:426:0x0af1 A[Catch: SQLiteException -> 0x0b07, TRY_LEAVE, TryCatch #26 {SQLiteException -> 0x0b07, blocks: (B:424:0x0ae7, B:426:0x0af1), top: B:466:0x0ae7 }] */
    /* JADX WARN: Code duplicated, block: B:488:0x0b04 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x091c A[EDGE_INSN: B:493:0x091c->B:360:0x091c BREAK  A[LOOP:4: B:342:0x08c3->B:361:0x0921], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0983 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0a77 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a6e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0a44 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0615 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x076d A[EDGE_INSN: B:506:0x076d->B:289:0x076d BREAK  A[LOOP:8: B:269:0x0711->B:290:0x0772], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0840 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x083a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x05be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x048d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x04d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x0333 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0215 A[EDGE_INSN: B:565:0x0215->B:81:0x0215 BREAK  A[LOOP:22: B:70:0x01c9->B:82:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ac A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #14 {all -> 0x01ba, blocks: (B:60:0x01a6, B:62:0x01ac, B:69:0x01c4, B:70:0x01c9, B:71:0x01d3, B:72:0x01e3, B:79:0x020f, B:74:0x01f2, B:76:0x0202, B:78:0x0208, B:94:0x0235), top: B:456:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4 A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #14 {all -> 0x01ba, blocks: (B:60:0x01a6, B:62:0x01ac, B:69:0x01c4, B:70:0x01c9, B:71:0x01d3, B:72:0x01e3, B:79:0x020f, B:74:0x01f2, B:76:0x0202, B:78:0x0208, B:94:0x0235), top: B:456:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x021b A[LOOP:22: B:70:0x01c9->B:82:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v48, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @WorkerThread
    public final List zza(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        ?? r5;
        Map map;
        Cursor cursor;
        String str2;
        Cursor cursorQuery;
        Map map2;
        String str3;
        Map map3;
        String str4;
        String str5;
        String str6;
        com.google.android.gms.internal.measurement.zzgi zzgiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        int i3;
        String str7;
        Iterator it;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        Long lValueOf;
        String str8;
        Map arrayMap2;
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r6;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzgi zzgiVar2;
        List list4;
        Map map4;
        Integer numValueOf;
        List arrayList;
        zzw zzwVar;
        ArrayMap arrayMap4;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzft zzftVar;
        com.google.android.gms.internal.measurement.zzft zzftVarZza;
        zzam zzamVarZzi;
        String str9;
        String strZzh;
        zzas zzasVarZzn;
        zzas zzasVar;
        long j;
        String strZzh2;
        Map mapEmptyMap;
        zzas zzasVar2;
        Iterator it4;
        Integer num2;
        int iIntValue;
        Iterator it5;
        boolean zZzd;
        Map map5;
        Iterator it6;
        zzx zzxVar;
        zzam zzamVarZzi2;
        String str10;
        ArrayMap arrayMap5;
        String str11;
        String str12;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List list5;
        List arrayList2;
        String str13;
        ArrayMap arrayMap6;
        Iterator it7;
        String strZzf;
        Map mapEmptyMap2;
        String str14;
        String str15;
        Iterator it8;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzet zzetVar;
        Integer numValueOf3;
        zzz zzzVar;
        Integer numValueOf4;
        zzam zzamVarZzi3;
        String str16;
        ArrayMap arrayMap7;
        Cursor cursor2;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list6;
        List arrayList3;
        String str17;
        ArrayList arrayList4;
        zzam zzamVarZzi4;
        String str18;
        ContentValues contentValues;
        ArrayMap arrayMap8;
        int i4;
        ?? r7;
        Cursor cursorQuery4;
        List arrayList5;
        String str19 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it9 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it9.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it9.next()).zzh())) {
                z = true;
                break;
            }
        }
        zznz.zzc();
        boolean zZzs = this.zzt.zzf().zzs(this.zza, zzdu.zzW);
        zznz.zzc();
        boolean zZzs2 = this.zzt.zzf().zzs(this.zza, zzdu.zzV);
        if (z) {
            zzam zzamVarZzi5 = this.zzf.zzi();
            String str20 = this.zza;
            zzamVarZzi5.zzW();
            zzamVarZzi5.zzg();
            Preconditions.checkNotEmpty(str20);
            ContentValues contentValues2 = new ContentValues();
            ?? r8 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                r8 = new String[]{str20};
                zzamVarZzi5.zzh().update("events", contentValues2, "app_id = ?", r8);
                r5 = r8;
            } catch (SQLiteException e) {
                zzamVarZzi5.zzt.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeh.zzn(str20), e);
                r5 = r8;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str21 = "Failed to merge filter. appId";
        String str22 = "Database error querying filters. appId";
        String str23 = "data";
        String str24 = "audience_id";
        if (zZzs2 && zZzs) {
            zzam zzamVarZzi6 = this.zzf.zzi();
            String str25 = this.zza;
            Preconditions.checkNotEmpty(str25);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzamVarZzi6.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str25}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery4.getBlob(i2))).zzaC();
                                    if (zzekVar.zzo()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list7 = (List) arrayMap9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzekVar);
                                    }
                                } catch (IOException e2) {
                                    zzamVarZzi6.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str25), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzamVarZzi6.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str25), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzam zzamVarZzi7 = this.zzf.zzi();
                        String str26 = this.zza;
                        zzamVarZzi7.zzW();
                        zzamVarZzi7.zzg();
                        Preconditions.checkNotEmpty(str26);
                        cursorQuery = zzamVarZzi7.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str26}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursorQuery.getBlob(1))).zzaC());
                                            str2 = str24;
                                        } catch (IOException e4) {
                                            str2 = str24;
                                            try {
                                                zzamVarZzi7.zzt.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(str26), Integer.valueOf(i4), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str23 = str23;
                                                zzamVarZzi7.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str26), e);
                                                Map mapEmptyMap4 = Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap4;
                                                if (map2.isEmpty()) {
                                                    str6 = "Database error querying filters. appId";
                                                    str4 = "Failed to merge filter. appId";
                                                    str5 = str2;
                                                } else {
                                                    HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                    if (z) {
                                                        String str27 = this.zza;
                                                        zzam zzamVarZzi8 = this.zzf.zzi();
                                                        str8 = this.zza;
                                                        zzamVarZzi8.zzW();
                                                        zzamVarZzi8.zzg();
                                                        Preconditions.checkNotEmpty(str8);
                                                        arrayMap2 = new ArrayMap();
                                                        sQLiteDatabaseZzh = zzamVarZzi8.zzh();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) arrayMap2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                arrayMap2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        arrayMap2 = Collections.emptyMap();
                                                                    }
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    zzamVarZzi8.zzt.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeh.zzn(str8), e);
                                                                    arrayMap2 = Collections.emptyMap();
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str27);
                                                                    Preconditions.checkNotNull(map2);
                                                                    arrayMap3 = new ArrayMap();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                                                            list4 = (List) arrayMap2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap2;
                                                                            arrayMap3.put(num, zzgiVar2);
                                                                            arrayMap2 = map4;
                                                                            it2 = it2;
                                                                            str22 = str22;
                                                                        }
                                                                    }
                                                                    str3 = str22;
                                                                    map3 = arrayMap3;
                                                                    for (Integer num3 : hashSet) {
                                                                        num3.intValue();
                                                                        zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        arrayMap = new ArrayMap();
                                                                        if (zzgiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzj()) {
                                                                                if (zzfrVar.zzh()) {
                                                                                    Integer numValueOf7 = Integer.valueOf(zzfrVar.zza());
                                                                                    if (zzfrVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    arrayMap.put(numValueOf7, lValueOf);
                                                                                }
                                                                            }
                                                                        }
                                                                        ArrayMap arrayMap10 = new ArrayMap();
                                                                        if (zzgiVar != null) {
                                                                            it = zzgiVar.zzm().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                                                                if (!zzgkVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map6 = map3;
                                                                        if (zzgiVar != null) {
                                                                            i3 = 0;
                                                                            while (i3 < zzgiVar.zzd() * 64) {
                                                                                if (zzkv.zzv(zzgiVar.zzn(), i3)) {
                                                                                    str7 = str21;
                                                                                    this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                                                                    bitSet2.set(i3);
                                                                                    if (zzkv.zzv(zzgiVar.zzk(), i3)) {
                                                                                        bitSet.set(i3);
                                                                                    }
                                                                                    i3++;
                                                                                    str21 = str7;
                                                                                } else {
                                                                                    str7 = str21;
                                                                                }
                                                                                arrayMap.remove(Integer.valueOf(i3));
                                                                                i3++;
                                                                                str21 = str7;
                                                                            }
                                                                        }
                                                                        String str28 = str21;
                                                                        com.google.android.gms.internal.measurement.zzgi zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num3);
                                                                        if (!zZzs2) {
                                                                        }
                                                                        this.zzc.put(num3, new zzu(this, this.zza, zzgiVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                        str21 = str28;
                                                                        zZzs = zZzs;
                                                                        map = map;
                                                                        map3 = map6;
                                                                        str2 = str2;
                                                                        map2 = map2;
                                                                    }
                                                                    str4 = str21;
                                                                    str5 = str2;
                                                                    str6 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        zzwVar = new zzw(this, null);
                                                                        arrayMap4 = new ArrayMap();
                                                                        it3 = list.iterator();
                                                                        while (it3.hasNext()) {
                                                                            zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                                                            zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                                                            if (zzftVarZza != null) {
                                                                                zzamVarZzi = this.zzf.zzi();
                                                                                str9 = this.zza;
                                                                                strZzh = zzftVarZza.zzh();
                                                                                zzasVarZzn = zzamVarZzi.zzn(str9, zzftVar.zzh());
                                                                                if (zzasVarZzn == null) {
                                                                                    zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str9), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                                                                    zzasVar = new zzas(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                                                } else {
                                                                                    zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                                                }
                                                                                this.zzf.zzi().zzE(zzasVar);
                                                                                j = zzasVar.zzc;
                                                                                strZzh2 = zzftVarZza.zzh();
                                                                                mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                                                if (mapEmptyMap == null) {
                                                                                    zzamVarZzi2 = this.zzf.zzi();
                                                                                    str10 = this.zza;
                                                                                    zzamVarZzi2.zzW();
                                                                                    zzamVarZzi2.zzg();
                                                                                    Preconditions.checkNotEmpty(str10);
                                                                                    Preconditions.checkNotEmpty(strZzh2);
                                                                                    arrayMap5 = new ArrayMap();
                                                                                    str11 = str5;
                                                                                    str12 = str23;
                                                                                    try {
                                                                                        try {
                                                                                            str23 = str12;
                                                                                            try {
                                                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str11, str12}, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                                            str5 = str11;
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        com.google.android.gms.internal.measurement.zzek zzekVar2 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                                                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                        list5 = (List) arrayMap5.get(numValueOf2);
                                                                                                                        if (list5 == null) {
                                                                                                                            zzasVar2 = zzasVar;
                                                                                                                            try {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                arrayMap5.put(numValueOf2, arrayList2);
                                                                                                                            } catch (SQLiteException e7) {
                                                                                                                                e = e7;
                                                                                                                                zzamVarZzi2.zzt.zzay().zzd().zzc(str6, zzeh.zzn(str10), e);
                                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                                if (cursorQuery2 != null) {
                                                                                                                                    cursorQuery2.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            zzasVar2 = zzasVar;
                                                                                                                            arrayList2 = list5;
                                                                                                                        }
                                                                                                                        arrayList2.add(zzekVar2);
                                                                                                                    } catch (IOException e8) {
                                                                                                                        zzasVar2 = zzasVar;
                                                                                                                        zzamVarZzi2.zzt.zzay().zzd().zzc(str4, zzeh.zzn(str10), e8);
                                                                                                                    }
                                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    zzasVar = zzasVar2;
                                                                                                                } catch (SQLiteException e9) {
                                                                                                                    e = e9;
                                                                                                                    zzasVar2 = zzasVar;
                                                                                                                }
                                                                                                            }
                                                                                                            cursorQuery2.close();
                                                                                                            mapEmptyMap = arrayMap5;
                                                                                                        } else {
                                                                                                            zzasVar2 = zzasVar;
                                                                                                            str5 = str11;
                                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e10) {
                                                                                                    e = e10;
                                                                                                    zzasVar2 = zzasVar;
                                                                                                    str5 = str11;
                                                                                                }
                                                                                            } catch (SQLiteException e11) {
                                                                                                e = e11;
                                                                                                zzasVar2 = zzasVar;
                                                                                                str5 = str11;
                                                                                                cursorQuery2 = null;
                                                                                                zzamVarZzi2.zzt.zzay().zzd().zzc(str6, zzeh.zzn(str10), e);
                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                it4 = mapEmptyMap.keySet().iterator();
                                                                                                while (it4.hasNext()) {
                                                                                                    num2 = (Integer) it4.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.zzb.contains(num2)) {
                                                                                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num2);
                                                                                                    } else {
                                                                                                        it5 = ((List) mapEmptyMap.get(num2)).iterator();
                                                                                                        zZzd = true;
                                                                                                        while (true) {
                                                                                                            if (!it5.hasNext()) {
                                                                                                                map5 = mapEmptyMap;
                                                                                                                it6 = it4;
                                                                                                                break;
                                                                                                            }
                                                                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                                                                                            zzxVar = new zzx(this, this.zza, iIntValue, zzekVar3);
                                                                                                            map5 = mapEmptyMap;
                                                                                                            it6 = it4;
                                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue, zzekVar3.zzb()));
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(num2);
                                                                                                                break;
                                                                                                            }
                                                                                                            zzd(num2).zzc(zzxVar);
                                                                                                            mapEmptyMap = map5;
                                                                                                            it4 = it6;
                                                                                                        }
                                                                                                        if (!zZzd) {
                                                                                                            this.zzb.add(num2);
                                                                                                        }
                                                                                                        mapEmptyMap = map5;
                                                                                                        it4 = it6;
                                                                                                    }
                                                                                                }
                                                                                                zzwVar = zzwVar;
                                                                                                it3 = it3;
                                                                                                str19 = str19;
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            th = th2;
                                                                                            cursorQuery2 = null;
                                                                                        }
                                                                                    } catch (SQLiteException e12) {
                                                                                        e = e12;
                                                                                        str23 = str12;
                                                                                    }
                                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                } else {
                                                                                    zzasVar2 = zzasVar;
                                                                                }
                                                                                it4 = mapEmptyMap.keySet().iterator();
                                                                                while (it4.hasNext()) {
                                                                                    num2 = (Integer) it4.next();
                                                                                    iIntValue = num2.intValue();
                                                                                    if (this.zzb.contains(num2)) {
                                                                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num2);
                                                                                    } else {
                                                                                        it5 = ((List) mapEmptyMap.get(num2)).iterator();
                                                                                        zZzd = true;
                                                                                        while (true) {
                                                                                            if (!it5.hasNext()) {
                                                                                                map5 = mapEmptyMap;
                                                                                                it6 = it4;
                                                                                                break;
                                                                                            }
                                                                                            com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                                                                            zzxVar = new zzx(this, this.zza, iIntValue, zzekVar4);
                                                                                            map5 = mapEmptyMap;
                                                                                            it6 = it4;
                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue, zzekVar4.zzb()));
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(num2);
                                                                                                break;
                                                                                            }
                                                                                            zzd(num2).zzc(zzxVar);
                                                                                            mapEmptyMap = map5;
                                                                                            it4 = it6;
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(num2);
                                                                                        }
                                                                                        mapEmptyMap = map5;
                                                                                        it4 = it6;
                                                                                    }
                                                                                }
                                                                                zzwVar = zzwVar;
                                                                                it3 = it3;
                                                                                str19 = str19;
                                                                            }
                                                                        }
                                                                    }
                                                                    str13 = str19;
                                                                    if (!list2.isEmpty()) {
                                                                        arrayMap6 = new ArrayMap();
                                                                        it7 = list2.iterator();
                                                                        while (it7.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it7.next();
                                                                            strZzf = zzgmVar.zzf();
                                                                            mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                                            if (mapEmptyMap2 == null) {
                                                                                zzamVarZzi3 = this.zzf.zzi();
                                                                                str16 = this.zza;
                                                                                zzamVarZzi3.zzW();
                                                                                zzamVarZzi3.zzg();
                                                                                Preconditions.checkNotEmpty(str16);
                                                                                Preconditions.checkNotEmpty(strZzf);
                                                                                arrayMap7 = new ArrayMap();
                                                                                str14 = str5;
                                                                                str15 = str23;
                                                                                try {
                                                                                    cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                                                                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list6 = (List) arrayMap7.get(numValueOf5);
                                                                                                        if (list6 == null) {
                                                                                                            arrayList3 = new ArrayList();
                                                                                                            arrayMap7.put(numValueOf5, arrayList3);
                                                                                                        } else {
                                                                                                            arrayList3 = list6;
                                                                                                        }
                                                                                                        arrayList3.add(zzetVar2);
                                                                                                    } catch (IOException e13) {
                                                                                                        zzamVarZzi3.zzt.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(str16), e13);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it7 = it7;
                                                                                                    } catch (SQLiteException e14) {
                                                                                                        e = e14;
                                                                                                        zzamVarZzi3.zzt.zzay().zzd().zzc(str6, zzeh.zzn(str16), e);
                                                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                mapEmptyMap2 = arrayMap7;
                                                                                            } else {
                                                                                                it7 = it7;
                                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor2 = cursorQuery3;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        it7 = it7;
                                                                                    }
                                                                                } catch (SQLiteException e16) {
                                                                                    e = e16;
                                                                                    it7 = it7;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor2 = null;
                                                                                }
                                                                                arrayMap6.put(strZzf, mapEmptyMap2);
                                                                            } else {
                                                                                it7 = it7;
                                                                                str14 = str5;
                                                                                str15 = str23;
                                                                            }
                                                                            for (Integer num4 : mapEmptyMap2.keySet()) {
                                                                                int iIntValue2 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                                                                    break;
                                                                                }
                                                                                it8 = ((List) mapEmptyMap2.get(num4)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        zzetVar = (com.google.android.gms.internal.measurement.zzet) it8.next();
                                                                                        if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                                                            zzef zzefVarZzj = this.zzt.zzay().zzj();
                                                                                            if (zzetVar.zzj()) {
                                                                                                numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            zzefVarZzj.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                                            this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                                                                        }
                                                                                        if (zzetVar.zzj()) {
                                                                                        }
                                                                                        zzef zzefVarZzk = this.zzt.zzay().zzk();
                                                                                        Object objZzn = zzeh.zzn(this.zza);
                                                                                        if (zzetVar.zzj()) {
                                                                                            numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        zzefVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf3));
                                                                                        this.zzb.add(num4);
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                    } else {
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    zzd(num4).zzc(zzzVar);
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                }
                                                                            }
                                                                            it7 = it7;
                                                                            str23 = str15;
                                                                            str5 = str14;
                                                                        }
                                                                    }
                                                                    str17 = str5;
                                                                    arrayList4 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue3 = num5.intValue();
                                                                        zzu zzuVar = (zzu) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzuVar);
                                                                        com.google.android.gms.internal.measurement.zzfp zzfpVarZza = zzuVar.zza(iIntValue3);
                                                                        arrayList4.add(zzfpVarZza);
                                                                        zzamVarZzi4 = this.zzf.zzi();
                                                                        str18 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzgi zzgiVarZzd = zzfpVarZza.zzd();
                                                                        zzamVarZzi4.zzW();
                                                                        zzamVarZzi4.zzg();
                                                                        Preconditions.checkNotEmpty(str18);
                                                                        Preconditions.checkNotNull(zzgiVarZzd);
                                                                        byte[] bArrZzbu = zzgiVarZzd.zzbu();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str18);
                                                                        contentValues.put(str17, num5);
                                                                        String str29 = str13;
                                                                        contentValues.put(str29, bArrZzbu);
                                                                        try {
                                                                            try {
                                                                                if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzamVarZzi4.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str18));
                                                                                }
                                                                            } catch (SQLiteException e17) {
                                                                                e = e17;
                                                                                zzamVarZzi4.zzt.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(str18), e);
                                                                            }
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                        }
                                                                        str13 = str29;
                                                                    }
                                                                    return arrayList4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                r6 = sQLiteDatabaseZzh;
                                                                if (r6 != 0) {
                                                                    r6.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e19) {
                                                            e = e19;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r6 = 0;
                                                            if (r6 != 0) {
                                                                r6.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        Preconditions.checkNotEmpty(str27);
                                                        Preconditions.checkNotNull(map2);
                                                        arrayMap3 = new ArrayMap();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                                                list4 = (List) arrayMap2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = arrayMap2;
                                                                arrayMap3.put(num, zzgiVar2);
                                                                arrayMap2 = map4;
                                                                it2 = it2;
                                                                str22 = str22;
                                                            }
                                                        }
                                                        str3 = str22;
                                                        map3 = arrayMap3;
                                                    } else {
                                                        str3 = "Database error querying filters. appId";
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        arrayMap = new ArrayMap();
                                                        if (zzgiVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzfrVar.zzh()) {
                                                                    Integer numValueOf8 = Integer.valueOf(zzfrVar.zza());
                                                                    if (zzfrVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf8, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        ArrayMap arrayMap11 = new ArrayMap();
                                                        if (zzgiVar != null) {
                                                            it = zzgiVar.zzm().iterator();
                                                            while (it.hasNext()) {
                                                                zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                                                if (!zzgkVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        Map map7 = map3;
                                                        if (zzgiVar != null) {
                                                            i3 = 0;
                                                            while (i3 < zzgiVar.zzd() * 64) {
                                                                if (zzkv.zzv(zzgiVar.zzn(), i3)) {
                                                                    str7 = str21;
                                                                    this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (zzkv.zzv(zzgiVar.zzk(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    str21 = str7;
                                                                } else {
                                                                    str7 = str21;
                                                                }
                                                                arrayMap.remove(Integer.valueOf(i3));
                                                                i3++;
                                                                str21 = str7;
                                                            }
                                                        }
                                                        String str210 = str21;
                                                        com.google.android.gms.internal.measurement.zzgi zzgiVar4 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num3);
                                                        if (!zZzs2) {
                                                        }
                                                        this.zzc.put(num3, new zzu(this, this.zza, zzgiVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        str21 = str210;
                                                        zZzs = zZzs;
                                                        map = map;
                                                        map3 = map7;
                                                        str2 = str2;
                                                        map2 = map2;
                                                    }
                                                    str4 = str21;
                                                    str5 = str2;
                                                    str6 = str3;
                                                }
                                                if (!list.isEmpty()) {
                                                    zzwVar = new zzw(this, null);
                                                    arrayMap4 = new ArrayMap();
                                                    it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                                        zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                                        if (zzftVarZza != null) {
                                                            zzamVarZzi = this.zzf.zzi();
                                                            str9 = this.zza;
                                                            strZzh = zzftVarZza.zzh();
                                                            zzasVarZzn = zzamVarZzi.zzn(str9, zzftVar.zzh());
                                                            if (zzasVarZzn == null) {
                                                                zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str9), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                                                zzasVar = new zzas(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                            }
                                                            this.zzf.zzi().zzE(zzasVar);
                                                            j = zzasVar.zzc;
                                                            strZzh2 = zzftVarZza.zzh();
                                                            mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                            if (mapEmptyMap == null) {
                                                                zzamVarZzi2 = this.zzf.zzi();
                                                                str10 = this.zza;
                                                                zzamVarZzi2.zzW();
                                                                zzamVarZzi2.zzg();
                                                                Preconditions.checkNotEmpty(str10);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                arrayMap5 = new ArrayMap();
                                                                str11 = str5;
                                                                str12 = str23;
                                                                str23 = str12;
                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str11, str12}, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                                                if (cursorQuery2.moveToFirst()) {
                                                                    str5 = str11;
                                                                    while (true) {
                                                                        com.google.android.gms.internal.measurement.zzek zzekVar5 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                        list5 = (List) arrayMap5.get(numValueOf2);
                                                                        if (list5 == null) {
                                                                            zzasVar2 = zzasVar;
                                                                            arrayList2 = new ArrayList();
                                                                            arrayMap5.put(numValueOf2, arrayList2);
                                                                        } else {
                                                                            zzasVar2 = zzasVar;
                                                                            arrayList2 = list5;
                                                                        }
                                                                        arrayList2.add(zzekVar5);
                                                                        if (!cursorQuery2.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        zzasVar = zzasVar2;
                                                                    }
                                                                    cursorQuery2.close();
                                                                    mapEmptyMap = arrayMap5;
                                                                } else {
                                                                    zzasVar2 = zzasVar;
                                                                    str5 = str11;
                                                                    mapEmptyMap = Collections.emptyMap();
                                                                    cursorQuery2.close();
                                                                }
                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                            }
                                                            it4 = mapEmptyMap.keySet().iterator();
                                                            while (it4.hasNext()) {
                                                                num2 = (Integer) it4.next();
                                                                iIntValue = num2.intValue();
                                                                if (this.zzb.contains(num2)) {
                                                                    this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num2);
                                                                } else {
                                                                    it5 = ((List) mapEmptyMap.get(num2)).iterator();
                                                                    zZzd = true;
                                                                    while (true) {
                                                                        if (!it5.hasNext()) {
                                                                            map5 = mapEmptyMap;
                                                                            it6 = it4;
                                                                            break;
                                                                        }
                                                                        com.google.android.gms.internal.measurement.zzek zzekVar6 = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                                                        zzxVar = new zzx(this, this.zza, iIntValue, zzekVar6);
                                                                        map5 = mapEmptyMap;
                                                                        it6 = it4;
                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue, zzekVar6.zzb()));
                                                                        if (!zZzd) {
                                                                            this.zzb.add(num2);
                                                                            break;
                                                                        }
                                                                        zzd(num2).zzc(zzxVar);
                                                                        mapEmptyMap = map5;
                                                                        it4 = it6;
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(num2);
                                                                    }
                                                                    mapEmptyMap = map5;
                                                                    it4 = it6;
                                                                }
                                                            }
                                                            zzwVar = zzwVar;
                                                            it3 = it3;
                                                            str19 = str19;
                                                        }
                                                    }
                                                }
                                                str13 = str19;
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new ArrayMap();
                                                    it7 = list2.iterator();
                                                    while (it7.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzgm zzgmVar2 = (com.google.android.gms.internal.measurement.zzgm) it7.next();
                                                        strZzf = zzgmVar2.zzf();
                                                        mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                        if (mapEmptyMap2 == null) {
                                                            zzamVarZzi3 = this.zzf.zzi();
                                                            str16 = this.zza;
                                                            zzamVarZzi3.zzW();
                                                            zzamVarZzi3.zzg();
                                                            Preconditions.checkNotEmpty(str16);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            arrayMap7 = new ArrayMap();
                                                            str14 = str5;
                                                            str15 = str23;
                                                            cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzet zzetVar3 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) arrayMap7.get(numValueOf5);
                                                                    if (list6 == null) {
                                                                        arrayList3 = new ArrayList();
                                                                        arrayMap7.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        arrayList3 = list6;
                                                                    }
                                                                    arrayList3.add(zzetVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it7 = it7;
                                                                }
                                                                cursorQuery3.close();
                                                                mapEmptyMap2 = arrayMap7;
                                                            } else {
                                                                it7 = it7;
                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                cursorQuery3.close();
                                                            }
                                                            arrayMap6.put(strZzf, mapEmptyMap2);
                                                        } else {
                                                            it7 = it7;
                                                            str14 = str5;
                                                            str15 = str23;
                                                        }
                                                        while (r3.hasNext()) {
                                                            int iIntValue4 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                                                break;
                                                                break;
                                                            }
                                                            it8 = ((List) mapEmptyMap2.get(num4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    zzetVar = (com.google.android.gms.internal.measurement.zzet) it8.next();
                                                                    if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                                        zzef zzefVarZzj2 = this.zzt.zzay().zzj();
                                                                        if (zzetVar.zzj()) {
                                                                            numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        zzefVarZzj2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                        this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                                                    }
                                                                    if (zzetVar.zzj()) {
                                                                    }
                                                                    zzef zzefVarZzk2 = this.zzt.zzay().zzk();
                                                                    Object objZzn2 = zzeh.zzn(this.zza);
                                                                    if (zzetVar.zzj()) {
                                                                        numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    zzefVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf3));
                                                                    this.zzb.add(num4);
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                } else {
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                zzd(num4).zzc(zzzVar);
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                            }
                                                        }
                                                        it7 = it7;
                                                        str23 = str15;
                                                        str5 = str14;
                                                    }
                                                }
                                                str17 = str5;
                                                arrayList4 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r2.hasNext()) {
                                                    int iIntValue5 = num5.intValue();
                                                    zzu zzuVar2 = (zzu) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzuVar2);
                                                    com.google.android.gms.internal.measurement.zzfp zzfpVarZza2 = zzuVar2.zza(iIntValue5);
                                                    arrayList4.add(zzfpVarZza2);
                                                    zzamVarZzi4 = this.zzf.zzi();
                                                    str18 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzgi zzgiVarZzd2 = zzfpVarZza2.zzd();
                                                    zzamVarZzi4.zzW();
                                                    zzamVarZzi4.zzg();
                                                    Preconditions.checkNotEmpty(str18);
                                                    Preconditions.checkNotNull(zzgiVarZzd2);
                                                    byte[] bArrZzbu2 = zzgiVarZzd2.zzbu();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str18);
                                                    contentValues.put(str17, num5);
                                                    String str211 = str13;
                                                    contentValues.put(str211, bArrZzbu2);
                                                    if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzamVarZzi4.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str18));
                                                    }
                                                    str13 = str211;
                                                }
                                                return arrayList4;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str24 = str2;
                                            str23 = str23;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            zzamVarZzi7.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str26), e);
                                            Map mapEmptyMap5 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap5;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = arrayMap8;
                                } else {
                                    Map mapEmptyMap6 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap6;
                                    str2 = "audience_id";
                                    str23 = "data";
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            str2 = "audience_id";
                        }
                        if (map2.isEmpty()) {
                            str6 = "Database error querying filters. appId";
                            str4 = "Failed to merge filter. appId";
                            str5 = str2;
                        } else {
                            HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                            if (z) {
                                String str212 = this.zza;
                                zzam zzamVarZzi9 = this.zzf.zzi();
                                str8 = this.zza;
                                zzamVarZzi9.zzW();
                                zzamVarZzi9.zzg();
                                Preconditions.checkNotEmpty(str8);
                                arrayMap2 = new ArrayMap();
                                sQLiteDatabaseZzh = zzamVarZzi9.zzh();
                                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) arrayMap2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            arrayMap2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    arrayMap2 = Collections.emptyMap();
                                }
                                cursorRawQuery.close();
                                Preconditions.checkNotEmpty(str212);
                                Preconditions.checkNotNull(map2);
                                arrayMap3 = new ArrayMap();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                        list4 = (List) arrayMap2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = arrayMap2;
                                        arrayMap3.put(num, zzgiVar2);
                                        arrayMap2 = map4;
                                        it2 = it2;
                                        str22 = str22;
                                    }
                                }
                                str3 = str22;
                                map3 = arrayMap3;
                            } else {
                                str3 = "Database error querying filters. appId";
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zzgiVar != null) {
                                    while (r2.hasNext()) {
                                        if (zzfrVar.zzh()) {
                                            Integer numValueOf9 = Integer.valueOf(zzfrVar.zza());
                                            if (zzfrVar.zzg()) {
                                                lValueOf = Long.valueOf(zzfrVar.zzb());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(numValueOf9, lValueOf);
                                        }
                                    }
                                }
                                ArrayMap arrayMap12 = new ArrayMap();
                                if (zzgiVar != null) {
                                    it = zzgiVar.zzm().iterator();
                                    while (it.hasNext()) {
                                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                        if (!zzgkVar.zzi()) {
                                        }
                                    }
                                }
                                Map map8 = map3;
                                if (zzgiVar != null) {
                                    i3 = 0;
                                    while (i3 < zzgiVar.zzd() * 64) {
                                        if (zzkv.zzv(zzgiVar.zzn(), i3)) {
                                            str7 = str21;
                                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                                            bitSet2.set(i3);
                                            if (zzkv.zzv(zzgiVar.zzk(), i3)) {
                                                bitSet.set(i3);
                                            }
                                            i3++;
                                            str21 = str7;
                                        } else {
                                            str7 = str21;
                                        }
                                        arrayMap.remove(Integer.valueOf(i3));
                                        i3++;
                                        str21 = str7;
                                    }
                                }
                                String str213 = str21;
                                com.google.android.gms.internal.measurement.zzgi zzgiVar5 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num3);
                                if (!zZzs2) {
                                }
                                this.zzc.put(num3, new zzu(this, this.zza, zzgiVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                str21 = str213;
                                zZzs = zZzs;
                                map = map;
                                map3 = map8;
                                str2 = str2;
                                map2 = map2;
                            }
                            str4 = str21;
                            str5 = str2;
                            str6 = str3;
                        }
                        if (!list.isEmpty()) {
                            zzwVar = new zzw(this, null);
                            arrayMap4 = new ArrayMap();
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                if (zzftVarZza != null) {
                                    zzamVarZzi = this.zzf.zzi();
                                    str9 = this.zza;
                                    strZzh = zzftVarZza.zzh();
                                    zzasVarZzn = zzamVarZzi.zzn(str9, zzftVar.zzh());
                                    if (zzasVarZzn == null) {
                                        zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str9), zzamVarZzi.zzt.zzj().zzd(strZzh));
                                        zzasVar = new zzas(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                    } else {
                                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                    }
                                    this.zzf.zzi().zzE(zzasVar);
                                    j = zzasVar.zzc;
                                    strZzh2 = zzftVarZza.zzh();
                                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                    if (mapEmptyMap == null) {
                                        zzamVarZzi2 = this.zzf.zzi();
                                        str10 = this.zza;
                                        zzamVarZzi2.zzW();
                                        zzamVarZzi2.zzg();
                                        Preconditions.checkNotEmpty(str10);
                                        Preconditions.checkNotEmpty(strZzh2);
                                        arrayMap5 = new ArrayMap();
                                        str11 = str5;
                                        str12 = str23;
                                        str23 = str12;
                                        cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str11, str12}, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            str5 = str11;
                                            while (true) {
                                                com.google.android.gms.internal.measurement.zzek zzekVar7 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                list5 = (List) arrayMap5.get(numValueOf2);
                                                if (list5 == null) {
                                                    zzasVar2 = zzasVar;
                                                    arrayList2 = new ArrayList();
                                                    arrayMap5.put(numValueOf2, arrayList2);
                                                } else {
                                                    zzasVar2 = zzasVar;
                                                    arrayList2 = list5;
                                                }
                                                arrayList2.add(zzekVar7);
                                                if (!cursorQuery2.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                zzasVar = zzasVar2;
                                            }
                                            cursorQuery2.close();
                                            mapEmptyMap = arrayMap5;
                                        } else {
                                            zzasVar2 = zzasVar;
                                            str5 = str11;
                                            mapEmptyMap = Collections.emptyMap();
                                            cursorQuery2.close();
                                        }
                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                    } else {
                                        zzasVar2 = zzasVar;
                                    }
                                    it4 = mapEmptyMap.keySet().iterator();
                                    while (it4.hasNext()) {
                                        num2 = (Integer) it4.next();
                                        iIntValue = num2.intValue();
                                        if (this.zzb.contains(num2)) {
                                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num2);
                                        } else {
                                            it5 = ((List) mapEmptyMap.get(num2)).iterator();
                                            zZzd = true;
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    map5 = mapEmptyMap;
                                                    it6 = it4;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzek zzekVar8 = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                                zzxVar = new zzx(this, this.zza, iIntValue, zzekVar8);
                                                map5 = mapEmptyMap;
                                                it6 = it4;
                                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue, zzekVar8.zzb()));
                                                if (!zZzd) {
                                                    this.zzb.add(num2);
                                                    break;
                                                }
                                                zzd(num2).zzc(zzxVar);
                                                mapEmptyMap = map5;
                                                it4 = it6;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(num2);
                                            }
                                            mapEmptyMap = map5;
                                            it4 = it6;
                                        }
                                    }
                                    zzwVar = zzwVar;
                                    it3 = it3;
                                    str19 = str19;
                                }
                            }
                        }
                        str13 = str19;
                        if (!list2.isEmpty()) {
                            arrayMap6 = new ArrayMap();
                            it7 = list2.iterator();
                            while (it7.hasNext()) {
                                com.google.android.gms.internal.measurement.zzgm zzgmVar3 = (com.google.android.gms.internal.measurement.zzgm) it7.next();
                                strZzf = zzgmVar3.zzf();
                                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                if (mapEmptyMap2 == null) {
                                    zzamVarZzi3 = this.zzf.zzi();
                                    str16 = this.zza;
                                    zzamVarZzi3.zzW();
                                    zzamVarZzi3.zzg();
                                    Preconditions.checkNotEmpty(str16);
                                    Preconditions.checkNotEmpty(strZzf);
                                    arrayMap7 = new ArrayMap();
                                    str14 = str5;
                                    str15 = str23;
                                    cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzet zzetVar4 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list6 = (List) arrayMap7.get(numValueOf5);
                                            if (list6 == null) {
                                                arrayList3 = new ArrayList();
                                                arrayMap7.put(numValueOf5, arrayList3);
                                            } else {
                                                arrayList3 = list6;
                                            }
                                            arrayList3.add(zzetVar4);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it7 = it7;
                                        }
                                        cursorQuery3.close();
                                        mapEmptyMap2 = arrayMap7;
                                    } else {
                                        it7 = it7;
                                        mapEmptyMap2 = Collections.emptyMap();
                                        cursorQuery3.close();
                                    }
                                    arrayMap6.put(strZzf, mapEmptyMap2);
                                } else {
                                    it7 = it7;
                                    str14 = str5;
                                    str15 = str23;
                                }
                                while (r3.hasNext()) {
                                    int iIntValue6 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                        break;
                                        break;
                                    }
                                    it8 = ((List) mapEmptyMap2.get(num4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it8.hasNext()) {
                                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it8.next();
                                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                                zzef zzefVarZzj3 = this.zzt.zzay().zzj();
                                                if (zzetVar.zzj()) {
                                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                zzefVarZzj3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                            }
                                            if (zzetVar.zzj()) {
                                            }
                                            zzef zzefVarZzk3 = this.zzt.zzay().zzk();
                                            Object objZzn3 = zzeh.zzn(this.zza);
                                            if (zzetVar.zzj()) {
                                                numValueOf3 = Integer.valueOf(zzetVar.zza());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            zzefVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf3));
                                            this.zzb.add(num4);
                                            mapEmptyMap2 = mapEmptyMap2;
                                        } else {
                                            mapEmptyMap2 = mapEmptyMap2;
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(num4);
                                        }
                                        mapEmptyMap2 = mapEmptyMap2;
                                        zzd(num4).zzc(zzzVar);
                                        mapEmptyMap2 = mapEmptyMap2;
                                    }
                                }
                                it7 = it7;
                                str23 = str15;
                                str5 = str14;
                            }
                        }
                        str17 = str5;
                        arrayList4 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r2.hasNext()) {
                            int iIntValue7 = num5.intValue();
                            zzu zzuVar3 = (zzu) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzuVar3);
                            com.google.android.gms.internal.measurement.zzfp zzfpVarZza3 = zzuVar3.zza(iIntValue7);
                            arrayList4.add(zzfpVarZza3);
                            zzamVarZzi4 = this.zzf.zzi();
                            str18 = this.zza;
                            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd3 = zzfpVarZza3.zzd();
                            zzamVarZzi4.zzW();
                            zzamVarZzi4.zzg();
                            Preconditions.checkNotEmpty(str18);
                            Preconditions.checkNotNull(zzgiVarZzd3);
                            byte[] bArrZzbu3 = zzgiVarZzd3.zzbu();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str18);
                            contentValues.put(str17, num5);
                            String str214 = str13;
                            contentValues.put(str214, bArrZzbu3);
                            if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzamVarZzi4.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str18));
                            }
                            str13 = str214;
                        }
                        return arrayList4;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r7 = r5;
                    if (r7 != 0) {
                        r7.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e22) {
                e = e22;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r7 = 0;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzam zzamVarZzi10 = this.zzf.zzi();
        String str215 = this.zza;
        zzamVarZzi10.zzW();
        zzamVarZzi10.zzg();
        Preconditions.checkNotEmpty(str215);
        try {
            cursorQuery = zzamVarZzi10.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str215}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap7 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap7;
                str2 = "audience_id";
                str23 = "data";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursorQuery.getBlob(1))).zzaC());
                    str2 = str24;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str24 = str2;
                    str23 = str23;
                }
                cursorQuery.close();
                map2 = arrayMap8;
            }
        } catch (SQLiteException e23) {
            e = e23;
            str2 = "audience_id";
            str23 = "data";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str6 = "Database error querying filters. appId";
            str4 = "Failed to merge filter. appId";
            str5 = str2;
        } else {
            HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
            if (z) {
                String str216 = this.zza;
                zzam zzamVarZzi11 = this.zzf.zzi();
                str8 = this.zza;
                zzamVarZzi11.zzW();
                zzamVarZzi11.zzg();
                Preconditions.checkNotEmpty(str8);
                arrayMap2 = new ArrayMap();
                sQLiteDatabaseZzh = zzamVarZzi11.zzh();
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    arrayMap2 = Collections.emptyMap();
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str216);
                Preconditions.checkNotNull(map2);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                        list4 = (List) arrayMap2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            arrayMap3.put(num, zzgiVar2);
                            arrayMap2 = map4;
                            it2 = it2;
                            str22 = str22;
                        } else {
                            map4 = arrayMap2;
                            List listZzq = this.zzf.zzu().zzq(zzgiVar2.zzk(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap2 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzgiVar2.zzby();
                                zzghVar.zzf();
                                zzghVar.zzb(listZzq);
                                List listZzq2 = this.zzf.zzu().zzq(zzgiVar2.zzn(), list4);
                                zzghVar.zzh();
                                zzghVar.zzd(listZzq2);
                                zzoc.zzc();
                                if (this.zzt.zzf().zzs(null, zzdu.zzas)) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it10 = zzgiVar2.zzj().iterator();
                                    while (it10.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) it10.next();
                                        Iterator it11 = it10;
                                        if (!list4.contains(Integer.valueOf(zzfrVar2.zza()))) {
                                            arrayList6.add(zzfrVar2);
                                        }
                                        it10 = it11;
                                    }
                                    zzghVar.zze();
                                    zzghVar.zza(arrayList6);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (com.google.android.gms.internal.measurement.zzgk zzgkVar2 : zzgiVar2.zzm()) {
                                        if (!list4.contains(Integer.valueOf(zzgkVar2.zzb()))) {
                                            arrayList7.add(zzgkVar2);
                                        }
                                    }
                                    zzghVar.zzg();
                                    zzghVar.zzc(arrayList7);
                                } else {
                                    for (int i5 = 0; i5 < zzgiVar2.zza(); i5++) {
                                        if (list4.contains(Integer.valueOf(zzgiVar2.zze(i5).zza()))) {
                                            zzghVar.zzi(i5);
                                        }
                                    }
                                    for (int i6 = 0; i6 < zzgiVar2.zzc(); i6++) {
                                        if (list4.contains(Integer.valueOf(zzgiVar2.zzi(i6).zzb()))) {
                                            zzghVar.zzj(i6);
                                        }
                                    }
                                }
                                arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzgi) zzghVar.zzaC());
                                arrayMap2 = map4;
                                it2 = it2;
                                str22 = str22;
                            }
                        }
                    }
                }
                str3 = str22;
                map3 = arrayMap3;
            } else {
                str3 = "Database error querying filters. appId";
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zzgiVar != null && zzgiVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfrVar.zzh()) {
                            Integer numValueOf10 = Integer.valueOf(zzfrVar.zza());
                            if (zzfrVar.zzg()) {
                                lValueOf = Long.valueOf(zzfrVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf10, lValueOf);
                        }
                    }
                }
                ArrayMap arrayMap13 = new ArrayMap();
                if (zzgiVar != null && zzgiVar.zzc() != 0) {
                    it = zzgiVar.zzm().iterator();
                    while (it.hasNext()) {
                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                        if (!zzgkVar.zzi() && zzgkVar.zza() > 0) {
                            arrayMap13.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                            map3 = map3;
                            it = it;
                        }
                    }
                }
                Map map9 = map3;
                if (zzgiVar != null) {
                    i3 = 0;
                    while (i3 < zzgiVar.zzd() * 64) {
                        if (zzkv.zzv(zzgiVar.zzn(), i3)) {
                            str7 = str21;
                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzkv.zzv(zzgiVar.zzk(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str21 = str7;
                        } else {
                            str7 = str21;
                        }
                        arrayMap.remove(Integer.valueOf(i3));
                        i3++;
                        str21 = str7;
                    }
                }
                String str217 = str21;
                com.google.android.gms.internal.measurement.zzgi zzgiVar6 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num3);
                if (!zZzs2 && zZzs && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzek zzekVar9 : list3) {
                        int iZzb = zzekVar9.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzekVar9.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf11)) {
                            arrayMap.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf11)) {
                            arrayMap13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(num3, new zzu(this, this.zza, zzgiVar6, bitSet, bitSet2, arrayMap, arrayMap13, null));
                str21 = str217;
                zZzs = zZzs;
                map = map;
                map3 = map9;
                str2 = str2;
                map2 = map2;
            }
            str4 = str21;
            str5 = str2;
            str6 = str3;
        }
        if (!list.isEmpty()) {
            zzwVar = new zzw(this, null);
            arrayMap4 = new ArrayMap();
            it3 = list.iterator();
            while (it3.hasNext()) {
                zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                if (zzftVarZza != null) {
                    zzamVarZzi = this.zzf.zzi();
                    str9 = this.zza;
                    strZzh = zzftVarZza.zzh();
                    zzasVarZzn = zzamVarZzi.zzn(str9, zzftVar.zzh());
                    if (zzasVarZzn == null) {
                        zzamVarZzi.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str9), zzamVarZzi.zzt.zzj().zzd(strZzh));
                        zzasVar = new zzas(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzasVar);
                    j = zzasVar.zzc;
                    strZzh2 = zzftVarZza.zzh();
                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                    if (mapEmptyMap == null) {
                        zzamVarZzi2 = this.zzf.zzi();
                        str10 = this.zza;
                        zzamVarZzi2.zzW();
                        zzamVarZzi2.zzg();
                        Preconditions.checkNotEmpty(str10);
                        Preconditions.checkNotEmpty(strZzh2);
                        arrayMap5 = new ArrayMap();
                        str11 = str5;
                        str12 = str23;
                        str23 = str12;
                        cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str11, str12}, "app_id=? AND event_name=?", new String[]{str10, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            str5 = str11;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzek zzekVar10 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaC();
                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) arrayMap5.get(numValueOf2);
                                if (list5 == null) {
                                    zzasVar2 = zzasVar;
                                    arrayList2 = new ArrayList();
                                    arrayMap5.put(numValueOf2, arrayList2);
                                } else {
                                    zzasVar2 = zzasVar;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzekVar10);
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                zzasVar = zzasVar2;
                            }
                            cursorQuery2.close();
                            mapEmptyMap = arrayMap5;
                        } else {
                            zzasVar2 = zzasVar;
                            str5 = str11;
                            mapEmptyMap = Collections.emptyMap();
                            cursorQuery2.close();
                        }
                        arrayMap4.put(strZzh2, mapEmptyMap);
                    } else {
                        zzasVar2 = zzasVar;
                    }
                    it4 = mapEmptyMap.keySet().iterator();
                    while (it4.hasNext()) {
                        num2 = (Integer) it4.next();
                        iIntValue = num2.intValue();
                        if (this.zzb.contains(num2)) {
                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num2);
                        } else {
                            it5 = ((List) mapEmptyMap.get(num2)).iterator();
                            zZzd = true;
                            while (true) {
                                if (!it5.hasNext()) {
                                    map5 = mapEmptyMap;
                                    it6 = it4;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzek zzekVar11 = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                zzxVar = new zzx(this, this.zza, iIntValue, zzekVar11);
                                map5 = mapEmptyMap;
                                it6 = it4;
                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzasVar2, zzf(iIntValue, zzekVar11.zzb()));
                                if (!zZzd) {
                                    this.zzb.add(num2);
                                    break;
                                }
                                zzd(num2).zzc(zzxVar);
                                mapEmptyMap = map5;
                                it4 = it6;
                            }
                            if (!zZzd) {
                                this.zzb.add(num2);
                            }
                            mapEmptyMap = map5;
                            it4 = it6;
                        }
                    }
                    zzwVar = zzwVar;
                    it3 = it3;
                    str19 = str19;
                }
            }
        }
        str13 = str19;
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it7 = list2.iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.zzgm zzgmVar4 = (com.google.android.gms.internal.measurement.zzgm) it7.next();
                strZzf = zzgmVar4.zzf();
                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                if (mapEmptyMap2 == null) {
                    zzamVarZzi3 = this.zzf.zzi();
                    str16 = this.zza;
                    zzamVarZzi3.zzW();
                    zzamVarZzi3.zzg();
                    Preconditions.checkNotEmpty(str16);
                    Preconditions.checkNotEmpty(strZzf);
                    arrayMap7 = new ArrayMap();
                    str14 = str5;
                    str15 = str23;
                    cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzet zzetVar5 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaC();
                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) arrayMap7.get(numValueOf5);
                            if (list6 == null) {
                                arrayList3 = new ArrayList();
                                arrayMap7.put(numValueOf5, arrayList3);
                            } else {
                                arrayList3 = list6;
                            }
                            arrayList3.add(zzetVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it7 = it7;
                        }
                        cursorQuery3.close();
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        it7 = it7;
                        mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    arrayMap6.put(strZzf, mapEmptyMap2);
                } else {
                    it7 = it7;
                    str14 = str5;
                    str15 = str23;
                }
                while (r3.hasNext()) {
                    int iIntValue8 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", num4);
                        break;
                        break;
                    }
                    it8 = ((List) mapEmptyMap2.get(num4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it8.hasNext()) {
                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it8.next();
                            if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                zzef zzefVarZzj4 = this.zzt.zzay().zzj();
                                if (zzetVar.zzj()) {
                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                } else {
                                    numValueOf4 = null;
                                }
                                zzefVarZzj4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                            }
                            if (zzetVar.zzj() || zzetVar.zza() > 256) {
                                zzef zzefVarZzk4 = this.zzt.zzay().zzk();
                                Object objZzn4 = zzeh.zzn(this.zza);
                                if (zzetVar.zzj()) {
                                    numValueOf3 = Integer.valueOf(zzetVar.zza());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzefVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf3));
                                this.zzb.add(num4);
                                mapEmptyMap2 = mapEmptyMap2;
                            } else {
                                zzzVar = new zzz(this, this.zza, iIntValue8, zzetVar);
                                zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzgmVar4, zzf(iIntValue8, zzetVar.zza()));
                                if (zZzd2) {
                                    zzd(num4).zzc(zzzVar);
                                    mapEmptyMap2 = mapEmptyMap2;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                        }
                        if (!zZzd2) {
                            this.zzb.add(num4);
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                    }
                }
                it7 = it7;
                str23 = str15;
                str5 = str14;
            }
        }
        str17 = str5;
        arrayList4 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r2.hasNext()) {
            int iIntValue9 = num5.intValue();
            zzu zzuVar4 = (zzu) this.zzc.get(num5);
            Preconditions.checkNotNull(zzuVar4);
            com.google.android.gms.internal.measurement.zzfp zzfpVarZza4 = zzuVar4.zza(iIntValue9);
            arrayList4.add(zzfpVarZza4);
            zzamVarZzi4 = this.zzf.zzi();
            str18 = this.zza;
            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd4 = zzfpVarZza4.zzd();
            zzamVarZzi4.zzW();
            zzamVarZzi4.zzg();
            Preconditions.checkNotEmpty(str18);
            Preconditions.checkNotNull(zzgiVarZzd4);
            byte[] bArrZzbu4 = zzgiVarZzd4.zzbu();
            contentValues = new ContentValues();
            contentValues.put("app_id", str18);
            contentValues.put(str17, num5);
            String str218 = str13;
            contentValues.put(str218, bArrZzbu4);
            if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzamVarZzi4.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str18));
            }
            str13 = str218;
        }
        return arrayList4;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
