package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;
import p000.C1288U1;

/* JADX INFO: loaded from: classes.dex */
final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbM6151a = C1288U1.m6151a("Invalid long value for ", zzc(), ": ");
            sbM6151a.append((String) obj);
            Log.e("PhenotypeFlag", sbM6151a.toString());
            return null;
        }
    }
}
