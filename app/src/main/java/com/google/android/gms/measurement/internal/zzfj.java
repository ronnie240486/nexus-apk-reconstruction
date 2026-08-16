package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C3380R;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    public static String zza(Context context) {
        try {
            return context.getResources().getResourcePackageName(C3380R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    public static final String zzb(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
