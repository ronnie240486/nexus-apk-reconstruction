package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000.C5368sK;
import p000.C5431tK;
import p000.C5513uK;
import p000.C5584vK;

/* JADX INFO: loaded from: classes.dex */
public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C5513uK.m28600a(popupWindow);
        }
        if (i < 21) {
            return false;
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        Field field = sOverlapAnchorField;
        if (field == null) {
            return false;
        }
        try {
            return ((Boolean) field.get(popupWindow)).booleanValue();
        } catch (IllegalAccessException e2) {
            Log.i(TAG, "Could not get overlap anchor field in PopupWindow", e2);
            return false;
        }
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C5368sK.m28151a(popupWindow);
        }
        if (!sGetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", null);
                sGetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sGetWindowLayoutTypeMethod;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(popupWindow, null)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C5431tK.m28377a(popupWindow, z);
            return;
        }
        if (i >= 21) {
            if (!sOverlapAnchorFieldAttempted) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    sOverlapAnchorField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                sOverlapAnchorFieldAttempted = true;
            }
            Field field = sOverlapAnchorField;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i(TAG, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C5584vK.m28801a(popupWindow, i);
            return;
        }
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                sSetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sSetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
