package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import p000.C1023Ps;
import p000.C1262Tc;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    public static /* synthetic */ class C25661 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f10098xdde91696;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f10098xdde91696 = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10098xdde91696[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10098xdde91696[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10098xdde91696[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        ConstraintWidget widget;

        public static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C2567R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }

            private Table() {
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:40:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x0087  */
        /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolveGoneLeftMargin = this.goneLeftMargin;
            this.resolveGoneRightMargin = this.goneRightMargin;
            float f = this.horizontalBias;
            this.resolvedHorizontalBias = f;
            int i8 = this.guideBegin;
            this.resolvedGuideBegin = i8;
            int i9 = this.guideEnd;
            this.resolvedGuideEnd = i9;
            float f2 = this.guidePercent;
            this.resolvedGuidePercent = f2;
            if (z2) {
                int i10 = this.startToEnd;
                if (i10 != -1) {
                    this.resolvedRightToLeft = i10;
                } else {
                    int i11 = this.startToStart;
                    if (i11 != -1) {
                        this.resolvedRightToRight = i11;
                    } else {
                        i2 = this.endToStart;
                        if (i2 != -1) {
                            this.resolvedLeftToRight = i2;
                            z = true;
                        }
                        i3 = this.endToEnd;
                        if (i3 != -1) {
                            this.resolvedLeftToLeft = i3;
                            z = true;
                        }
                        i4 = this.goneStartMargin;
                        if (i4 != -1) {
                            this.resolveGoneRightMargin = i4;
                        }
                        i5 = this.goneEndMargin;
                        if (i5 != -1) {
                            this.resolveGoneLeftMargin = i5;
                        }
                        if (z) {
                            this.resolvedHorizontalBias = 1.0f - f;
                        }
                        if (this.isGuideline && this.orientation == 1) {
                            if (f2 != -1.0f) {
                                this.resolvedGuidePercent = 1.0f - f2;
                                this.resolvedGuideBegin = -1;
                                this.resolvedGuideEnd = -1;
                            } else {
                                if (i8 != -1) {
                                    this.resolvedGuideEnd = i8;
                                    this.resolvedGuideBegin = -1;
                                } else if (i9 != -1) {
                                    this.resolvedGuideBegin = i9;
                                    this.resolvedGuideEnd = -1;
                                }
                                this.resolvedGuidePercent = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.endToStart;
                if (i2 != -1) {
                    this.resolvedLeftToRight = i2;
                    z = true;
                }
                i3 = this.endToEnd;
                if (i3 != -1) {
                    this.resolvedLeftToLeft = i3;
                    z = true;
                }
                i4 = this.goneStartMargin;
                if (i4 != -1) {
                    this.resolveGoneRightMargin = i4;
                }
                i5 = this.goneEndMargin;
                if (i5 != -1) {
                    this.resolveGoneLeftMargin = i5;
                }
                if (z) {
                    this.resolvedHorizontalBias = 1.0f - f;
                }
                if (this.isGuideline) {
                    if (f2 != -1.0f) {
                        this.resolvedGuidePercent = 1.0f - f2;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuideEnd = -1;
                    } else {
                        if (i8 != -1) {
                            this.resolvedGuideEnd = i8;
                            this.resolvedGuideBegin = -1;
                        } else if (i9 != -1) {
                            this.resolvedGuideBegin = i9;
                            this.resolvedGuideEnd = -1;
                        }
                        this.resolvedGuidePercent = -1.0f;
                    }
                }
            } else {
                int i12 = this.startToEnd;
                if (i12 != -1) {
                    this.resolvedLeftToRight = i12;
                }
                int i13 = this.startToStart;
                if (i13 != -1) {
                    this.resolvedLeftToLeft = i13;
                }
                int i14 = this.endToStart;
                if (i14 != -1) {
                    this.resolvedRightToLeft = i14;
                }
                int i15 = this.endToEnd;
                if (i15 != -1) {
                    this.resolvedRightToRight = i15;
                }
                int i16 = this.goneStartMargin;
                if (i16 != -1) {
                    this.resolveGoneLeftMargin = i16;
                }
                int i17 = this.goneEndMargin;
                if (i17 != -1) {
                    this.resolveGoneRightMargin = i17;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i18 = this.rightToLeft;
                if (i18 != -1) {
                    this.resolvedRightToLeft = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.rightToRight;
                    if (i19 != -1) {
                        this.resolvedRightToRight = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.leftToLeft;
                if (i20 != -1) {
                    this.resolvedLeftToLeft = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                } else {
                    int i21 = this.leftToRight;
                    if (i21 == -1) {
                        return;
                    }
                    this.resolvedLeftToRight = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }

        public void setWidgetDebugName(String str) {
            this.widget.setDebugName(str);
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.horizontalDimensionFixed = false;
                if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.verticalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.isGuideline = true;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (!(this.widget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                this.widget = new androidx.constraintlayout.solver.widgets.Guideline();
            }
            ((androidx.constraintlayout.solver.widgets.Guideline) this.widget).setOrientation(this.orientation);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            String str;
            int i;
            float fAbs;
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2567R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = Table.map.get(index);
                switch (i3) {
                    case 1:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        continue;
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        continue;
                        break;
                    case 6:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        continue;
                        break;
                    case 7:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        continue;
                        break;
                    case 22:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        continue;
                        break;
                    case 23:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        continue;
                        break;
                    case 24:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        continue;
                        break;
                    case 25:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        continue;
                        break;
                    case 26:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        continue;
                        break;
                    case 27:
                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        continue;
                        break;
                    case 28:
                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        continue;
                        break;
                    case 29:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        continue;
                        break;
                    case 30:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        continue;
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                            }
                        }
                        break;
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                            }
                        }
                        break;
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        continue;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.dimensionRatio.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.dimensionRatio.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase(C1023Ps.f2627j)) {
                                            this.dimensionRatioSide = 0;
                                        } else if (strSubstring.equalsIgnoreCase(C1023Ps.f2628k)) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.dimensionRatio.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.dimensionRatio.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.dimensionRatioValue = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.dimensionRatio.substring(i, iIndexOf2);
                                        String strSubstring4 = this.dimensionRatio.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    fAbs = this.dimensionRatioSide == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                                                    this.dimensionRatioValue = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e(ConstraintLayout.TAG, str);
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.constraintTag = layoutParams.constraintTag;
            this.widget = layoutParams.widget;
        }
    }

    public class Measurer implements BasicMeasure.Measurer {
        ConstraintLayout layout;
        int layoutHeightSpec;
        int layoutWidthSpec;
        int paddingBottom;
        int paddingHeight;
        int paddingTop;
        int paddingWidth;

        public Measurer(ConstraintLayout constraintLayout) {
            this.layout = constraintLayout;
        }

        public void captureLayoutInfos(int i, int i2, int i3, int i4, int i5, int i6) {
            this.paddingTop = i3;
            this.paddingBottom = i4;
            this.paddingWidth = i5;
            this.paddingHeight = i6;
            this.layoutWidthSpec = i;
            this.layoutHeightSpec = i2;
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
            int childCount = this.layout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.layout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.layout);
                }
            }
            int size = this.layout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.layout.mConstraintHelpers.get(i2)).updatePostMeasure(this.layout);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0166  */
        /* JADX WARN: Code duplicated, block: B:104:0x0171 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:112:0x0186  */
        /* JADX WARN: Code duplicated, block: B:114:0x018a  */
        /* JADX WARN: Code duplicated, block: B:117:0x0198  */
        /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:121:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:124:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:127:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:128:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:131:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:134:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:135:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:138:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:141:0x01fb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:143:0x0206 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:144:0x0208 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:147:0x0213 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:151:0x021b  */
        /* JADX WARN: Code duplicated, block: B:153:0x021f  */
        /* JADX WARN: Code duplicated, block: B:155:0x0225  */
        /* JADX WARN: Code duplicated, block: B:158:0x023b  */
        /* JADX WARN: Code duplicated, block: B:159:0x023d  */
        /* JADX WARN: Code duplicated, block: B:162:0x0242  */
        /* JADX WARN: Code duplicated, block: B:166:0x0249  */
        /* JADX WARN: Code duplicated, block: B:169:0x0250  */
        /* JADX WARN: Code duplicated, block: B:170:0x0252  */
        /* JADX WARN: Code duplicated, block: B:172:0x0255  */
        /* JADX WARN: Code duplicated, block: B:42:0x00bb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:54:0x00df  */
        /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f4 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:68:0x0106  */
        /* JADX WARN: Code duplicated, block: B:69:0x0117  */
        /* JADX WARN: Code duplicated, block: B:70:0x0123  */
        /* JADX WARN: Code duplicated, block: B:73:0x0132  */
        /* JADX WARN: Code duplicated, block: B:74:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0137  */
        /* JADX WARN: Code duplicated, block: B:77:0x0139  */
        /* JADX WARN: Code duplicated, block: B:80:0x013e  */
        /* JADX WARN: Code duplicated, block: B:84:0x0145  */
        /* JADX WARN: Code duplicated, block: B:86:0x0148  */
        /* JADX WARN: Code duplicated, block: B:90:0x014f  */
        /* JADX WARN: Code duplicated, block: B:93:0x0153  */
        /* JADX WARN: Code duplicated, block: B:96:0x015b  */
        /* JADX WARN: Code duplicated, block: B:98:0x015e  */
        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        @SuppressLint({"WrongCall"})
        public final void measure(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            boolean z;
            int i;
            int iMakeMeasureSpec2;
            boolean z2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z3;
            boolean z4;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            LayoutParams layoutParams;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int i3;
            int iMin;
            int i4;
            int i5;
            int iMin2;
            int i6;
            int measuredWidth2;
            int measuredHeight2;
            int baseline;
            int i7;
            boolean z9;
            boolean z10;
            boolean z11;
            int childMeasureSpec;
            int childMeasureSpec2;
            boolean z12;
            int[] iArr;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.getVisibility() == 8 && !constraintWidget.isInPlaceholder()) {
                measure.measuredWidth = 0;
                measure.measuredHeight = 0;
                measure.measuredBaseline = 0;
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = measure.verticalBehavior;
            int i8 = measure.horizontalDimension;
            int i9 = measure.verticalDimension;
            int i10 = this.paddingTop + this.paddingBottom;
            int i11 = this.paddingWidth;
            View view = (View) constraintWidget.getCompanionWidget();
            int[] iArr2 = C25661.f10098xdde91696;
            int i12 = iArr2[dimensionBehaviour3.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, i11, -2);
                    constraintWidget.wrapMeasure[2] = -2;
                } else if (i12 == 3) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, constraintWidget.getHorizontalMargin() + i11, -1);
                    constraintWidget.wrapMeasure[2] = -1;
                } else if (i12 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutWidthSpec, i11, -2);
                    boolean z13 = constraintWidget.mMatchConstraintDefaultWidth == 1;
                    int[] iArr3 = constraintWidget.wrapMeasure;
                    iArr3[2] = 0;
                    if (measure.useCurrentDimensions) {
                        boolean z14 = !(!z13 || iArr3[3] == 0 || iArr3[0] == constraintWidget.getWidth()) || (view instanceof Placeholder);
                        if (!z13 || z14) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), 1073741824);
                        }
                        i = iArr2[dimensionBehaviour4.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        z2 = false;
                                        iMakeMeasureSpec2 = 0;
                                    } else {
                                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                                        if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        iArr = constraintWidget.wrapMeasure;
                                        iArr[3] = 0;
                                        if (measure.useCurrentDimensions) {
                                            boolean z15 = !(z12 || iArr[2] == 0 || iArr[1] == constraintWidget.getHeight()) || (view instanceof Placeholder);
                                            if (z12 || z15) {
                                                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                                            }
                                        }
                                    }
                                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour3 == dimensionBehaviour) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (dimensionBehaviour4 == dimensionBehaviour) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                                    if (dimensionBehaviour4 != dimensionBehaviour2 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (dimensionBehaviour3 != dimensionBehaviour2 || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z3 || constraintWidget.mDimensionRatio <= 0.0f) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z4 || constraintWidget.mDimensionRatio <= 0.0f) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    layoutParams = (LayoutParams) view.getLayoutParams();
                                    if (measure.useCurrentDimensions && z3 && constraintWidget.mMatchConstraintDefaultWidth == 0 && z4 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                        i7 = -1;
                                    } else {
                                        if ((view instanceof VirtualLayout) || !(constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((VirtualLayout) view).onMeasure((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        int baseline2 = view.getBaseline();
                                        if (z) {
                                            int[] iArr4 = constraintWidget.wrapMeasure;
                                            i2 = 0;
                                            iArr4[0] = measuredWidth;
                                            iArr4[2] = measuredHeight;
                                        } else {
                                            i2 = 0;
                                            int[] iArr5 = constraintWidget.wrapMeasure;
                                            iArr5[0] = 0;
                                            iArr5[2] = 0;
                                        }
                                        if (z2) {
                                            int[] iArr6 = constraintWidget.wrapMeasure;
                                            iArr6[1] = measuredHeight;
                                            iArr6[3] = measuredWidth;
                                        } else {
                                            int[] iArr7 = constraintWidget.wrapMeasure;
                                            iArr7[1] = i2;
                                            iArr7[3] = i2;
                                        }
                                        i3 = constraintWidget.mMatchConstraintMinWidth;
                                        if (i3 > 0) {
                                            iMin = Math.max(i3, measuredWidth);
                                        } else {
                                            iMin = measuredWidth;
                                        }
                                        i4 = constraintWidget.mMatchConstraintMaxWidth;
                                        if (i4 > 0) {
                                            iMin = Math.min(i4, iMin);
                                        }
                                        i5 = constraintWidget.mMatchConstraintMinHeight;
                                        if (i5 > 0) {
                                            iMin2 = Math.max(i5, measuredHeight);
                                        } else {
                                            iMin2 = measuredHeight;
                                        }
                                        i6 = constraintWidget.mMatchConstraintMaxHeight;
                                        if (i6 > 0) {
                                            iMin2 = Math.min(i6, iMin2);
                                        }
                                        if (!z7 && z5) {
                                            iMin = (int) ((iMin2 * constraintWidget.mDimensionRatio) + 0.5f);
                                        } else if (z8 && z6) {
                                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                        }
                                        if (measuredWidth == iMin || measuredHeight != iMin2) {
                                            if (measuredWidth != iMin) {
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                            }
                                            if (measuredHeight != iMin2) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        } else {
                                            measuredWidth2 = iMin;
                                            measuredHeight2 = iMin2;
                                            baseline = baseline2;
                                        }
                                        i7 = -1;
                                    }
                                    if (baseline != i7) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (measuredWidth2 == measure.horizontalDimension || measuredHeight2 != measure.verticalDimension) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    measure.measuredNeedsSolverPass = z10;
                                    if (layoutParams.needsBaseline) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    if (z11 && baseline != -1 && constraintWidget.getBaselineDistance() != baseline) {
                                        measure.measuredNeedsSolverPass = true;
                                    }
                                    measure.measuredWidth = measuredWidth2;
                                    measure.measuredHeight = measuredHeight2;
                                    measure.measuredHasBaseline = z11;
                                    measure.measuredBaseline = baseline;
                                }
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, constraintWidget.getVerticalMargin() + i10, -1);
                                constraintWidget.wrapMeasure[3] = -1;
                                iMakeMeasureSpec2 = childMeasureSpec2;
                            } else {
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                                constraintWidget.wrapMeasure[3] = -2;
                            }
                            iMakeMeasureSpec2 = childMeasureSpec;
                            z2 = true;
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour3 == dimensionBehaviour) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dimensionBehaviour4 == dimensionBehaviour) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                            if (dimensionBehaviour4 != dimensionBehaviour2) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (z3) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z4) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            layoutParams = (LayoutParams) view.getLayoutParams();
                            if (measure.useCurrentDimensions) {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline3 = view.getBaseline();
                                if (z) {
                                    int[] iArr8 = constraintWidget.wrapMeasure;
                                    i2 = 0;
                                    iArr8[0] = measuredWidth;
                                    iArr8[2] = measuredHeight;
                                } else {
                                    i2 = 0;
                                    int[] iArr9 = constraintWidget.wrapMeasure;
                                    iArr9[0] = 0;
                                    iArr9[2] = 0;
                                }
                                if (z2) {
                                    int[] iArr10 = constraintWidget.wrapMeasure;
                                    iArr10[1] = measuredHeight;
                                    iArr10[3] = measuredWidth;
                                } else {
                                    int[] iArr11 = constraintWidget.wrapMeasure;
                                    iArr11[1] = i2;
                                    iArr11[3] = i2;
                                }
                                i3 = constraintWidget.mMatchConstraintMinWidth;
                                if (i3 > 0) {
                                    iMin = Math.max(i3, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i4 = constraintWidget.mMatchConstraintMaxWidth;
                                if (i4 > 0) {
                                    iMin = Math.min(i4, iMin);
                                }
                                i5 = constraintWidget.mMatchConstraintMinHeight;
                                if (i5 > 0) {
                                    iMin2 = Math.max(i5, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i6 = constraintWidget.mMatchConstraintMaxHeight;
                                if (i6 > 0) {
                                    iMin2 = Math.min(i6, iMin2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i7 = -1;
                            } else {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline4 = view.getBaseline();
                                if (z) {
                                    int[] iArr12 = constraintWidget.wrapMeasure;
                                    i2 = 0;
                                    iArr12[0] = measuredWidth;
                                    iArr12[2] = measuredHeight;
                                } else {
                                    i2 = 0;
                                    int[] iArr13 = constraintWidget.wrapMeasure;
                                    iArr13[0] = 0;
                                    iArr13[2] = 0;
                                }
                                if (z2) {
                                    int[] iArr14 = constraintWidget.wrapMeasure;
                                    iArr14[1] = measuredHeight;
                                    iArr14[3] = measuredWidth;
                                } else {
                                    int[] iArr15 = constraintWidget.wrapMeasure;
                                    iArr15[1] = i2;
                                    iArr15[3] = i2;
                                }
                                i3 = constraintWidget.mMatchConstraintMinWidth;
                                if (i3 > 0) {
                                    iMin = Math.max(i3, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i4 = constraintWidget.mMatchConstraintMaxWidth;
                                if (i4 > 0) {
                                    iMin = Math.min(i4, iMin);
                                }
                                i5 = constraintWidget.mMatchConstraintMinHeight;
                                if (i5 > 0) {
                                    iMin2 = Math.max(i5, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i6 = constraintWidget.mMatchConstraintMaxHeight;
                                if (i6 > 0) {
                                    iMin2 = Math.min(i6, iMin2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i7 = -1;
                            }
                            if (baseline != i7) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (measuredWidth2 == measure.horizontalDimension) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            measure.measuredNeedsSolverPass = z10;
                            if (layoutParams.needsBaseline) {
                                z11 = true;
                            } else {
                                z11 = z9;
                            }
                            if (z11) {
                                measure.measuredNeedsSolverPass = true;
                            }
                            measure.measuredWidth = measuredWidth2;
                            measure.measuredHeight = measuredHeight2;
                            measure.measuredHasBaseline = z11;
                            measure.measuredBaseline = baseline;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        constraintWidget.wrapMeasure[3] = i9;
                        z2 = false;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        if (dimensionBehaviour4 != dimensionBehaviour2) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (z3) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z4) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        layoutParams = (LayoutParams) view.getLayoutParams();
                        if (measure.useCurrentDimensions) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline5 = view.getBaseline();
                            if (z) {
                                int[] iArr16 = constraintWidget.wrapMeasure;
                                i2 = 0;
                                iArr16[0] = measuredWidth;
                                iArr16[2] = measuredHeight;
                            } else {
                                i2 = 0;
                                int[] iArr17 = constraintWidget.wrapMeasure;
                                iArr17[0] = 0;
                                iArr17[2] = 0;
                            }
                            if (z2) {
                                int[] iArr18 = constraintWidget.wrapMeasure;
                                iArr18[1] = measuredHeight;
                                iArr18[3] = measuredWidth;
                            } else {
                                int[] iArr19 = constraintWidget.wrapMeasure;
                                iArr19[1] = i2;
                                iArr19[3] = i2;
                            }
                            i3 = constraintWidget.mMatchConstraintMinWidth;
                            if (i3 > 0) {
                                iMin = Math.max(i3, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i4 = constraintWidget.mMatchConstraintMaxWidth;
                            if (i4 > 0) {
                                iMin = Math.min(i4, iMin);
                            }
                            i5 = constraintWidget.mMatchConstraintMinHeight;
                            if (i5 > 0) {
                                iMin2 = Math.max(i5, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i6 = constraintWidget.mMatchConstraintMaxHeight;
                            if (i6 > 0) {
                                iMin2 = Math.min(i6, iMin2);
                            }
                            if (!z7) {
                                if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i7 = -1;
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline6 = view.getBaseline();
                            if (z) {
                                int[] iArr110 = constraintWidget.wrapMeasure;
                                i2 = 0;
                                iArr110[0] = measuredWidth;
                                iArr110[2] = measuredHeight;
                            } else {
                                i2 = 0;
                                int[] iArr111 = constraintWidget.wrapMeasure;
                                iArr111[0] = 0;
                                iArr111[2] = 0;
                            }
                            if (z2) {
                                int[] iArr112 = constraintWidget.wrapMeasure;
                                iArr112[1] = measuredHeight;
                                iArr112[3] = measuredWidth;
                            } else {
                                int[] iArr113 = constraintWidget.wrapMeasure;
                                iArr113[1] = i2;
                                iArr113[3] = i2;
                            }
                            i3 = constraintWidget.mMatchConstraintMinWidth;
                            if (i3 > 0) {
                                iMin = Math.max(i3, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i4 = constraintWidget.mMatchConstraintMaxWidth;
                            if (i4 > 0) {
                                iMin = Math.min(i4, iMin);
                            }
                            i5 = constraintWidget.mMatchConstraintMinHeight;
                            if (i5 > 0) {
                                iMin2 = Math.max(i5, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i6 = constraintWidget.mMatchConstraintMaxHeight;
                            if (i6 > 0) {
                                iMin2 = Math.min(i6, iMin2);
                            }
                            if (!z7) {
                                if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i7 = -1;
                        }
                        if (baseline != i7) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (measuredWidth2 == measure.horizontalDimension) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        measure.measuredNeedsSolverPass = z10;
                        if (layoutParams.needsBaseline) {
                            z11 = true;
                        } else {
                            z11 = z9;
                        }
                        if (z11) {
                            measure.measuredNeedsSolverPass = true;
                        }
                        measure.measuredWidth = measuredWidth2;
                        measure.measuredHeight = measuredHeight2;
                        measure.measuredHasBaseline = z11;
                        measure.measuredBaseline = baseline;
                    }
                }
                z = true;
                i = iArr2[dimensionBehaviour4.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                z2 = false;
                                iMakeMeasureSpec2 = 0;
                            } else {
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                                if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                iArr = constraintWidget.wrapMeasure;
                                iArr[3] = 0;
                                if (measure.useCurrentDimensions) {
                                    if (z12) {
                                    }
                                    if (z12) {
                                    }
                                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                                }
                            }
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour3 == dimensionBehaviour) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dimensionBehaviour4 == dimensionBehaviour) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                            if (dimensionBehaviour4 != dimensionBehaviour2) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (z3) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z4) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            layoutParams = (LayoutParams) view.getLayoutParams();
                            if (measure.useCurrentDimensions) {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline7 = view.getBaseline();
                                if (z) {
                                    int[] iArr114 = constraintWidget.wrapMeasure;
                                    i2 = 0;
                                    iArr114[0] = measuredWidth;
                                    iArr114[2] = measuredHeight;
                                } else {
                                    i2 = 0;
                                    int[] iArr115 = constraintWidget.wrapMeasure;
                                    iArr115[0] = 0;
                                    iArr115[2] = 0;
                                }
                                if (z2) {
                                    int[] iArr116 = constraintWidget.wrapMeasure;
                                    iArr116[1] = measuredHeight;
                                    iArr116[3] = measuredWidth;
                                } else {
                                    int[] iArr117 = constraintWidget.wrapMeasure;
                                    iArr117[1] = i2;
                                    iArr117[3] = i2;
                                }
                                i3 = constraintWidget.mMatchConstraintMinWidth;
                                if (i3 > 0) {
                                    iMin = Math.max(i3, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i4 = constraintWidget.mMatchConstraintMaxWidth;
                                if (i4 > 0) {
                                    iMin = Math.min(i4, iMin);
                                }
                                i5 = constraintWidget.mMatchConstraintMinHeight;
                                if (i5 > 0) {
                                    iMin2 = Math.max(i5, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i6 = constraintWidget.mMatchConstraintMaxHeight;
                                if (i6 > 0) {
                                    iMin2 = Math.min(i6, iMin2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i7 = -1;
                            } else {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline8 = view.getBaseline();
                                if (z) {
                                    int[] iArr118 = constraintWidget.wrapMeasure;
                                    i2 = 0;
                                    iArr118[0] = measuredWidth;
                                    iArr118[2] = measuredHeight;
                                } else {
                                    i2 = 0;
                                    int[] iArr119 = constraintWidget.wrapMeasure;
                                    iArr119[0] = 0;
                                    iArr119[2] = 0;
                                }
                                if (z2) {
                                    int[] iArr1110 = constraintWidget.wrapMeasure;
                                    iArr1110[1] = measuredHeight;
                                    iArr1110[3] = measuredWidth;
                                } else {
                                    int[] iArr1111 = constraintWidget.wrapMeasure;
                                    iArr1111[1] = i2;
                                    iArr1111[3] = i2;
                                }
                                i3 = constraintWidget.mMatchConstraintMinWidth;
                                if (i3 > 0) {
                                    iMin = Math.max(i3, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i4 = constraintWidget.mMatchConstraintMaxWidth;
                                if (i4 > 0) {
                                    iMin = Math.min(i4, iMin);
                                }
                                i5 = constraintWidget.mMatchConstraintMinHeight;
                                if (i5 > 0) {
                                    iMin2 = Math.max(i5, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i6 = constraintWidget.mMatchConstraintMaxHeight;
                                if (i6 > 0) {
                                    iMin2 = Math.min(i6, iMin2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i7 = -1;
                            }
                            if (baseline != i7) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (measuredWidth2 == measure.horizontalDimension) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            measure.measuredNeedsSolverPass = z10;
                            if (layoutParams.needsBaseline) {
                                z11 = true;
                            } else {
                                z11 = z9;
                            }
                            if (z11) {
                                measure.measuredNeedsSolverPass = true;
                            }
                            measure.measuredWidth = measuredWidth2;
                            measure.measuredHeight = measuredHeight2;
                            measure.measuredHasBaseline = z11;
                            measure.measuredBaseline = baseline;
                        }
                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, constraintWidget.getVerticalMargin() + i10, -1);
                        constraintWidget.wrapMeasure[3] = -1;
                        iMakeMeasureSpec2 = childMeasureSpec2;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                        constraintWidget.wrapMeasure[3] = -2;
                    }
                    iMakeMeasureSpec2 = childMeasureSpec;
                    z2 = true;
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if (dimensionBehaviour4 != dimensionBehaviour2) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dimensionBehaviour3 != dimensionBehaviour2) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (z3) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z4) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if (measure.useCurrentDimensions) {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline9 = view.getBaseline();
                        if (z) {
                            int[] iArr1112 = constraintWidget.wrapMeasure;
                            i2 = 0;
                            iArr1112[0] = measuredWidth;
                            iArr1112[2] = measuredHeight;
                        } else {
                            i2 = 0;
                            int[] iArr1113 = constraintWidget.wrapMeasure;
                            iArr1113[0] = 0;
                            iArr1113[2] = 0;
                        }
                        if (z2) {
                            int[] iArr1114 = constraintWidget.wrapMeasure;
                            iArr1114[1] = measuredHeight;
                            iArr1114[3] = measuredWidth;
                        } else {
                            int[] iArr1115 = constraintWidget.wrapMeasure;
                            iArr1115[1] = i2;
                            iArr1115[3] = i2;
                        }
                        i3 = constraintWidget.mMatchConstraintMinWidth;
                        if (i3 > 0) {
                            iMin = Math.max(i3, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i4 = constraintWidget.mMatchConstraintMaxWidth;
                        if (i4 > 0) {
                            iMin = Math.min(i4, iMin);
                        }
                        i5 = constraintWidget.mMatchConstraintMinHeight;
                        if (i5 > 0) {
                            iMin2 = Math.max(i5, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i6 = constraintWidget.mMatchConstraintMaxHeight;
                        if (i6 > 0) {
                            iMin2 = Math.min(i6, iMin2);
                        }
                        if (!z7) {
                            if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        } else if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                        if (measuredWidth == iMin) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i7 = -1;
                    } else {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline10 = view.getBaseline();
                        if (z) {
                            int[] iArr1116 = constraintWidget.wrapMeasure;
                            i2 = 0;
                            iArr1116[0] = measuredWidth;
                            iArr1116[2] = measuredHeight;
                        } else {
                            i2 = 0;
                            int[] iArr1117 = constraintWidget.wrapMeasure;
                            iArr1117[0] = 0;
                            iArr1117[2] = 0;
                        }
                        if (z2) {
                            int[] iArr1118 = constraintWidget.wrapMeasure;
                            iArr1118[1] = measuredHeight;
                            iArr1118[3] = measuredWidth;
                        } else {
                            int[] iArr1119 = constraintWidget.wrapMeasure;
                            iArr1119[1] = i2;
                            iArr1119[3] = i2;
                        }
                        i3 = constraintWidget.mMatchConstraintMinWidth;
                        if (i3 > 0) {
                            iMin = Math.max(i3, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i4 = constraintWidget.mMatchConstraintMaxWidth;
                        if (i4 > 0) {
                            iMin = Math.min(i4, iMin);
                        }
                        i5 = constraintWidget.mMatchConstraintMinHeight;
                        if (i5 > 0) {
                            iMin2 = Math.max(i5, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i6 = constraintWidget.mMatchConstraintMaxHeight;
                        if (i6 > 0) {
                            iMin2 = Math.min(i6, iMin2);
                        }
                        if (!z7) {
                            if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        } else if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                        if (measuredWidth == iMin) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i7 = -1;
                    }
                    if (baseline != i7) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (measuredWidth2 == measure.horizontalDimension) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    measure.measuredNeedsSolverPass = z10;
                    if (layoutParams.needsBaseline) {
                        z11 = true;
                    } else {
                        z11 = z9;
                    }
                    if (z11) {
                        measure.measuredNeedsSolverPass = true;
                    }
                    measure.measuredWidth = measuredWidth2;
                    measure.measuredHeight = measuredHeight2;
                    measure.measuredHasBaseline = z11;
                    measure.measuredBaseline = baseline;
                }
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                constraintWidget.wrapMeasure[3] = i9;
                z2 = false;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dimensionBehaviour4 == dimensionBehaviour) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour4 != dimensionBehaviour2) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (measure.useCurrentDimensions) {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline11 = view.getBaseline();
                    if (z) {
                        int[] iArr11110 = constraintWidget.wrapMeasure;
                        i2 = 0;
                        iArr11110[0] = measuredWidth;
                        iArr11110[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr11111 = constraintWidget.wrapMeasure;
                        iArr11111[0] = 0;
                        iArr11111[2] = 0;
                    }
                    if (z2) {
                        int[] iArr11112 = constraintWidget.wrapMeasure;
                        iArr11112[1] = measuredHeight;
                        iArr11112[3] = measuredWidth;
                    } else {
                        int[] iArr11113 = constraintWidget.wrapMeasure;
                        iArr11113[1] = i2;
                        iArr11113[3] = i2;
                    }
                    i3 = constraintWidget.mMatchConstraintMinWidth;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = constraintWidget.mMatchConstraintMaxWidth;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = constraintWidget.mMatchConstraintMinHeight;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = constraintWidget.mMatchConstraintMaxHeight;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!z7) {
                        if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i7 = -1;
                } else {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline12 = view.getBaseline();
                    if (z) {
                        int[] iArr11114 = constraintWidget.wrapMeasure;
                        i2 = 0;
                        iArr11114[0] = measuredWidth;
                        iArr11114[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr11115 = constraintWidget.wrapMeasure;
                        iArr11115[0] = 0;
                        iArr11115[2] = 0;
                    }
                    if (z2) {
                        int[] iArr11116 = constraintWidget.wrapMeasure;
                        iArr11116[1] = measuredHeight;
                        iArr11116[3] = measuredWidth;
                    } else {
                        int[] iArr11117 = constraintWidget.wrapMeasure;
                        iArr11117[1] = i2;
                        iArr11117[3] = i2;
                    }
                    i3 = constraintWidget.mMatchConstraintMinWidth;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = constraintWidget.mMatchConstraintMaxWidth;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = constraintWidget.mMatchConstraintMinHeight;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = constraintWidget.mMatchConstraintMaxHeight;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!z7) {
                        if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i7 = -1;
                }
                if (baseline != i7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (measuredWidth2 == measure.horizontalDimension) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                measure.measuredNeedsSolverPass = z10;
                if (layoutParams.needsBaseline) {
                    z11 = true;
                } else {
                    z11 = z9;
                }
                if (z11) {
                    measure.measuredNeedsSolverPass = true;
                }
                measure.measuredWidth = measuredWidth2;
                measure.measuredHeight = measuredHeight2;
                measure.measuredHasBaseline = z11;
                measure.measuredBaseline = baseline;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            constraintWidget.wrapMeasure[2] = i8;
            iMakeMeasureSpec = iMakeMeasureSpec3;
            z = false;
            i = iArr2[dimensionBehaviour4.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            z2 = false;
                            iMakeMeasureSpec2 = 0;
                        } else {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                            if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            iArr = constraintWidget.wrapMeasure;
                            iArr[3] = 0;
                            if (measure.useCurrentDimensions) {
                                if (z12) {
                                }
                                if (z12) {
                                }
                                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                            }
                        }
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        if (dimensionBehaviour4 != dimensionBehaviour2) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (z3) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z4) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        layoutParams = (LayoutParams) view.getLayoutParams();
                        if (measure.useCurrentDimensions) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline13 = view.getBaseline();
                            if (z) {
                                int[] iArr11118 = constraintWidget.wrapMeasure;
                                i2 = 0;
                                iArr11118[0] = measuredWidth;
                                iArr11118[2] = measuredHeight;
                            } else {
                                i2 = 0;
                                int[] iArr11119 = constraintWidget.wrapMeasure;
                                iArr11119[0] = 0;
                                iArr11119[2] = 0;
                            }
                            if (z2) {
                                int[] iArr111110 = constraintWidget.wrapMeasure;
                                iArr111110[1] = measuredHeight;
                                iArr111110[3] = measuredWidth;
                            } else {
                                int[] iArr111111 = constraintWidget.wrapMeasure;
                                iArr111111[1] = i2;
                                iArr111111[3] = i2;
                            }
                            i3 = constraintWidget.mMatchConstraintMinWidth;
                            if (i3 > 0) {
                                iMin = Math.max(i3, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i4 = constraintWidget.mMatchConstraintMaxWidth;
                            if (i4 > 0) {
                                iMin = Math.min(i4, iMin);
                            }
                            i5 = constraintWidget.mMatchConstraintMinHeight;
                            if (i5 > 0) {
                                iMin2 = Math.max(i5, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i6 = constraintWidget.mMatchConstraintMaxHeight;
                            if (i6 > 0) {
                                iMin2 = Math.min(i6, iMin2);
                            }
                            if (!z7) {
                                if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i7 = -1;
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline14 = view.getBaseline();
                            if (z) {
                                int[] iArr111112 = constraintWidget.wrapMeasure;
                                i2 = 0;
                                iArr111112[0] = measuredWidth;
                                iArr111112[2] = measuredHeight;
                            } else {
                                i2 = 0;
                                int[] iArr111113 = constraintWidget.wrapMeasure;
                                iArr111113[0] = 0;
                                iArr111113[2] = 0;
                            }
                            if (z2) {
                                int[] iArr111114 = constraintWidget.wrapMeasure;
                                iArr111114[1] = measuredHeight;
                                iArr111114[3] = measuredWidth;
                            } else {
                                int[] iArr111115 = constraintWidget.wrapMeasure;
                                iArr111115[1] = i2;
                                iArr111115[3] = i2;
                            }
                            i3 = constraintWidget.mMatchConstraintMinWidth;
                            if (i3 > 0) {
                                iMin = Math.max(i3, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i4 = constraintWidget.mMatchConstraintMaxWidth;
                            if (i4 > 0) {
                                iMin = Math.min(i4, iMin);
                            }
                            i5 = constraintWidget.mMatchConstraintMinHeight;
                            if (i5 > 0) {
                                iMin2 = Math.max(i5, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i6 = constraintWidget.mMatchConstraintMaxHeight;
                            if (i6 > 0) {
                                iMin2 = Math.min(i6, iMin2);
                            }
                            if (!z7) {
                                if (z8) {
                                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i7 = -1;
                        }
                        if (baseline != i7) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (measuredWidth2 == measure.horizontalDimension) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        measure.measuredNeedsSolverPass = z10;
                        if (layoutParams.needsBaseline) {
                            z11 = true;
                        } else {
                            z11 = z9;
                        }
                        if (z11) {
                            measure.measuredNeedsSolverPass = true;
                        }
                        measure.measuredWidth = measuredWidth2;
                        measure.measuredHeight = measuredHeight2;
                        measure.measuredHasBaseline = z11;
                        measure.measuredBaseline = baseline;
                    }
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, constraintWidget.getVerticalMargin() + i10, -1);
                    constraintWidget.wrapMeasure[3] = -1;
                    iMakeMeasureSpec2 = childMeasureSpec2;
                } else {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.layoutHeightSpec, i10, -2);
                    constraintWidget.wrapMeasure[3] = -2;
                }
                iMakeMeasureSpec2 = childMeasureSpec;
                z2 = true;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dimensionBehaviour4 == dimensionBehaviour) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour4 != dimensionBehaviour2) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (measure.useCurrentDimensions) {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline15 = view.getBaseline();
                    if (z) {
                        int[] iArr111116 = constraintWidget.wrapMeasure;
                        i2 = 0;
                        iArr111116[0] = measuredWidth;
                        iArr111116[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr111117 = constraintWidget.wrapMeasure;
                        iArr111117[0] = 0;
                        iArr111117[2] = 0;
                    }
                    if (z2) {
                        int[] iArr111118 = constraintWidget.wrapMeasure;
                        iArr111118[1] = measuredHeight;
                        iArr111118[3] = measuredWidth;
                    } else {
                        int[] iArr111119 = constraintWidget.wrapMeasure;
                        iArr111119[1] = i2;
                        iArr111119[3] = i2;
                    }
                    i3 = constraintWidget.mMatchConstraintMinWidth;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = constraintWidget.mMatchConstraintMaxWidth;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = constraintWidget.mMatchConstraintMinHeight;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = constraintWidget.mMatchConstraintMaxHeight;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!z7) {
                        if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i7 = -1;
                } else {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline16 = view.getBaseline();
                    if (z) {
                        int[] iArr1111110 = constraintWidget.wrapMeasure;
                        i2 = 0;
                        iArr1111110[0] = measuredWidth;
                        iArr1111110[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        int[] iArr1111111 = constraintWidget.wrapMeasure;
                        iArr1111111[0] = 0;
                        iArr1111111[2] = 0;
                    }
                    if (z2) {
                        int[] iArr1111112 = constraintWidget.wrapMeasure;
                        iArr1111112[1] = measuredHeight;
                        iArr1111112[3] = measuredWidth;
                    } else {
                        int[] iArr1111113 = constraintWidget.wrapMeasure;
                        iArr1111113[1] = i2;
                        iArr1111113[3] = i2;
                    }
                    i3 = constraintWidget.mMatchConstraintMinWidth;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = constraintWidget.mMatchConstraintMaxWidth;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = constraintWidget.mMatchConstraintMinHeight;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = constraintWidget.mMatchConstraintMaxHeight;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!z7) {
                        if (z8) {
                            iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i7 = -1;
                }
                if (baseline != i7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (measuredWidth2 == measure.horizontalDimension) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                measure.measuredNeedsSolverPass = z10;
                if (layoutParams.needsBaseline) {
                    z11 = true;
                } else {
                    z11 = z9;
                }
                if (z11) {
                    measure.measuredNeedsSolverPass = true;
                }
                measure.measuredWidth = measuredWidth2;
                measure.measuredHeight = measuredHeight2;
                measure.measuredHasBaseline = z11;
                measure.measuredBaseline = baseline;
            }
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            constraintWidget.wrapMeasure[3] = i9;
            z2 = false;
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour3 == dimensionBehaviour) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dimensionBehaviour4 == dimensionBehaviour) {
                z4 = true;
            } else {
                z4 = false;
            }
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z3) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            layoutParams = (LayoutParams) view.getLayoutParams();
            if (measure.useCurrentDimensions) {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline17 = view.getBaseline();
                if (z) {
                    int[] iArr1111114 = constraintWidget.wrapMeasure;
                    i2 = 0;
                    iArr1111114[0] = measuredWidth;
                    iArr1111114[2] = measuredHeight;
                } else {
                    i2 = 0;
                    int[] iArr1111115 = constraintWidget.wrapMeasure;
                    iArr1111115[0] = 0;
                    iArr1111115[2] = 0;
                }
                if (z2) {
                    int[] iArr1111116 = constraintWidget.wrapMeasure;
                    iArr1111116[1] = measuredHeight;
                    iArr1111116[3] = measuredWidth;
                } else {
                    int[] iArr1111117 = constraintWidget.wrapMeasure;
                    iArr1111117[1] = i2;
                    iArr1111117[3] = i2;
                }
                i3 = constraintWidget.mMatchConstraintMinWidth;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = constraintWidget.mMatchConstraintMaxWidth;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = constraintWidget.mMatchConstraintMinHeight;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = constraintWidget.mMatchConstraintMaxHeight;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (!z7) {
                    if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                } else if (z8) {
                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline18 = view.getBaseline();
                if (z) {
                    int[] iArr1111118 = constraintWidget.wrapMeasure;
                    i2 = 0;
                    iArr1111118[0] = measuredWidth;
                    iArr1111118[2] = measuredHeight;
                } else {
                    i2 = 0;
                    int[] iArr1111119 = constraintWidget.wrapMeasure;
                    iArr1111119[0] = 0;
                    iArr1111119[2] = 0;
                }
                if (z2) {
                    int[] iArr11111110 = constraintWidget.wrapMeasure;
                    iArr11111110[1] = measuredHeight;
                    iArr11111110[3] = measuredWidth;
                } else {
                    int[] iArr11111111 = constraintWidget.wrapMeasure;
                    iArr11111111[1] = i2;
                    iArr11111111[3] = i2;
                }
                i3 = constraintWidget.mMatchConstraintMinWidth;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = constraintWidget.mMatchConstraintMaxWidth;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = constraintWidget.mMatchConstraintMinHeight;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = constraintWidget.mMatchConstraintMaxHeight;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (!z7) {
                    if (z8) {
                        iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                } else if (z8) {
                    iMin2 = (int) ((iMin / constraintWidget.mDimensionRatio) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            }
            if (baseline != i7) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (measuredWidth2 == measure.horizontalDimension) {
                z10 = true;
            } else {
                z10 = true;
            }
            measure.measuredNeedsSolverPass = z10;
            if (layoutParams.needsBaseline) {
                z11 = true;
            } else {
                z11 = z9;
            }
            if (z11) {
                measure.measuredNeedsSolverPass = true;
            }
            measure.measuredWidth = measuredWidth2;
            measure.measuredHeight = measuredHeight2;
            measure.measuredHasBaseline = z11;
            measure.measuredBaseline = baseline;
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).widget;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2567R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == C2567R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C2567R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        float f;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        int i;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor.Type type3;
        int i2;
        ConstraintAnchor.Type type4;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor.Type type5;
        ConstraintAnchor.Type type6;
        int i3;
        int i4;
        ConstraintWidget constraintWidget5;
        ConstraintAnchor.Type type7;
        int i5;
        int i6;
        ConstraintAnchor.Type type8;
        int i7;
        layoutParams.validate();
        layoutParams.helped = false;
        constraintWidget.setVisibility(view.getVisibility());
        if (layoutParams.isInPlaceholder) {
            constraintWidget.setInPlaceholder(true);
            constraintWidget.setVisibility(8);
        }
        constraintWidget.setCompanionWidget(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).resolveRtl(constraintWidget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams.isGuideline) {
            androidx.constraintlayout.solver.widgets.Guideline guideline = (androidx.constraintlayout.solver.widgets.Guideline) constraintWidget;
            int i8 = layoutParams.resolvedGuideBegin;
            int i9 = layoutParams.resolvedGuideEnd;
            float f2 = layoutParams.resolvedGuidePercent;
            if (f2 != -1.0f) {
                guideline.setGuidePercent(f2);
                return;
            } else if (i8 != -1) {
                guideline.setGuideBegin(i8);
                return;
            } else {
                if (i9 != -1) {
                    guideline.setGuideEnd(i9);
                    return;
                }
                return;
            }
        }
        int i10 = layoutParams.resolvedLeftToLeft;
        int i11 = layoutParams.resolvedLeftToRight;
        int i12 = layoutParams.resolvedRightToLeft;
        int i13 = layoutParams.resolvedRightToRight;
        int i14 = layoutParams.resolveGoneLeftMargin;
        int i15 = layoutParams.resolveGoneRightMargin;
        float f3 = layoutParams.resolvedHorizontalBias;
        int i16 = layoutParams.circleConstraint;
        if (i16 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i16);
            if (constraintWidget6 != null) {
                constraintWidget.connectCircularConstraint(constraintWidget6, layoutParams.circleAngle, layoutParams.circleRadius);
            }
        } else {
            if (i10 != -1) {
                constraintWidget2 = sparseArray.get(i10);
                if (constraintWidget2 != null) {
                    type2 = ConstraintAnchor.Type.LEFT;
                    type = type2;
                    f = f3;
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    constraintWidget.immediateConnect(type, constraintWidget2, type2, i, i14);
                } else {
                    f = f3;
                }
            } else {
                f = f3;
                if (i11 != -1 && (constraintWidget2 = sparseArray.get(i11)) != null) {
                    type = ConstraintAnchor.Type.LEFT;
                    type2 = ConstraintAnchor.Type.RIGHT;
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    constraintWidget.immediateConnect(type, constraintWidget2, type2, i, i14);
                }
            }
            if (i12 != -1) {
                constraintWidget3 = sparseArray.get(i12);
                if (constraintWidget3 != null) {
                    type4 = ConstraintAnchor.Type.RIGHT;
                    type3 = ConstraintAnchor.Type.LEFT;
                    i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    constraintWidget.immediateConnect(type4, constraintWidget3, type3, i2, i15);
                }
            } else if (i13 != -1 && (constraintWidget3 = sparseArray.get(i13)) != null) {
                type3 = ConstraintAnchor.Type.RIGHT;
                i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                type4 = type3;
                constraintWidget.immediateConnect(type4, constraintWidget3, type3, i2, i15);
            }
            int i17 = layoutParams.topToTop;
            if (i17 != -1) {
                constraintWidget4 = sparseArray.get(i17);
                if (constraintWidget4 != null) {
                    type6 = ConstraintAnchor.Type.TOP;
                    i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i4 = layoutParams.goneTopMargin;
                    type5 = type6;
                    constraintWidget.immediateConnect(type5, constraintWidget4, type6, i3, i4);
                }
            } else {
                int i18 = layoutParams.topToBottom;
                if (i18 != -1 && (constraintWidget4 = sparseArray.get(i18)) != null) {
                    type5 = ConstraintAnchor.Type.TOP;
                    type6 = ConstraintAnchor.Type.BOTTOM;
                    i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i4 = layoutParams.goneTopMargin;
                    constraintWidget.immediateConnect(type5, constraintWidget4, type6, i3, i4);
                }
            }
            int i19 = layoutParams.bottomToTop;
            if (i19 != -1) {
                constraintWidget5 = sparseArray.get(i19);
                if (constraintWidget5 != null) {
                    type8 = ConstraintAnchor.Type.BOTTOM;
                    type7 = ConstraintAnchor.Type.TOP;
                    i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i6 = layoutParams.goneBottomMargin;
                    constraintWidget.immediateConnect(type8, constraintWidget5, type7, i5, i6);
                }
            } else {
                int i20 = layoutParams.bottomToBottom;
                if (i20 != -1 && (constraintWidget5 = sparseArray.get(i20)) != null) {
                    type7 = ConstraintAnchor.Type.BOTTOM;
                    i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i6 = layoutParams.goneBottomMargin;
                    type8 = type7;
                    constraintWidget.immediateConnect(type8, constraintWidget5, type7, i5, i6);
                }
            }
            int i21 = layoutParams.baselineToBaseline;
            if (i21 != -1) {
                View view2 = this.mChildrenByIds.get(i21);
                ConstraintWidget constraintWidget7 = sparseArray.get(layoutParams.baselineToBaseline);
                if (constraintWidget7 != null && view2 != null && (view2.getLayoutParams() instanceof LayoutParams)) {
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams.needsBaseline = true;
                    layoutParams2.needsBaseline = true;
                    ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BASELINE;
                    constraintWidget.getAnchor(type9).connect(constraintWidget7.getAnchor(type9), 0, -1, true);
                    constraintWidget.setHasBaseline(true);
                    layoutParams2.widget.setHasBaseline(true);
                    constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).reset();
                    constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
                }
            }
            float f4 = f;
            if (f4 >= 0.0f) {
                constraintWidget.setHorizontalBiasPercent(f4);
            }
            float f5 = layoutParams.verticalBias;
            if (f5 >= 0.0f) {
                constraintWidget.setVerticalBiasPercent(f5);
            }
        }
        if (z && ((i7 = layoutParams.editorAbsoluteX) != -1 || layoutParams.editorAbsoluteY != -1)) {
            constraintWidget.setOrigin(i7, layoutParams.editorAbsoluteY);
        }
        if (layoutParams.horizontalDimensionFixed) {
            constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setWidth(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            constraintWidget.setHorizontalDimensionBehaviour(layoutParams.constrainedWidth ? ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT : ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.setWidth(0);
        }
        if (layoutParams.verticalDimensionFixed) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            constraintWidget.setVerticalDimensionBehaviour(layoutParams.constrainedHeight ? ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT : ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.setHeight(0);
        }
        constraintWidget.setDimensionRatio(layoutParams.dimensionRatio);
        constraintWidget.setHorizontalWeight(layoutParams.horizontalWeight);
        constraintWidget.setVerticalWeight(layoutParams.verticalWeight);
        constraintWidget.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
        constraintWidget.setVerticalChainStyle(layoutParams.verticalChainStyle);
        constraintWidget.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
        constraintWidget.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(C1262Tc.f3278g);
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || zIsInEditMode) && !layoutParams.isInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.solver.widgets.Guideline guideline = new androidx.constraintlayout.solver.widgets.Guideline();
            layoutParams.widget = guideline;
            layoutParams.isGuideline = true;
            guideline.setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.paddingHeight;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + measurer.paddingWidth, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0);
        int i6 = iResolveSizeAndState & ViewCompat.MEASURED_SIZE_MASK;
        int i7 = iResolveSizeAndState2 & ViewCompat.MEASURED_SIZE_MASK;
        int iMin = Math.min(this.mMaxWidth, i6);
        int iMin2 = Math.min(this.mMaxHeight, i7);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i4 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfos(i2, i3, iMax2, iMax3, paddingWidth, i4);
        int iMax4 = Math.max(0, getPaddingStart());
        int iMax5 = Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = isRtl() ? iMax5 : iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i5, mode2, i6);
        constraintWidgetContainer.measure(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax, iMax2);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[PHI: r9
      0x0027: PHI (r9v2 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r9v1 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour)
      (r9v8 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:13:0x0030, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[PHI: r2
      0x0047: PHI (r2v2 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v1 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v4 androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:24:0x0050, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.paddingHeight;
        int i6 = measurer.paddingWidth;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i2 = Math.min(this.mMaxWidth - i6, i2);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != constraintWidgetContainer.getWidth() || i4 != constraintWidgetContainer.getHeight()) {
            constraintWidgetContainer.invalidateMeasures();
        }
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        constraintWidgetContainer.setMaxWidth(this.mMaxWidth - i6);
        constraintWidgetContainer.setMaxHeight(this.mMaxHeight - i5);
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setHeight(i4);
        constraintWidgetContainer.setMinWidth(this.mMinWidth - i6);
        constraintWidgetContainer.setMinHeight(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = Optimizer.OPTIMIZATION_STANDARD;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }
}
