package com.google.android.exoplayer2.p007ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.p007ui.DefaultTimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.C0043Ae;
import p000.C4626jg;
import p000.C4711l0;
import p000.C5800ye;
import p000.C5870ze;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;

    @Nullable
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;

    @Nullable
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;

    @Nullable
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int dpToPx(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private void drawPlayhead(Canvas canvas) {
        int i;
        if (this.duration <= 0) {
            return;
        }
        Rect rect = this.scrubberBar;
        int iConstrainValue = Util.constrainValue(rect.right, rect.left, this.progressBar.right);
        int iCenterY = this.scrubberBar.centerY();
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null) {
            if (this.scrubbing || isFocused()) {
                i = this.scrubberDraggedSize;
            } else {
                i = isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize;
            }
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((i * this.scrubberScale) / 2.0f), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.scrubberScale)) / 2;
        int intrinsicHeight = ((int) (this.scrubberDrawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
        this.scrubberDrawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void drawTimeBar(Canvas canvas) {
        int iHeight = this.progressBar.height();
        int iCenterY = this.progressBar.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.duration <= 0) {
            Rect rect = this.progressBar;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.unplayedPaint);
            return;
        }
        Rect rect2 = this.bufferedBar;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.progressBar.left, i3), this.scrubberBar.right);
        int i4 = this.progressBar.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.unplayedPaint);
        }
        int iMax2 = Math.max(i2, this.scrubberBar.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            Rect rect3 = this.scrubberBar;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = (long[]) Assertions.checkNotNull(this.adGroupTimesMs);
        boolean[] zArr = (boolean[]) Assertions.checkNotNull(this.playedAdGroups);
        int i5 = this.adMarkerWidth / 2;
        for (int i6 = 0; i6 < this.adGroupCount; i6++) {
            int iWidth = ((int) ((((long) this.progressBar.width()) * Util.constrainValue(jArr[i6], 0L, this.duration)) / this.duration)) - i5;
            Rect rect4 = this.progressBar;
            int iMin = Math.min(rect4.width() - this.adMarkerWidth, Math.max(0, iWidth)) + rect4.left;
            canvas.drawRect(iMin, iCenterY, iMin + this.adMarkerWidth, i, zArr[i6] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private long getPositionIncrement() {
        long j = this.keyTimeIncrement;
        if (j != C3219C.TIME_UNSET) {
            return j;
        }
        long j2 = this.duration;
        if (j2 == C3219C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.keyCountIncrement);
    }

    private String getProgressText() {
        return Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == C3219C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.scrubberBar.width()) * this.duration) / ((long) this.progressBar.width());
    }

    private boolean isInSeekBar(float f, float f2) {
        return this.seekBounds.contains((int) f, (int) f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        stopScrubbing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
        this.scrubberScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.seekBounds);
    }

    private void positionScrubber(float f) {
        Rect rect = this.scrubberBar;
        Rect rect2 = this.progressBar;
        rect.right = Util.constrainValue((int) f, rect2.left, rect2.right);
    }

    private static int pxToDp(float f, int i) {
        return (int) (i / f);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private boolean scrubIncrementally(long j) {
        long j2 = this.duration;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.scrubbing ? this.scrubPosition : this.position;
        long jConstrainValue = Util.constrainValue(j3 + j, 0L, j2);
        if (jConstrainValue == j3) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(jConstrainValue);
        } else {
            startScrubbing(jConstrainValue);
        }
        update();
        return true;
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
        return Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    @RequiresApi(29)
    private void setSystemGestureExclusionRectsV29(int i, int i2) {
        Rect rect = this.lastExclusionRectangle;
        if (rect != null && rect.width() == i && this.lastExclusionRectangle.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.lastExclusionRectangle = rect2;
        C0043Ae.m209a(this, Collections.singletonList(rect2));
    }

    private void startScrubbing(long j) {
        this.scrubPosition = j;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    private void stopScrubbing(boolean z) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, z);
        }
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            int iWidth = (int) ((((long) this.progressBar.width()) * this.bufferedPosition) / this.duration);
            Rect rect = this.bufferedBar;
            Rect rect2 = this.progressBar;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.progressBar.width()) * j) / this.duration);
            Rect rect3 = this.scrubberBar;
            Rect rect4 = this.progressBar;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.bufferedBar;
            int i = this.progressBar.left;
            rect5.right = i;
            this.scrubberBar.right = i;
        }
        invalidate(this.seekBounds);
    }

    private void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void updateScrubbing(long j) {
        if (this.scrubPosition == j) {
            return;
        }
        this.scrubPosition = j;
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.add(onScrubListener);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iPxToDp = pxToDp(this.density, this.progressBar.width());
        if (iPxToDp != 0) {
            long j = this.duration;
            if (j != 0 && j != C3219C.TIME_UNSET) {
                return j / ((long) iPxToDp);
            }
        }
        return Long.MAX_VALUE;
    }

    public void hideScrubber() {
        hideScrubber(0L);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        if (Util.SDK_INT >= 21) {
            C4711l0.m21889a(accessibilityNodeInfo, C5800ye.m29868a());
            C4711l0.m21889a(accessibilityNodeInfo, C5870ze.m30022a());
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.scrubbing) {
                            stopScrubbing(false);
                            return true;
                        }
                        break;
                }
            } else if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = (i6 - this.touchTargetHeight) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i8 = this.touchTargetHeight;
        int i9 = ((i8 - this.barHeight) / 2) + i7;
        this.seekBounds.set(paddingLeft, i7, paddingRight, i8 + i7);
        Rect rect = this.progressBar;
        Rect rect2 = this.seekBounds;
        int i10 = rect2.left;
        int i11 = this.scrubberPadding;
        rect.set(i10 + i11, i9, rect2.right - i11, this.barHeight + i9);
        if (Util.SDK_INT >= 29) {
            setSystemGestureExclusionRectsV29(i5, i6);
        }
        update();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        updateDrawableState();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !setDrawableLayoutDirection(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.duration > 0) {
            Point pointResolveRelativeTouchPosition = resolveRelativeTouchPosition(motionEvent);
            int i = pointResolveRelativeTouchPosition.x;
            int i2 = pointResolveRelativeTouchPosition.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (isInSeekBar(f, i2)) {
                    positionScrubber(f);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.scrubbing) {
                    stopScrubbing(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.scrubbing) {
                        stopScrubbing(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.scrubbing) {
                if (i2 < this.fineScrubYThreshold) {
                    int i3 = this.lastCoarseScrubXPosition;
                    i = ((i - i3) / 3) + i3;
                } else {
                    this.lastCoarseScrubXPosition = i;
                }
                positionScrubber(i);
                updateScrubbing(getScrubberPosition());
                update();
                invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @Override // android.view.View
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        Assertions.checkArgument(i == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.adMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.bufferedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setBufferedPosition(long j) {
        this.bufferedPosition = j;
        update();
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setDuration(long j) {
        this.duration = j;
        if (this.scrubbing && j == C3219C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p007ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setKeyCountIncrement(int i) {
        Assertions.checkArgument(i > 0);
        this.keyCountIncrement = i;
        this.keyTimeIncrement = C3219C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setKeyTimeIncrement(long j) {
        Assertions.checkArgument(j > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.playedAdMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.playedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    @Override // com.google.android.exoplayer2.p007ui.TimeBar
    public void setPosition(long j) {
        this.position = j;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.scrubberPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.unplayedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void showScrubber() {
        showScrubber(0L);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int i) {
        return Util.SDK_INT >= 23 && C4626jg.m21609a(drawable, i);
    }

    public void hideScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 0.0f);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }

    public void showScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 1.0f);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        int i2;
        int iMax;
        super(context, attributeSet, i);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        this.touchPosition = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.density = f;
        this.fineScrubYThreshold = dpToPx(f, FINE_SCRUB_Y_THRESHOLD_DP);
        int iDpToPx = dpToPx(f, 4);
        int iDpToPx2 = dpToPx(f, 26);
        int iDpToPx3 = dpToPx(f, 4);
        int iDpToPx4 = dpToPx(f, 12);
        int iDpToPx5 = dpToPx(f, 0);
        int iDpToPx6 = dpToPx(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3355R.styleable.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C3355R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    iDpToPx2 = Math.max(drawable.getMinimumHeight(), iDpToPx2);
                }
                this.barHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_bar_height, iDpToPx);
                this.touchTargetHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_touch_target_height, iDpToPx2);
                this.adMarkerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_ad_marker_width, iDpToPx3);
                this.scrubberEnabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_scrubber_enabled_size, iDpToPx4);
                this.scrubberDisabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_scrubber_disabled_size, iDpToPx5);
                this.scrubberDraggedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3355R.styleable.DefaultTimeBar_scrubber_dragged_size, iDpToPx6);
                int i3 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i6 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i7 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i8 = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.barHeight = iDpToPx;
            this.touchTargetHeight = iDpToPx2;
            this.adMarkerWidth = iDpToPx3;
            this.scrubberEnabledSize = iDpToPx4;
            this.scrubberDisabledSize = iDpToPx5;
            this.scrubberDraggedSize = iDpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.stopScrubbingRunnable = new Runnable(this) { // from class: Be

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultTimeBar f315a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            iMax = drawable2.getMinimumWidth();
            i2 = 1;
        } else {
            i2 = 1;
            iMax = Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize));
        }
        this.scrubberPadding = (iMax + i2) / 2;
        this.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Ce

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultTimeBar f454a;

            /* JADX WARN: Invalid debug info offset */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
            }
        });
        this.duration = C3219C.TIME_UNSET;
        this.keyTimeIncrement = C3219C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
