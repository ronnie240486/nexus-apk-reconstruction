package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpj;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.slf4j.impl.AndroidLoggerFactory;
import p000.C4327f4;
import p000.e70;

/* JADX INFO: loaded from: classes.dex */
public final class zzdy extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzdy(zzfr zzfrVar, long j) {
        super(zzfrVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0161  */
    /* JADX WARN: Code duplicated, block: B:54:0x016a A[Catch: IllegalStateException -> 0x0191, TryCatch #0 {IllegalStateException -> 0x0191, blocks: (B:49:0x0149, B:52:0x0162, B:54:0x016a, B:58:0x0188, B:57:0x0184, B:62:0x0195, B:64:0x01ab, B:66:0x01b0, B:65:0x01ae), top: B:87:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0184 A[Catch: IllegalStateException -> 0x0191, TryCatch #0 {IllegalStateException -> 0x0191, blocks: (B:49:0x0149, B:52:0x0162, B:54:0x016a, B:58:0x0188, B:57:0x0184, B:62:0x0195, B:64:0x01ab, B:66:0x01b0, B:65:0x01ae), top: B:87:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0195 A[Catch: IllegalStateException -> 0x0191, TryCatch #0 {IllegalStateException -> 0x0191, blocks: (B:49:0x0149, B:52:0x0162, B:54:0x016a, B:58:0x0188, B:57:0x0184, B:62:0x0195, B:64:0x01ab, B:66:0x01b0, B:65:0x01ae), top: B:87:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab A[Catch: IllegalStateException -> 0x0191, TryCatch #0 {IllegalStateException -> 0x0191, blocks: (B:49:0x0149, B:52:0x0162, B:54:0x016a, B:58:0x0188, B:57:0x0184, B:62:0x0195, B:64:0x01ab, B:66:0x01b0, B:65:0x01ae), top: B:87:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae A[Catch: IllegalStateException -> 0x0191, TryCatch #0 {IllegalStateException -> 0x0191, blocks: (B:49:0x0149, B:52:0x0162, B:54:0x016a, B:58:0x0188, B:57:0x0184, B:62:0x0195, B:64:0x01ab, B:66:0x01b0, B:65:0x01ae), top: B:87:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:85:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00cd. Please report as an issue. */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void zzd() {
        String str;
        String string;
        boolean z;
        int iZza;
        zzfr zzfrVar;
        String str2;
        zzef zzefVarZzi;
        String str3;
        zzef zzefVarZzl;
        String str4;
        List listZzp;
        Iterator it;
        String strZzc;
        String str5;
        Context contextZzau;
        String strZzz;
        String packageName = this.zzt.zzau().getPackageName();
        PackageManager packageManager = this.zzt.zzau().getPackageManager();
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        String str6 = "Unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzt.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeh.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzt.zzau().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str6 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str6;
                            str6 = string;
                            this.zzt.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeh.zzn(packageName), str6);
                            string = str6;
                            str6 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str6;
                this.zzc = i;
                this.zze = string;
                this.zzf = 0L;
                if (TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx())) {
                    z = true;
                } else {
                    z = false;
                }
                iZza = this.zzt.zza();
                switch (iZza) {
                    case 0:
                        zzfrVar = this.zzt;
                        str2 = "App measurement collection enabled";
                        e70.m20045a(zzfrVar, str2);
                        break;
                    case 1:
                        zzefVarZzi = this.zzt.zzay().zzi();
                        str3 = "App measurement deactivated via the manifest";
                        zzefVarZzi.zza(str3);
                        break;
                    case 2:
                        zzfrVar = this.zzt;
                        str2 = "App measurement deactivated via the init parameters";
                        e70.m20045a(zzfrVar, str2);
                        break;
                    case 3:
                        zzefVarZzi = this.zzt.zzay().zzi();
                        str3 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                        zzefVarZzi.zza(str3);
                        break;
                    case 4:
                        zzefVarZzi = this.zzt.zzay().zzi();
                        str3 = "App measurement disabled via the manifest";
                        zzefVarZzi.zza(str3);
                        break;
                    case 5:
                        zzfrVar = this.zzt;
                        str2 = "App measurement disabled via the init parameters";
                        e70.m20045a(zzfrVar, str2);
                        break;
                    case 6:
                        zzefVarZzl = this.zzt.zzay().zzl();
                        str4 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                        zzefVarZzl.zza(str4);
                        break;
                    case 7:
                        zzefVarZzl = this.zzt.zzay().zzi();
                        str4 = "App measurement disabled via the global data collection setting";
                        zzefVarZzl.zza(str4);
                        break;
                    default:
                        zzefVarZzl = this.zzt.zzay().zzi();
                        str4 = "App measurement disabled due to denied storage consent";
                        zzefVarZzl.zza(str4);
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzt.zzaw();
                if (z) {
                    this.zzl = this.zzt.zzw();
                }
                strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
                this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
                if (!TextUtils.isEmpty(strZzc)) {
                    contextZzau = this.zzt.zzau();
                    strZzz = this.zzt.zzz();
                    Preconditions.checkNotNull(contextZzau);
                    Resources resources = contextZzau.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfj.zza(contextZzau);
                    }
                    this.zzl = zzfj.zzb("admob_app_id", resources, strZzz);
                }
                if (iZza == 0) {
                    zzef zzefVarZzj = this.zzt.zzay().zzj();
                    String str7 = this.zza;
                    if (TextUtils.isEmpty(this.zzk)) {
                        str5 = this.zzl;
                    } else {
                        str5 = this.zzk;
                    }
                    zzefVarZzj.zzc("App measurement enabled for app package, google app id", str7, str5);
                }
                this.zzh = null;
                this.zzt.zzaw();
                listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                if (listZzp != null) {
                    this.zzh = listZzp;
                } else if (listZzp.isEmpty()) {
                    this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzp.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzh = listZzp;
                        }
                    } while (this.zzt.zzv().zzab("safelisted event", (String) it.next()));
                }
                if (packageManager != null) {
                    this.zzj = InstantApps.isInstantApp(this.zzt.zzau()) ? 1 : 0;
                } else {
                    this.zzj = 0;
                }
            }
            this.zzt.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeh.zzn(packageName));
            strZzc = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
            this.zzk = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                contextZzau = this.zzt.zzau();
                strZzz = this.zzt.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources2 = contextZzau.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfj.zza(contextZzau);
                }
                this.zzl = zzfj.zzb("admob_app_id", resources2, strZzz);
            }
            if (iZza == 0) {
                zzef zzefVarZzj2 = this.zzt.zzay().zzj();
                String str8 = this.zza;
                if (TextUtils.isEmpty(this.zzk)) {
                    str5 = this.zzl;
                } else {
                    str5 = this.zzk;
                }
                zzefVarZzj2.zzc("App measurement enabled for app package, google app id", str8, str5);
            }
        } catch (IllegalStateException e) {
            this.zzt.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeh.zzn(packageName), e);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str6;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
            z = false;
        } else {
            z = false;
        }
        iZza = this.zzt.zza();
        switch (iZza) {
            case 0:
                zzfrVar = this.zzt;
                str2 = "App measurement collection enabled";
                e70.m20045a(zzfrVar, str2);
                break;
            case 1:
                zzefVarZzi = this.zzt.zzay().zzi();
                str3 = "App measurement deactivated via the manifest";
                zzefVarZzi.zza(str3);
                break;
            case 2:
                zzfrVar = this.zzt;
                str2 = "App measurement deactivated via the init parameters";
                e70.m20045a(zzfrVar, str2);
                break;
            case 3:
                zzefVarZzi = this.zzt.zzay().zzi();
                str3 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                zzefVarZzi.zza(str3);
                break;
            case 4:
                zzefVarZzi = this.zzt.zzay().zzi();
                str3 = "App measurement disabled via the manifest";
                zzefVarZzi.zza(str3);
                break;
            case 5:
                zzfrVar = this.zzt;
                str2 = "App measurement disabled via the init parameters";
                e70.m20045a(zzfrVar, str2);
                break;
            case 6:
                zzefVarZzl = this.zzt.zzay().zzl();
                str4 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                zzefVarZzl.zza(str4);
                break;
            case 7:
                zzefVarZzl = this.zzt.zzay().zzi();
                str4 = "App measurement disabled via the global data collection setting";
                zzefVarZzl.zza(str4);
                break;
            default:
                zzefVarZzl = this.zzt.zzay().zzi();
                str4 = "App measurement disabled due to denied storage consent";
                zzefVarZzl.zza(str4);
                break;
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzaw();
        if (z) {
            this.zzl = this.zzt.zzw();
        }
        this.zzh = null;
        this.zzt.zzaw();
        listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
        if (listZzp != null) {
            this.zzh = listZzp;
        } else if (listZzp.isEmpty()) {
            this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzp.iterator();
            do {
                if (it.hasNext()) {
                    this.zzh = listZzp;
                }
            } while (this.zzt.zzv().zzab("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.zzj = InstantApps.isInstantApp(this.zzt.zzau()) ? 1 : 0;
        } else {
            this.zzj = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    @WorkerThread
    public final int zzh() {
        zza();
        return this.zzj;
    }

    @WorkerThread
    public final int zzi() {
        zza();
        return this.zzc;
    }

    @WorkerThread
    public final zzq zzj(String str) {
        String str2;
        zzef zzefVarZzm;
        String str3;
        String str4;
        List list;
        zzg();
        String strZzl = zzl();
        String strZzm = zzm();
        zza();
        String str5 = this.zzb;
        zza();
        long j = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        this.zzt.zzf().zzh();
        zza();
        zzg();
        long j2 = this.zzf;
        if (j2 == 0) {
            zzlb zzlbVarZzv = this.zzt.zzv();
            Context contextZzau = this.zzt.zzau();
            String packageName = this.zzt.zzau().getPackageName();
            zzlbVarZzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestZzF = zzlb.zzF();
            long jZzp = -1;
            if (messageDigestZzF == null) {
                C4327f4.m20229a(zzlbVarZzv.zzt, "Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzlbVarZzv.zzag(contextZzau, packageName)) {
                            jZzp = 0;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(zzlbVarZzv.zzt.zzau().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzlbVarZzv.zzt.zzay().zzk().zza("Could not get signatures");
                            } else {
                                jZzp = zzlb.zzp(messageDigestZzF.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        zzlbVarZzv.zzt.zzay().zzd().zzb("Package name not found", e);
                        j2 = 0;
                    }
                }
                j2 = 0;
                this.zzf = j2;
            }
            j2 = jZzp;
            this.zzf = j2;
        }
        long j3 = j2;
        boolean zZzJ = this.zzt.zzJ();
        boolean z = !this.zzt.zzm().zzl;
        zzg();
        if (this.zzt.zzJ()) {
            zzpj.zzc();
            if (this.zzt.zzf().zzs(null, zzdu.zzaa)) {
                e70.m20045a(this.zzt, "Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.zzt.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzt.zzau());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    zzefVarZzm = this.zzt.zzay().zzl();
                                    str3 = "Failed to retrieve Firebase Instance Id";
                                    zzefVarZzm.zza(str3);
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            zzefVarZzm = this.zzt.zzay().zzm();
                            str3 = "Failed to obtain Firebase Analytics instance";
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzfr zzfrVar = this.zzt;
        long jZza = zzfrVar.zzm().zzc.zza();
        long jMin = jZza == 0 ? zzfrVar.zzc : Math.min(zzfrVar.zzc, jZza);
        zza();
        int i = this.zzj;
        boolean zZzr = this.zzt.zzf().zzr();
        zzew zzewVarZzm = this.zzt.zzm();
        zzewVarZzm.zzg();
        boolean z2 = zzewVarZzm.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str7 = this.zzl;
        Boolean boolZzk = this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolZzk == null ? null : Boolean.valueOf(!boolZzk.booleanValue());
        long j4 = this.zzg;
        List list2 = this.zzh;
        String strZzh = this.zzt.zzm().zzc().zzh();
        if (this.zzi == null) {
            this.zzi = this.zzt.zzf().zzs(null, zzdu.zzap) ? this.zzt.zzv().zzC() : "";
        }
        String str8 = this.zzi;
        zzpd.zzc();
        String str9 = null;
        if (this.zzt.zzf().zzs(null, zzdu.zzam)) {
            zzg();
            if (this.zzn == 0) {
                str4 = str7;
                list = list2;
            } else {
                str4 = str7;
                list = list2;
                long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzo();
                }
            }
            if (this.zzm == null) {
                zzo();
            }
            str9 = this.zzm;
        } else {
            str4 = str7;
            list = list2;
        }
        return new zzq(strZzl, strZzm, str5, j, str6, 74029L, j3, str, zZzJ, z, str2, 0L, jMin, i, zZzr, z2, str4, boolValueOf, j4, list, (String) null, strZzh, str8, str9);
    }

    @WorkerThread
    public final String zzk() {
        zza();
        return this.zzl;
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    @WorkerThread
    public final List zzn() {
        return this.zzh;
    }

    @WorkerThread
    public final void zzo() {
        String str;
        zzg();
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        this.zzt.zzay().zzc().zza(String.format("Resetting session stitching token to %s", str == null ? AndroidLoggerFactory.f17234b : "not null"));
        this.zzm = str;
        this.zzn = this.zzt.zzav().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
