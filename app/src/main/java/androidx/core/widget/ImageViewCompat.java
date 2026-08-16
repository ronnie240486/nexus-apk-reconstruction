package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C1087Qr;
import p000.C1149Rr;
import p000.C1212Sr;
import p000.C1277Tr;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewCompat {
    private ImageViewCompat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1212Sr.m5711a(imageView);
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1087Qr.m4838a(imageView);
        }
        if (imageView instanceof TintableImageSourceView) {
            return ((TintableImageSourceView) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (imageView instanceof TintableImageSourceView) {
                ((TintableImageSourceView) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        C1277Tr.m6124a(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C1212Sr.m5711a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setImageTintMode(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (imageView instanceof TintableImageSourceView) {
                ((TintableImageSourceView) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        C1149Rr.m5383a(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C1212Sr.m5711a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
