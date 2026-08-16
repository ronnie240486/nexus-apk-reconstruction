package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import p000.C4331f8;
import p000.C4391g4;
import p000.e70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzea extends zzf {
    private final zzdz zza;
    private boolean zzb;

    public zzea(zzfr zzfrVar) {
        super(zzfrVar);
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        this.zza = new zzdz(this, contextZzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[PHI: r8
      0x00f4: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:60:0x00f2, B:76:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @WorkerThread
    private final boolean zzq(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? RawQuery;
        ?? r10;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r8 = 0;
             = 0;
            ?? r9 = 0;
            sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzh = zzh();
                try {
                    if (sQLiteDatabaseZzh == null) {
                        this.zzb = true;
                        return r2;
                    }
                    sQLiteDatabaseZzh.beginTransaction();
                    RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r9 = RawQuery;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                r8 = r9;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            r10 = RawQuery;
                            this.zzt.zzay().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    r8 = RawQuery;
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzay().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = RawQuery;
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (sQLiteDatabaseZzh != null) {
                                sQLiteDatabaseZzh.close();
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.zzt.zzay().zzd().zza("Data loss, local db full");
                        long j2 = 100001 - j;
                        long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                        if (jDelete != j2) {
                            this.zzt.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    sQLiteDatabaseZzh.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseZzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    RawQuery = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                r10 = 0;
            } catch (SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseZzh = null;
                if (r8 != 0) {
                    r8.close();
                }
                if (sQLiteDatabaseZzh != null) {
                    sQLiteDatabaseZzh.close();
                }
                throw th;
            }
        }
        e70.m20045a(this.zzt, "Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x020f A[Catch: all -> 0x0213, TryCatch #21 {all -> 0x0213, blocks: (B:139:0x0209, B:141:0x020f, B:144:0x0215, B:160:0x0244, B:152:0x0231), top: B:188:0x0209 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0226  */
    /* JADX WARN: Code duplicated, block: B:155:0x0238  */
    /* JADX WARN: Code duplicated, block: B:157:0x023d A[PHI: r9 r15
      0x023d: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:147:0x0229, B:163:0x0258, B:156:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
      (r15v5 android.database.sqlite.SQLiteDatabase)
      (r15v6 android.database.sqlite.SQLiteDatabase)
      (r15v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:147:0x0229, B:163:0x0258, B:156:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0255  */
    /* JADX WARN: Code duplicated, block: B:167:0x0261  */
    /* JADX WARN: Code duplicated, block: B:169:0x0266  */
    /* JADX WARN: Code duplicated, block: B:188:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x025b A[SYNTHETIC] */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        SafeParcelable safeParcelable;
        zzef zzefVarZzd;
        String str2;
        zzg();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabaseZzh.beginTransaction();
                    try {
                        try {
                            cursorQuery2 = sQLiteDatabaseZzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{C4331f8.f13908k}, null, null, "rowid desc", "1");
                            try {
                                long j2 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j = cursorQuery2.getLong(0);
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursorQuery2.close();
                                    j = -1;
                                }
                                if (j != -1) {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(j)};
                                } else {
                                    str = null;
                                    strArr = null;
                                }
                                cursorQuery = sQLiteDatabaseZzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j2 = cursorQuery.getLong(0);
                                        int i4 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i4 == 0) {
                                            Parcel parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    safeParcelable = (zzaw) zzaw.CREATOR.createFromParcel(parcelObtain);
                                                    parcelObtain.recycle();
                                                    if (safeParcelable != null) {
                                                        arrayList.add(safeParcelable);
                                                    }
                                                } catch (Throwable th3) {
                                                    parcelObtain.recycle();
                                                    throw th3;
                                                }
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                this.zzt.zzay().zzd().zza("Failed to load event from local database");
                                                parcelObtain.recycle();
                                            }
                                        } else if (i4 == 1) {
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                    parcelObtain2.setDataPosition(0);
                                                    safeParcelable = (zzkw) zzkw.CREATOR.createFromParcel(parcelObtain2);
                                                    parcelObtain2.recycle();
                                                } catch (Throwable th4) {
                                                    parcelObtain2.recycle();
                                                    throw th4;
                                                }
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.zzt.zzay().zzd().zza("Failed to load user property from local database");
                                                parcelObtain2.recycle();
                                                safeParcelable = null;
                                            }
                                            if (safeParcelable != null) {
                                                arrayList.add(safeParcelable);
                                            }
                                        } else if (i4 == 2) {
                                            Parcel parcelObtain3 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                    parcelObtain3.setDataPosition(0);
                                                    safeParcelable = (zzac) zzac.CREATOR.createFromParcel(parcelObtain3);
                                                    parcelObtain3.recycle();
                                                } catch (Throwable th5) {
                                                    parcelObtain3.recycle();
                                                    throw th5;
                                                }
                                            } catch (SafeParcelReader.ParseException unused4) {
                                                this.zzt.zzay().zzd().zza("Failed to load conditional user property from local database");
                                                parcelObtain3.recycle();
                                                safeParcelable = null;
                                            }
                                            if (safeParcelable != null) {
                                                arrayList.add(safeParcelable);
                                            }
                                        } else {
                                            if (i4 == 3) {
                                                zzefVarZzd = this.zzt.zzay().zzk();
                                                str2 = "Skipping app launch break";
                                            } else {
                                                zzefVarZzd = this.zzt.zzay().zzd();
                                                str2 = "Unknown record type in local database";
                                            }
                                            zzefVarZzd.zza(str2);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        }
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursor = cursorQuery;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                sQLiteDatabase2 = sQLiteDatabaseZzh;
                                try {
                                    if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                        this.zzt.zzay().zzd().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase2.setTransactionSuccessful();
                                    sQLiteDatabase2.endTransaction();
                                    cursorQuery.close();
                                    sQLiteDatabase2.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    }
                                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor = cursorQuery;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase2 = sQLiteDatabaseZzh;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteFullException e7) {
                                        e = e7;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        }
                                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase2 = sQLiteDatabaseZzh;
                            cursorQuery2 = null;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (Throwable th13) {
                th = th13;
                sQLiteDatabase = null;
            }
        }
        C4391g4.m20722a(this.zzt, "Failed to read events from database in reasonable time");
        return null;
    }

    @WorkerThread
    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzau = this.zzt.zzau();
        this.zzt.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[PHI: r4
      0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @WorkerThread
    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzh = zzh();
                            if (sQLiteDatabaseZzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            sQLiteDatabaseZzh.beginTransaction();
                            sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseZzh.setTransactionSuccessful();
                            sQLiteDatabaseZzh.endTransaction();
                            sQLiteDatabaseZzh.close();
                            return true;
                        } catch (SQLiteException e) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            C4391g4.m20722a(this.zzt, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzan = this.zzt.zzv().zzan(zzacVar);
        if (bArrZzan.length <= 131072) {
            return zzq(2, bArrZzan);
        }
        this.zzt.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.zza(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzkw zzkwVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzkx.zza(zzkwVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzt.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
