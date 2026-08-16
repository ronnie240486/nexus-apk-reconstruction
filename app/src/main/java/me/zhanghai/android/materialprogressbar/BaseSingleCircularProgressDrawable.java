package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* JADX WARN: Invalid debug info offset */
    public void drawRing(Canvas canvas, Paint paint, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int i, int i2, Paint paint) {
    }

    public abstract void onDrawRing(Canvas canvas, Paint paint);

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
    }
}
