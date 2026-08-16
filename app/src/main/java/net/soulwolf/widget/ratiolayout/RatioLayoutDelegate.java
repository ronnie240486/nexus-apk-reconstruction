package net.soulwolf.widget.ratiolayout;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import net.soulwolf.widget.ratiolayout.RatioMeasureDelegate;

/* JADX INFO: loaded from: classes2.dex */
public final class RatioLayoutDelegate<TARGET extends View & RatioMeasureDelegate> {
    private float mAspectRatio;
    private float mDatumHeight;
    private float mDatumWidth;
    private int mHeightMeasureSpec;
    private boolean mIsSquare;
    private RatioDatumMode mRatioDatumMode;
    private final TARGET mRatioTarget;
    private int mWidthMeasureSpec;

    /* JADX WARN: Invalid debug info offset */
    private RatioLayoutDelegate(TARGET target, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void requestLayout() {
    }

    private int resolveSize(int i, int i2) {
        return i;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean shouldLinearParamsHeight(ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean shouldLinearParamsWidth(ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private RatioDatumMode shouldRatioDatumMode(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getHeightMeasureSpec() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getWidthMeasureSpec() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setAspectRatio(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setRatio(RatioDatumMode ratioDatumMode, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSquare(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void update(int i, int i2) {
    }
}
