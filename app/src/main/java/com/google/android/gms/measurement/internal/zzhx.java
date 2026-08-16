package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.C4391g4;
import p000.e70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhx extends zzf {

    @VisibleForTesting
    protected zzhw zza;
    final zzs zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzgr zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;

    @GuardedBy("consentLock")
    private zzai zzi;

    @GuardedBy("consentLock")
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzla zzn;

    public zzhx(zzfr zzfrVar) {
        super(zzfrVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhl(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzfrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzew zzewVarZzm = this.zzt.zzm();
            zzfr zzfrVar = zzewVarZzm.zzt;
            zzewVarZzm.zzg();
            SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzab() {
        zzg();
        String strZza = this.zzt.zzm().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzY("app", "_npa", null, this.zzt.zzav().currentTimeMillis());
            } else {
                zzY("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), this.zzt.zzav().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzof.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzad)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaz().zzp(new zzgz(this));
    }

    public static /* bridge */ /* synthetic */ void zzv(zzhx zzhxVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zZzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || zZzl) {
            zzhxVar.zzt.zzh().zzo();
        }
    }

    public static /* synthetic */ void zzw(zzhx zzhxVar, zzai zzaiVar, int i, long j, boolean z, boolean z2) {
        zzhxVar.zzg();
        zzhxVar.zza();
        if (j <= zzhxVar.zzl && zzai.zzj(zzhxVar.zzm, i)) {
            zzhxVar.zzt.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzew zzewVarZzm = zzhxVar.zzt.zzm();
        zzfr zzfrVar = zzewVarZzm.zzt;
        zzewVarZzm.zzg();
        if (!zzewVarZzm.zzl(i)) {
            zzhxVar.zzt.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
        editorEdit.putString("consent_settings", zzaiVar.zzh());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        zzhxVar.zzl = j;
        zzhxVar.zzm = i;
        zzhxVar.zzt.zzt().zzF(z);
        if (z2) {
            zzhxVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaz().zzp(new zzhg(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle bundleZza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzaf(obj)) {
                    this.zzt.zzv().zzN(this.zzn, null, 27, null, null, 0);
                }
                this.zzt.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlb.zzah(str)) {
                this.zzt.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else {
                zzlb zzlbVarZzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzlbVarZzv.zzaa("param", str, 100, obj)) {
                    this.zzt.zzv().zzO(bundleZza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int iZzc = this.zzt.zzf().zzc();
        if (bundleZza.size() > iZzc) {
            int i = 0;
            for (String str2 : new TreeSet(bundleZza.keySet())) {
                i++;
                if (i > iZzc) {
                    bundleZza.remove(str2);
                }
            }
            this.zzt.zzv().zzN(this.zzn, null, 26, null, null, 0);
            this.zzt.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(bundleZza);
        this.zzt.zzt().zzH(bundleZza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == FirebaseAnalytics.Event.SCREEN_VIEW || (str2 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzt.zzs().zzx(bundle2, j);
        } else {
            zzM(str3, str2, j, bundle2, z2, !z2 || this.zzd == null || zzlb.zzah(str2), z, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfr.zzO();
        zzM("auto", str2, this.zzt.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzav().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void zzH(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzI(str, str2, j, bundle, true, this.zzd == null || zzlb.zzah(str2), true, null);
    }

    @WorkerThread
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        long j2;
        Bundle[] bundleArr;
        Object[] array;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzn = this.zzt.zzh().zzn();
        if (listZzn != null && !listZzn.contains(str2)) {
            this.zzt.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzau());
                } catch (Exception e) {
                    this.zzt.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzaw();
            zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzav().currentTimeMillis());
        }
        this.zzt.zzaw();
        if (z && zzlb.zzal(str2)) {
            this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
        }
        if (!z3) {
            this.zzt.zzaw();
            if (!"_iap".equals(str2)) {
                zzlb zzlbVarZzv = this.zzt.zzv();
                int i = 2;
                if (zzlbVarZzv.zzac(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzlbVarZzv.zzZ(NotificationCompat.CATEGORY_EVENT, zzgo.zza, zzgo.zzb, str2)) {
                        zzlbVarZzv.zzt.zzf();
                        if (zzlbVarZzv.zzY(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.zzt.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzlb zzlbVarZzv2 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzN(this.zzn, null, i, "_ev", zzlbVarZzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.zzt.zzaw();
        zzie zzieVarZzj = this.zzt.zzs().zzj(false);
        if (zzieVarZzj != null && !bundle.containsKey("_sc")) {
            zzieVarZzj.zzd = true;
        }
        zzlb.zzK(zzieVarZzj, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zZzah = zzlb.zzah(str2);
        if (!z || this.zzd == null || zZzah) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                this.zzt.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (this.zzt.zzM()) {
            int iZzh = this.zzt.zzv().zzh(str2);
            if (iZzh != 0) {
                this.zzt.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                zzlb zzlbVarZzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzN(this.zzn, str3, iZzh, "_ev", zzlbVarZzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzy = this.zzt.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleZzy);
            this.zzt.zzaw();
            if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzka zzkaVar = this.zzt.zzu().zzb;
                long jElapsedRealtime = zzkaVar.zzc.zzt.zzav().elapsedRealtime();
                long j3 = jElapsedRealtime - zzkaVar.zzb;
                zzkaVar.zzb = jElapsedRealtime;
                if (j3 > 0) {
                    this.zzt.zzv().zzI(bundleZzy, j3);
                }
            }
            zznw.zzc();
            if (this.zzt.zzf().zzs(null, zzdu.zzac)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    zzlb zzlbVarZzv4 = this.zzt.zzv();
                    String string = bundleZzy.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzkz.zza(string, zzlbVarZzv4.zzt.zzm().zzp.zza())) {
                        zzlbVarZzv4.zzt.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzlbVarZzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String strZza = this.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleZzy.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzy);
            if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j) && this.zzt.zzm().zzm.zzb()) {
                e70.m20045a(this.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                zzY("auto", "_sid", null, this.zzt.zzav().currentTimeMillis());
                zzY("auto", "_sno", null, this.zzt.zzav().currentTimeMillis());
                zzY("auto", "_se", null, this.zzt.zzav().currentTimeMillis());
                this.zzt.zzm().zzk.zzb(0L);
            } else {
                j2 = 0;
            }
            if (bundleZzy.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                e70.m20045a(this.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzt.zzu().zza.zzb(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = (String) arrayList2.get(i2);
                if (str4 != null) {
                    this.zzt.zzv();
                    Object obj = bundleZzy.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            array = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) array;
                    }
                    if (bundleArr != null) {
                        bundleZzy.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleZzt = (Bundle) arrayList.get(i3);
                String str5 = i3 != 0 ? "_ep" : str2;
                bundleZzt.putString("_o", str);
                if (z2) {
                    bundleZzt = this.zzt.zzv().zzt(bundleZzt);
                }
                Bundle bundle2 = bundleZzt;
                this.zzt.zzt().zzA(new zzaw(str5, new zzau(bundle2), str, j), str3);
                if (!z4) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzgs) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
            }
            this.zzt.zzaw();
            if (this.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.add(zzgsVar)) {
            return;
        }
        C4391g4.m20722a(this.zzt, "OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.zzg.set(null);
        this.zzt.zzaz().zzp(new zzhe(this, j));
    }

    public final void zzL(long j, boolean z) {
        zzg();
        zza();
        this.zzt.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkc zzkcVarZzu = this.zzt.zzu();
        zzkcVarZzu.zzg();
        zzkcVarZzu.zzb.zza();
        zzpd.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzam)) {
            this.zzt.zzh().zzo();
        }
        boolean zZzJ = this.zzt.zzJ();
        zzew zzewVarZzm = this.zzt.zzm();
        zzewVarZzm.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzewVarZzm.zzt.zzm().zzp.zza())) {
            zzewVarZzm.zzp.zzb(null);
        }
        zzof.zzc();
        zzag zzagVarZzf = zzewVarZzm.zzt.zzf();
        zzdt zzdtVar = zzdu.zzad;
        if (zzagVarZzf.zzs(null, zzdtVar)) {
            zzewVarZzm.zzj.zzb(0L);
        }
        zzewVarZzm.zzk.zzb(0L);
        if (!zzewVarZzm.zzt.zzf().zzv()) {
            zzewVarZzm.zzi(!zZzJ);
        }
        zzewVarZzm.zzq.zzb(null);
        zzewVarZzm.zzr.zzb(0L);
        zzewVarZzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzof.zzc();
        if (this.zzt.zzf().zzs(null, zzdtVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zZzJ;
    }

    public final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaz().zzp(new zzhb(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzN(String str, String str2, long j, Object obj) {
        this.zzt.zzaz().zzp(new zzhc(this, str, str2, obj, j));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C4391g4.m20722a(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgn.zza(bundle2, "app_id", String.class, null);
        zzgn.zza(bundle2, "origin", String.class, null);
        zzgn.zza(bundle2, "name", String.class, null);
        zzgn.zza(bundle2, "value", Object.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzay().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzay().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object objZzB = this.zzt.zzv().zzB(string, obj);
        if (objZzB == null) {
            this.zzt.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzgn.zzb(bundle2, objZzB);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.zzt.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.zzt.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j3));
        } else {
            this.zzt.zzaz().zzp(new zzhf(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String strZzg = zzai.zzg(bundle);
        if (strZzg != null) {
            this.zzt.zzay().zzl().zzb("Ignoring invalid consent setting", strZzg);
            this.zzt.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i, j);
    }

    public final void zzS(zzai zzaiVar, int i, long j) {
        zzai zzaiVar2;
        boolean z;
        boolean zZzk;
        boolean z2;
        zzai zzaiVarZzd = zzaiVar;
        zza();
        if (i != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzt.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzaiVar2 = this.zzi;
                z = false;
                if (zzai.zzj(i, this.zzj)) {
                    zZzk = zzaiVarZzd.zzk(this.zzi);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (zzaiVarZzd.zzi(zzahVar) && !this.zzi.zzi(zzahVar)) {
                        z = true;
                    }
                    zzaiVarZzd = zzaiVarZzd.zzd(this.zzi);
                    this.zzi = zzaiVarZzd;
                    this.zzj = i;
                    z2 = z;
                    z = true;
                } else {
                    zZzk = false;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.zzt.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVarZzd);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (zZzk) {
            this.zzg.set(null);
            this.zzt.zzaz().zzq(new zzhr(this, zzaiVarZzd, j, i, andIncrement, z2, zzaiVar2));
            return;
        }
        zzhs zzhsVar = new zzhs(this, zzaiVarZzd, i, andIncrement, z2, zzaiVar2);
        if (i == 30 || i == -10) {
            this.zzt.zzaz().zzq(zzhsVar);
        } else {
            this.zzt.zzaz().zzp(zzhsVar);
        }
    }

    @WorkerThread
    public final void zzT(zzgr zzgrVar) {
        zzgr zzgrVar2;
        zzg();
        zza();
        if (zzgrVar != null && zzgrVar != (zzgrVar2 = this.zzd)) {
            Preconditions.checkState(zzgrVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgrVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaz().zzp(new zzhq(this, bool));
    }

    @WorkerThread
    public final void zzV(zzai zzaiVar) {
        zzg();
        boolean z = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzew zzewVarZzm = this.zzt.zzm();
            zzfr zzfrVar = zzewVarZzm.zzt;
            zzewVarZzm.zzg();
            Boolean boolValueOf = zzewVarZzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzewVarZzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzav().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int iZzl;
        String str3 = str == null ? "app" : str;
        zzlb zzlbVarZzv = this.zzt.zzv();
        if (z) {
            iZzl = zzlbVarZzv.zzl(str2);
        } else if (!zzlbVarZzv.zzac("user property", str2)) {
            iZzl = 6;
        } else if (zzlbVarZzv.zzZ("user property", zzgq.zza, null, str2)) {
            zzlbVarZzv.zzt.zzf();
            if (zzlbVarZzv.zzY("user property", 24, str2)) {
                iZzl = 0;
            } else {
                iZzl = 6;
            }
        } else {
            iZzl = 15;
        }
        if (iZzl != 0) {
            zzlb zzlbVarZzv2 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzN(this.zzn, null, iZzl, "_ev", zzlbVarZzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj == null) {
                zzN(str3, str2, j, null);
                return;
            }
            int iZzd = this.zzt.zzv().zzd(str2, obj);
            if (iZzd != 0) {
                zzlb zzlbVarZzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzN(this.zzn, null, iZzd, "_ev", zzlbVarZzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
            } else {
                Object objZzB = this.zzt.zzv().zzB(str2, obj);
                if (objZzB != null) {
                    zzN(str3, str2, j, objZzB);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    @WorkerThread
    public final void zzY(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    long j2 = true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    Long lValueOf = Long.valueOf(j2);
                    this.zzt.zzm().zzh.zzb(j2 == 1 ? "true" : "false");
                    obj2 = lValueOf;
                } else if (obj == null) {
                    this.zzt.zzm().zzh.zzb("unset");
                    obj2 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                obj2 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzt.zzJ()) {
            e70.m20045a(this.zzt, "User property not set since app measurement is disabled");
        } else if (this.zzt.zzM()) {
            this.zzt.zzt().zzK(new zzkw(str3, j, obj2, str));
        }
    }

    public final void zzZ(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.remove(zzgsVar)) {
            return;
        }
        C4391g4.m20722a(this.zzt, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhi(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzhp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzho(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhn(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzie zzieVarZzi = this.zzt.zzs().zzi();
        if (zzieVarZzi != null) {
            return zzieVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzie zzieVarZzi = this.zzt.zzs().zzi();
        if (zzieVarZzi != null) {
            return zzieVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhm(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaz().zzs()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzaw();
        if (zzab.zza()) {
            this.zzt.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaz().zzd(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get conditional user properties", new zzhh(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlb.zzH(list);
        }
        this.zzt.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zzef zzefVarZzd;
        String str;
        zza();
        e70.m20045a(this.zzt, "Getting user properties (FE)");
        if (!this.zzt.zzaz().zzs()) {
            this.zzt.zzaw();
            if (zzab.zza()) {
                zzefVarZzd = this.zzt.zzay().zzd();
                str = "Cannot get all user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.zzt.zzaz().zzd(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzhd(this, atomicReference, z));
                List list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                this.zzt.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            }
            return Collections.emptyList();
        }
        zzefVarZzd = this.zzt.zzay().zzd();
        str = "Cannot get all user properties from analytics worker thread";
        zzefVarZzd.zza(str);
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        zzef zzefVarZzd;
        String str3;
        if (!this.zzt.zzaz().zzs()) {
            this.zzt.zzaw();
            if (zzab.zza()) {
                zzefVarZzd = this.zzt.zzay().zzd();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.zzt.zzaz().zzd(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzhj(this, atomicReference, null, str, str2, z));
                List<zzkw> list = (List) atomicReference.get();
                if (list != null) {
                    ArrayMap arrayMap = new ArrayMap(list.size());
                    for (zzkw zzkwVar : list) {
                        Object objZza = zzkwVar.zza();
                        if (objZza != null) {
                            arrayMap.put(zzkwVar.zzb, objZza);
                        }
                    }
                    return arrayMap;
                }
                this.zzt.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            }
            return Collections.emptyMap();
        }
        zzefVarZzd = this.zzt.zzay().zzd();
        str3 = "Cannot get user properties from analytics worker thread";
        zzefVarZzd.zza(str3);
        return Collections.emptyMap();
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzdu.zzX)) {
                zzag zzagVarZzf = this.zzt.zzf();
                zzagVarZzf.zzt.zzaw();
                Boolean boolZzk = zzagVarZzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (boolZzk != null && boolZzk.booleanValue()) {
                    this.zzt.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgy
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhx zzhxVar = this.zza;
                            zzhxVar.zzg();
                            if (zzhxVar.zzt.zzm().zzn.zzb()) {
                                zzhxVar.zzt.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzhxVar.zzt.zzm().zzo.zza();
                            zzhxVar.zzt.zzm().zzo.zzb(1 + jZza);
                            zzhxVar.zzt.zzf();
                            if (jZza < 5) {
                                zzhxVar.zzt.zzE();
                            } else {
                                C4391g4.m20722a(zzhxVar.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhxVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzew zzewVarZzm = this.zzt.zzm();
            zzewVarZzm.zzg();
            String string = zzewVarZzm.zza().getString("previous_os_version", null);
            zzewVarZzm.zzt.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }
}
