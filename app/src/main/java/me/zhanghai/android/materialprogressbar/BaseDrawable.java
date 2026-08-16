package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseDrawable extends Drawable implements TintableDrawable {
    protected int mAlpha;
    protected ColorFilter mColorFilter;
    private DummyConstantState mConstantState;
    protected PorterDuffColorFilter mTintFilter;
    protected ColorStateList mTintList;
    protected PorterDuff.Mode mTintMode;

    public class DummyConstantState extends Drawable.ConstantState {
        final /* synthetic */ BaseDrawable this$0;

        /* JADX WARN: Invalid debug info offset */
        private DummyConstantState(BaseDrawable baseDrawable) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ DummyConstantState(BaseDrawable baseDrawable, C48191 c48191) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean updateTintFilter() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ColorFilter getColorFilterForDrawing() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public abstract void onDraw(Canvas canvas, int i, int i2);

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
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTint(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
    }
}
