package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import p000.C0541IL;

/* JADX INFO: loaded from: classes.dex */
class PropertyValuesHolderUtils {
    private PropertyValuesHolderUtils() {
    }

    public static PropertyValuesHolder ofPointF(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? C0541IL.m2514a(property, null, path) : PropertyValuesHolder.ofFloat(new PathProperty(property, path), 0.0f, 1.0f);
    }
}
