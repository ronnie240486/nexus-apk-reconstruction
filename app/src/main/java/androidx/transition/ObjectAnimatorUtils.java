package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import p000.C4530iH;

/* JADX INFO: loaded from: classes.dex */
class ObjectAnimatorUtils {
    private ObjectAnimatorUtils() {
    }

    public static <T> ObjectAnimator ofPointF(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? C4530iH.m21354a(t, property, null, path) : ObjectAnimator.ofFloat(t, new PathProperty(property, path), 0.0f, 1.0f);
    }
}
