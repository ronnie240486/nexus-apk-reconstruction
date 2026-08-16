package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes2.dex */
class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    /* JADX WARN: Invalid debug info offset */
    private ObjectAnimatorCompatBase() {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void calculateXYValues(Path path, @Size(201) float[] fArr, @Size(201) float[] fArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void calculateXYValues(Path path, @Size(201) int[] iArr, @Size(201) int[] iArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> ObjectAnimator ofArgb(T t, Property<T, Integer> property, int... iArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return null;
    }
}
