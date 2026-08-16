package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
import p000.C1288U1;

/* JADX INFO: loaded from: classes.dex */
final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzha.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbM6151a = C1288U1.m6151a("Invalid boolean value for ", zzc(), ": ");
        sbM6151a.append((String) obj);
        Log.e("PhenotypeFlag", sbM6151a.toString());
        return null;
    }
}
