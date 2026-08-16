package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.NonNull;
import p000.C0238DZ;
import p000.C5827z3;

/* JADX INFO: loaded from: classes.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0238DZ.m1400a((UserManager) C5827z3.m29927a(context, UserManager.class));
        }
        return true;
    }
}
