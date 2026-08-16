package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.impl.AndroidLoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class zzim extends zzf {

    @VisibleForTesting
    protected zzie zza;
    private volatile zzie zzb;
    private volatile zzie zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private Activity zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzie zzg;
    private zzie zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zzim(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    @WorkerThread
    public final void zzA(zzie zzieVar, zzie zzieVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzieVar2 != null && zzieVar2.zzc == zzieVar.zzc && zzif.zza(zzieVar2.zzb, zzieVar.zzb) && zzif.zza(zzieVar2.zza, zzieVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlb.zzK(zzieVar, bundle2, true);
            if (zzieVar2 != null) {
                String str = zzieVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzieVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzieVar2.zzc);
            }
            if (z2) {
                zzka zzkaVar = this.zzt.zzu().zzb;
                long j3 = j - zzkaVar.zzb;
                zzkaVar.zzb = j;
                if (j3 > 0) {
                    this.zzt.zzv().zzI(bundle2, j3);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzieVar.zze ? "auto" : "app";
            long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis();
            if (zzieVar.zze) {
                long j4 = zzieVar.zzf;
                if (j4 == 0) {
                    j2 = jCurrentTimeMillis;
                } else {
                    j2 = j4;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            this.zzt.zzq().zzH(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            zzB(this.zza, true, j);
        }
        this.zza = zzieVar;
        if (zzieVar.zze) {
            this.zzh = zzieVar;
        }
        this.zzt.zzt().zzG(zzieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzB(zzie zzieVar, boolean z, long j) {
        this.zzt.zzd().zzf(this.zzt.zzav().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzieVar != null && zzieVar.zzd, z, j) || zzieVar == null) {
            return;
        }
        zzieVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzim zzimVar, Bundle bundle, zzie zzieVar, zzie zzieVar2, long j) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzimVar.zzA(zzieVar, zzieVar2, j, true, zzimVar.zzt.zzv().zzy(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @MainThread
    private final zzie zzy(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzie zzieVar = (zzie) this.zzd.get(activity);
        if (zzieVar == null) {
            zzie zzieVar2 = new zzie(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzieVar2);
            zzieVar = zzieVar2;
        }
        return this.zzg != null ? this.zzg : zzieVar;
    }

    @MainThread
    private final void zzz(Activity activity, zzie zzieVar, boolean z) {
        zzie zzieVar2;
        zzie zzieVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzieVar.zzb == null) {
            zzieVar2 = new zzie(zzieVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzieVar.zzc, zzieVar.zze, zzieVar.zzf);
        } else {
            zzieVar2 = zzieVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzieVar2;
        this.zzt.zzaz().zzp(new zzih(this, zzieVar2, zzieVar3, this.zzt.zzav().elapsedRealtime(), z));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzie zzi() {
        return this.zzb;
    }

    @WorkerThread
    public final zzie zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzie zzieVar = this.zza;
        return zzieVar != null ? zzieVar : this.zzh;
    }

    @VisibleForTesting
    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzt.zzf();
        return str2.substring(0, 100);
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzie(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = this.zzt.zzav().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaz().zzp(new zzij(this, jElapsedRealtime));
        } else {
            zzie zzieVarZzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaz().zzp(new zzik(this, zzieVarZzy, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaz().zzp(new zzil(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaz().zzp(new zzii(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzdVarZzd = this.zzt.zzd();
            zzdVarZzd.zzt.zzaz().zzp(new zzc(zzdVarZzd, zzdVarZzd.zzt.zzav().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzie zzieVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzieVar = (zzie) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzieVar.zzc);
        bundle2.putString("name", zzieVar.zza);
        bundle2.putString("referrer_name", zzieVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!this.zzt.zzf().zzu()) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzie zzieVar = this.zzb;
        if (zzieVar == null) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            this.zzt.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzl(activity.getClass(), "Activity");
        }
        boolean zZza = zzif.zza(zzieVar.zzb, str2);
        boolean zZza2 = zzif.zza(zzieVar.zza, str);
        if (zZza && zZza2) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                this.zzt.zzf();
            }
            this.zzt.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                this.zzt.zzf();
            }
            this.zzt.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.zzt.zzay().zzj().zzc("Setting current screen to name, class", str == null ? AndroidLoggerFactory.f17234b : str, str2);
        zzie zzieVar2 = new zzie(str, str2, this.zzt.zzv().zzq());
        this.zzd.put(activity, zzieVar2);
        zzz(activity, zzieVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j) {
        String strZzl;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzt.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzay().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzay().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = this.zze;
                    strZzl = activity != null ? zzl(activity.getClass(), "Activity") : "Activity";
                } else {
                    strZzl = string2;
                }
                zzie zzieVar = this.zzb;
                if (this.zzf && zzieVar != null) {
                    this.zzf = false;
                    boolean zZza = zzif.zza(zzieVar.zzb, strZzl);
                    boolean zZza2 = zzif.zza(zzieVar.zza, string);
                    if (zZza && zZza2) {
                        this.zzt.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                this.zzt.zzay().zzj().zzc("Logging screen view with name, class", string == null ? AndroidLoggerFactory.f17234b : string, strZzl == null ? AndroidLoggerFactory.f17234b : strZzl);
                zzie zzieVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzie zzieVar3 = new zzie(string, strZzl, this.zzt.zzv().zzq(), true, j);
                this.zzb = zzieVar3;
                this.zzc = zzieVar2;
                this.zzg = zzieVar3;
                this.zzt.zzaz().zzp(new zzig(this, bundle, zzieVar3, zzieVar2, this.zzt.zzav().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
