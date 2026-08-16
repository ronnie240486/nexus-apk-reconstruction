package org.lucasr.twowayview.widget;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ShimmerImageView extends ImageView implements ValueAnimator.AnimatorUpdateListener {
    private Bitmap bmOverlay;
    private boolean isFinished;
    private Matrix matrix;
    private Paint paint;
    private Runnable startRunnable;
    private ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: org.lucasr.twowayview.widget.ShimmerImageView$1 */
    public class RunnableC50751 implements Runnable {
        final /* synthetic */ ShimmerImageView this$0;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50751(ShimmerImageView shimmerImageView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ShimmerImageView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ShimmerImageView(Context context, @Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ShimmerImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public ShimmerImageView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ ValueAnimator access$000(ShimmerImageView shimmerImageView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$102(ShimmerImageView shimmerImageView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void drawShimmer(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void init() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startShimmer() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void stopShimmer() {
    }
}
