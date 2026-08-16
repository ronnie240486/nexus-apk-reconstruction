package com.google.android.gms.common;

import android.content.Context;
import android.media.ViviTV.activity.UserRegisterActivity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {

    @Nullable
    private static zzad zza;
    private volatile zzac zzb;

    private static zzad zza() {
        zzad zzadVar;
        synchronized (zzad.class) {
            try {
                if (zza == null) {
                    zza = new zzad();
                }
                zzadVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadVar;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza();
        if (!zzn.zzf()) {
            throw new zzae();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : UserRegisterActivity.f5377x);
        if (this.zzb == null || !this.zzb.zza.equals(strConcat)) {
            zza();
            zzx zzxVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
            if (!zzxVarZzc.zza) {
                Preconditions.checkNotNull(zzxVarZzc.zzb);
                return PackageVerificationResult.zza(str, zzxVarZzc.zzb, zzxVarZzc.zzc);
            }
            this.zzb = new zzac(strConcat, PackageVerificationResult.zzd(str, zzxVarZzc.zzd));
        }
        return this.zzb.zzb;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                return packageVerificationResultQueryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
