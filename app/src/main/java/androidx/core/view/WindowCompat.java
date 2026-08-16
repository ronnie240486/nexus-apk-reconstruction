package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p000.C5958f40;
import p000.C5967g40;
import p000.C5974h40;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    @RequiresApi(16)
    public static class Impl16 {
        private Impl16() {
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi(30)
    public static class Impl30 {
        private Impl30() {
        }

        public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window) {
            WindowInsetsController windowInsetsControllerM20941a = C5974h40.m20941a(window);
            if (windowInsetsControllerM20941a != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsControllerM20941a);
            }
            return null;
        }

        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
            C5967g40.m20723a(window, z);
        }
    }

    private WindowCompat() {
    }

    @Nullable
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return Build.VERSION.SDK_INT >= 30 ? Impl30.getInsetsController(window) : new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C5958f40.m20230a(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.setDecorFitsSystemWindows(window, z);
        } else {
            Impl16.setDecorFitsSystemWindows(window, z);
        }
    }
}
