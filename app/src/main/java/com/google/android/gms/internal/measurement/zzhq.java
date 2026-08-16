package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhq {

    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza = new ArrayMap();

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = zza;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
