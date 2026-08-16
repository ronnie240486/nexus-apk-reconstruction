package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p000.C0847N8;
import p000.C0911O8;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? C0847N8.m3927a(canvas, f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i) {
        return Build.VERSION.SDK_INT > 21 ? C0911O8.m4228a(canvas, rectF, i) : canvas.saveLayerAlpha(rectF, i, 31);
    }
}
