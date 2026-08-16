package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.C0353FN;
import p000.C4391g4;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfi extends zzkh implements zzaf {

    @VisibleForTesting
    final Map zza;

    @VisibleForTesting
    final Map zzb;

    @VisibleForTesting
    final Map zzc;

    @VisibleForTesting
    final LruCache zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzfi(zzkt zzktVar) {
        super(zzktVar);
        this.zzg = new ArrayMap();
        this.zza = new ArrayMap();
        this.zzb = new ArrayMap();
        this.zzc = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zzd = new zzff(this, 20);
        this.zze = new zzfg(this);
    }

    @WorkerThread
    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzkv.zzl(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaC();
            this.zzt.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzffVar.zzs() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzr() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzkp e) {
            e = e;
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e2) {
            e = e2;
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i).zzby();
            if (zzfcVar.zzc().isEmpty()) {
                C4391g4.m20722a(this.zzt, "EventConfig contained null event name");
            } else {
                String strZzc = zzfcVar.zzc();
                String strZzb = zzgo.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(strZzb)) {
                    zzfcVar.zzb(strZzb);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    arrayMap.put(strZzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    arrayMap2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        this.zzt.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        arrayMap3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    @WorkerThread
    private final void zzC(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        zzaj zzajVar;
        Map map;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzam zzamVarZzi = this.zzf.zzi();
            Preconditions.checkNotEmpty(str);
            zzamVarZzi.zzg();
            zzamVarZzi.zzW();
            Cursor cursor = null;
            String str2 = null;
            try {
                cursorQuery = zzamVarZzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = zzamVarZzi.zzt.zzf().zzs(null, zzdu.zzao) ? cursorQuery.getString(2) : null;
                            if (cursorQuery.moveToNext()) {
                                zzamVarZzi.zzt.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeh.zzn(str));
                            }
                            if (blob != null) {
                                zzajVar = new zzaj(blob, string, string2);
                                cursorQuery.close();
                            }
                            if (zzajVar == null) {
                                this.zzg.put(str, null);
                                this.zzb.put(str, null);
                                this.zza.put(str, null);
                                this.zzc.put(str, null);
                                this.zzh.put(str, null);
                                this.zzj.put(str, null);
                                this.zzk.put(str, null);
                                this.zzl.put(str, null);
                                map = this.zzi;
                            } else {
                                com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, zzajVar.zza).zzby();
                                zzB(str, zzfeVar);
                                this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()));
                                this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
                                zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
                                this.zzj.put(str, zzfeVar.zze());
                                this.zzk.put(str, zzajVar.zzb);
                                map = this.zzl;
                                str2 = zzajVar.zzc;
                            }
                            map.put(str, str2);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        zzamVarZzi.zzt.zzay().zzd().zzc("Error querying remote config. appId", zzeh.zzn(str), e);
                        if (cursorQuery != null) {
                        }
                        zzajVar = null;
                        if (zzajVar == null) {
                            this.zzg.put(str, null);
                            this.zzb.put(str, null);
                            this.zza.put(str, null);
                            this.zzc.put(str, null);
                            this.zzh.put(str, null);
                            this.zzj.put(str, null);
                            this.zzk.put(str, null);
                            this.zzl.put(str, null);
                            map = this.zzi;
                        } else {
                            com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzA(str, zzajVar.zza).zzby();
                            zzB(str, zzfeVar2);
                            this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaC()));
                            this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaC());
                            zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaC());
                            this.zzj.put(str, zzfeVar2.zze());
                            this.zzk.put(str, zzajVar.zzb);
                            map = this.zzl;
                            str2 = zzajVar.zzc;
                        }
                        map.put(str, str2);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursorQuery.close();
            zzajVar = null;
            if (zzajVar == null) {
                this.zzg.put(str, null);
                this.zzb.put(str, null);
                this.zza.put(str, null);
                this.zzc.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                map = this.zzi;
            } else {
                com.google.android.gms.internal.measurement.zzfe zzfeVar3 = (com.google.android.gms.internal.measurement.zzfe) zzA(str, zzajVar.zza).zzby();
                zzB(str, zzfeVar3);
                this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaC()));
                this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaC());
                zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaC());
                this.zzj.put(str, zzfeVar3.zze());
                this.zzk.put(str, zzajVar.zzb);
                map = this.zzl;
                str2 = zzajVar.zzc;
            }
            map.put(str, str2);
        }
    }

    @WorkerThread
    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzt.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
        com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfh(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfi zzfiVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfi zzfiVar2 = zzfiVar;
                            String str3 = str2;
                            zzh zzhVarZzj = zzfiVar2.zzf.zzi().zzj(str3);
                            HashMap map = new HashMap();
                            map.put("platform", C0353FN.f780a);
                            map.put("package_name", str3);
                            zzfiVar2.zzt.zzf().zzh();
                            map.put("gmp_version", 74029L);
                            if (zzhVarZzj != null) {
                                String strZzw = zzhVarZzj.zzw();
                                if (strZzw != null) {
                                    map.put("app_version", strZzw);
                                }
                                map.put("app_version_int", Long.valueOf(zzhVarZzj.zzb()));
                                map.put("dynamite_version", Long.valueOf(zzhVarZzj.zzk()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.zze);
                }
            });
            zzcVar.zzc(zzgtVar);
            this.zzd.put(str, zzcVar);
            this.zzt.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzt.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgr) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzt.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzn()) {
                arrayMap.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return arrayMap;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfi zzfiVar, String str) throws Throwable {
        zzfiVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfiVar.zzo(str)) {
            return null;
        }
        if (!zzfiVar.zzh.containsKey(str) || zzfiVar.zzh.get(str) == null) {
            zzfiVar.zzC(str);
        } else {
            zzfiVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfiVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfiVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    @WorkerThread
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final int zzc(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    @WorkerThread
    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    @WorkerThread
    public final String zzi(String str) throws Throwable {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    @WorkerThread
    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    @WorkerThread
    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    @WorkerThread
    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    @WorkerThread
    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzff zzffVarZze = zze(str);
        if (zzffVarZze == null) {
            return false;
        }
        return zzffVarZze.zzq();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) ? false : true;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean zzq(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean zzr(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlb.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlb.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzby();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC()).zzbu();
        } catch (RuntimeException e) {
            this.zzt.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(str), e);
        }
        zzam zzamVarZzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzamVarZzi.zzg();
        zzamVarZzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzamVarZzi.zzt.zzf().zzs(null, zzdu.zzao)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzamVarZzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzamVarZzi.zzt.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzamVarZzi.zzt.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(str), e2);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaC());
        return true;
    }

    @WorkerThread
    public final boolean zzu(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    @WorkerThread
    public final boolean zzv(String str) throws Throwable {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("device_model") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzw(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    @WorkerThread
    public final boolean zzx(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    @WorkerThread
    public final boolean zzy(String str) throws Throwable {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzz(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
