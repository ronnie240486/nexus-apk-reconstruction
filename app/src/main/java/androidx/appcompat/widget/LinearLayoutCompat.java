package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C2439R;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.C1313UP;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zIsLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    right = (left - paddingRight) - this.mDividerWidth;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int measuredHeight;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.mGravity;
        int i12 = i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i11, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity != 1) {
            paddingLeft = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        }
        if (zIsLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int i13 = (i6 * childrenSkipCount) + i5;
            View virtualChildAt = getVirtualChildAt(i13);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i13) + paddingLeft;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i14 = childrenSkipCount;
                    if (z) {
                        i7 = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i8 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i8 < 0) {
                            i8 = i12;
                        }
                        i9 = i8 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
                        if (i9 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        } else if (i9 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i9 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i13)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i15 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i15, measuredHeight, measuredWidth, measuredHeight2);
                        paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i15;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i13) + i14;
                    } else {
                        i7 = virtualChildCount;
                    }
                    i8 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i8 < 0) {
                        i8 = i12;
                    }
                    i9 = i8 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
                    if (i9 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    } else if (i9 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i9 != 80) {
                        measuredHeight = paddingTop;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                        }
                    }
                    if (hasDividerBeforeChildAt(i13)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i16 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i16, measuredHeight, measuredWidth, measuredHeight2);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i16;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i13) + i14;
                }
                childrenSkipCount++;
                virtualChildCount = i7;
                i12 = i12;
                paddingTop = paddingTop;
            }
            i7 = virtualChildCount;
            childrenSkipCount++;
            virtualChildCount = i7;
            i12 = i12;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = i8 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
        int i10 = i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i9 != 16) {
            paddingTop = i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(childrenSkipCount) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i11 < 0) {
                    i11 = i10;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i6 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                    }
                    int i12 = i6;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i12, getLocationOffset(virtualChildAt) + i13, measuredWidth, measuredHeight);
                    paddingTop = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i13;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                }
                i6 = i5 - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                int i14 = i6;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    paddingTop += this.mDividerHeight;
                }
                int i15 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                setChildFrame(virtualChildAt, i14, getLocationOffset(virtualChildAt) + i15, measuredWidth, measuredHeight);
                paddingTop = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i15;
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03b1 A[PHI: r3
      0x03b1: PHI (r3v34 int) = (r3v30 int), (r3v35 int) binds: [B:171:0x03c2, B:165:0x03ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x0449  */
    /* JADX WARN: Code duplicated, block: B:61:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    public void measureHorizontal(int i, int i2) {
        int[] iArr;
        int iCombineMeasuredStates;
        int i3;
        int iMax;
        int i4;
        int i5;
        int baseline;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        View view;
        int i10;
        boolean z3;
        int i11;
        int measuredHeight;
        int childrenSkipCount;
        int baseline2;
        int i12;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.mBaselineAligned;
        boolean z5 = this.mUseLargestChild;
        int i13 = 1073741824;
        boolean z6 = mode == 1073741824;
        float f = 0.0f;
        int childrenSkipCount2 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (true) {
            iArr = iArr3;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount2)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f3 = f + f2;
                    if (mode == i13 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f2 > 0.0f) {
                        int i14 = this.mTotalLength;
                        if (z6) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i14;
                        } else {
                            this.mTotalLength = Math.max(i14, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i14 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i9 = childrenSkipCount2;
                            z = z5;
                            z2 = z4;
                            view = virtualChildAt;
                        } else {
                            i9 = childrenSkipCount2;
                            z = z5;
                            z2 = z4;
                            view = virtualChildAt;
                            i10 = 1073741824;
                            z7 = true;
                        }
                        if (mode2 == i10 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z3 = true;
                            z9 = true;
                        } else {
                            z3 = false;
                        }
                        i11 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i11;
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i12 < 0) {
                                i12 = this.mGravity;
                            }
                            int i15 = (((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) >> 4) & (-2)) >> 1;
                            iArr2[i15] = Math.max(iArr2[i15], baseline2);
                            iArr[i15] = Math.max(iArr[i15], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(iMax3, measuredHeight);
                        if (z8 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i11);
                        } else {
                            int i16 = iMax5;
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax4 = Math.max(iMax4, i11);
                            iMax5 = i16;
                        }
                        int i17 = i9;
                        childrenSkipCount = getChildrenSkipCount(view, i17) + i17;
                        f = f3;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f2 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams).width = -2;
                            i8 = 0;
                        }
                        i9 = childrenSkipCount2;
                        int i18 = i8;
                        z = z5;
                        z2 = z4;
                        measureChildBeforeLayout(virtualChildAt, i9, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i18 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i18;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z6) {
                            view = virtualChildAt;
                            this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + this.mTotalLength;
                        } else {
                            view = virtualChildAt;
                            int i19 = this.mTotalLength;
                            this.mTotalLength = Math.max(i19, getNextLocationOffset(view) + i19 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    i10 = 1073741824;
                    if (mode2 == i10) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i11 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i11;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z2) {
                        i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i12 < 0) {
                            i12 = this.mGravity;
                        }
                        int i110 = (((i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax3 = Math.max(iMax3, measuredHeight);
                    if (z8) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i11);
                    } else {
                        int i111 = iMax5;
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i11);
                        iMax5 = i111;
                    }
                    int i112 = i9;
                    childrenSkipCount = getChildrenSkipCount(view, i112) + i112;
                    f = f3;
                }
                childrenSkipCount2 = childrenSkipCount + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i13 = 1073741824;
            }
            childrenSkipCount = childrenSkipCount2;
            z = z5;
            z2 = z4;
            childrenSkipCount2 = childrenSkipCount + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i13 = 1073741824;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i20 = iMax3;
        int i21 = iMax4;
        int i22 = iMax5;
        int i23 = iCombineMeasuredStates2;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i24 = iArr2[1];
        int iMax6 = (i24 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i20 : Math.max(i20, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i24, iArr2[2]))));
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int childrenSkipCount3 = 0;
            while (childrenSkipCount3 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                if (virtualChildAt2 == null) {
                    this.mTotalLength = measureNullChild(childrenSkipCount3) + this.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    int i25 = this.mTotalLength;
                    if (z6) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i25;
                    } else {
                        this.mTotalLength = Math.max(i25, getNextLocationOffset(virtualChildAt2) + i25 + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                    }
                    childrenSkipCount3++;
                    iMax6 = iMax6;
                }
                childrenSkipCount3++;
                iMax6 = iMax6;
            }
        }
        int iMax7 = iMax6;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
        int i26 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z7 || (i26 != 0 && f > 0.0f)) {
            float f4 = this.mWeightSum;
            if (f4 > 0.0f) {
                f = f4;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i27 = i21;
            iCombineMeasuredStates = i23;
            int iMax8 = -1;
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i28);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i4 = i26;
                    virtualChildCount = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f5 > 0.0f) {
                        int measuredWidth2 = (int) ((i26 * f5) / f);
                        float f6 = f - f5;
                        int i29 = i26 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i7 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                            f = f6;
                            i4 = i29;
                        } else {
                            i7 = 1073741824;
                        }
                        measuredWidth2 = virtualChildAt3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                        f = f6;
                        i4 = i29;
                    } else {
                        i4 = i26;
                    }
                    int i30 = this.mTotalLength;
                    if (z6) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + i30;
                    } else {
                        this.mTotalLength = Math.max(i30, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i30 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z12 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i31 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i31;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z12) {
                        i31 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i27, i31);
                    if (z8) {
                        i5 = -1;
                        boolean z13 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z11 && (baseline = virtualChildAt3.getBaseline()) != i5) {
                            i6 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i6 < 0) {
                                i6 = this.mGravity;
                            }
                            int i32 = (((i6 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) >> 4) & (-2)) >> 1;
                            iArr2[i32] = Math.max(iArr2[i32], baseline);
                            iArr[i32] = Math.max(iArr[i32], measuredHeight2 - baseline);
                        }
                        z8 = z13;
                        i27 = iMax9;
                        f = f;
                    } else {
                        i5 = -1;
                    }
                    if (z11) {
                        i6 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i6 < 0) {
                            i6 = this.mGravity;
                        }
                        int i33 = (((i6 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) >> 4) & (-2)) >> 1;
                        iArr2[i33] = Math.max(iArr2[i33], baseline);
                        iArr[i33] = Math.max(iArr[i33], measuredHeight2 - baseline);
                    }
                    z8 = z13;
                    i27 = iMax9;
                    f = f;
                }
                i28++;
                i26 = i4;
                virtualChildCount = virtualChildCount;
            }
            i3 = virtualChildCount;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i34 = iArr2[1];
            iMax7 = (i34 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i34, iArr2[2]))));
            iMax = i27;
        } else {
            iMax = Math.max(i21, i22);
            if (z10 && mode != 1073741824) {
                for (int i35 = 0; i35 < virtualChildCount; i35++) {
                    View virtualChildAt4 = getVirtualChildAt(i35);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = virtualChildCount;
            iCombineMeasuredStates = i23;
        }
        if (z8 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
        if (z9) {
            forceUniformHeight(i3, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02d6 A[PHI: r10
      0x02d6: PHI (r10v23 int) = (r10v21 int), (r10v24 int) binds: [B:135:0x02e7, B:129:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x0328  */
    public void measureVertical(int i, int i2) {
        int i3;
        int iCombineMeasuredStates;
        int iMax;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        View view;
        int iMax3;
        boolean z2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i15 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        float f = 0.0f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iMax4 = 0;
        int i19 = 0;
        int childrenSkipCount = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i20 = 8;
            int i21 = iMax4;
            if (childrenSkipCount >= virtualChildCount) {
                int i22 = i16;
                int i23 = i18;
                int i24 = i19;
                int i25 = mode2;
                int iMax5 = i17;
                int i26 = virtualChildCount;
                if (this.mTotalLength > 0) {
                    i3 = i26;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i26;
                }
                if (z3 && (i25 == Integer.MIN_VALUE || i25 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i3) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i20) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i27 = this.mTotalLength;
                            this.mTotalLength = Math.max(i27, getNextLocationOffset(virtualChildAt) + i27 + i23 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i20 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
                int i28 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z4 || (i28 != 0 && f > 0.0f)) {
                    float f2 = this.mWeightSum;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.mTotalLength = 0;
                    int i29 = i28;
                    int i30 = i24;
                    iCombineMeasuredStates = i22;
                    int i31 = 0;
                    while (i31 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i31);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i4 = i29;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f3 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f3 > 0.0f) {
                                int measuredHeight = (int) ((i29 * f3) / f);
                                float f4 = f - f3;
                                i4 = i29 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i7 = 1073741824;
                                    if (i25 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                    f = f4;
                                } else {
                                    i7 = 1073741824;
                                }
                                measuredHeight = virtualChildAt2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                f = f4;
                            } else {
                                i4 = i29;
                            }
                            int i32 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i32;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width != -1) {
                                }
                                int iMax6 = Math.max(i30, i32);
                                if (z5 || ((LinearLayout.LayoutParams) layoutParams2).width != i6) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                int i33 = this.mTotalLength;
                                this.mTotalLength = Math.max(i33, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i33 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                                z5 = z;
                                iCombineMeasuredStates = i5;
                                i30 = iMax6;
                                f = f5;
                            } else {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                            }
                            i32 = measuredWidth;
                            int iMax7 = Math.max(i30, i32);
                            if (z5) {
                                z = false;
                            } else {
                                z = false;
                            }
                            int i34 = this.mTotalLength;
                            this.mTotalLength = Math.max(i34, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i34 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            z5 = z;
                            iCombineMeasuredStates = i5;
                            i30 = iMax7;
                            f = f5;
                        }
                        i31++;
                        i29 = i4;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    iMax = i30;
                } else {
                    iMax = Math.max(i24, i21);
                    if (z3 && i25 != 1073741824) {
                        for (int i35 = 0; i35 < i3; i35++) {
                            View virtualChildAt3 = getVirtualChildAt(i35);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i22;
                }
                if (z5 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z6) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
                i11 = mode2;
                iMax4 = i21;
                i13 = virtualChildCount;
            } else {
                int i36 = i16;
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                    iMax4 = i21;
                    i16 = i36;
                    i13 = virtualChildCount;
                    i11 = mode2;
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f6 > 0.0f) {
                        int i37 = this.mTotalLength;
                        this.mTotalLength = Math.max(i37, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i37 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax3 = i18;
                        view = virtualChildAt4;
                        iMax2 = i19;
                        i9 = i36;
                        i10 = i17;
                        z4 = true;
                        i11 = mode2;
                        i12 = i21;
                        i13 = virtualChildCount;
                        i14 = childrenSkipCount;
                    } else {
                        int i38 = i17;
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f6 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i8 = 0;
                        }
                        i9 = i36;
                        int i39 = i8;
                        i10 = i38;
                        int i40 = i18;
                        i11 = mode2;
                        i12 = i21;
                        i13 = virtualChildCount;
                        iMax2 = i19;
                        i14 = childrenSkipCount;
                        measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i, 0, i2, f7 == 0.0f ? this.mTotalLength : 0);
                        if (i39 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i39;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight();
                        int i41 = this.mTotalLength;
                        view = virtualChildAt4;
                        this.mTotalLength = Math.max(i41, getNextLocationOffset(view) + i41 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax3 = z3 ? Math.max(measuredHeight2, i40) : i40;
                    }
                    if (i15 >= 0 && i15 == i14 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i14 < i15 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z6 = true;
                    }
                    int i42 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i42;
                    int iMax8 = Math.max(i10, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i9, view.getMeasuredState());
                    z5 = z5 && ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z2) {
                            i42 = measuredWidth2;
                        }
                        iMax4 = Math.max(i12, i42);
                    } else {
                        if (!z2) {
                            i42 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i42);
                        iMax4 = i12;
                    }
                    int childrenSkipCount3 = getChildrenSkipCount(view, i14) + i14;
                    i18 = iMax3;
                    i17 = iMax8;
                    f = f7;
                    i19 = iMax2;
                    childrenSkipCount = childrenSkipCount3;
                    i16 = iCombineMeasuredStates2;
                }
            }
            childrenSkipCount++;
            virtualChildCount = i13;
            mode2 = i11;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + C1313UP.f3459l);
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
        int i3 = this.mGravity;
        if ((i3 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = BadgeDrawable.TOP_START;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2439R.styleable.LinearLayoutCompat, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, C2439R.styleable.LinearLayoutCompat, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = tintTypedArrayObtainStyledAttributes.getInt(C2439R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = tintTypedArrayObtainStyledAttributes.getInt(C2439R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = tintTypedArrayObtainStyledAttributes.getBoolean(C2439R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(C2439R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(C2439R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(C2439R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2439R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(C2439R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2439R.styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
