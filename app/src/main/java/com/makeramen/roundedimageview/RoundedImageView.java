package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedImageView extends ImageView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] SCALE_TYPES = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public static final String TAG = "RoundedImageView";
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_UNDEFINED = -2;
    private Drawable mBackgroundDrawable;
    private int mBackgroundResource;
    private ColorStateList mBorderColor;
    private float mBorderWidth;
    private ColorFilter mColorFilter;
    private boolean mColorMod;
    private final float[] mCornerRadii;
    private Drawable mDrawable;
    private boolean mHasColorFilter;
    private boolean mIsOval;
    private boolean mMutateBackground;
    private int mResource;
    private ImageView.ScaleType mScaleType;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;

    /* JADX INFO: renamed from: com.makeramen.roundedimageview.RoundedImageView$1 */
    public static /* synthetic */ class C38761 {
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
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedImageView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applyColorMod() {
    }

    /* JADX WARN: Invalid debug info offset */
    private static Shader.TileMode parseTileMode(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private android.graphics.drawable.Drawable resolveBackgroundResource() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedImageView.resolveBackgroundResource():android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private android.graphics.drawable.Drawable resolveResource() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedImageView.resolveResource():android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateAttrs(Drawable drawable, ImageView.ScaleType scaleType) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateBackgroundDrawableAttrs(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateDrawableAttrs() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
    }

    /* JADX WARN: Invalid debug info offset */
    @ColorInt
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
    public float getCornerRadius() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getCornerRadius(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getMaxCornerRadius() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
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
    public void mutateBackground(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean mutatesBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderColor(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderColor(ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderWidth(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderWidth(@DimenRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCornerRadius(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCornerRadius(float f, float f2, float f3, float f4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCornerRadius(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCornerRadiusDimen(@DimenRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCornerRadiusDimen(int i, @DimenRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOval(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTileModeX(Shader.TileMode tileMode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTileModeY(Shader.TileMode tileMode) {
    }
}
