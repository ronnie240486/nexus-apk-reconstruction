package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i2;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i = this.mCount;
            for (int i2 = 0; i2 < i && this.mStartIndex + i2 < Flow.this.mDisplayedWidgetsCount; i2++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i2];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i3 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i3 = 0;
                    }
                    this.mWidth = width + i3 + this.mWidth;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < widgetHeight) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i4 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i4 = 0;
                    }
                    this.mHeight = widgetHeight2 + i4 + this.mHeight;
                    if (this.biggest == null || this.biggestDimension < widgetWidth) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth = widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0) + this.mWidth;
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight = widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0) + this.mHeight;
                if (this.biggest == null || this.biggestDimension < widgetWidth2) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z, int i, boolean z2) {
            ConstraintAnchor constraintAnchor;
            ConstraintAnchor constraintAnchor2;
            ConstraintAnchor constraintAnchor3;
            ConstraintAnchor constraintAnchor4;
            ConstraintAnchor constraintAnchor5;
            ConstraintAnchor constraintAnchor6;
            ConstraintWidget constraintWidget;
            ConstraintAnchor constraintAnchor7;
            ConstraintAnchor constraintAnchor8;
            int i2 = this.mCount;
            for (int i3 = 0; i3 < i2 && this.mStartIndex + i3 < Flow.this.mDisplayedWidgetsCount; i3++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i2 == 0 || this.biggest == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.mStartIndex + i7 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                if (Flow.this.mDisplayedWidgets[this.mStartIndex + i7].getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            ConstraintWidget constraintWidget3 = null;
            if (this.mOrientation == 0) {
                ConstraintWidget constraintWidget4 = this.biggest;
                constraintWidget4.setVerticalChainStyle(Flow.this.mVerticalStyle);
                int i8 = this.mPaddingTop;
                if (i > 0) {
                    i8 += Flow.this.mVerticalGap;
                }
                constraintWidget4.mTop.connect(this.mTop, i8);
                if (z2) {
                    constraintWidget4.mBottom.connect(this.mBottom, this.mPaddingBottom);
                }
                if (i > 0) {
                    this.mTop.mOwner.mBottom.connect(constraintWidget4.mTop, 0);
                }
                if (Flow.this.mVerticalAlign != 3 || constraintWidget4.hasBaseline()) {
                    constraintWidget = constraintWidget4;
                    break;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < i2) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount) {
                            constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                            if (constraintWidget.hasBaseline()) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    constraintWidget = constraintWidget4;
                    break;
                }
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.mStartIndex + i12 >= Flow.this.mDisplayedWidgetsCount) {
                        return;
                    }
                    ConstraintWidget constraintWidget5 = Flow.this.mDisplayedWidgets[this.mStartIndex + i12];
                    if (i11 == 0) {
                        constraintWidget5.connect(constraintWidget5.mLeft, this.mLeft, this.mPaddingLeft);
                    }
                    if (i12 == 0) {
                        int i13 = Flow.this.mHorizontalStyle;
                        float f = Flow.this.mHorizontalBias;
                        if (this.mStartIndex == 0 && Flow.this.mFirstHorizontalStyle != -1) {
                            i13 = Flow.this.mFirstHorizontalStyle;
                            f = Flow.this.mFirstHorizontalBias;
                        } else if (z2 && Flow.this.mLastHorizontalStyle != -1) {
                            i13 = Flow.this.mLastHorizontalStyle;
                            f = Flow.this.mLastHorizontalBias;
                        }
                        constraintWidget5.setHorizontalChainStyle(i13);
                        constraintWidget5.setHorizontalBiasPercent(f);
                    }
                    if (i11 == i2 - 1) {
                        constraintWidget5.connect(constraintWidget5.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget5.mLeft.connect(constraintWidget3.mRight, Flow.this.mHorizontalGap);
                        if (i11 == i4) {
                            constraintWidget5.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget3.mRight.connect(constraintWidget5.mLeft, 0);
                        if (i11 == i5 + 1) {
                            constraintWidget3.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget5 != constraintWidget4) {
                        if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget5 != constraintWidget && constraintWidget5.hasBaseline()) {
                            constraintAnchor7 = constraintWidget5.mBaseline;
                            constraintAnchor8 = constraintWidget.mBaseline;
                        } else {
                            int i14 = Flow.this.mVerticalAlign;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    ConstraintAnchor constraintAnchor9 = constraintWidget5.mTop;
                                    if (z3) {
                                        constraintAnchor9.connect(this.mTop, this.mPaddingTop);
                                        constraintWidget5.mBottom.connect(this.mBottom, this.mPaddingBottom);
                                    } else {
                                        constraintAnchor9.connect(constraintWidget4.mTop, 0);
                                    }
                                }
                                constraintAnchor7 = constraintWidget5.mBottom;
                                constraintAnchor8 = constraintWidget4.mBottom;
                            } else {
                                constraintAnchor7 = constraintWidget5.mTop;
                                constraintAnchor8 = constraintWidget4.mTop;
                            }
                        }
                        constraintAnchor7.connect(constraintAnchor8, 0);
                    }
                    i11++;
                    constraintWidget3 = constraintWidget5;
                }
                return;
            }
            ConstraintWidget constraintWidget6 = this.biggest;
            constraintWidget6.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
            int i15 = this.mPaddingLeft;
            if (i > 0) {
                i15 += Flow.this.mHorizontalGap;
            }
            if (z) {
                constraintWidget6.mRight.connect(this.mRight, i15);
                if (z2) {
                    constraintWidget6.mLeft.connect(this.mLeft, this.mPaddingRight);
                }
                if (i > 0) {
                    constraintAnchor = this.mRight.mOwner.mLeft;
                    constraintAnchor2 = constraintWidget6.mRight;
                    constraintAnchor.connect(constraintAnchor2, 0);
                }
            } else {
                constraintWidget6.mLeft.connect(this.mLeft, i15);
                if (z2) {
                    constraintWidget6.mRight.connect(this.mRight, this.mPaddingRight);
                }
                if (i > 0) {
                    constraintAnchor = this.mLeft.mOwner.mRight;
                    constraintAnchor2 = constraintWidget6.mLeft;
                    constraintAnchor.connect(constraintAnchor2, 0);
                }
            }
            int i16 = 0;
            while (i16 < i2 && this.mStartIndex + i16 < Flow.this.mDisplayedWidgetsCount) {
                ConstraintWidget constraintWidget7 = Flow.this.mDisplayedWidgets[this.mStartIndex + i16];
                if (i16 == 0) {
                    constraintWidget7.connect(constraintWidget7.mTop, this.mTop, this.mPaddingTop);
                    int i17 = Flow.this.mVerticalStyle;
                    float f2 = Flow.this.mVerticalBias;
                    if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                        i17 = Flow.this.mFirstVerticalStyle;
                        f2 = Flow.this.mFirstVerticalBias;
                    } else if (z2 && Flow.this.mLastVerticalStyle != -1) {
                        i17 = Flow.this.mLastVerticalStyle;
                        f2 = Flow.this.mLastVerticalBias;
                    }
                    constraintWidget7.setVerticalChainStyle(i17);
                    constraintWidget7.setVerticalBiasPercent(f2);
                }
                if (i16 == i2 - 1) {
                    constraintWidget7.connect(constraintWidget7.mBottom, this.mBottom, this.mPaddingBottom);
                }
                if (constraintWidget3 != null) {
                    constraintWidget7.mTop.connect(constraintWidget3.mBottom, Flow.this.mVerticalGap);
                    if (i16 == i4) {
                        constraintWidget7.mTop.setGoneMargin(this.mPaddingTop);
                    }
                    constraintWidget3.mBottom.connect(constraintWidget7.mTop, 0);
                    if (i16 == i5 + 1) {
                        constraintWidget3.mBottom.setGoneMargin(this.mPaddingBottom);
                    }
                }
                if (constraintWidget7 != constraintWidget6) {
                    int i18 = Flow.this.mHorizontalAlign;
                    if (!z) {
                        if (i18 != 0) {
                            if (i18 != 1) {
                                if (i18 == 2) {
                                    ConstraintAnchor constraintAnchor10 = constraintWidget7.mLeft;
                                    if (z3) {
                                        constraintAnchor10.connect(this.mLeft, this.mPaddingLeft);
                                        constraintWidget7.mRight.connect(this.mRight, this.mPaddingRight);
                                    } else {
                                        constraintAnchor10.connect(constraintWidget6.mLeft, 0);
                                    }
                                }
                            }
                            constraintAnchor3 = constraintWidget7.mRight;
                            constraintAnchor4 = constraintWidget6.mRight;
                        } else {
                            constraintAnchor3 = constraintWidget7.mLeft;
                            constraintAnchor4 = constraintWidget6.mLeft;
                        }
                        constraintAnchor3.connect(constraintAnchor4, 0);
                    } else if (i18 == 0) {
                        constraintAnchor5 = constraintWidget7.mRight;
                        constraintAnchor6 = constraintWidget6.mRight;
                        constraintAnchor5.connect(constraintAnchor6, 0);
                    } else if (i18 == 1) {
                        constraintAnchor5 = constraintWidget7.mLeft;
                        constraintAnchor6 = constraintWidget6.mLeft;
                        constraintAnchor5.connect(constraintAnchor6, 0);
                    } else if (i18 == 2) {
                        constraintWidget7.mLeft.connect(constraintWidget6.mLeft, 0);
                        constraintAnchor5 = constraintWidget7.mRight;
                        constraintAnchor6 = constraintWidget6.mRight;
                        constraintAnchor5.connect(constraintAnchor6, 0);
                    }
                }
                i16++;
                constraintWidget3 = constraintWidget7;
            }
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i) {
            Flow flow;
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour;
            int width;
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour;
            int height;
            int i2 = this.mNbMatchConstraintsWidgets;
            if (i2 == 0) {
                return;
            }
            int i3 = this.mCount;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.mStartIndex + i5 < Flow.this.mDisplayedWidgetsCount; i5++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i5];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        flow = Flow.this;
                        horizontalDimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                        verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
                        height = constraintWidget.getHeight();
                        width = i4;
                        flow.measure(constraintWidget, horizontalDimensionBehaviour, width, verticalDimensionBehaviour, height);
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    flow = Flow.this;
                    horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                    width = constraintWidget.getWidth();
                    verticalDimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    height = i4;
                    flow.measure(constraintWidget, horizontalDimensionBehaviour, width, verticalDimensionBehaviour, height);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i) {
            this.mStartIndex = i;
        }

        public void setup(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
            this.mMax = i6;
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i = 0; i < this.mDisplayedWidgetsCount; i++) {
            this.mDisplayedWidgets[i].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ConstraintWidget constraintWidget2 = null;
        for (int i4 = 0; i4 < i2; i4++) {
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[z ? (i2 - i4) - 1 : i4];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i4 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(this.mHorizontalBias);
                }
                if (i4 == i2 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i4 > 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i5];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i5 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i5 == i3 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i5 > 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i7 * i2) + i6;
                if (this.mOrientation == 1) {
                    i8 = (i6 * i3) + i7;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i8 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i8]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i6];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i7];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentHeight * i);
                if (i3 != constraintWidget.getHeight()) {
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return constraintWidget.getHeight();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentWidth * i);
                if (i3 != constraintWidget.getWidth()) {
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i3;
            }
            if (i2 == 1) {
                return constraintWidget.getWidth();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0057 A[ADDED_TO_REGION, EDGE_INSN: B:117:0x0057->B:40:0x0057 BREAK  A[LOOP:1: B:42:0x005a->B:122:0x005a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0057 A[ADDED_TO_REGION, EDGE_INSN: B:120:0x0057->B:40:0x0057 BREAK  A[LOOP:1: B:42:0x005a->B:122:0x005a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0068  */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x008e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0095  */
    /* JADX WARN: Code duplicated, block: B:64:0x0098  */
    /* JADX WARN: Code duplicated, block: B:66:0x009d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00db  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x010b -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x010d -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0113 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0115 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:97:0x00f8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Flow.measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i6;
        if (i == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
        this.mChainList.add(widgetsList);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (i2 == 0) {
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int widgetWidth = getWidgetWidth(constraintWidget, i3);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i10 = i7;
                boolean z = (i8 == i3 || (this.mHorizontalGap + i8) + widgetWidth > i3) && widgetsList.biggest != null;
                if (!z && i9 > 0 && (i6 = this.mMaxElementsWrap) > 0 && i9 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    widgetsList.setStartIndex(i9);
                    this.mChainList.add(widgetsList);
                } else {
                    if (i9 > 0) {
                        i8 = this.mHorizontalGap + widgetWidth + i8;
                    }
                    widgetsList.add(constraintWidget);
                    i9++;
                    i7 = i10;
                }
                i8 = widgetWidth;
                widgetsList.add(constraintWidget);
                i9++;
                i7 = i10;
            }
        } else {
            while (i9 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i9];
                int widgetHeight = getWidgetHeight(constraintWidget2, i3);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i11 = i7;
                boolean z2 = (i8 == i3 || (this.mVerticalGap + i8) + widgetHeight > i3) && widgetsList.biggest != null;
                if (!z2 && i9 > 0 && (i4 = this.mMaxElementsWrap) > 0 && i9 % i4 == 0) {
                    z2 = true;
                }
                if (z2) {
                    widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    widgetsList.setStartIndex(i9);
                    this.mChainList.add(widgetsList);
                } else {
                    if (i9 > 0) {
                        i8 = this.mVerticalGap + widgetHeight + i8;
                    }
                    widgetsList.add(constraintWidget2);
                    i9++;
                    i7 = i11;
                }
                i8 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i9++;
                i7 = i11;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i7 > 0 && z3) {
            for (int i12 = 0; i12 < size; i12++) {
                WidgetsList widgetsList2 = this.mChainList.get(i12);
                widgetsList2.measureMatchConstraints(i3 - (i2 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
            }
        }
        int i13 = paddingTop;
        int i14 = paddingRight2;
        int height = 0;
        int width = 0;
        int i15 = 0;
        int i16 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i17 = paddingBottom2;
        while (i15 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i15);
            if (i2 == 0) {
                if (i15 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i15 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i18 = height;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i19 = width;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i5 = i15;
                widgetsList3.setup(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i16, i13, i14, paddingBottom, i3);
                int iMax = Math.max(i19, widgetsList3.getWidth());
                height = i18 + widgetsList3.getHeight();
                if (i5 > 0) {
                    height += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                width = iMax;
                constraintAnchor7 = constraintAnchor9;
                i13 = 0;
                constraintAnchor = constraintAnchor14;
                int i20 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i17 = i20;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i21 = height;
                int i22 = width;
                i5 = i15;
                if (i5 < size - 1) {
                    constraintAnchor = this.mChainList.get(i5 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i16, i13, paddingRight, i17, i3);
                width = i22 + widgetsList3.getWidth();
                int iMax2 = Math.max(i21, widgetsList3.getHeight());
                if (i5 > 0) {
                    width += this.mHorizontalGap;
                }
                height = iMax2;
                i14 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i16 = 0;
            }
            i15 = i5 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = width;
        iArr[1] = height;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        WidgetsList widgetsList;
        if (i == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            widgetsList.add(constraintWidgetArr[i4]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        super.addToSolver(linearSystem);
        boolean zIsRtl = getParent() != null ? ((ConstraintWidgetContainer) getParent()).isRtl() : false;
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(zIsRtl, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(zIsRtl);
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(zIsRtl, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z;
        char c;
        int iMin;
        int iMin2;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = new int[2];
        int i7 = (i2 - paddingLeft) - paddingRight;
        int i8 = this.mOrientation;
        if (i8 == 1) {
            i7 = (i4 - paddingTop) - paddingBottom;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.mWidgetsCount;
            if (i10 >= i5) {
                break;
            }
            if (this.mWidgets[i10].getVisibility() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            constraintWidgetArr = new ConstraintWidget[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.mWidgetsCount; i13++) {
                ConstraintWidget constraintWidget = this.mWidgets[i13];
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr[i12] = constraintWidget;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i6;
        int i14 = this.mWrapMode;
        if (i14 == 0) {
            z = true;
            measureNoWrap(constraintWidgetArr, i6, this.mOrientation, i9, iArr);
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    iArr = iArr;
                    c = 0;
                    z = true;
                } else {
                    z = true;
                    measureAligned(constraintWidgetArr, i6, this.mOrientation, i9, iArr);
                }
                iMin = iArr[c] + paddingLeft + paddingRight;
                iMin2 = iArr[z ? 1 : 0] + paddingTop + paddingBottom;
                if (i == 1073741824) {
                    iMin = i2;
                } else if (i == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i2);
                } else if (i != 0) {
                    iMin = 0;
                }
                if (i3 == 1073741824) {
                    iMin2 = i4;
                } else if (i3 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(iMin2, i4);
                } else if (i3 != 0) {
                    iMin2 = 0;
                }
                setMeasure(iMin, iMin2);
                setWidth(iMin);
                setHeight(iMin2);
                if (this.mWidgetsCount <= 0) {
                    z = false;
                }
                needsCallbackFromSolver(z);
            }
            z = true;
            measureChainWrap(constraintWidgetArr, i6, this.mOrientation, i9, iArr);
        }
        c = 0;
        iMin = iArr[c] + paddingLeft + paddingRight;
        iMin2 = iArr[z ? 1 : 0] + paddingTop + paddingBottom;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        if (this.mWidgetsCount <= 0) {
            z = false;
        }
        needsCallbackFromSolver(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.mFirstHorizontalBias = f;
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFirstHorizontalStyle = i;
    }

    public void setFirstVerticalBias(float f) {
        this.mFirstVerticalBias = f;
    }

    public void setFirstVerticalStyle(int i) {
        this.mFirstVerticalStyle = i;
    }

    public void setHorizontalAlign(int i) {
        this.mHorizontalAlign = i;
    }

    public void setHorizontalBias(float f) {
        this.mHorizontalBias = f;
    }

    public void setHorizontalGap(int i) {
        this.mHorizontalGap = i;
    }

    public void setHorizontalStyle(int i) {
        this.mHorizontalStyle = i;
    }

    public void setLastHorizontalBias(float f) {
        this.mLastHorizontalBias = f;
    }

    public void setLastHorizontalStyle(int i) {
        this.mLastHorizontalStyle = i;
    }

    public void setLastVerticalBias(float f) {
        this.mLastVerticalBias = f;
    }

    public void setLastVerticalStyle(int i) {
        this.mLastVerticalStyle = i;
    }

    public void setMaxElementsWrap(int i) {
        this.mMaxElementsWrap = i;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public void setVerticalAlign(int i) {
        this.mVerticalAlign = i;
    }

    public void setVerticalBias(float f) {
        this.mVerticalBias = f;
    }

    public void setVerticalGap(int i) {
        this.mVerticalGap = i;
    }

    public void setVerticalStyle(int i) {
        this.mVerticalStyle = i;
    }

    public void setWrapMode(int i) {
        this.mWrapMode = i;
    }
}
