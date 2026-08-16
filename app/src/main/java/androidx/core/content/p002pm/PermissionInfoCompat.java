package androidx.core.content.p002pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.C0857NI;
import p000.C0921OI;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionInfoCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Protection {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtection(@NonNull PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0921OI.m4240a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int getProtectionFlags(@NonNull PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0857NI.m3972a(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
