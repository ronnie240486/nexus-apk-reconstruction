package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C4239dg;
import p000.C4302eg;
import p000.C4365fg;
import p000.C4429gg;
import p000.C4474hO;
import p000.C4492hg;
import p000.C4555ig;
import p000.C4626jg;
import p000.C4690kg;
import p000.C4753lg;
import p000.C4824mg;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    private DrawableCompat() {
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4555ig.m21404a(drawable, theme);
        }
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4690kg.m21830a(drawable);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void clearColorFilter(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable wrappedDrawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            wrappedDrawable = ((InsetDrawable) drawable).getDrawable();
        } else {
            if (!(drawable instanceof WrappedDrawable)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
                return;
            }
            wrappedDrawable = ((WrappedDrawable) drawable).getWrappedDrawable();
        }
        clearColorFilter(wrappedDrawable);
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4239dg.m19962a(drawable);
        }
        return null;
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4492hg.m21121a(drawable);
        }
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(TAG, "Failed to retrieve getLayoutDirection() method", e);
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        Method method = sGetLayoutDirectionMethod;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e2) {
            Log.i(TAG, "Failed to invoke getLayoutDirection() via reflection", e2);
            sGetLayoutDirectionMethod = null;
            return 0;
        }
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            C4474hO.m20999a(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4753lg.m21991a(drawable, f, f2);
        }
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4302eg.m20121a(drawable, i, i2, i3, i4);
        }
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4626jg.m21609a(drawable, i);
        }
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(TAG, "Failed to retrieve setLayoutDirection(int) method", e);
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        Method method = sSetLayoutDirectionMethod;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i(TAG, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                sSetLayoutDirectionMethod = null;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTint(@NonNull Drawable drawable, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4824mg.m22180a(drawable, i);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4365fg.m20574a(drawable, colorStateList);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTintMode(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4429gg.m20856a(drawable, mode);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static Drawable wrap(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        if (i >= 21) {
            return !(drawable instanceof TintAwareDrawable) ? new WrappedDrawableApi21(drawable) : drawable;
        }
        return !(drawable instanceof TintAwareDrawable) ? new WrappedDrawableApi14(drawable) : drawable;
    }
}
