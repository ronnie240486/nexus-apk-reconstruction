package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000.C5532ud;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq extends zzgl {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzaq(zzfr zzfrVar) {
        super(zzfrVar);
    }

    @WorkerThread
    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzu();
        return this.zza;
    }

    public final String zzc() {
        zzu();
        return this.zzb;
    }

    @WorkerThread
    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    @WorkerThread
    public final boolean zze() {
        zzg();
        long jCurrentTimeMillis = this.zzt.zzav().currentTimeMillis();
        if (jCurrentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.zzt.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.zzt.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzt.zzau());
            }
            try {
                Account[] result = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.zzd = Boolean.TRUE;
                    this.zze = jCurrentTimeMillis;
                    return true;
                }
                Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.zzd = Boolean.TRUE;
                    this.zze = jCurrentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException e) {
                e = e;
                this.zzt.zzay().zzh().zzb("Exception checking account types", e);
            } catch (OperationCanceledException e2) {
                e = e2;
                this.zzt.zzay().zzh().zzb("Exception checking account types", e);
            } catch (IOException e3) {
                e = e3;
                this.zzt.zzay().zzh().zzb("Exception checking account types", e);
            }
        }
        this.zze = jCurrentTimeMillis;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = C5532ud.m28671a(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
