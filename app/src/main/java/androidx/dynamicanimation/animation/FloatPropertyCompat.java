package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;
import p000.C5395sl;
import p000.C5458tl;
import p000.C5540ul;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatPropertyCompat<T> {
    final String mPropertyName;

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        return new FloatPropertyCompat<T>(C5395sl.m28271a(floatProperty)) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t) {
                return ((Float) C5540ul.m28712a(floatProperty, t)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t, float f) {
                C5458tl.m28511a(floatProperty, t, f);
            }
        };
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
