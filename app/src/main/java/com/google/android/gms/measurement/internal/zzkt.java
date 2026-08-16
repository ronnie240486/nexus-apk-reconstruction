package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.media.ViviTV.fragmens.VodPlayFragment;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import p000.AbstractC4717l6;
import p000.C0353FN;
import p000.C1262Tc;
import p000.C1313UP;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkt implements zzgm {
    private static volatile zzkt zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzie zzD;
    private String zzE;

    @VisibleForTesting
    long zza;
    private final zzfi zzc;
    private final zzen zzd;
    private zzam zze;
    private zzep zzf;
    private zzkf zzg;
    private zzaa zzh;
    private final zzkv zzi;
    private zzic zzj;
    private zzjo zzk;
    private final zzki zzl;
    private zzez zzm;
    private final zzfr zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzla zzF = new zzko(this);

    public zzkt(zzku zzkuVar, zzfr zzfrVar) {
        Preconditions.checkNotNull(zzkuVar);
        this.zzn = zzfr.zzp(zzkuVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzki(this);
        zzkv zzkvVar = new zzkv(this);
        zzkvVar.zzX();
        this.zzi = zzkvVar;
        zzen zzenVar = new zzen(this);
        zzenVar.zzX();
        this.zzd = zzenVar;
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzX();
        this.zzc = zzfiVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkj(this, zzkuVar));
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze.zzj("_err");
        zzfwVarZze.zzi(i);
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze.zzaC();
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze2.zzj("_ev");
        zzfwVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze2.zzaC();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    public static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, @NonNull String str) {
        List listZzp = zzfsVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @WorkerThread
    private final zzq zzac(String str) {
        String str2;
        zzef zzefVarZzc;
        Object objZzn;
        String str3 = str;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str3);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            str2 = "No app data available; dropping";
            objZzn = str3;
            zzefVarZzc = zzay().zzc();
        } else {
            Boolean boolZzad = zzad(zzhVarZzj);
            if (boolZzad == null || boolZzad.booleanValue()) {
                String strZzy = zzhVarZzj.zzy();
                String strZzw = zzhVarZzj.zzw();
                long jZzb = zzhVarZzj.zzb();
                String strZzv = zzhVarZzj.zzv();
                long jZzm = zzhVarZzj.zzm();
                long jZzj = zzhVarZzj.zzj();
                boolean zZzai = zzhVarZzj.zzai();
                String strZzx = zzhVarZzj.zzx();
                zzhVarZzj.zza();
                return new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
            }
            zzef zzefVarZzd = zzay().zzd();
            str2 = "App version does not match; dropping. appId";
            objZzn = zzeh.zzn(str);
            zzefVarZzc = zzefVarZzd;
        }
        zzefVarZzc.zzb(str2, objZzn);
        return null;
    }

    @WorkerThread
    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String strZzw = zzhVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        zzky zzkyVar;
        String str = true != z ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzky zzkyVarZzp = zzamVar.zzp(zzgcVar.zzap(), str);
        if (zzkyVarZzp == null || zzkyVarZzp.zze == null) {
            zzkyVar = new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzkyVar = new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzkyVarZzp.zze).longValue() + j));
        }
        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzglVarZzd.zzf(str);
        zzglVarZzd.zzg(zzav().currentTimeMillis());
        zzglVarZzd.zze(((Long) zzkyVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
        int iZza = zzkv.zza(zzgcVar, str);
        if (iZza >= 0) {
            zzgcVar.zzam(iZza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzkyVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzkyVar.zze);
        }
    }

    @WorkerThread
    private final void zzag() {
        zzdt zzdtVar;
        long jMax;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkf zzkfVar = this.zzg;
                zzal(zzkfVar);
                zzkfVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkf zzkfVar2 = this.zzg;
            zzal(zzkfVar2);
            zzkfVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax2 = Math.max(0L, ((Long) zzdu.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                zzdtVar = zzdu.zzt;
            } else {
                zzg();
                zzdtVar = zzdu.zzu;
            }
        } else {
            zzg();
            zzdtVar = zzdu.zzs;
        }
        long jMax3 = Math.max(0L, ((Long) zzdtVar.zza(null)).longValue());
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z2 = z;
        long jZzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long jMax4 = Math.max(jZzd, zzamVar4.zze());
        if (jMax4 != 0) {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z2 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            if (!zzkvVar.zzw(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzdu.zzB.zza(null)).intValue()))) {
                        jMax = 0;
                        break;
                    }
                    zzg();
                    jMax += Math.max(0L, ((Long) zzdu.zzA.zza(null)).longValue()) * (1 << i);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            jMax = 0;
            break;
        }
        if (jMax == 0) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkf zzkfVar3 = this.zzg;
            zzal(zzkfVar3);
            zzkfVar3.zza();
            return;
        }
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        if (!zzenVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkf zzkfVar4 = this.zzg;
            zzal(zzkfVar4);
            zzkfVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzdu.zzq.zza(null)).longValue());
        zzkv zzkvVar2 = this.zzi;
        zzal(zzkvVar2);
        if (!zzkvVar2.zzw(jZza3, jMax6)) {
            jMax = Math.max(jMax, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzdu.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkf zzkfVar5 = this.zzg;
        zzal(zzkfVar5);
        zzkfVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0378 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0390 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x03a9 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03bf A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d1 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ea A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x041a  */
    /* JADX WARN: Code duplicated, block: B:134:0x041f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0420 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0431  */
    /* JADX WARN: Code duplicated, block: B:140:0x0438 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0442 A[Catch: all -> 0x00e9, LOOP:3: B:138:0x0432->B:142:0x0442, LOOP_END, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x046c A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x047d  */
    /* JADX WARN: Code duplicated, block: B:158:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:160:0x04c2 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x04d0 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0513  */
    /* JADX WARN: Code duplicated, block: B:184:0x0569 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0574 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x057a A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0583  */
    /* JADX WARN: Code duplicated, block: B:290:0x08e1 A[PHI: r8
      0x08e1: PHI (r8v19 com.google.android.gms.measurement.internal.zzas) = (r8v18 com.google.android.gms.measurement.internal.zzas), (r8v31 com.google.android.gms.measurement.internal.zzas) binds: [B:286:0x088b, B:288:0x08a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x0b63 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:175:0x0533, B:26:0x00fa, B:28:0x0108, B:31:0x0128, B:33:0x012e, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x0170, B:44:0x0189, B:112:0x03a9, B:113:0x03b5, B:116:0x03bf, B:122:0x03e2, B:119:0x03d1, B:144:0x0460, B:146:0x046c, B:149:0x047f, B:151:0x0490, B:153:0x049c, B:174:0x051d, B:160:0x04c2, B:162:0x04d0, B:165:0x04e5, B:167:0x04f6, B:169:0x0502, B:126:0x03ea, B:128:0x03f6, B:130:0x0402, B:143:0x0448, B:135:0x0420, B:138:0x0432, B:140:0x0438, B:142:0x0442, B:69:0x01e9, B:72:0x01f3, B:74:0x0201, B:78:0x0246, B:75:0x021d, B:77:0x022d, B:82:0x0253, B:84:0x027f, B:85:0x02a9, B:87:0x02e0, B:89:0x02e6, B:92:0x02f2, B:94:0x0328, B:95:0x0343, B:97:0x0349, B:99:0x0357, B:103:0x036a, B:100:0x035f, B:106:0x0371, B:109:0x0378, B:110:0x0390, B:178:0x0547, B:180:0x0555, B:182:0x0560, B:194:0x0594, B:184:0x0569, B:186:0x0574, B:188:0x057a, B:191:0x0586, B:193:0x058e, B:195:0x0596, B:196:0x05a2, B:199:0x05aa, B:201:0x05bc, B:202:0x05c8, B:204:0x05d0, B:208:0x05f5, B:210:0x061a, B:212:0x062b, B:214:0x0631, B:216:0x063d, B:217:0x066e, B:219:0x0674, B:221:0x0682, B:222:0x0686, B:223:0x0689, B:224:0x068c, B:225:0x069a, B:227:0x06a0, B:229:0x06b0, B:230:0x06b7, B:232:0x06c3, B:233:0x06ca, B:234:0x06cd, B:236:0x070b, B:237:0x071e, B:239:0x0724, B:242:0x073e, B:244:0x0759, B:246:0x0772, B:248:0x0777, B:250:0x077b, B:252:0x077f, B:254:0x0789, B:255:0x0793, B:257:0x0797, B:259:0x079d, B:260:0x07ab, B:261:0x07b4, B:328:0x09f0, B:262:0x07c0, B:264:0x07d7, B:270:0x07f3, B:272:0x0817, B:273:0x081f, B:275:0x0825, B:277:0x0837, B:284:0x0861, B:285:0x0881, B:287:0x088d, B:289:0x08a2, B:291:0x08e3, B:297:0x08ff, B:299:0x090a, B:301:0x090e, B:303:0x0912, B:305:0x0916, B:306:0x0924, B:308:0x092a, B:310:0x0942, B:311:0x0947, B:327:0x09ed, B:312:0x0961, B:314:0x0969, B:318:0x0990, B:320:0x09b8, B:322:0x09c6, B:326:0x09e0, B:315:0x0976, B:282:0x084b, B:268:0x07de, B:329:0x09fb, B:331:0x0a08, B:332:0x0a0e, B:333:0x0a16, B:335:0x0a1c, B:338:0x0a36, B:340:0x0a47, B:360:0x0abb, B:362:0x0ac1, B:364:0x0ad9, B:367:0x0ae0, B:372:0x0b0f, B:374:0x0b51, B:377:0x0b86, B:378:0x0b8a, B:379:0x0b95, B:381:0x0bd8, B:382:0x0be5, B:384:0x0bf4, B:388:0x0c0e, B:389:0x0c22, B:391:0x0c27, B:376:0x0b63, B:368:0x0ae8, B:370:0x0af4, B:371:0x0af8, B:392:0x0c3d, B:393:0x0c55, B:396:0x0c5d, B:397:0x0c62, B:398:0x0c72, B:400:0x0c8c, B:401:0x0ca7, B:402:0x0cb0, B:407:0x0ccf, B:406:0x0cbc, B:341:0x0a5f, B:343:0x0a65, B:345:0x0a6f, B:347:0x0a76, B:353:0x0a86, B:355:0x0a8d, B:357:0x0aac, B:359:0x0ab3, B:358:0x0ab0, B:354:0x0a8a, B:346:0x0a73, B:205:0x05d5, B:207:0x05db, B:410:0x0ce1), top: B:420:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ce  */
    @WorkerThread
    private final boolean zzah(String str, long j) {
        int i;
        int i2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzkq zzkqVar;
        Object obj;
        zzef zzefVarZzd;
        String str2;
        Object objZzn;
        long j2;
        int iZzc;
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB;
        Long lValueOf;
        String str3;
        String str4;
        int i3;
        int i4;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzfs zzfsVar2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        int i5;
        int i6;
        com.google.android.gms.internal.measurement.zzfs zzfsVar3;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        String strZzh;
        int iCharCount;
        int iCodePointAt;
        byte b;
        String str5 = "_npa";
        String str6 = "_ai";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzkq zzkqVar2 = new zzkq(this, null);
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzU(null, j, this.zzA, zzkqVar2);
            List list = zzkqVar2.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar4 = (com.google.android.gms.internal.measurement.zzgc) zzkqVar2.zza.zzby();
                zzgcVar4.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar4 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar5 = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    i = i14;
                    i2 = i11;
                    com.google.android.gms.internal.measurement.zzfs zzfsVar6 = zzfsVar4;
                    if (i10 >= zzkqVar2.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar7 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzkqVar2.zzc.get(i10)).zzby();
                    zzfi zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    String str7 = str5;
                    if (zzfiVar.zzr(zzkqVar2.zza.zzx(), zzfsVar7.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(zzkqVar2.zza.zzx()), this.zzn.zzj().zzd(zzfsVar7.zzo()));
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        if (!zzfiVar2.zzp(zzkqVar2.zza.zzx())) {
                            zzfi zzfiVar3 = this.zzc;
                            zzal(zzfiVar3);
                            if (!zzfiVar3.zzs(zzkqVar2.zza.zzx()) && !"_err".equals(zzfsVar7.zzo())) {
                                zzv().zzN(this.zzF, zzkqVar2.zza.zzx(), 11, "_ev", zzfsVar7.zzo(), 0);
                            }
                        }
                        str3 = str6;
                        zzgcVar3 = zzgcVar4;
                        i6 = i10;
                        i14 = i;
                        i11 = i2;
                        zzfsVar4 = zzfsVar6;
                    } else {
                        if (zzfsVar7.zzo().equals(zzgo.zza(str6))) {
                            zzfsVar7.zzi(str6);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i15 = 0;
                                while (i15 < zzfsVar7.zza()) {
                                    String str8 = str6;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar7.zzn(i15).zzg()) && !zzfsVar7.zzn(i15).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar7.zzn(i15).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i15++;
                                    str6 = str8;
                                }
                            }
                        }
                        str3 = str6;
                        zzfi zzfiVar4 = this.zzc;
                        zzal(zzfiVar4);
                        boolean zZzq = zzfiVar4.zzq(zzkqVar2.zza.zzx(), zzfsVar7.zzo());
                        if (zZzq) {
                            str4 = "_et";
                            i3 = i10;
                            i4 = i12;
                        } else {
                            zzal(this.zzi);
                            String strZzo = zzfsVar7.zzo();
                            Preconditions.checkNotEmpty(strZzo);
                            i3 = i10;
                            int iHashCode = strZzo.hashCode();
                            i4 = i12;
                            str4 = "_et";
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strZzo.equals("_ui")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strZzo.equals("_ug")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strZzo.equals("_in")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b != 0 && b != 1 && b != 2) {
                                zzgcVar2 = zzgcVar4;
                                zzfsVar = zzfsVar5;
                                i13 = i13;
                                zZzq = false;
                            }
                            if (zZzq) {
                                arrayList = new ArrayList(zzfsVar7.zzp());
                                i8 = -1;
                                i9 = -1;
                                for (i7 = 0; i7 < arrayList.size(); i7++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i7)).zzg())) {
                                        i8 = i7;
                                    } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i7)).zzg())) {
                                        i9 = i7;
                                    }
                                }
                                if (i8 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i8)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i8)).zzu()) {
                                        if (i9 == -1) {
                                            strZzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i9)).zzh();
                                            if (strZzh.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strZzh.length()) {
                                                    iCodePointAt = strZzh.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        zzfsVar7.zzh(i8);
                                        zzab(zzfsVar7, "_c");
                                        zzaa(zzfsVar7, 19, FirebaseAnalytics.Param.CURRENCY);
                                        break;
                                    }
                                    zzay().zzl().zza("Value must be specified with a numeric type.");
                                    zzfsVar7.zzh(i8);
                                    zzab(zzfsVar7, "_c");
                                    zzaa(zzfsVar7, 18, "value");
                                }
                            }
                            if ("_e".equals(zzfsVar7.zzo())) {
                                zzal(this.zzi);
                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC(), "_fr") != null) {
                                    zzgcVar3 = zzgcVar2;
                                    i12 = i4;
                                    zzfsVar5 = zzfsVar;
                                } else if (zzfsVar != null || Math.abs(zzfsVar.zzc() - zzfsVar7.zzc()) > 1000) {
                                    zzgcVar3 = zzgcVar2;
                                    zzfsVar6 = zzfsVar7;
                                    i12 = i2;
                                    zzfsVar5 = zzfsVar;
                                } else {
                                    com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.clone();
                                    if (zzaj(zzfsVar7, zzfsVar8)) {
                                        zzgcVar3 = zzgcVar2;
                                        zzgcVar3.zzS(i13, zzfsVar8);
                                        i12 = i4;
                                        zzfsVar3 = null;
                                        zzfsVar5 = null;
                                    } else {
                                        zzgcVar3 = zzgcVar2;
                                        zzfsVar3 = zzfsVar7;
                                        i12 = i2;
                                        zzfsVar5 = zzfsVar;
                                    }
                                    zzfsVar6 = zzfsVar3;
                                    i13 = i13;
                                }
                            } else {
                                zzgcVar3 = zzgcVar2;
                                if ("_vs".equals(zzfsVar7.zzo())) {
                                    zzal(this.zzi);
                                    if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC(), str4) == null) {
                                        if (zzfsVar6 != null || Math.abs(zzfsVar6.zzc() - zzfsVar7.zzc()) > 1000) {
                                            i12 = i4;
                                            zzfsVar5 = zzfsVar7;
                                            i13 = i2;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzfs zzfsVar9 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar6.clone();
                                            if (zzaj(zzfsVar9, zzfsVar7)) {
                                                i5 = i4;
                                                zzgcVar3.zzS(i5, zzfsVar9);
                                                i13 = i13;
                                                zzfsVar5 = null;
                                                zzfsVar6 = null;
                                            } else {
                                                i5 = i4;
                                                zzfsVar5 = zzfsVar7;
                                                i13 = i2;
                                            }
                                            i12 = i5;
                                        }
                                    }
                                }
                                i12 = i4;
                                zzfsVar5 = zzfsVar;
                            }
                            i6 = i3;
                            zzkqVar2.zzc.set(i6, (com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC());
                            i11 = i2 + 1;
                            zzgcVar3.zzk(zzfsVar7);
                            i14 = i;
                            zzfsVar4 = zzfsVar6;
                        }
                        int i16 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            zzgcVar2 = zzgcVar4;
                            if (i16 >= zzfsVar7.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar7.zzn(i16).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar7.zzn(i16).zzby();
                                zzfsVar2 = zzfsVar5;
                                zzfwVar.zzi(1L);
                                zzfsVar7.zzk(i16, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaC());
                                z = true;
                            } else {
                                zzfsVar2 = zzfsVar5;
                                if ("_r".equals(zzfsVar7.zzn(i16).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar7.zzn(i16).zzby();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar7.zzk(i16, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaC());
                                    z2 = true;
                                }
                            }
                            i16++;
                            zzgcVar4 = zzgcVar2;
                            zzfsVar5 = zzfsVar2;
                        }
                        zzfsVar = zzfsVar5;
                        if (!z && zZzq) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar7.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze.zzj("_c");
                            zzfwVarZze.zzi(1L);
                            zzfsVar7.zze(zzfwVarZze);
                        }
                        if (!z2) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar7.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze2.zzj("_r");
                            zzfwVarZze2.zzi(1L);
                            zzfsVar7.zze(zzfwVarZze2);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        i13 = i13;
                        if (zzamVar3.zzl(zza(), zzkqVar2.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkqVar2.zza.zzx(), zzdu.zzn)) {
                            zzab(zzfsVar7, "_r");
                        } else {
                            i = 1;
                        }
                        if (zzlb.zzai(zzfsVar7.zzo()) && zZzq) {
                            zzam zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            if (zzamVar4.zzl(zza(), zzkqVar2.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkqVar2.zza.zzx(), zzdu.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z3 = false;
                                int i17 = -1;
                                for (int i18 = 0; i18 < zzfsVar7.zza(); i18++) {
                                    com.google.android.gms.internal.measurement.zzfx zzfxVarZzn = zzfsVar7.zzn(i18);
                                    if ("_c".equals(zzfxVarZzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzfxVarZzn.zzby();
                                        i17 = i18;
                                    } else if ("_err".equals(zzfxVarZzn.zzg())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar7.zzh(i17);
                                    } else {
                                        zzfwVar3 = null;
                                        if (zzfwVar3 != null) {
                                            com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                            zzfwVar4.zzj("_err");
                                            zzfwVar4.zzi(10L);
                                            zzfsVar7.zzk(i17, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaC());
                                        } else {
                                            zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                        }
                                    }
                                } else if (zzfwVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar5 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                    zzfwVar5.zzj("_err");
                                    zzfwVar5.zzi(10L);
                                    zzfsVar7.zzk(i17, (com.google.android.gms.internal.measurement.zzfx) zzfwVar5.zzaC());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                                }
                            }
                        }
                        if (zZzq) {
                            arrayList = new ArrayList(zzfsVar7.zzp());
                            i8 = -1;
                            i9 = -1;
                            while (i7 < arrayList.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i7)).zzg())) {
                                    i8 = i7;
                                } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i7)).zzg())) {
                                    i9 = i7;
                                }
                            }
                            if (i8 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i8)).zzw()) {
                                }
                                if (i9 == -1) {
                                    strZzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i9)).zzh();
                                    if (strZzh.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strZzh.length()) {
                                            iCodePointAt = strZzh.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                zzfsVar7.zzh(i8);
                                zzab(zzfsVar7, "_c");
                                zzaa(zzfsVar7, 19, FirebaseAnalytics.Param.CURRENCY);
                                break;
                            }
                        }
                        if ("_e".equals(zzfsVar7.zzo())) {
                            zzal(this.zzi);
                            if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC(), "_fr") != null) {
                                if (zzfsVar != null) {
                                }
                                zzgcVar3 = zzgcVar2;
                                zzfsVar6 = zzfsVar7;
                                i12 = i2;
                                zzfsVar5 = zzfsVar;
                            } else {
                                zzgcVar3 = zzgcVar2;
                                i12 = i4;
                                zzfsVar5 = zzfsVar;
                            }
                        } else {
                            zzgcVar3 = zzgcVar2;
                            if ("_vs".equals(zzfsVar7.zzo())) {
                                zzal(this.zzi);
                                if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC(), str4) == null) {
                                    if (zzfsVar6 != null) {
                                        i12 = i4;
                                        zzfsVar5 = zzfsVar7;
                                        i13 = i2;
                                    } else {
                                        i12 = i4;
                                        zzfsVar5 = zzfsVar7;
                                        i13 = i2;
                                    }
                                }
                            }
                            i12 = i4;
                            zzfsVar5 = zzfsVar;
                        }
                        i6 = i3;
                        zzkqVar2.zzc.set(i6, (com.google.android.gms.internal.measurement.zzft) zzfsVar7.zzaC());
                        i11 = i2 + 1;
                        zzgcVar3.zzk(zzfsVar7);
                        i14 = i;
                        zzfsVar4 = zzfsVar6;
                    }
                    i10 = i6 + 1;
                    zzgcVar4 = zzgcVar3;
                    str5 = str7;
                    str6 = str3;
                }
                String str9 = str5;
                com.google.android.gms.internal.measurement.zzgc zzgcVar5 = zzgcVar4;
                long jLongValue = 0;
                int i19 = i2;
                int i20 = 0;
                while (i20 < i19) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze = zzgcVar5.zze(i20);
                    if ("_e".equals(zzftVarZze.zzh())) {
                        zzal(this.zzi);
                        if (zzkv.zzB(zzftVarZze, "_fr") != null) {
                            zzgcVar5.zzA(i20);
                            i19--;
                            i20--;
                        } else {
                            zzal(this.zzi);
                            zzfxVarZzB = zzkv.zzB(zzftVarZze, "_et");
                            if (zzfxVarZzB != null) {
                                if (zzfxVarZzB.zzw()) {
                                    lValueOf = Long.valueOf(zzfxVarZzB.zzd());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf != null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        zzal(this.zzi);
                        zzfxVarZzB = zzkv.zzB(zzftVarZze, "_et");
                        if (zzfxVarZzB != null) {
                            if (zzfxVarZzB.zzw()) {
                                lValueOf = Long.valueOf(zzfxVarZzB.zzd());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                jLongValue += lValueOf.longValue();
                            }
                        }
                    }
                    i20++;
                }
                zzaf(zzgcVar5, jLongValue, false);
                Iterator it = zzgcVar5.zzas().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzgcVar5.zzap(), "_se");
                        break;
                    }
                }
                if (zzkv.zza(zzgcVar5, "_sid") >= 0) {
                    zzaf(zzgcVar5, jLongValue, true);
                } else {
                    int iZza = zzkv.zza(zzgcVar5, "_se");
                    if (iZza >= 0) {
                        zzgcVar5.zzB(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(zzkqVar2.zza.zzx()));
                    }
                }
                zzkv zzkvVar = this.zzi;
                zzal(zzkvVar);
                zzkvVar.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfi zzfiVar5 = zzkvVar.zzf.zzc;
                zzal(zzfiVar5);
                if (zzfiVar5.zzn(zzgcVar5.zzap())) {
                    zzam zzamVar6 = zzkvVar.zzf.zze;
                    zzal(zzamVar6);
                    zzh zzhVarZzj = zzamVar6.zzj(zzgcVar5.zzap());
                    if (zzhVarZzj != null && zzhVarZzj.zzah() && zzkvVar.zzt.zzg().zze()) {
                        zzkvVar.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd.zzf(str9);
                        zzglVarZzd.zzg(zzkvVar.zzt.zzg().zza());
                        zzglVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
                        int i21 = 0;
                        while (true) {
                            if (i21 >= zzgcVar5.zzb()) {
                                zzgcVar5.zzm(zzgmVar);
                                break;
                            }
                            if (str9.equals(zzgcVar5.zzao(i21).zzf())) {
                                zzgcVar5.zzam(i21, zzgmVar);
                                break;
                            }
                            i21++;
                        }
                    }
                }
                zzgcVar5.zzai(Long.MAX_VALUE);
                zzgcVar5.zzQ(Long.MIN_VALUE);
                for (int i22 = 0; i22 < zzgcVar5.zza(); i22++) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze2 = zzgcVar5.zze(i22);
                    if (zzftVarZze2.zzd() < zzgcVar5.zzd()) {
                        zzgcVar5.zzai(zzftVarZze2.zzd());
                    }
                    if (zzftVarZze2.zzd() > zzgcVar5.zzc()) {
                        zzgcVar5.zzQ(zzftVarZze2.zzd());
                    }
                }
                zzgcVar5.zzz();
                zzgcVar5.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar5.zzf(zzaaVar.zza(zzgcVar5.zzap(), zzgcVar5.zzas(), zzgcVar5.zzat(), Long.valueOf(zzgcVar5.zzd()), Long.valueOf(zzgcVar5.zzc())));
                if (zzg().zzw(zzkqVar2.zza.zzx())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzG = zzv().zzG();
                    int i23 = 0;
                    while (i23 < zzgcVar5.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar10 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar5.zze(i23).zzby();
                        if (zzfsVar10.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str10 = (String) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC(), "_en");
                            zzas zzasVarZzn = (zzas) map.get(str10);
                            if (zzasVarZzn == null) {
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzasVarZzn = zzamVar7.zzn(zzkqVar2.zza.zzx(), (String) Preconditions.checkNotNull(str10));
                                if (zzasVarZzn != null) {
                                    map.put(str10, zzasVarZzn);
                                }
                            }
                            if (zzasVarZzn != null && zzasVarZzn.zzi == null) {
                                Long l = zzasVarZzn.zzj;
                                if (l != null && l.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar10, "_sr", zzasVarZzn.zzj);
                                }
                                Boolean bool = zzasVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar10, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC());
                            }
                        } else {
                            zzfi zzfiVar6 = this.zzc;
                            zzal(zzfiVar6);
                            String strZzx = zzkqVar2.zza.zzx();
                            String strZza = zzfiVar6.zza(strZzx, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j2 = 0;
                            } else {
                                try {
                                    j2 = Long.parseLong(strZza);
                                } catch (NumberFormatException e) {
                                    zzfiVar6.zzt.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(strZzx), e);
                                    j2 = 0;
                                }
                            }
                            long jZzr = zzv().zzr(zzfsVar10.zzc(), j2);
                            com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC();
                            Long l2 = 1L;
                            long j3 = j2;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it2 = zzftVar.zzi().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                                        Iterator it3 = it2;
                                        if ("_dbg".equals(zzfxVar.zzg())) {
                                            if (l2.equals(Long.valueOf(zzfxVar.zzd()))) {
                                                iZzc = 1;
                                                break;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                    zzfi zzfiVar7 = this.zzc;
                                    zzal(zzfiVar7);
                                    iZzc = zzfiVar7.zzc(zzkqVar2.zza.zzx(), zzfsVar10.zzo());
                                    break;
                                }
                            }
                            zzfi zzfiVar8 = this.zzc;
                            zzal(zzfiVar8);
                            iZzc = zzfiVar8.zzc(zzkqVar2.zza.zzx(), zzfsVar10.zzo());
                            break;
                            if (iZzc <= 0) {
                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar10.zzo(), Integer.valueOf(iZzc));
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC());
                            } else {
                                zzas zzasVarZza = (zzas) map.get(zzfsVar10.zzo());
                                if (zzasVarZza == null) {
                                    zzam zzamVar8 = this.zze;
                                    zzal(zzamVar8);
                                    zzasVarZza = zzamVar8.zzn(zzkqVar2.zza.zzx(), zzfsVar10.zzo());
                                    if (zzasVarZza == null) {
                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkqVar2.zza.zzx(), zzfsVar10.zzo());
                                        zzasVarZza = new zzas(zzkqVar2.zza.zzx(), zzfsVar10.zzo(), 1L, 1L, 1L, zzfsVar10.zzc(), 0L, null, null, null, null);
                                    }
                                }
                                zzal(this.zzi);
                                Long l3 = (Long) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC(), "_eid");
                                boolean z4 = l3 != null;
                                if (iZzc == 1) {
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC());
                                    if (z4 && (zzasVarZza.zzi != null || zzasVarZza.zzj != null || zzasVarZza.zzk != null)) {
                                        map.put(zzfsVar10.zzo(), zzasVarZza.zza(null, null, null));
                                    }
                                } else {
                                    if (secureRandomZzG.nextInt(iZzc) == 0) {
                                        zzal(this.zzi);
                                        Long lValueOf2 = Long.valueOf(iZzc);
                                        zzkv.zzz(zzfsVar10, "_sr", lValueOf2);
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC());
                                        if (z4) {
                                            zzasVarZza = zzasVarZza.zza(null, lValueOf2, null);
                                        }
                                        map.put(zzfsVar10.zzo(), zzasVarZza.zzb(zzfsVar10.zzc(), jZzr));
                                        zzkqVar2 = zzkqVar2;
                                    } else {
                                        Long l4 = zzasVarZza.zzh;
                                        if ((l4 != null ? l4.longValue() : zzv().zzr(zzfsVar10.zzb(), j3)) != jZzr) {
                                            zzal(this.zzi);
                                            zzkv.zzz(zzfsVar10, "_efs", 1L);
                                            zzal(this.zzi);
                                            Long lValueOf3 = Long.valueOf(iZzc);
                                            zzkv.zzz(zzfsVar10, "_sr", lValueOf3);
                                            arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar10.zzaC());
                                            map.put(zzfsVar10.zzo(), (z4 ? zzasVarZza.zza(null, lValueOf3, Boolean.TRUE) : zzasVarZza).zzb(zzfsVar10.zzc(), jZzr));
                                        } else {
                                            zzas zzasVar = zzasVarZza;
                                            if (z4) {
                                                map.put(zzfsVar10.zzo(), zzasVar.zza(l3, null, null));
                                            }
                                        }
                                        i23 = i23;
                                    }
                                    zzgcVar5.zzS(i23, zzfsVar10);
                                }
                                i23++;
                                zzgcVar5 = zzgcVar5;
                                secureRandomZzG = secureRandomZzG;
                                zzkqVar2 = zzkqVar2;
                            }
                        }
                        zzgcVar5.zzS(i23, zzfsVar10);
                        zzkqVar2 = zzkqVar2;
                        secureRandomZzG = secureRandomZzG;
                        zzgcVar5 = zzgcVar5;
                        i23++;
                        zzgcVar5 = zzgcVar5;
                        secureRandomZzG = secureRandomZzG;
                        zzkqVar2 = zzkqVar2;
                    }
                    zzgcVar = zzgcVar5;
                    zzkq zzkqVar3 = zzkqVar2;
                    if (arrayList2.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzE((zzas) entry.getValue());
                    }
                    zzkqVar = zzkqVar3;
                } else {
                    zzgcVar = zzgcVar5;
                    zzkqVar = zzkqVar2;
                }
                String strZzx2 = zzkqVar.zza.zzx();
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzh zzhVarZzj2 = zzamVar10.zzj(strZzx2);
                if (zzhVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                } else if (zzgcVar.zza() > 0) {
                    long jZzn = zzhVarZzj2.zzn();
                    if (jZzn != 0) {
                        zzgcVar.zzab(jZzn);
                    } else {
                        zzgcVar.zzv();
                    }
                    long jZzp = zzhVarZzj2.zzp();
                    if (jZzp != 0) {
                        jZzn = jZzp;
                    }
                    if (jZzn != 0) {
                        zzgcVar.zzac(jZzn);
                    } else {
                        zzgcVar.zzw();
                    }
                    zzhVarZzj2.zzE();
                    zzgcVar.zzI((int) zzhVarZzj2.zzo());
                    zzhVarZzj2.zzab(zzgcVar.zzd());
                    zzhVarZzj2.zzZ(zzgcVar.zzc());
                    String strZzs = zzhVarZzj2.zzs();
                    if (strZzs != null) {
                        zzgcVar.zzW(strZzs);
                    } else {
                        zzgcVar.zzs();
                    }
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzD(zzhVarZzj2);
                }
                if (zzgcVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfi zzfiVar9 = this.zzc;
                    zzal(zzfiVar9);
                    com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar9.zze(zzkqVar.zza.zzx());
                    if (zzffVarZze != null && zzffVarZze.zzs()) {
                        zzgcVar.zzK(zzffVarZze.zzc());
                    } else if (zzkqVar.zza.zzF().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC();
                    zzamVar12.zzg();
                    zzamVar12.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzx());
                    Preconditions.checkState(zzgdVar.zzbe());
                    zzamVar12.zzz();
                    long jCurrentTimeMillis = zzamVar12.zzt.zzav().currentTimeMillis();
                    long jZzk = zzgdVar.zzk();
                    zzamVar12.zzt.zzf();
                    if (jZzk >= jCurrentTimeMillis - zzag.zzA()) {
                        long jZzk2 = zzgdVar.zzk();
                        zzamVar12.zzt.zzf();
                        if (jZzk2 > zzag.zzA() + jCurrentTimeMillis) {
                            zzamVar12.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                        }
                    } else {
                        zzamVar12.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    }
                    byte[] bArrZzbu = zzgdVar.zzbu();
                    try {
                        zzkv zzkvVar2 = zzamVar12.zzf.zzi;
                        zzal(zzkvVar2);
                        byte[] bArrZzy = zzkvVar2.zzy(bArrZzbu);
                        zzamVar12.zzt.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", bArrZzy);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (zzgdVar.zzbk()) {
                            contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                        }
                        try {
                            if (zzamVar12.zzh().insert("queue", null, contentValues) == -1) {
                                zzamVar12.zzt.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(zzgdVar.zzx()));
                            }
                        } catch (SQLiteException e2) {
                            obj = e2;
                            zzefVarZzd = zzamVar12.zzt.zzay().zzd();
                            str2 = "Error storing bundle. appId";
                            objZzn = zzeh.zzn(zzgdVar.zzx());
                            zzefVarZzd.zzc(str2, objZzn, obj);
                        }
                    } catch (IOException e3) {
                        obj = e3;
                        zzefVarZzd = zzamVar12.zzt.zzay().zzd();
                        str2 = "Data loss. Failed to serialize bundle. appId";
                        objZzn = zzeh.zzn(zzgdVar.zzx());
                    }
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkqVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i24 = 0; i24 < list2.size(); i24++) {
                    if (i24 != 0) {
                        sb.append(C1262Tc.f3278g);
                    }
                    sb.append(((Long) list2.get(i24)).longValue());
                }
                sb.append(C1313UP.f3459l);
                int iDelete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    zzamVar13.zzt.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzx2, strZzx2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzt.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(strZzx2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_sc");
        String strZzh = zzfxVarZzB == null ? null : zzfxVarZzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB2 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_pc");
        String strZzh2 = zzfxVarZzB2 != null ? zzfxVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB3 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_et");
        if (zzfxVarZzB3 == null || !zzfxVarZzB3.zzw() || zzfxVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfxVarZzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB4 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_et");
        if (zzfxVarZzB4 != null && zzfxVarZzB4.zzd() > 0) {
            jZzd += zzfxVarZzB4.zzd();
        }
        zzal(this.zzi);
        zzkv.zzz(zzfsVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzkv.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkh zzal(zzkh zzkhVar) {
        if (zzkhVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkhVar.zzY()) {
            return zzkhVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkhVar.getClass())));
    }

    public static zzkt zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkt.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzkt((zzku) Preconditions.checkNotNull(new zzku(context)), null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzkt zzktVar, zzku zzkuVar) {
        zzktVar.zzaz().zzg();
        zzktVar.zzm = new zzez(zzktVar);
        zzam zzamVar = new zzam(zzktVar);
        zzamVar.zzX();
        zzktVar.zze = zzamVar;
        zzktVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzktVar.zzc));
        zzjo zzjoVar = new zzjo(zzktVar);
        zzjoVar.zzX();
        zzktVar.zzk = zzjoVar;
        zzaa zzaaVar = new zzaa(zzktVar);
        zzaaVar.zzX();
        zzktVar.zzh = zzaaVar;
        zzic zzicVar = new zzic(zzktVar);
        zzicVar.zzX();
        zzktVar.zzj = zzicVar;
        zzkf zzkfVar = new zzkf(zzktVar);
        zzkfVar.zzX();
        zzktVar.zzg = zzkfVar;
        zzktVar.zzf = new zzep(zzktVar);
        if (zzktVar.zzr != zzktVar.zzs) {
            zzktVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzktVar.zzr), Integer.valueOf(zzktVar.zzs));
        }
        zzktVar.zzo = true;
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzA() {
        zzef zzefVarZzd;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzay().zzd().zzb("Failed to read from channel", e);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i > iZzi) {
                zzefVarZzd = zzay().zzd();
                numValueOf = Integer.valueOf(i);
                numValueOf2 = Integer.valueOf(iZzi);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (i >= iZzi) {
                    return;
                }
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzefVarZzd = zzay().zzj();
                        numValueOf = Integer.valueOf(i);
                        numValueOf2 = Integer.valueOf(iZzi);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e2) {
                        zzay().zzd().zzb("Failed to write to channel", e2);
                        zzefVarZzd = zzay().zzd();
                        numValueOf = Integer.valueOf(i);
                        numValueOf2 = Integer.valueOf(iZzi);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                zzefVarZzd = zzay().zzd();
                numValueOf = Integer.valueOf(i);
                numValueOf2 = Integer.valueOf(iZzi);
                str = "Storage version upgrade failed. Previous, current version";
            }
            zzefVarZzd.zzc(str, numValueOf, numValueOf2);
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int iZza;
        int iIndexOf;
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        Set setZzk = zzfiVar.zzk(str);
        if (setZzk != null) {
            zzgcVar.zzi(setZzk);
        }
        zzfi zzfiVar2 = this.zzc;
        zzal(zzfiVar2);
        if (zzfiVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfi zzfiVar3 = this.zzc;
        zzal(zzfiVar3);
        if (zzfiVar3.zzy(str)) {
            if (zzg().zzs(str, zzdu.zzaq)) {
                String strZzar = zzgcVar.zzar();
                if (!TextUtils.isEmpty(strZzar) && (iIndexOf = strZzar.indexOf(".")) != -1) {
                    zzgcVar.zzY(strZzar.substring(0, iIndexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfi zzfiVar4 = this.zzc;
        zzal(zzfiVar4);
        if (zzfiVar4.zzz(str) && (iZza = zzkv.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(iZza);
        }
        zzfi zzfiVar5 = this.zzc;
        zzal(zzfiVar5);
        if (zzfiVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfi zzfiVar6 = this.zzc;
        zzal(zzfiVar6);
        if (zzfiVar6.zzu(str)) {
            zzgcVar.zzn();
            zzks zzksVar = (zzks) this.zzC.get(str);
            if (zzksVar == null) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            } else if (zzg().zzi(str, zzdu.zzR) + zzksVar.zzb < zzav().elapsedRealtime()) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            }
            zzgcVar.zzR(zzksVar.zza);
        }
        zzfi zzfiVar7 = this.zzc;
        zzal(zzfiVar7);
        if (zzfiVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    @WorkerThread
    public final void zzD(zzh zzhVar) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzki zzkiVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzhVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzhVar.zzr();
        }
        ArrayMap arrayMap3 = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzdu.zzd.zza(null)).encodedAuthority((String) zzdu.zze.zza(null)).path("config/app/".concat(String.valueOf(strZzy))).appendQueryParameter("platform", C0353FN.f780a);
        zzkiVar.zzt.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfi zzfiVar = this.zzc;
            zzal(zzfiVar);
            com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar.zze(str);
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            String strZzh = zzfiVar2.zzh(str);
            if (zzffVarZze == null) {
                arrayMap = arrayMap3;
            } else {
                if (TextUtils.isEmpty(strZzh)) {
                    arrayMap2 = null;
                } else {
                    arrayMap2 = new ArrayMap();
                    arrayMap2.put("If-Modified-Since", strZzh);
                }
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    String strZzf = zzfiVar3.zzf(str);
                    if (!TextUtils.isEmpty(strZzf)) {
                        if (arrayMap2 == null) {
                            arrayMap2 = new ArrayMap();
                        }
                        arrayMap3 = arrayMap2;
                        arrayMap3.put("If-None-Match", strZzf);
                        arrayMap = arrayMap3;
                    }
                }
                arrayMap = arrayMap2;
            }
            this.zzt = true;
            zzen zzenVar = this.zzd;
            zzal(zzenVar);
            zzkl zzklVar = new zzkl(this);
            zzenVar.zzg();
            zzenVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzklVar);
            zzenVar.zzt.zzaz().zzo(new zzem(zzenVar, str, url, null, arrayMap, zzklVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(zzhVar.zzt()), string);
        }
    }

    @WorkerThread
    public final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        zzef zzefVarZzd;
        String str;
        Object objZzn;
        String strZzf;
        Object obj;
        String str2;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str3 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzaz().zzg();
        zzie zzieVar = null;
        if (this.zzD != null && (str2 = this.zzE) != null && str2.equals(str3)) {
            zzieVar = this.zzD;
        }
        zzlb.zzK(zzieVar, zzeiVarZzb.zzd, false);
        zzaw zzawVarZza = zzeiVarZzb.zza();
        zzal(this.zzi);
        if (zzkv.zzA(zzawVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zzawVarZza;
            } else if (!list.contains(zzawVarZza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str3, zzawVarZza.zza, zzawVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzawVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zzawVarZza.zza, new zzau(bundleZzc), zzawVarZza.zzc, zzawVarZza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str3);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j < 0) {
                    zzamVar2.zzt.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(str3), Long.valueOf(j));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str3, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str3);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzt.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(str3), Long.valueOf(j));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str3, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str3, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str4 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotEmpty(str4);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzt.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(str3), zzamVar7.zzt.zzj().zzd(str4), Long.valueOf(j));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzkw zzkwVar = zzacVar3.zzc;
                        zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzkwVar.zzb, j, Preconditions.checkNotNull(zzkwVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzkyVar)) {
                            zzefVarZzd = zzay().zzj();
                            str = "User property triggered";
                            objZzn = zzacVar3.zza;
                            strZzf = this.zzn.zzj().zzf(zzkyVar.zzc);
                            obj = zzkyVar.zze;
                        } else {
                            zzefVarZzd = zzay().zzd();
                            str = "Too many active user properties, ignoring";
                            objZzn = zzeh.zzn(zzacVar3.zza);
                            strZzf = this.zzn.zzj().zzf(zzkyVar.zzc);
                            obj = zzkyVar.zze;
                        }
                        zzefVarZzd.zzd(str, objZzn, strZzf, obj);
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzkw(zzkyVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(str));
            return;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        zzG(zzawVar, new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    @WorkerThread
    public final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzlb zzlbVarZzv = zzv();
        Bundle bundle = zzeiVarZzb.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzlbVarZzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzeiVarZzb, zzg().zzd(zzqVar.zza));
        zzaw zzawVarZza = zzeiVarZzb.zza();
        if ("_cmp".equals(zzawVarZza.zza) && "referrer API v2".equals(zzawVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzawVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzkw("_lgclid", zzawVarZza.zzd, strZzg, "auto"), zzqVar);
            }
        }
        zzE(zzawVarZza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r10
      0x0048: PHI (r10v11 int) = (r10v2 int), (r10v0 int) binds: [B:15:0x004a, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    @VisibleForTesting
    @WorkerThread
    public final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzae();
                throw th2;
            }
        }
        zzef zzefVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzefVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzhVarZzj = zzamVar2.zzj(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = VodPlayFragment.f8485n3;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (zzhVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(str));
            } else {
                if (z || i == 404) {
                    List list = map != null ? (List) map.get("Last-Modified") : null;
                    String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    zzox.zzc();
                    if (zzg().zzs(null, zzdu.zzao)) {
                        List list2 = map != null ? (List) map.get("ETag") : null;
                        if (list2 == null || list2.isEmpty()) {
                            str2 = null;
                        } else {
                            str2 = (String) list2.get(0);
                        }
                    } else {
                        str2 = null;
                    }
                    if (i == 404 || i == 304) {
                        zzfi zzfiVar = this.zzc;
                        zzal(zzfiVar);
                        if (zzfiVar.zze(str) == null) {
                            zzfi zzfiVar2 = this.zzc;
                            zzal(zzfiVar2);
                            zzfiVar2.zzt(str, null, null, null);
                        }
                    } else {
                        zzfi zzfiVar3 = this.zzc;
                        zzal(zzfiVar3);
                        zzfiVar3.zzt(str, bArr, str3, str2);
                    }
                    zzhVarZzj.zzL(zzav().currentTimeMillis());
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zzD(zzhVarZzj);
                    if (i == 404) {
                        zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                    } else {
                        zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                    }
                    zzen zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza() && zzai()) {
                        zzX();
                    }
                } else {
                    zzhVarZzj.zzU(zzav().currentTimeMillis());
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzamVar4.zzD(zzhVarZzj);
                    zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                    zzfi zzfiVar4 = this.zzc;
                    zzal(zzfiVar4);
                    zzfiVar4.zzl(str);
                    this.zzk.zzd.zzb(zzav().currentTimeMillis());
                    if (i == 503 || i == 429) {
                        this.zzk.zzb.zzb(zzav().currentTimeMillis());
                    }
                }
                zzag();
            }
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzC();
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
            this.zzt = false;
            zzae();
        } catch (Throwable th3) {
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzx();
            throw th3;
        }
    }

    public final void zzJ(boolean z) {
        zzag();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:15:0x0063, B:16:0x0067, B:18:0x006d, B:19:0x0073, B:20:0x008e, B:23:0x009a, B:24:0x00a1, B:28:0x00a5, B:29:0x00b4, B:31:0x00b6, B:33:0x00ba, B:36:0x00c1, B:37:0x00c2), top: B:62:0x0063, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb A[Catch: all -> 0x0010, SQLiteException -> 0x00e9, TryCatch #2 {SQLiteException -> 0x00e9, blocks: (B:14:0x002a, B:38:0x00ca, B:40:0x00df, B:42:0x00e5, B:46:0x00f2, B:45:0x00eb, B:47:0x00f5, B:48:0x00fd), top: B:63:0x002a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[Catch: all -> 0x0010, PHI: r8
      0x0129: PHI (r8v18 int) = (r8v2 int), (r8v0 int) binds: [B:13:0x0028, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0129, B:55:0x0160, B:54:0x0151, B:14:0x002a, B:38:0x00ca, B:40:0x00df, B:42:0x00e5, B:46:0x00f2, B:45:0x00eb, B:47:0x00f5, B:48:0x00fd, B:49:0x00fe), top: B:61:0x000d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0129, B:55:0x0160, B:54:0x0151, B:14:0x002a, B:38:0x00ca, B:40:0x00df, B:42:0x00e5, B:46:0x00f2, B:45:0x00eb, B:47:0x00f5, B:48:0x00fd, B:49:0x00fe), top: B:61:0x000d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0099 A[SYNTHETIC] */
    @VisibleForTesting
    @WorkerThread
    public final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzen zzenVar;
        zzam zzamVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzae();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i == 200) {
            if (th == null) {
                try {
                    this.zzk.zzc.zzb(zzav().currentTimeMillis());
                    this.zzk.zzd.zzb(0L);
                    zzag();
                    zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                jLongValue = l.longValue();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    zzamVar.zzt.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                List list2 = this.zzz;
                                if (list2 == null || !list2.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzC();
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzx();
                        this.zzz = null;
                        zzenVar = this.zzd;
                        zzal(zzenVar);
                        if (zzenVar.zza() || !zzai()) {
                            this.zzA = -1L;
                            zzag();
                        } else {
                            zzX();
                        }
                        this.zza = 0L;
                    } catch (Throwable th3) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    this.zza = zzav().elapsedRealtime();
                    zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzy(list);
                zzag();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzw();
                while (r8.hasNext()) {
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    jLongValue = l.longValue();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
                this.zzz = null;
                zzenVar = this.zzd;
                zzal(zzenVar);
                if (zzenVar.zza()) {
                    this.zzA = -1L;
                    zzag();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                } else {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzy(list);
                zzag();
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            } else {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzamVar11.zzy(list);
            zzag();
        }
        this.zzu = false;
        zzae();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x03f1 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x041d A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0456 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x045e A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0464 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0471  */
    /* JADX WARN: Code duplicated, block: B:154:0x0477 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0480 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0486  */
    /* JADX WARN: Code duplicated, block: B:160:0x048f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0492  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:170:0x04cd A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x04d2 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:176:0x04e0 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x04e9 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x023d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0241 A[Catch: all -> 0x00c5, TryCatch #2 {all -> 0x00c5, blocks: (B:23:0x00a4, B:25:0x00b3, B:45:0x011a, B:47:0x012e, B:49:0x0144, B:50:0x016b, B:52:0x01c3, B:54:0x01cb, B:58:0x01d7, B:65:0x0207, B:67:0x0212, B:72:0x0225, B:75:0x0233, B:79:0x023e, B:81:0x0241, B:83:0x0262, B:85:0x0267, B:88:0x0286, B:91:0x029a, B:93:0x02c1, B:96:0x02cb, B:98:0x02da, B:99:0x02e6, B:134:0x03bf, B:136:0x03f1, B:137:0x03f4, B:139:0x041d, B:179:0x04e9, B:180:0x04ec, B:189:0x0565, B:141:0x0432, B:146:0x0456, B:148:0x045e, B:150:0x0464, B:154:0x0477, B:158:0x0488, B:162:0x0494, B:165:0x04aa, B:170:0x04cd, B:172:0x04d2, B:174:0x04da, B:176:0x04e0, B:168:0x04ba, B:156:0x0480, B:144:0x0442, B:100:0x02ed, B:102:0x0318, B:103:0x0325, B:105:0x032c, B:107:0x0332, B:109:0x033c, B:111:0x0342, B:113:0x0348, B:115:0x034e, B:116:0x0353, B:118:0x035e, B:122:0x0375, B:128:0x037d, B:129:0x0391, B:130:0x039e, B:132:0x03a4, B:133:0x03b2, B:181:0x0501, B:183:0x0532, B:184:0x0535, B:185:0x0546, B:186:0x054a, B:188:0x054e, B:86:0x0276, B:62:0x01ef, B:31:0x00c8, B:33:0x00cc, B:37:0x00dd, B:39:0x00f4, B:41:0x00fe, B:44:0x010a), top: B:199:0x00a4, inners: #0, #3 }] */
    @WorkerThread
    public final void zzL(zzq zzqVar) {
        String str;
        String str2;
        String str3;
        long j;
        zzas zzasVarZzn;
        boolean z;
        zzaw zzawVar;
        int i;
        zzef zzefVarZzm;
        String str4;
        Bundle bundle;
        String str5;
        String str6;
        String str7;
        String str8;
        long jZzc;
        PackageInfo packageInfo;
        int i2;
        ApplicationInfo applicationInfo;
        int i3;
        long j2;
        long j3;
        boolean z2;
        long j4;
        zzef zzefVarZzm2;
        String str9;
        boolean z3;
        String strZzw;
        boolean z4;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
            if (zzhVarZzj != null && TextUtils.isEmpty(zzhVarZzj.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzhVarZzj.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzhVarZzj);
                zzfi zzfiVar = this.zzc;
                zzal(zzfiVar);
                zzfiVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long jCurrentTimeMillis = zzqVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i4 = zzqVar.zzn;
            if (i4 != 0 && i4 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzqVar.zza), Integer.valueOf(i4));
                i4 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzky zzkyVarZzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzkyVarZzp != null && !"auto".equals(zzkyVarZzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                } else if (zzqVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    zzkw zzkwVar = new zzkw("_npa", jCurrentTimeMillis, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzkyVarZzp == null || !zzkyVarZzp.zze.equals(zzkwVar.zzd)) {
                        zzW(zzkwVar, zzqVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    if (zzkyVarZzp != null) {
                        zzP(new zzkw("_npa", jCurrentTimeMillis, null, "auto"), zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzhVarZzj2 == null || !zzv().zzam(zzqVar.zzb, zzhVarZzj2.zzy(), zzqVar.zzq, zzhVarZzj2.zzr())) {
                    str3 = "_pfo";
                } else {
                    zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(zzhVarZzj2.zzt()));
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    String strZzt = zzhVarZzj2.zzt();
                    zzamVar6.zzW();
                    zzamVar6.zzg();
                    Preconditions.checkNotEmpty(strZzt);
                    try {
                        SQLiteDatabase sQLiteDatabaseZzh = zzamVar6.zzh();
                        String[] strArr = {strZzt};
                        int iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                        zzoi.zzc();
                        str3 = "_pfo";
                        try {
                            if (zzamVar6.zzt.zzf().zzs(null, zzdu.zzat)) {
                                iDelete += sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (iDelete > 0) {
                                zzamVar6.zzt.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete));
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            zzamVar6.zzt.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(strZzt), e);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        str3 = "_pfo";
                    }
                    zzhVarZzj2 = null;
                }
                if (zzhVarZzj2 != null) {
                    if (zzhVarZzj2.zzb() != -2147483648L) {
                        j = jCurrentTimeMillis;
                        z3 = zzhVarZzj2.zzb() != zzqVar.zzj;
                        strZzw = zzhVarZzj2.zzw();
                        if (zzhVarZzj2.zzb() == -2147483648L || strZzw == null || strZzw.equals(zzqVar.zzc)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4 | z3) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_pv", strZzw);
                            zzE(new zzaw("_au", new zzau(bundle2), "auto", j), zzqVar);
                        }
                    } else {
                        j = jCurrentTimeMillis;
                    }
                    strZzw = zzhVarZzj2.zzw();
                    if (zzhVarZzj2.zzb() == -2147483648L) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4 | z3) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("_pv", strZzw);
                        zzE(new zzaw("_au", new zzau(bundle3), "auto", j), zzqVar);
                    }
                } else {
                    j = jCurrentTimeMillis;
                }
                zzd(zzqVar);
                if (i4 == 0) {
                    zzam zzamVar7 = this.zze;
                    zzal(zzamVar7);
                    zzasVarZzn = zzamVar7.zzn(zzqVar.zza, "_f");
                    z = false;
                } else {
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzasVarZzn = zzamVar8.zzn(zzqVar.zza, "_v");
                    z = true;
                }
                if (zzasVarZzn == null) {
                    long j5 = ((j / 3600000) + 1) * 3600000;
                    if (z) {
                        zzW(new zzkw("_fvt", j, Long.valueOf(j5), "auto"), zzqVar);
                        zzaz().zzg();
                        zzB();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1L);
                        bundle4.putLong("_r", 1L);
                        bundle4.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle4.putLong("_dac", 1L);
                        }
                        zzawVar = new zzaw("_v", new zzau(bundle4), "auto", j);
                        zzG(zzawVar, zzqVar);
                    } else {
                        zzW(new zzkw("_fot", j, Long.valueOf(j5), "auto"), zzqVar);
                        zzaz().zzg();
                        zzez zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                        String str10 = zzqVar.zza;
                        if (str10 == null || str10.isEmpty()) {
                            i = 0;
                            zzefVarZzm = zzezVar.zza.zzay().zzm();
                            str4 = "Install Referrer Reporter was called with invalid app package name";
                        } else {
                            zzezVar.zza.zzaz().zzg();
                            if (zzezVar.zza()) {
                                zzey zzeyVar = new zzey(zzezVar, str10);
                                zzezVar.zza.zzaz().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzezVar.zza.zzau().getPackageManager();
                                if (packageManager == null) {
                                    zzefVarZzm2 = zzezVar.zza.zzay().zzm();
                                    str9 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                                } else {
                                    i = 0;
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzefVarZzm = zzezVar.zza.zzay().zzi();
                                        str4 = "Play Service for fetching Install Referrer is unavailable on device";
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str11 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str11) && zzezVar.zza()) {
                                                try {
                                                    try {
                                                        zzezVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzezVar.zza.zzau(), new Intent(intent), zzeyVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e3) {
                                                        e = e3;
                                                        zzezVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } catch (RuntimeException e4) {
                                                    e = e4;
                                                }
                                            } else {
                                                zzefVarZzm = zzezVar.zza.zzay().zzk();
                                                str4 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                            }
                                        }
                                    }
                                }
                                zzaz().zzg();
                                zzB();
                                bundle = new Bundle();
                                bundle.putLong("_c", 1L);
                                bundle.putLong("_r", 1L);
                                bundle.putLong("_uwa", 0L);
                                str5 = str3;
                                bundle.putLong(str5, 0L);
                                str6 = str2;
                                bundle.putLong(str6, 0L);
                                str7 = str;
                                bundle.putLong(str7, 0L);
                                bundle.putLong("_et", 1L);
                                if (zzqVar.zzp) {
                                    bundle.putLong("_dac", 1L);
                                }
                                str8 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                zzam zzamVar9 = this.zze;
                                zzal(zzamVar9);
                                Preconditions.checkNotEmpty(str8);
                                zzamVar9.zzg();
                                zzamVar9.zzW();
                                jZzc = zzamVar9.zzc(str8, "first_open_count");
                                if (this.zzn.zzau().getPackageManager() == null) {
                                    zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str8));
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, i);
                                    } catch (PackageManager.NameNotFoundException e5) {
                                        zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(str8), e5);
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        j3 = packageInfo.firstInstallTime;
                                        if (j3 != 0) {
                                            if (j3 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!zzg().zzs(null, zzdu.zzab)) {
                                                    bundle.putLong("_uwa", 1L);
                                                } else if (jZzc == 0) {
                                                    bundle.putLong("_uwa", 1L);
                                                    jZzc = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                applicationInfo = null;
                                                z2 = true;
                                            }
                                            i2 = 1;
                                            if (true != z2) {
                                                j4 = 0;
                                            } else {
                                                j4 = 1;
                                            }
                                            i3 = 0;
                                            zzW(new zzkw("_fi", j, Long.valueOf(j4), "auto"), zzqVar);
                                        } else {
                                            i2 = 1;
                                            applicationInfo = null;
                                            i3 = 0;
                                        }
                                    } else {
                                        i2 = 1;
                                        applicationInfo = null;
                                        i3 = 0;
                                    }
                                    try {
                                        applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str8, i3);
                                    } catch (PackageManager.NameNotFoundException e6) {
                                        zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(str8), e6);
                                    }
                                    if (applicationInfo != null) {
                                        if ((applicationInfo.flags & i2) != 0) {
                                            j2 = 1;
                                            bundle.putLong(str6, 1L);
                                        } else {
                                            j2 = 1;
                                        }
                                        if ((applicationInfo.flags & 128) != 0) {
                                            bundle.putLong(str7, j2);
                                        }
                                    }
                                }
                                if (jZzc >= 0) {
                                    bundle.putLong(str5, jZzc);
                                }
                                zzG(new zzaw("_f", new zzau(bundle), "auto", j), zzqVar);
                            } else {
                                zzefVarZzm2 = zzezVar.zza.zzay().zzi();
                                str9 = "Install Referrer Reporter is not available";
                            }
                            zzefVarZzm2.zza(str9);
                            i = 0;
                            zzaz().zzg();
                            zzB();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_uwa", 0L);
                            str5 = str3;
                            bundle.putLong(str5, 0L);
                            str6 = str2;
                            bundle.putLong(str6, 0L);
                            str7 = str;
                            bundle.putLong(str7, 0L);
                            bundle.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle.putLong("_dac", 1L);
                            }
                            str8 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar10 = this.zze;
                            zzal(zzamVar10);
                            Preconditions.checkNotEmpty(str8);
                            zzamVar10.zzg();
                            zzamVar10.zzW();
                            jZzc = zzamVar10.zzc(str8, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() == null) {
                                zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str8));
                            } else {
                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, i);
                                if (packageInfo != null) {
                                    j3 = packageInfo.firstInstallTime;
                                    if (j3 != 0) {
                                        if (j3 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzdu.zzab)) {
                                                bundle.putLong("_uwa", 1L);
                                            } else if (jZzc == 0) {
                                                bundle.putLong("_uwa", 1L);
                                                jZzc = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        i2 = 1;
                                        if (true != z2) {
                                            j4 = 0;
                                        } else {
                                            j4 = 1;
                                        }
                                        i3 = 0;
                                        zzW(new zzkw("_fi", j, Long.valueOf(j4), "auto"), zzqVar);
                                    } else {
                                        i2 = 1;
                                        applicationInfo = null;
                                        i3 = 0;
                                    }
                                } else {
                                    i2 = 1;
                                    applicationInfo = null;
                                    i3 = 0;
                                }
                                applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str8, i3);
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & i2) != 0) {
                                        j2 = 1;
                                        bundle.putLong(str6, 1L);
                                    } else {
                                        j2 = 1;
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle.putLong(str7, j2);
                                    }
                                }
                            }
                            if (jZzc >= 0) {
                                bundle.putLong(str5, jZzc);
                            }
                            zzG(new zzaw("_f", new zzau(bundle), "auto", j), zzqVar);
                        }
                        zzefVarZzm.zza(str4);
                        zzaz().zzg();
                        zzB();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_uwa", 0L);
                        str5 = str3;
                        bundle.putLong(str5, 0L);
                        str6 = str2;
                        bundle.putLong(str6, 0L);
                        str7 = str;
                        bundle.putLong(str7, 0L);
                        bundle.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle.putLong("_dac", 1L);
                        }
                        str8 = (String) Preconditions.checkNotNull(zzqVar.zza);
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        Preconditions.checkNotEmpty(str8);
                        zzamVar11.zzg();
                        zzamVar11.zzW();
                        jZzc = zzamVar11.zzc(str8, "first_open_count");
                        if (this.zzn.zzau().getPackageManager() == null) {
                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str8));
                        } else {
                            packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, i);
                            if (packageInfo != null) {
                                j3 = packageInfo.firstInstallTime;
                                if (j3 != 0) {
                                    if (j3 != packageInfo.lastUpdateTime) {
                                        applicationInfo = null;
                                        if (!zzg().zzs(null, zzdu.zzab)) {
                                            bundle.putLong("_uwa", 1L);
                                        } else if (jZzc == 0) {
                                            bundle.putLong("_uwa", 1L);
                                            jZzc = 0;
                                        }
                                        z2 = false;
                                    } else {
                                        applicationInfo = null;
                                        z2 = true;
                                    }
                                    i2 = 1;
                                    if (true != z2) {
                                        j4 = 0;
                                    } else {
                                        j4 = 1;
                                    }
                                    i3 = 0;
                                    zzW(new zzkw("_fi", j, Long.valueOf(j4), "auto"), zzqVar);
                                } else {
                                    i2 = 1;
                                    applicationInfo = null;
                                    i3 = 0;
                                }
                            } else {
                                i2 = 1;
                                applicationInfo = null;
                                i3 = 0;
                            }
                            applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str8, i3);
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & i2) != 0) {
                                    j2 = 1;
                                    bundle.putLong(str6, 1L);
                                } else {
                                    j2 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle.putLong(str7, j2);
                                }
                            }
                        }
                        if (jZzc >= 0) {
                            bundle.putLong(str5, jZzc);
                        }
                        zzG(new zzaw("_f", new zzau(bundle), "auto", j), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    zzawVar = new zzaw("_cd", new zzau(new Bundle()), "auto", j);
                    zzG(zzawVar, zzqVar);
                }
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzC();
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                zzamVar13.zzx();
            } catch (Throwable th) {
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                zzamVar14.zzx();
                throw th;
            }
        }
    }

    public final void zzM() {
        this.zzr++;
    }

    @WorkerThread
    public final void zzN(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    @WorkerThread
    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeh.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzP(zzkw zzkwVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzkwVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzkw("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzkwVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzkwVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzkwVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzkwVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzamVar.zzt.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    @WorkerThread
    public final void zzR(String str, zzie zzieVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzieVar != null) {
            this.zzE = str;
            this.zzD = zzieVar;
        }
    }

    @WorkerThread
    public final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    @WorkerThread
    public final void zzT(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    @WorkerThread
    public final void zzU(zzac zzacVar, zzq zzqVar) {
        zzef zzefVarZzd;
        String str;
        Object objZzn;
        String strZzf;
        Object objZza;
        zzef zzefVarZzd2;
        String str2;
        Object objZzn2;
        String strZzf2;
        Object obj;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzkw zzkwVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar.zzb, zzacVarZzk.zzc.zzc, zzkwVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzkw zzkwVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar2.zzb, zzacVar2.zzd, zzkwVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzkw zzkwVar3 = zzacVar2.zzc;
                    zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzkwVar3.zzb, zzkwVar3.zzc, Preconditions.checkNotNull(zzkwVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzkyVar)) {
                        zzefVarZzd2 = zzay().zzc();
                        str2 = "User property updated immediately";
                        objZzn2 = zzacVar2.zza;
                        strZzf2 = this.zzn.zzj().zzf(zzkyVar.zzc);
                        obj = zzkyVar.zze;
                    } else {
                        zzefVarZzd2 = zzay().zzd();
                        str2 = "(2)Too many active user properties, ignoring";
                        objZzn2 = zzeh.zzn(zzacVar2.zza);
                        strZzf2 = this.zzn.zzj().zzf(zzkyVar.zzc);
                        obj = zzkyVar.zze;
                    }
                    zzefVarZzd2.zzd(str2, objZzn2, strZzf2, obj);
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzefVarZzd = zzay().zzc();
                    str = "Conditional property added";
                    objZzn = zzacVar2.zza;
                    strZzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    objZza = zzacVar2.zzc.zza();
                } else {
                    zzefVarZzd = zzay().zzd();
                    str = "Too many conditional properties, ignoring";
                    objZzn = zzeh.zzn(zzacVar2.zza);
                    strZzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    objZza = zzacVar2.zzc.zza();
                }
                zzefVarZzd.zzd(str, objZzn, strZzf, objZza);
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    @WorkerThread
    public final void zzW(zzkw zzkwVar, zzq zzqVar) {
        zzas zzasVarZzn;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int iZzl = zzv().zzl(zzkwVar.zzb);
            if (iZzl != 0) {
                zzlb zzlbVarZzv = zzv();
                String str = zzkwVar.zzb;
                zzg();
                String strZzD = zzlbVarZzv.zzD(str, 24, true);
                String str2 = zzkwVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, iZzl, "_ev", strZzD, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzkwVar.zzb, zzkwVar.zza());
            if (iZzd != 0) {
                zzlb zzlbVarZzv2 = zzv();
                String str3 = zzkwVar.zzb;
                zzg();
                String strZzD2 = zzlbVarZzv2.zzD(str3, 24, true);
                Object objZza = zzkwVar.zza();
                zzv().zzN(this.zzF, zzqVar.zza, iZzd, "_ev", strZzD2, (objZza == null || !((objZza instanceof String) || (objZza instanceof CharSequence))) ? 0 : objZza.toString().length());
                return;
            }
            Object objZzB = zzv().zzB(zzkwVar.zzb, zzkwVar.zza());
            if (objZzB == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.zzb)) {
                long j = zzkwVar.zzc;
                String str4 = zzkwVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzky zzkyVarZzp = zzamVar.zzp(str5, "_sno");
                if (zzkyVarZzp != null) {
                    Object obj = zzkyVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzkyVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkyVarZzp.zze);
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzasVarZzn = zzamVar2.zzn(str5, "_s");
                        if (zzasVarZzn != null) {
                            jLongValue = zzasVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (zzkyVarZzp != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkyVarZzp.zze);
                    }
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzasVarZzn = zzamVar3.zzn(str5, "_s");
                    if (zzasVarZzn != null) {
                        jLongValue = zzasVarZzn.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                zzW(new zzkw("_sno", j, Long.valueOf(jLongValue + 1), str4), zzqVar);
            }
            zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzkwVar.zzf), zzkwVar.zzb, zzkwVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzkyVar.zzc), objZzB);
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzamVar4.zzw();
            try {
                if ("_id".equals(zzkyVar.zzc)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzky zzkyVarZzp2 = zzamVar5.zzp(zzqVar.zza, "_id");
                    if (zzkyVarZzp2 != null && !zzkyVar.zze.equals(zzkyVarZzp2.zze)) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                boolean zZzL = zzamVar7.zzL(zzkyVar);
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0228  */
    /* JADX WARN: Code duplicated, block: B:121:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x029a A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02a6 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02b0 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d3 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x02e8 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0316 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0324  */
    /* JADX WARN: Code duplicated, block: B:166:0x0349 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0357  */
    /* JADX WARN: Code duplicated, block: B:172:0x035b A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0395 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x039a A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03a2 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03aa A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03b9 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x03e8 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:192:0x041c A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0451 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x046c A[Catch: all -> 0x0034, MalformedURLException -> 0x04da, TryCatch #10 {MalformedURLException -> 0x04da, blocks: (B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a), top: B:255:0x045a, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x047a A[Catch: all -> 0x0034, MalformedURLException -> 0x04da, TryCatch #10 {MalformedURLException -> 0x04da, blocks: (B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a), top: B:255:0x045a, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x048c A[Catch: all -> 0x0034, MalformedURLException -> 0x04da, TryCatch #10 {MalformedURLException -> 0x04da, blocks: (B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a), top: B:255:0x045a, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0564 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x056f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:172:0x035b, B:174:0x0395, B:176:0x039a, B:178:0x03a2, B:179:0x03a5, B:181:0x03aa, B:182:0x03ad, B:184:0x03b9, B:185:0x03cf, B:186:0x03d7, B:188:0x03e8, B:190:0x03fa, B:192:0x041c, B:194:0x045a, B:196:0x046c, B:198:0x0481, B:200:0x048c, B:201:0x0495, B:197:0x047a, B:203:0x04da, B:193:0x0451, B:124:0x0266, B:135:0x0291, B:205:0x04ee, B:206:0x04f1, B:207:0x04f2, B:212:0x0531, B:232:0x055e, B:234:0x0564, B:236:0x056f, B:220:0x053f, B:240:0x057a, B:241:0x057d), top: B:257:0x0010, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:? A[LOOP:1: B:141:0x02aa->B:275:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0266 A[ADDED_TO_REGION, EDGE_INSN: B:285:0x0266->B:124:0x0266 BREAK  A[LOOP:4: B:80:0x01a2->B:123:0x025f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x01cc A[EDGE_INSN: B:287:0x01cc->B:86:0x01cc BREAK  A[LOOP:5: B:251:0x01c6->B:108:0x0229], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189 A[Catch: all -> 0x0194, SQLiteException -> 0x0197, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0197, blocks: (B:70:0x0183, B:72:0x0189, B:79:0x019c, B:80:0x01a2, B:81:0x01a6, B:82:0x01b1), top: B:246:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019c A[Catch: all -> 0x0194, SQLiteException -> 0x0197, TRY_ENTER, TryCatch #1 {SQLiteException -> 0x0197, blocks: (B:70:0x0183, B:72:0x0189, B:79:0x019c, B:80:0x01a2, B:81:0x01a6, B:82:0x01b1), top: B:246:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6 A[Catch: all -> 0x0194, SQLiteException -> 0x01e2, TryCatch #5 {SQLiteException -> 0x01e2, blocks: (B:84:0x01c6, B:86:0x01cc, B:87:0x01d6, B:89:0x01dc, B:95:0x01e5, B:97:0x01f0, B:99:0x01f6, B:100:0x01fd, B:119:0x0256, B:102:0x0212, B:103:0x0222, B:108:0x0229, B:112:0x0230, B:113:0x023f, B:118:0x0245), top: B:251:0x01c6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x041c, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0543: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:222:0x0543 */
    @WorkerThread
    public final void zzX() {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursorRawQuery;
        String string;
        zzh zzhVarZzj;
        Cursor cursorRawQuery2;
        int iZze;
        int iMax;
        zzam zzamVar;
        boolean z;
        boolean z2;
        Cursor cursor3;
        long j;
        Cursor cursorQuery;
        List listEmptyList;
        com.google.android.gms.internal.measurement.zzga zzgaVarZza;
        int size;
        ArrayList arrayList;
        boolean z3;
        boolean zZzi;
        boolean zZzi2;
        boolean z4;
        int i;
        String strZzm;
        String strZzi;
        String string2;
        String strZzx;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        Iterator it;
        String strZzJ;
        int i2;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar2;
        ArrayList arrayList2;
        int length;
        long j2;
        zzef zzefVarZzd;
        String str;
        Object objZzn;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i3;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        zzef zzefVarZzj;
        String str2;
        zzaz().zzg();
        zzB();
        int i4 = 1;
        this.zzv = true;
        int i5 = 0;
        try {
            this.zzn.zzaw();
            Boolean boolZzj = this.zzn.zzt().zzj();
            if (boolZzj == null) {
                zzefVarZzj = zzay().zzk();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolZzj.booleanValue()) {
                    if (this.zza <= 0) {
                        zzaz().zzg();
                        if (this.zzy != null) {
                            zzefVarZzj = zzay().zzj();
                            str2 = "Uploading requested multiple times";
                        } else {
                            zzen zzenVar = this.zzd;
                            zzal(zzenVar);
                            if (zzenVar.zza()) {
                                long jCurrentTimeMillis = zzav().currentTimeMillis();
                                Cursor cursor4 = null;
                                int iZze2 = zzg().zze(null, zzdu.zzP);
                                zzg();
                                long jZzz = jCurrentTimeMillis - zzag.zzz();
                                for (int i6 = 0; i6 < iZze2 && zzah(null, jZzz); i6++) {
                                }
                                long jZza = this.zzk.zzc.zza();
                                if (jZza != 0) {
                                    zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                                }
                                zzam zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                String strZzr = zzamVar2.zzr();
                                long j3 = -1;
                                if (TextUtils.isEmpty(strZzr)) {
                                    try {
                                        this.zzA = -1L;
                                        zzam zzamVar3 = this.zze;
                                        zzal(zzamVar3);
                                        zzg();
                                        long jZzz2 = jCurrentTimeMillis - zzag.zzz();
                                        zzamVar3.zzg();
                                        zzamVar3.zzW();
                                        try {
                                            cursorRawQuery = zzamVar3.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz2)});
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    string = cursorRawQuery.getString(0);
                                                    cursorRawQuery.close();
                                                } else {
                                                    zzamVar3.zzt.zzay().zzj().zza("No expired configs for apps with pending events");
                                                    cursorRawQuery.close();
                                                    string = null;
                                                }
                                            } catch (SQLiteException e) {
                                                e = e;
                                                zzamVar3.zzt.zzay().zzd().zzb("Error selecting expired configs", e);
                                                if (cursorRawQuery != null) {
                                                }
                                                string = null;
                                                if (!TextUtils.isEmpty(string)) {
                                                    zzam zzamVar4 = this.zze;
                                                    zzal(zzamVar4);
                                                    zzhVarZzj = zzamVar4.zzj(string);
                                                    if (zzhVarZzj != null) {
                                                        zzD(zzhVarZzj);
                                                    }
                                                }
                                                this.zzv = false;
                                                zzae();
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            cursorRawQuery = null;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor2 = null;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            zzam zzamVar5 = this.zze;
                                            zzal(zzamVar5);
                                            zzhVarZzj = zzamVar5.zzj(string);
                                            if (zzhVarZzj != null) {
                                                zzD(zzhVarZzj);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor2 = cursor;
                                    }
                                } else {
                                    if (this.zzA == -1) {
                                        try {
                                            zzam zzamVar6 = this.zze;
                                            zzal(zzamVar6);
                                            try {
                                                cursorRawQuery2 = zzamVar6.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                                try {
                                                    if (cursorRawQuery2.moveToFirst()) {
                                                        j3 = cursorRawQuery2.getLong(0);
                                                    }
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    zzamVar6.zzt.zzay().zzd().zzb("Error querying raw events", e);
                                                    if (cursorRawQuery2 != null) {
                                                    }
                                                    this.zzA = j3;
                                                    iZze = zzg().zze(strZzr, zzdu.zzf);
                                                    iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                                    zzamVar = this.zze;
                                                    zzal(zzamVar);
                                                    zzamVar.zzg();
                                                    zzamVar.zzW();
                                                    if (iZze > 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    Preconditions.checkArgument(z);
                                                    if (iMax > 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    Preconditions.checkArgument(z2);
                                                    Preconditions.checkNotEmpty(strZzr);
                                                    cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                                    try {
                                                        try {
                                                            if (cursorQuery.moveToFirst()) {
                                                                arrayList2 = new ArrayList();
                                                                length = 0;
                                                                while (true) {
                                                                    j2 = cursorQuery.getLong(i5);
                                                                    try {
                                                                        byte[] blob = cursorQuery.getBlob(i4);
                                                                        zzkv zzkvVar = zzamVar.zzf.zzi;
                                                                        zzal(zzkvVar);
                                                                        try {
                                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                                                            bArr = new byte[1024];
                                                                            j = jCurrentTimeMillis;
                                                                            while (true) {
                                                                                try {
                                                                                    try {
                                                                                        i3 = gZIPInputStream.read(bArr);
                                                                                        if (i3 <= 0) {
                                                                                            break;
                                                                                        } else {
                                                                                            byteArrayOutputStream.write(bArr, 0, i3);
                                                                                        }
                                                                                    } catch (SQLiteException e4) {
                                                                                        e = e4;
                                                                                        zzamVar.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(strZzr), e);
                                                                                        listEmptyList = Collections.emptyList();
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                    }
                                                                                } catch (IOException e5) {
                                                                                    e = e5;
                                                                                    try {
                                                                                        zzkvVar.zzt.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                                        throw e;
                                                                                    } catch (IOException e6) {
                                                                                        e = e6;
                                                                                        zzefVarZzd = zzamVar.zzt.zzay().zzd();
                                                                                        str = "Failed to unzip queued bundle. appId";
                                                                                        objZzn = zzeh.zzn(strZzr);
                                                                                        zzefVarZzd.zzc(str, objZzn, e);
                                                                                        if (cursorQuery.moveToNext()) {
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery.close();
                                                                                        listEmptyList = arrayList2;
                                                                                        if (!listEmptyList.isEmpty()) {
                                                                                            if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                                                it = listEmptyList.iterator();
                                                                                                while (true) {
                                                                                                    if (!it.hasNext()) {
                                                                                                        strZzJ = null;
                                                                                                        break;
                                                                                                    }
                                                                                                    zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                                                                    if (!zzgdVar2.zzJ().isEmpty()) {
                                                                                                        strZzJ = zzgdVar2.zzJ();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (strZzJ != null) {
                                                                                                    for (i2 = 0; i2 < listEmptyList.size(); i2++) {
                                                                                                        zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i2)).first;
                                                                                                        if (zzgdVar.zzJ().isEmpty()) {
                                                                                                            listEmptyList = listEmptyList.subList(0, i2);
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                                                            size = listEmptyList.size();
                                                                                            arrayList = new ArrayList(listEmptyList.size());
                                                                                            if (zzg().zzt(strZzr)) {
                                                                                                z3 = false;
                                                                                            } else {
                                                                                                z3 = false;
                                                                                            }
                                                                                            zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                            zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                            zzpd.zzc();
                                                                                            if (zzg().zzs(null, zzdu.zzal)) {
                                                                                                z4 = false;
                                                                                            } else {
                                                                                                z4 = false;
                                                                                            }
                                                                                            i = 0;
                                                                                            while (i < size) {
                                                                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i)).first).zzby();
                                                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                                                                                zzg().zzh();
                                                                                                zzgcVar.zzal(74029L);
                                                                                                long j4 = j;
                                                                                                zzgcVar.zzak(j4);
                                                                                                this.zzn.zzaw();
                                                                                                zzgcVar.zzag(false);
                                                                                                if (!z3) {
                                                                                                    zzgcVar.zzq();
                                                                                                }
                                                                                                if (!zZzi) {
                                                                                                    zzgcVar.zzx();
                                                                                                    zzgcVar.zzt();
                                                                                                }
                                                                                                if (!zZzi2) {
                                                                                                    zzgcVar.zzn();
                                                                                                }
                                                                                                zzC(strZzr, zzgcVar);
                                                                                                if (!z4) {
                                                                                                    zzgcVar.zzy();
                                                                                                }
                                                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                                                    byte[] bArrZzbu = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                                                                    zzkv zzkvVar2 = this.zzi;
                                                                                                    zzal(zzkvVar2);
                                                                                                    zzgcVar.zzJ(zzkvVar2.zzd(bArrZzbu));
                                                                                                }
                                                                                                zzgaVarZza.zza(zzgcVar);
                                                                                                i++;
                                                                                                j = j4;
                                                                                            }
                                                                                            long j5 = j;
                                                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                zzkv zzkvVar3 = this.zzi;
                                                                                                zzal(zzkvVar3);
                                                                                                strZzm = zzkvVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                                                            } else {
                                                                                                strZzm = null;
                                                                                            }
                                                                                            zzal(this.zzi);
                                                                                            byte[] bArrZzbu2 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                                                            zzfi zzfiVar = this.zzl.zzf.zzc;
                                                                                            zzal(zzfiVar);
                                                                                            strZzi = zzfiVar.zzi(strZzr);
                                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                                string2 = (String) zzdu.zzp.zza(null);
                                                                                            } else {
                                                                                                Uri uri = Uri.parse((String) zzdu.zzp.zza(null));
                                                                                                Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                builderBuildUpon.authority(strZzi + "." + uri.getAuthority());
                                                                                                string2 = builderBuildUpon.build().toString();
                                                                                            }
                                                                                            try {
                                                                                                URL url = new URL(string2);
                                                                                                Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                if (this.zzy != null) {
                                                                                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                } else {
                                                                                                    this.zzy = new ArrayList(arrayList);
                                                                                                }
                                                                                                this.zzk.zzd.zzb(j5);
                                                                                                strZzx = AbstractC4717l6.f14991e;
                                                                                                if (size > 0) {
                                                                                                    strZzx = zzgaVarZza.zzb(0).zzx();
                                                                                                }
                                                                                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbu2.length), strZzm);
                                                                                                this.zzu = true;
                                                                                                zzen zzenVar2 = this.zzd;
                                                                                                zzal(zzenVar2);
                                                                                                zzkk zzkkVar = new zzkk(this, strZzr);
                                                                                                zzenVar2.zzg();
                                                                                                zzenVar2.zzW();
                                                                                                Preconditions.checkNotNull(url);
                                                                                                Preconditions.checkNotNull(bArrZzbu2);
                                                                                                Preconditions.checkNotNull(zzkkVar);
                                                                                                zzenVar2.zzt.zzaz().zzo(new zzem(zzenVar2, strZzr, url, bArrZzbu2, null, zzkkVar));
                                                                                            } catch (MalformedURLException unused) {
                                                                                                zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(strZzr), string2);
                                                                                            }
                                                                                        }
                                                                                        this.zzv = false;
                                                                                        zzae();
                                                                                    }
                                                                                }
                                                                            }
                                                                            gZIPInputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            byteArray = byteArrayOutputStream.toByteArray();
                                                                            if (arrayList2.isEmpty()) {
                                                                            }
                                                                            try {
                                                                                zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                                                                if (!cursorQuery.isNull(2)) {
                                                                                    zzgcVar2.zzaf(cursorQuery.getInt(2));
                                                                                }
                                                                                length += byteArray.length;
                                                                                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC(), Long.valueOf(j2)));
                                                                            } catch (IOException e7) {
                                                                                e = e7;
                                                                                zzefVarZzd = zzamVar.zzt.zzay().zzd();
                                                                                str = "Failed to merge queued bundle. appId";
                                                                                objZzn = zzeh.zzn(strZzr);
                                                                                zzefVarZzd.zzc(str, objZzn, e);
                                                                            }
                                                                        } catch (IOException e8) {
                                                                            e = e8;
                                                                            j = jCurrentTimeMillis;
                                                                        }
                                                                    } catch (IOException e9) {
                                                                        e = e9;
                                                                        j = jCurrentTimeMillis;
                                                                    }
                                                                    if (cursorQuery.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    jCurrentTimeMillis = j;
                                                                    i4 = 1;
                                                                    i5 = 0;
                                                                }
                                                                cursorQuery.close();
                                                                listEmptyList = arrayList2;
                                                            } else {
                                                                listEmptyList = Collections.emptyList();
                                                                cursorQuery.close();
                                                                j = jCurrentTimeMillis;
                                                            }
                                                        } catch (SQLiteException e10) {
                                                            e = e10;
                                                            j = jCurrentTimeMillis;
                                                        }
                                                        if (!listEmptyList.isEmpty()) {
                                                            if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                it = listEmptyList.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        strZzJ = null;
                                                                        break;
                                                                    }
                                                                    zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                                    if (!zzgdVar2.zzJ().isEmpty()) {
                                                                        strZzJ = zzgdVar2.zzJ();
                                                                        break;
                                                                    }
                                                                }
                                                                if (strZzJ != null) {
                                                                    while (i2 < listEmptyList.size()) {
                                                                        zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i2)).first;
                                                                        if (zzgdVar.zzJ().isEmpty()) {
                                                                            listEmptyList = listEmptyList.subList(0, i2);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                                            size = listEmptyList.size();
                                                            arrayList = new ArrayList(listEmptyList.size());
                                                            if (zzg().zzt(strZzr)) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                            zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                            zzpd.zzc();
                                                            if (zzg().zzs(null, zzdu.zzal)) {
                                                                z4 = false;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            i = 0;
                                                            while (i < size) {
                                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i)).first).zzby();
                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                                                zzg().zzh();
                                                                zzgcVar.zzal(74029L);
                                                                long j6 = j;
                                                                zzgcVar.zzak(j6);
                                                                this.zzn.zzaw();
                                                                zzgcVar.zzag(false);
                                                                if (!z3) {
                                                                    zzgcVar.zzq();
                                                                }
                                                                if (!zZzi) {
                                                                    zzgcVar.zzx();
                                                                    zzgcVar.zzt();
                                                                }
                                                                if (!zZzi2) {
                                                                    zzgcVar.zzn();
                                                                }
                                                                zzC(strZzr, zzgcVar);
                                                                if (!z4) {
                                                                    zzgcVar.zzy();
                                                                }
                                                                if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                                    byte[] bArrZzbu3 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                                    zzkv zzkvVar4 = this.zzi;
                                                                    zzal(zzkvVar4);
                                                                    zzgcVar.zzJ(zzkvVar4.zzd(bArrZzbu3));
                                                                }
                                                                zzgaVarZza.zza(zzgcVar);
                                                                i++;
                                                                j = j6;
                                                            }
                                                            long j7 = j;
                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                zzkv zzkvVar5 = this.zzi;
                                                                zzal(zzkvVar5);
                                                                strZzm = zzkvVar5.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                                            } else {
                                                                strZzm = null;
                                                            }
                                                            zzal(this.zzi);
                                                            byte[] bArrZzbu4 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                                            zzfi zzfiVar2 = this.zzl.zzf.zzc;
                                                            zzal(zzfiVar2);
                                                            strZzi = zzfiVar2.zzi(strZzr);
                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                Uri uri2 = Uri.parse((String) zzdu.zzp.zza(null));
                                                                Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                builderBuildUpon2.authority(strZzi + "." + uri2.getAuthority());
                                                                string2 = builderBuildUpon2.build().toString();
                                                            } else {
                                                                string2 = (String) zzdu.zzp.zza(null);
                                                            }
                                                            URL url2 = new URL(string2);
                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                            if (this.zzy != null) {
                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                            } else {
                                                                this.zzy = new ArrayList(arrayList);
                                                            }
                                                            this.zzk.zzd.zzb(j7);
                                                            strZzx = AbstractC4717l6.f14991e;
                                                            if (size > 0) {
                                                                strZzx = zzgaVarZza.zzb(0).zzx();
                                                            }
                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbu4.length), strZzm);
                                                            this.zzu = true;
                                                            zzen zzenVar3 = this.zzd;
                                                            zzal(zzenVar3);
                                                            zzkk zzkkVar2 = new zzkk(this, strZzr);
                                                            zzenVar3.zzg();
                                                            zzenVar3.zzW();
                                                            Preconditions.checkNotNull(url2);
                                                            Preconditions.checkNotNull(bArrZzbu4);
                                                            Preconditions.checkNotNull(zzkkVar2);
                                                            zzenVar3.zzt.zzaz().zzo(new zzem(zzenVar3, strZzr, url2, bArrZzbu4, null, zzkkVar2));
                                                        }
                                                        this.zzv = false;
                                                        zzae();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor3 = cursorQuery;
                                                        if (cursor3 != null) {
                                                            cursor3.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                cursorRawQuery2 = null;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                throw th;
                                            }
                                            cursorRawQuery2.close();
                                            this.zzA = j3;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor4 = cursorRawQuery2;
                                        }
                                    }
                                    iZze = zzg().zze(strZzr, zzdu.zzf);
                                    iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                    if (iZze > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    Preconditions.checkArgument(z);
                                    if (iMax > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    Preconditions.checkArgument(z2);
                                    Preconditions.checkNotEmpty(strZzr);
                                    try {
                                        cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                        if (cursorQuery.moveToFirst()) {
                                            listEmptyList = Collections.emptyList();
                                            cursorQuery.close();
                                            j = jCurrentTimeMillis;
                                        } else {
                                            arrayList2 = new ArrayList();
                                            length = 0;
                                            while (true) {
                                                j2 = cursorQuery.getLong(i5);
                                                byte[] blob2 = cursorQuery.getBlob(i4);
                                                zzkv zzkvVar6 = zzamVar.zzf.zzi;
                                                zzal(zzkvVar6);
                                                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                bArr = new byte[1024];
                                                j = jCurrentTimeMillis;
                                                while (true) {
                                                    i3 = gZIPInputStream.read(bArr);
                                                    if (i3 <= 0) {
                                                        break;
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr, 0, i3);
                                                }
                                                gZIPInputStream.close();
                                                byteArrayInputStream2.close();
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                                    break;
                                                }
                                                zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                                if (!cursorQuery.isNull(2)) {
                                                    zzgcVar2.zzaf(cursorQuery.getInt(2));
                                                }
                                                length += byteArray.length;
                                                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC(), Long.valueOf(j2)));
                                                if (cursorQuery.moveToNext() || length > iMax) {
                                                    break;
                                                    break;
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                    i4 = 1;
                                                    i5 = 0;
                                                }
                                            }
                                            cursorQuery.close();
                                            listEmptyList = arrayList2;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        j = jCurrentTimeMillis;
                                        cursorQuery = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        cursor3 = null;
                                    }
                                    if (!listEmptyList.isEmpty()) {
                                        if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                            it = listEmptyList.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    strZzJ = null;
                                                    break;
                                                }
                                                zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                                if (!zzgdVar2.zzJ().isEmpty()) {
                                                    strZzJ = zzgdVar2.zzJ();
                                                    break;
                                                }
                                            }
                                            if (strZzJ != null) {
                                                while (i2 < listEmptyList.size()) {
                                                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i2)).first;
                                                    if (zzgdVar.zzJ().isEmpty() && !zzgdVar.zzJ().equals(strZzJ)) {
                                                        listEmptyList = listEmptyList.subList(0, i2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                        size = listEmptyList.size();
                                        arrayList = new ArrayList(listEmptyList.size());
                                        if (zzg().zzt(strZzr) || !zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                        zzpd.zzc();
                                        if (zzg().zzs(null, zzdu.zzal) || !zzg().zzs(strZzr, zzdu.zzan)) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        i = 0;
                                        while (i < size) {
                                            zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i)).first).zzby();
                                            arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                            zzg().zzh();
                                            zzgcVar.zzal(74029L);
                                            long j8 = j;
                                            zzgcVar.zzak(j8);
                                            this.zzn.zzaw();
                                            zzgcVar.zzag(false);
                                            if (!z3) {
                                                zzgcVar.zzq();
                                            }
                                            if (!zZzi) {
                                                zzgcVar.zzx();
                                                zzgcVar.zzt();
                                            }
                                            if (!zZzi2) {
                                                zzgcVar.zzn();
                                            }
                                            zzC(strZzr, zzgcVar);
                                            if (!z4) {
                                                zzgcVar.zzy();
                                            }
                                            if (zzg().zzs(strZzr, zzdu.zzT)) {
                                                byte[] bArrZzbu5 = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC()).zzbu();
                                                zzkv zzkvVar7 = this.zzi;
                                                zzal(zzkvVar7);
                                                zzgcVar.zzJ(zzkvVar7.zzd(bArrZzbu5));
                                            }
                                            zzgaVarZza.zza(zzgcVar);
                                            i++;
                                            j = j8;
                                        }
                                        long j9 = j;
                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                            zzkv zzkvVar8 = this.zzi;
                                            zzal(zzkvVar8);
                                            strZzm = zzkvVar8.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                        } else {
                                            strZzm = null;
                                        }
                                        zzal(this.zzi);
                                        byte[] bArrZzbu6 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                        zzfi zzfiVar3 = this.zzl.zzf.zzc;
                                        zzal(zzfiVar3);
                                        strZzi = zzfiVar3.zzi(strZzr);
                                        if (TextUtils.isEmpty(strZzi)) {
                                            Uri uri3 = Uri.parse((String) zzdu.zzp.zza(null));
                                            Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                            builderBuildUpon3.authority(strZzi + "." + uri3.getAuthority());
                                            string2 = builderBuildUpon3.build().toString();
                                        } else {
                                            string2 = (String) zzdu.zzp.zza(null);
                                        }
                                        URL url3 = new URL(string2);
                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                        if (this.zzy != null) {
                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzy = new ArrayList(arrayList);
                                        }
                                        this.zzk.zzd.zzb(j9);
                                        strZzx = AbstractC4717l6.f14991e;
                                        if (size > 0) {
                                            strZzx = zzgaVarZza.zzb(0).zzx();
                                        }
                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbu6.length), strZzm);
                                        this.zzu = true;
                                        zzen zzenVar4 = this.zzd;
                                        zzal(zzenVar4);
                                        zzkk zzkkVar3 = new zzkk(this, strZzr);
                                        zzenVar4.zzg();
                                        zzenVar4.zzW();
                                        Preconditions.checkNotNull(url3);
                                        Preconditions.checkNotNull(bArrZzbu6);
                                        Preconditions.checkNotNull(zzkkVar3);
                                        zzenVar4.zzt.zzaz().zzo(new zzem(zzenVar4, strZzr, url3, bArrZzbu6, null, zzkkVar3));
                                    }
                                }
                                this.zzv = false;
                            } else {
                                zzay().zzj().zza("Network not connected, ignoring upload request");
                            }
                        }
                        zzae();
                    }
                    zzag();
                    this.zzv = false;
                    zzae();
                }
                zzefVarZzj = zzay().zzd();
                str2 = "Upload called in the client side when service should be used";
            }
            zzefVarZzj.zza(str2);
            this.zzv = false;
            zzae();
        } catch (Throwable th7) {
            this.zzv = false;
            zzae();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x016c A[Catch: all -> 0x014b, TRY_ENTER, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0183 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0196  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea A[Catch: all -> 0x014b, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f8 A[Catch: all -> 0x014b, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0209 A[Catch: all -> 0x014b, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213 A[Catch: all -> 0x014b, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ae A[Catch: all -> 0x014b, TryCatch #8 {all -> 0x014b, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:39:0x014f, B:90:0x02e1, B:99:0x0317, B:101:0x0359, B:103:0x035e, B:104:0x0375, B:108:0x0388, B:110:0x03a0, B:112:0x03a7, B:113:0x03be, B:118:0x03e8, B:122:0x040b, B:123:0x0422, B:126:0x0433, B:129:0x0450, B:130:0x0464, B:132:0x046e, B:134:0x047b, B:136:0x0481, B:137:0x048a, B:138:0x0498, B:140:0x04ad, B:150:0x04e3, B:151:0x04f8, B:153:0x051d, B:156:0x0535, B:159:0x0578, B:161:0x05a4, B:163:0x05e3, B:164:0x05e8, B:166:0x05f0, B:167:0x05f5, B:169:0x05fd, B:170:0x0602, B:172:0x0612, B:174:0x0620, B:176:0x0628, B:177:0x062d, B:179:0x0636, B:180:0x063a, B:182:0x0647, B:183:0x064c, B:185:0x0673, B:187:0x067b, B:188:0x0680, B:190:0x0688, B:191:0x068b, B:193:0x06a3, B:196:0x06ac, B:197:0x06c6, B:199:0x06cc, B:201:0x06e0, B:203:0x06ec, B:205:0x06f9, B:209:0x0713, B:210:0x0723, B:214:0x072d, B:215:0x0730, B:217:0x074e, B:219:0x0752, B:221:0x0764, B:223:0x0768, B:225:0x0773, B:226:0x077c, B:228:0x07bb, B:230:0x07c5, B:231:0x07c8, B:233:0x07d5, B:235:0x07f5, B:236:0x0802, B:237:0x0838, B:239:0x0840, B:241:0x084a, B:242:0x0857, B:244:0x0861, B:245:0x086e, B:246:0x087a, B:248:0x0880, B:250:0x08b0, B:251:0x08f6, B:253:0x0900, B:254:0x0903, B:255:0x090f, B:257:0x0915, B:266:0x0962, B:267:0x09b0, B:269:0x09bf, B:288:0x0a2e, B:274:0x09da, B:275:0x09dd, B:260:0x0921, B:262:0x094d, B:287:0x0a19, B:285:0x0a01, B:286:0x0a18, B:160:0x0596, B:147:0x04c9, B:93:0x02f7, B:94:0x02fe, B:96:0x0304, B:98:0x0310, B:44:0x0160, B:47:0x016c, B:49:0x0183, B:56:0x01a4, B:64:0x01e4, B:66:0x01ea, B:68:0x01f8, B:70:0x0209, B:73:0x0213, B:86:0x02a3, B:88:0x02ae, B:75:0x0240, B:76:0x025a, B:78:0x0268, B:85:0x0288, B:84:0x0275, B:59:0x01b2, B:63:0x01da), top: B:310:0x0124, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02df  */
    @WorkerThread
    public final void zzY(zzaw zzawVar, zzq zzqVar) {
        String strZzg;
        long jLongValue;
        String str;
        String upperCase;
        String strConcat;
        zzky zzkyVarZzp;
        String str2;
        zzam zzamVar;
        String str3;
        zzky zzkyVar;
        zzky zzkyVar2;
        zzam zzamVar2;
        Object obj;
        double dDoubleValue;
        long length;
        long jDelete;
        zzas zzasVarZzc;
        ArrayList arrayList;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        int i;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str4 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzkv.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        String str5 = "_err";
        if (zzfiVar.zzr(str4, zzawVar.zza)) {
            zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(str4), this.zzn.zzj().zzd(zzawVar.zza));
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            if (!zzfiVar2.zzp(str4)) {
                zzfi zzfiVar3 = this.zzc;
                zzal(zzfiVar3);
                if (!zzfiVar3.zzs(str4)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzN(this.zzF, str4, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzh zzhVarZzj = zzamVar3.zzj(str4);
            if (zzhVarZzj != null) {
                long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzhVarZzj.zzl(), zzhVarZzj.zzc()));
                zzg();
                if (jAbs > ((Long) zzdu.zzy.zza(null)).longValue()) {
                    zzay().zzc().zza("Fetching config for blocked app");
                    zzD(zzhVarZzj);
                    return;
                }
                return;
            }
            return;
        }
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzv().zzM(zzeiVarZzb, zzg().zzd(str4));
        zzaw zzawVarZza = zzeiVarZzb.zza();
        if (Log.isLoggable(zzay().zzq(), 2)) {
            zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzawVarZza));
        }
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        zzamVar4.zzw();
        try {
            zzd(zzqVar);
            boolean z = "ecommerce_purchase".equals(zzawVarZza.zza) || FirebaseAnalytics.Event.PURCHASE.equals(zzawVarZza.zza) || FirebaseAnalytics.Event.REFUND.equals(zzawVarZza.zza);
            if ("_iap".equals(zzawVarZza.zza)) {
                strZzg = zzawVarZza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
                if (z) {
                    dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue = zzawVarZza.zzb.zze("value").longValue();
                        Double.isNaN(dLongValue);
                        dDoubleValue = dLongValue * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str4), Double.valueOf(dDoubleValue));
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzC();
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzx();
                        return;
                    }
                    jLongValue = Math.round(dDoubleValue);
                    if (FirebaseAnalytics.Event.REFUND.equals(zzawVarZza.zza)) {
                        jLongValue = -jLongValue;
                    }
                } else {
                    str5 = "_err";
                    jLongValue = zzawVarZza.zzb.zze("value").longValue();
                }
                if (TextUtils.isEmpty(strZzg)) {
                    str = str5;
                } else {
                    upperCase = strZzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strConcat = "_ltv_".concat(upperCase);
                        zzam zzamVar7 = this.zze;
                        zzal(zzamVar7);
                        zzkyVarZzp = zzamVar7.zzp(str4, strConcat);
                        if (zzkyVarZzp != null) {
                            obj = zzkyVarZzp.zze;
                            if (obj instanceof Long) {
                                zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                str = str5;
                            } else {
                                str2 = str5;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze = zzg().zze(str4, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str4);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    str3 = str2;
                                    try {
                                        zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str4, str4, String.valueOf(iZze)});
                                    } catch (SQLiteException e) {
                                        e = e;
                                        zzamVar.zzt.zzay().zzd().zzc("Error pruning currencies. appId", zzeh.zzn(str4), e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    str3 = str2;
                                }
                                str = str3;
                                zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                        } else {
                            str2 = str5;
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            int iZze2 = zzg().zze(str4, zzdu.zzD) - 1;
                            Preconditions.checkNotEmpty(str4);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            str3 = str2;
                            zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str4, str4, String.valueOf(iZze2)});
                            str = str3;
                            zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                        }
                        zzkyVar2 = zzkyVar;
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        if (!zzamVar2.zzL(zzkyVar2)) {
                            zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str4), this.zzn.zzj().zzf(zzkyVar2.zzc), zzkyVar2.zze);
                            zzv().zzN(this.zzF, str4, 9, null, null, 0);
                        }
                    } else {
                        str = str5;
                    }
                }
            } else if (z) {
                z = true;
                strZzg = zzawVarZza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
                if (z) {
                    dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue2 = zzawVarZza.zzb.zze("value").longValue();
                        Double.isNaN(dLongValue2);
                        dDoubleValue = dLongValue2 * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d) {
                    }
                    zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str4), Double.valueOf(dDoubleValue));
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzamVar8.zzC();
                    zzam zzamVar9 = this.zze;
                    zzal(zzamVar9);
                    zzamVar9.zzx();
                    return;
                }
                str5 = "_err";
                jLongValue = zzawVarZza.zzb.zze("value").longValue();
                if (TextUtils.isEmpty(strZzg)) {
                    upperCase = strZzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strConcat = "_ltv_".concat(upperCase);
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzkyVarZzp = zzamVar10.zzp(str4, strConcat);
                        if (zzkyVarZzp != null) {
                            obj = zzkyVarZzp.zze;
                            if (obj instanceof Long) {
                                str2 = str5;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze3 = zzg().zze(str4, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str4);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                str3 = str2;
                                zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str4, str4, String.valueOf(iZze3)});
                                str = str3;
                                zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            } else {
                                zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                str = str5;
                            }
                        } else {
                            str2 = str5;
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            int iZze4 = zzg().zze(str4, zzdu.zzD) - 1;
                            Preconditions.checkNotEmpty(str4);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            str3 = str2;
                            zzamVar.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str4, str4, String.valueOf(iZze4)});
                            str = str3;
                            zzkyVar = new zzky(str4, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                        }
                        zzkyVar2 = zzkyVar;
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        if (!zzamVar2.zzL(zzkyVar2)) {
                            zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str4), this.zzn.zzj().zzf(zzkyVar2.zzc), zzkyVar2.zze);
                            zzv().zzN(this.zzF, str4, 9, null, null, 0);
                        }
                    } else {
                        str = str5;
                    }
                } else {
                    str = str5;
                }
            } else {
                str = "_err";
            }
            boolean zZzai = zzlb.zzai(zzawVarZza.zza);
            boolean zEquals = str.equals(zzawVarZza.zza);
            zzv();
            zzau zzauVar = zzawVarZza.zzb;
            if (zzauVar == null) {
                length = 0;
            } else {
                zzat zzatVar = new zzat(zzauVar);
                length = 0;
                while (zzatVar.hasNext()) {
                    Object objZzf = zzauVar.zzf(zzatVar.next());
                    if (objZzf instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objZzf).length;
                    }
                }
            }
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzak zzakVarZzm = zzamVar11.zzm(zza(), str4, length + 1, true, zZzai, false, zEquals, false);
            long j = zzakVarZzm.zzb;
            zzg();
            long jIntValue = j - ((long) ((Integer) zzdu.zzj.zza(null)).intValue());
            if (jIntValue > 0) {
                if (jIntValue % 1000 == 1) {
                    zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(str4), Long.valueOf(zzakVarZzm.zzb));
                }
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzC();
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                zzamVar13.zzx();
                return;
            }
            if (zZzai) {
                long j2 = zzakVarZzm.zza;
                zzg();
                long jIntValue2 = j2 - ((long) ((Integer) zzdu.zzl.zza(null)).intValue());
                if (jIntValue2 > 0) {
                    if (jIntValue2 % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(str4), Long.valueOf(zzakVarZzm.zza));
                    }
                    zzv().zzN(this.zzF, str4, 16, "_ev", zzawVarZza.zza, 0);
                    zzam zzamVar14 = this.zze;
                    zzal(zzamVar14);
                    zzamVar14.zzC();
                    zzam zzamVar15 = this.zze;
                    zzal(zzamVar15);
                    zzamVar15.zzx();
                    return;
                }
            }
            if (zEquals) {
                long jMax = zzakVarZzm.zzd - ((long) Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzdu.zzk))));
                if (jMax > 0) {
                    if (jMax == 1) {
                        zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(str4), Long.valueOf(zzakVarZzm.zzd));
                    }
                    zzam zzamVar16 = this.zze;
                    zzal(zzamVar16);
                    zzamVar16.zzC();
                    zzam zzamVar17 = this.zze;
                    zzal(zzamVar17);
                    zzamVar17.zzx();
                    return;
                }
            }
            Bundle bundleZzc = zzawVarZza.zzb.zzc();
            zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
            if (zzv().zzae(str4)) {
                zzv().zzO(bundleZzc, "_dbg", 1L);
                zzv().zzO(bundleZzc, "_r", 1L);
            }
            if ("_s".equals(zzawVarZza.zza)) {
                zzam zzamVar18 = this.zze;
                zzal(zzamVar18);
                zzky zzkyVarZzp2 = zzamVar18.zzp(zzqVar.zza, "_sno");
                if (zzkyVarZzp2 != null && (zzkyVarZzp2.zze instanceof Long)) {
                    zzv().zzO(bundleZzc, "_sno", zzkyVarZzp2.zze);
                }
            }
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            Preconditions.checkNotEmpty(str4);
            zzamVar19.zzg();
            zzamVar19.zzW();
            try {
                try {
                    jDelete = zzamVar19.zzh().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str4, String.valueOf(Math.max(0, Math.min(1000000, zzamVar19.zzt.zzf().zze(str4, zzdu.zzo))))});
                } catch (SQLiteException e3) {
                    e = e3;
                    zzamVar19.zzt.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(str4), e);
                    jDelete = 0;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
            if (jDelete > 0) {
                zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(str4), Long.valueOf(jDelete));
            }
            zzar zzarVar = new zzar(this.zzn, zzawVarZza.zzc, str4, zzawVarZza.zza, zzawVarZza.zzd, 0L, bundleZzc);
            zzam zzamVar20 = this.zze;
            zzal(zzamVar20);
            zzas zzasVarZzn = zzamVar20.zzn(str4, zzarVar.zzb);
            if (zzasVarZzn == null) {
                zzam zzamVar21 = this.zze;
                zzal(zzamVar21);
                if (zzamVar21.zzf(str4) >= zzg().zzb(str4) && zZzai) {
                    zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeh.zzn(str4), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str4)));
                    zzv().zzN(this.zzF, str4, 8, null, null, 0);
                    zzam zzamVar22 = this.zze;
                    zzal(zzamVar22);
                    zzamVar22.zzx();
                    return;
                }
                zzasVarZzc = new zzas(str4, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
            } else {
                zzarVar = zzarVar.zza(this.zzn, zzasVarZzn.zzf);
                zzasVarZzc = zzasVarZzn.zzc(zzarVar.zzd);
            }
            zzam zzamVar23 = this.zze;
            zzal(zzamVar23);
            zzamVar23.zzE(zzasVarZzc);
            zzaz().zzg();
            zzB();
            Preconditions.checkNotNull(zzarVar);
            Preconditions.checkNotNull(zzqVar);
            Preconditions.checkNotEmpty(zzarVar.zza);
            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
            com.google.android.gms.internal.measurement.zzgc zzgcVarZzt = com.google.android.gms.internal.measurement.zzgd.zzt();
            zzgcVarZzt.zzad(1);
            zzgcVarZzt.zzZ(C0353FN.f780a);
            if (!TextUtils.isEmpty(zzqVar.zza)) {
                zzgcVarZzt.zzD(zzqVar.zza);
            }
            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                zzgcVarZzt.zzF(zzqVar.zzd);
            }
            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                zzgcVarZzt.zzG(zzqVar.zzc);
            }
            zzpd.zzc();
            if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan) && !TextUtils.isEmpty(zzqVar.zzx)) {
                zzgcVarZzt.zzah(zzqVar.zzx);
            }
            long j3 = zzqVar.zzj;
            if (j3 != -2147483648L) {
                zzgcVarZzt.zzH((int) j3);
            }
            zzgcVarZzt.zzV(zzqVar.zze);
            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                zzgcVarZzt.zzU(zzqVar.zzb);
            }
            zzgcVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
            if (zzgcVarZzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                zzgcVarZzt.zzC(zzqVar.zzq);
            }
            long j4 = zzqVar.zzf;
            if (j4 != 0) {
                zzgcVarZzt.zzM(j4);
            }
            zzgcVarZzt.zzP(zzqVar.zzs);
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            Map mapZzc = zzdu.zzc(zzkvVar.zzf.zzn.zzau());
            if (mapZzc != null && !mapZzc.isEmpty()) {
                arrayList = new ArrayList();
                int iIntValue = ((Integer) zzdu.zzO.zza(null)).intValue();
                for (Map.Entry entry : mapZzc.entrySet()) {
                    if (((String) entry.getKey()).startsWith("measurement.id.")) {
                        try {
                            int i2 = Integer.parseInt((String) entry.getValue());
                            if (i2 != 0) {
                                arrayList.add(Integer.valueOf(i2));
                                if (arrayList.size() >= iIntValue) {
                                    zzkvVar.zzt.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } catch (NumberFormatException e5) {
                            zzkvVar.zzt.zzay().zzk().zzb("Experiment ID NumberFormatException", e5);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                zzam zzamVar24 = this.zze;
                zzal(zzamVar24);
                zzamVar24.zzx();
                throw th;
            }
            arrayList = null;
            if (arrayList != null) {
                zzgcVarZzt.zzh(arrayList);
            }
            zzai zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
            zzah zzahVar = zzah.AD_STORAGE;
            if (zzaiVarZzc.zzi(zzahVar) && zzqVar.zzo) {
                Pair pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzqVar.zzo) {
                    zzgcVarZzt.zzae((String) pairZzd.first);
                    Object obj2 = pairZzd.second;
                    if (obj2 != null) {
                        zzgcVarZzt.zzX(((Boolean) obj2).booleanValue());
                    }
                }
            }
            this.zzn.zzg().zzu();
            zzgcVarZzt.zzN(Build.MODEL);
            this.zzn.zzg().zzu();
            zzgcVarZzt.zzY(Build.VERSION.RELEASE);
            zzgcVarZzt.zzaj((int) this.zzn.zzg().zzb());
            zzgcVarZzt.zzan(this.zzn.zzg().zzc());
            if (this.zzn.zzJ()) {
                zzgcVarZzt.zzap();
                if (!TextUtils.isEmpty(null)) {
                    zzgcVarZzt.zzO(null);
                }
            }
            zzam zzamVar25 = this.zze;
            zzal(zzamVar25);
            zzh zzhVarZzj2 = zzamVar25.zzj(zzqVar.zza);
            if (zzhVarZzj2 == null) {
                zzhVarZzj2 = new zzh(this.zzn, zzqVar.zza);
                zzhVarZzj2.zzH(zzw(zzaiVarZzc));
                zzhVarZzj2.zzV(zzqVar.zzk);
                zzhVarZzj2.zzW(zzqVar.zzb);
                if (zzaiVarZzc.zzi(zzahVar)) {
                    zzhVarZzj2.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                }
                zzhVarZzj2.zzaa(0L);
                zzhVarZzj2.zzab(0L);
                zzhVarZzj2.zzZ(0L);
                zzhVarZzj2.zzJ(zzqVar.zzc);
                zzhVarZzj2.zzK(zzqVar.zzj);
                zzhVarZzj2.zzI(zzqVar.zzd);
                zzhVarZzj2.zzX(zzqVar.zze);
                zzhVarZzj2.zzS(zzqVar.zzf);
                zzhVarZzj2.zzac(zzqVar.zzh);
                zzhVarZzj2.zzT(zzqVar.zzs);
                zzam zzamVar26 = this.zze;
                zzal(zzamVar26);
                zzamVar26.zzD(zzhVarZzj2);
            }
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzj2.zzu())) {
                zzgcVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj2.zzu()));
            }
            if (!TextUtils.isEmpty(zzhVarZzj2.zzx())) {
                zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj2.zzx()));
            }
            zzam zzamVar27 = this.zze;
            zzal(zzamVar27);
            List listZzu = zzamVar27.zzu(zzqVar.zza);
            for (int i3 = 0; i3 < listZzu.size(); i3++) {
                com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                zzglVarZzd.zzf(((zzky) listZzu.get(i3)).zzc);
                zzglVarZzd.zzg(((zzky) listZzu.get(i3)).zzd);
                zzkv zzkvVar2 = this.zzi;
                zzal(zzkvVar2);
                zzkvVar2.zzu(zzglVarZzd, ((zzky) listZzu.get(i3)).zze);
                zzgcVarZzt.zzl(zzglVarZzd);
            }
            try {
                zzam zzamVar28 = this.zze;
                zzal(zzamVar28);
                com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVarZzt.zzaC();
                zzamVar28.zzg();
                zzamVar28.zzW();
                Preconditions.checkNotNull(zzgdVar);
                Preconditions.checkNotEmpty(zzgdVar.zzx());
                byte[] bArrZzbu = zzgdVar.zzbu();
                zzkv zzkvVar3 = zzamVar28.zzf.zzi;
                zzal(zzkvVar3);
                long jZzd = zzkvVar3.zzd(bArrZzbu);
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", zzgdVar.zzx());
                contentValues.put("metadata_fingerprint", Long.valueOf(jZzd));
                contentValues.put(TtmlNode.TAG_METADATA, bArrZzbu);
                try {
                    zzgcVar = zzgcVarZzt;
                    try {
                        try {
                            zzamVar28.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                            zzam zzamVar29 = this.zze;
                            zzal(zzamVar29);
                            zzat zzatVar2 = new zzat(zzarVar.zzf);
                            while (true) {
                                if (!zzatVar2.hasNext()) {
                                    zzfi zzfiVar4 = this.zzc;
                                    zzal(zzfiVar4);
                                    boolean zZzq = zzfiVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                    zzam zzamVar30 = this.zze;
                                    zzal(zzamVar30);
                                    zzak zzakVarZzl = zzamVar30.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                    if (!zZzq || zzakVarZzl.zze >= zzg().zze(zzarVar.zza, zzdu.zzn)) {
                                        i = 0;
                                        break;
                                    }
                                } else if ("_r".equals(zzatVar2.next())) {
                                }
                                i = 1;
                                break;
                            }
                            zzamVar29.zzg();
                            zzamVar29.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzkv zzkvVar4 = zzamVar29.zzf.zzi;
                            zzal(zzkvVar4);
                            byte[] bArrZzbu2 = zzkvVar4.zzj(zzarVar).zzbu();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", zzarVar.zza);
                            contentValues2.put("name", zzarVar.zzb);
                            contentValues2.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues2.put("metadata_fingerprint", Long.valueOf(jZzd));
                            contentValues2.put("data", bArrZzbu2);
                            contentValues2.put("realtime", Integer.valueOf(i));
                            try {
                                if (zzamVar29.zzh().insert("raw_events", null, contentValues2) == -1) {
                                    zzamVar29.zzt.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzarVar.zza));
                                } else {
                                    this.zza = 0L;
                                }
                            } catch (SQLiteException e6) {
                                zzamVar29.zzt.zzay().zzd().zzc("Error storing raw event. appId", zzeh.zzn(zzarVar.zza), e6);
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            SQLiteException sQLiteException = e;
                            zzamVar28.zzt.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(zzgdVar.zzx()), sQLiteException);
                            throw sQLiteException;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeh.zzn(zzgcVar.zzap()), e);
                    }
                    zzam zzamVar31 = this.zze;
                    zzal(zzamVar31);
                    zzamVar31.zzC();
                    zzam zzamVar32 = this.zze;
                    zzal(zzamVar32);
                    zzamVar32.zzx();
                    zzag();
                    zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                } catch (SQLiteException e9) {
                    e = e9;
                    zzgcVar = zzgcVarZzt;
                }
            } catch (IOException e10) {
                e = e10;
                zzgcVar = zzgcVarZzt;
            }
        } catch (Throwable th) {
            zzam zzamVar210 = this.zze;
            zzal(zzamVar210);
            zzamVar210.zzx();
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzZ() {
        zzef zzefVarZzk;
        String str;
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            zzefVarZzk = zzay().zzd();
            str = "Failed to acquire storage lock";
            zzefVarZzk.zzb(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            zzefVarZzk = zzay().zzd();
            str = "Failed to access storage lock file";
            zzefVarZzk.zzb(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            zzefVarZzk = zzay().zzk();
            str = "Storage lock already acquired";
            zzefVarZzk.zzb(str, e);
            return false;
        }
    }

    public final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzjo zzjoVar = this.zzk;
        zzjoVar.zzW();
        zzjoVar.zzg();
        long jZza = zzjoVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzjoVar.zzt.zzv().zzG().nextInt(86400000)) + 1;
            zzjoVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    @WorkerThread
    public final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkr zzkrVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzks(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
        zzai zzaiVarZzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String strZzf = zzaiVarZzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
            }
            if (zzaiVarZzc.zzi(zzahVar)) {
                zzhVarZzj.zzae(strZzf);
            }
        } else if (zzaiVarZzc.zzi(zzahVar) && strZzf != null && !strZzf.equals(zzhVarZzj.zzA())) {
            zzhVarZzj.zzae(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzaiVarZzc).first)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzky zzkyVar = new zzky(zzqVar.zza, "auto", "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzkyVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzu()) && zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzH(zzw(zzaiVarZzc));
        }
        zzhVarZzj.zzW(zzqVar.zzb);
        zzhVarZzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzV(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzhVarZzj.zzX(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzJ(zzqVar.zzc);
        }
        zzhVarZzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzI(str);
        }
        zzhVarZzj.zzS(zzqVar.zzf);
        zzhVarZzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzY(zzqVar.zzg);
        }
        zzhVarZzj.zzG(zzqVar.zzo);
        zzhVarZzj.zzad(zzqVar.zzr);
        zzhVarZzj.zzT(zzqVar.zzs);
        zzpd.zzc();
        if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan)) {
            zzhVarZzj.zzag(zzqVar.zzx);
        }
        zznt.zzc();
        if (zzg().zzs(null, zzdu.zzaj)) {
            zzhVarZzj.zzaf(zzqVar.zzt);
        } else {
            zznt.zzc();
            if (zzg().zzs(null, zzdu.zzai)) {
                zzhVarZzj.zzaf(null);
            }
        }
        if (zzhVarZzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    @WorkerThread
    public final zzai zzh(String str) {
        String string;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                zzai zzaiVarZzb = zzai.zzb(string);
                zzV(str, zzaiVarZzb);
                return zzaiVarZzb;
            } catch (SQLiteException e) {
                zzamVar.zzt.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzec zzj() {
        return this.zzn.zzj();
    }

    public final zzen zzl() {
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        return zzenVar;
    }

    public final zzep zzm() {
        zzep zzepVar = this.zzf;
        if (zzepVar != null) {
            return zzepVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfi zzo() {
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        return zzfiVar;
    }

    public final zzfr zzq() {
        return this.zzn;
    }

    public final zzic zzr() {
        zzic zzicVar = this.zzj;
        zzal(zzicVar);
        return zzicVar;
    }

    public final zzjo zzs() {
        return this.zzk;
    }

    public final zzkv zzu() {
        zzkv zzkvVar = this.zzi;
        zzal(zzkvVar);
        return zzkvVar;
    }

    public final zzlb zzv() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    @WorkerThread
    public final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzkm(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzqVar.zza), e);
            return null;
        }
    }

    @WorkerThread
    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
