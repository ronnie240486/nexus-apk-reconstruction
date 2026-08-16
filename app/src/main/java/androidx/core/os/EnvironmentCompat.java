package androidx.core.os;

import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import java.io.File;
import p000.C1012Ph;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    private EnvironmentCompat() {
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return Build.VERSION.SDK_INT >= 21 ? C1012Ph.m4474a(file) : Environment.getStorageState(file);
    }
}
