package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import p000.C0045Ag;
import p000.C5606vg;
import p000.C5737xg;
import p000.C5802yg;
import p000.C5872zg;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();
    private static final String TAG = "DrawableUtils";
    private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static Class<?> sInsetsClazz;

    static {
        try {
            sInsetsClazz = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    private DrawableUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof WrappedDrawable) {
                drawable2 = ((WrappedDrawable) drawable).getWrappedDrawable();
            } else if (drawable instanceof DrawableWrapper) {
                drawable2 = ((DrawableWrapper) drawable).getWrappedDrawable();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return canSafelyMutateDrawable(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!canSafelyMutateDrawable(drawable3)) {
                return false;
            }
        }
        return true;
    }

    public static void fixDrawable(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && VECTOR_DRAWABLE_CLAZZ_NAME.equals(drawable.getClass().getName())) {
            fixVectorDrawableTinting(drawable);
        }
    }

    private static void fixVectorDrawableTinting(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Rect getOpticalBounds(Drawable drawable) {
        byte b;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insetsM29117a = C5606vg.m29117a(drawable);
            Rect rect = new Rect();
            rect.left = C5737xg.m29672a(insetsM29117a);
            rect.right = C5802yg.m29869a(insetsM29117a);
            rect.top = C5872zg.m30031a(insetsM29117a);
            rect.bottom = C0045Ag.m210a(insetsM29117a);
            return rect;
        }
        if (sInsetsClazz != null) {
            try {
                Drawable drawableUnwrap = DrawableCompat.unwrap(drawable);
                Object objInvoke = drawableUnwrap.getClass().getMethod("getOpticalInsets", null).invoke(drawableUnwrap, null);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : sInsetsClazz.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 3317767:
                                if (name.equals(TtmlNode.LEFT)) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 108511772:
                                if (name.equals(TtmlNode.RIGHT)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (b == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (b == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (b == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return INSETS_NONE;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
