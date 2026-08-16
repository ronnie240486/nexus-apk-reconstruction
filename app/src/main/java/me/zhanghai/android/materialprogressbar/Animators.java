package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
class Animators {
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X;

    static {
        Path path = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* JADX WARN: Invalid debug info offset */
    private Animators() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Animator createIndeterminate(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Animator createIndeterminateHorizontalRect1(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Animator createIndeterminateHorizontalRect2(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Animator createIndeterminateRotation(Object obj) {
        return null;
    }
}
