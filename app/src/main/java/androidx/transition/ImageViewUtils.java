package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import p000.C1473Wr;

/* JADX INFO: loaded from: classes.dex */
class ImageViewUtils {
    private static Field sDrawMatrixField = null;
    private static boolean sDrawMatrixFieldFetched = false;
    private static boolean sTryHiddenAnimateTransform = true;

    private ImageViewUtils() {
    }

    public static void animateTransform(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C1473Wr.m6930a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            }
        } else {
            if (i >= 21) {
                hiddenAnimateTransform(imageView, matrix);
                return;
            }
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 == null) {
                return;
            }
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            fetchDrawMatrixField();
            Field field = sDrawMatrixField;
            Matrix matrix2 = null;
            if (field != null) {
                try {
                    Matrix matrix3 = (Matrix) field.get(imageView);
                    if (matrix3 == null) {
                        try {
                            matrix2 = new Matrix();
                            sDrawMatrixField.set(imageView, matrix2);
                        } catch (IllegalAccessException unused) {
                            matrix2 = matrix3;
                        }
                    } else {
                        matrix2 = matrix3;
                    }
                } catch (IllegalAccessException unused2) {
                }
            }
            if (matrix2 != null) {
                matrix2.set(matrix);
            }
        }
        imageView.invalidate();
    }

    private static void fetchDrawMatrixField() {
        if (sDrawMatrixFieldFetched) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            sDrawMatrixField = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        sDrawMatrixFieldFetched = true;
    }

    @RequiresApi(21)
    @SuppressLint({"NewApi"})
    private static void hiddenAnimateTransform(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                C1473Wr.m6930a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }
}
