package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.squareup.picasso.Transformation;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundedTransformationBuilder {
    private ColorStateList mBorderColor;
    private float mBorderWidth;
    private float[] mCornerRadii;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mOval;
    private ImageView.ScaleType mScaleType;

    /* JADX INFO: renamed from: com.makeramen.roundedimageview.RoundedTransformationBuilder$1 */
    public class C38781 implements Transformation {
        final /* synthetic */ RoundedTransformationBuilder this$0;

        /* JADX WARN: Invalid debug info offset */
        public C38781(RoundedTransformationBuilder roundedTransformationBuilder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.Transformation
        public String key() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.Transformation
        public Bitmap transform(Bitmap bitmap) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$000(RoundedTransformationBuilder roundedTransformationBuilder) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ ColorStateList access$100(RoundedTransformationBuilder roundedTransformationBuilder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ float access$200(RoundedTransformationBuilder roundedTransformationBuilder) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ float[] access$300(RoundedTransformationBuilder roundedTransformationBuilder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ ImageView.ScaleType access$400(RoundedTransformationBuilder roundedTransformationBuilder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder borderColor(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder borderColor(ColorStateList colorStateList) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder borderWidth(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder borderWidthDp(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Transformation build() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder cornerRadius(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder cornerRadius(int i, float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder cornerRadiusDp(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder cornerRadiusDp(int i, float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder oval(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedTransformationBuilder scaleType(ImageView.ScaleType scaleType) {
        return null;
    }
}
