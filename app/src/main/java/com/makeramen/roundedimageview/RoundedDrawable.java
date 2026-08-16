package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedDrawable extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";
    private final Bitmap mBitmap;
    private final int mBitmapHeight;
    private final Paint mBitmapPaint;
    private final RectF mBitmapRect;
    private final int mBitmapWidth;
    private ColorStateList mBorderColor;
    private final Paint mBorderPaint;
    private final RectF mBorderRect;
    private float mBorderWidth;
    private final RectF mBounds;
    private float mCornerRadius;
    private final boolean[] mCornersRounded;
    private final RectF mDrawableRect;
    private boolean mOval;
    private boolean mRebuildShader;
    private ImageView.ScaleType mScaleType;
    private final Matrix mShaderMatrix;
    private final RectF mSquareCornersRect;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;

    /* JADX INFO: renamed from: com.makeramen.roundedimageview.RoundedDrawable$1 */
    public static /* synthetic */ class C38751 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean all(boolean[] zArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean any(boolean[] zArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static android.graphics.Bitmap drawableToBitmap(android.graphics.drawable.Drawable r5) {
        /*
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedDrawable.drawableToBitmap(android.graphics.drawable.Drawable):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    public static RoundedDrawable fromBitmap(Bitmap bitmap) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Drawable fromDrawable(Drawable drawable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean only(int i, boolean[] zArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void redrawBitmapForSquareCorners(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void redrawBorderForSquareCorners(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateShaderMatrix() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getBorderColor() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ColorStateList getBorderColors() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getBorderWidth() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getCornerRadius() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getCornerRadius(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Invalid debug info offset */
    public ImageView.ScaleType getScaleType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Bitmap getSourceBitmap() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Shader.TileMode getTileModeX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Shader.TileMode getTileModeY() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isOval() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setBorderColor(@ColorInt int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setBorderColor(ColorStateList colorStateList) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setBorderWidth(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setCornerRadius(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setCornerRadius(float f, float f2, float f3, float f4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setCornerRadius(int i, float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setOval(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setScaleType(ImageView.ScaleType scaleType) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setTileModeX(Shader.TileMode tileMode) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedDrawable setTileModeY(Shader.TileMode tileMode) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Bitmap toBitmap() {
        return null;
    }
}
