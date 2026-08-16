package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C4517i4;
import p000.C4588j4;
import p000.C4651k4;
import p000.C5827z3;

/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static int noteOp(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    public static int noteOpNoThrow(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    public static int noteProxyOp(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4651k4.m21696a((AppOpsManager) C5827z3.m29927a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4517i4.m21294a((AppOpsManager) C5827z3.m29927a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    @Nullable
    public static String permissionToOp(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4588j4.m21486a(str);
        }
        return null;
    }
}
