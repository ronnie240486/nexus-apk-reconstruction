package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
class BaseSingleHorizontalProgressDrawable extends BaseProgressDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    protected static final RectF RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;

    /* JADX WARN: Invalid debug info offset */
    public BaseSingleHorizontalProgressDrawable(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int i, int i2, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onDrawRect(Canvas canvas, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
    }
}
