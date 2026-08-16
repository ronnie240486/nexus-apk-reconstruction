package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.C0786MA;
import p000.C0978P9;
import p000.C1023Ps;
import p000.C1313UP;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;

    /* JADX INFO: renamed from: mX */
    protected int f10086mX;

    /* JADX INFO: renamed from: mY */
    protected int f10087mY;
    public boolean measured;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
    public static /* synthetic */ class C25561 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f10088x4c44d048;

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f10089xdde91696;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f10089xdde91696 = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10089xdde91696[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10089xdde91696[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10089xdde91696[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f10088x4c44d048 = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10088x4c44d048[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f10086mX = 0;
        this.f10087mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019b  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:189:0x02fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:190:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0300  */
    /* JADX WARN: Code duplicated, block: B:199:0x0310  */
    /* JADX WARN: Code duplicated, block: B:201:0x032a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0341  */
    /* JADX WARN: Code duplicated, block: B:211:0x0347  */
    /* JADX WARN: Code duplicated, block: B:215:0x0350  */
    /* JADX WARN: Code duplicated, block: B:235:0x037a  */
    /* JADX WARN: Code duplicated, block: B:243:0x0398  */
    /* JADX WARN: Code duplicated, block: B:245:0x039c  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:269:0x03db A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:271:0x03ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x041f  */
    /* JADX WARN: Code duplicated, block: B:298:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    /* JADX WARN: Code duplicated, block: B:79:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, int i5, int i6, int i7, int i8, float f2, boolean z10) {
        int i9;
        boolean z11;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        SolverVariable solverVariableCreateObjectVariable;
        ConstraintWidget constraintWidget;
        ConstraintAnchor.Type type3;
        int i15;
        boolean z13;
        ConstraintAnchor constraintAnchor3;
        int i16;
        boolean z14;
        boolean z15;
        int i17;
        int i18;
        boolean z16;
        boolean z17;
        boolean z18;
        int i19;
        ConstraintWidget constraintWidget2;
        int i20;
        LinearSystem linearSystem2;
        SolverVariable solverVariable3;
        int i21;
        int iMin2;
        int i22;
        SolverVariable solverVariable4;
        int i23;
        int margin;
        ConstraintWidget constraintWidget3;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z19;
        boolean z20;
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i30 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i30++;
        }
        int i31 = z6 ? 3 : i5;
        int i32 = C25561.f10089xdde91696[dimensionBehaviour.ordinal()];
        if (i32 != 1 && i32 != 2 && i32 != 3 && i32 == 4) {
            i9 = i31;
            if (i9 != 4) {
                z11 = true;
            }
            if (this.mVisibility == 8) {
                iMin = 0;
                z11 = false;
            } else {
                iMin = i2;
            }
            if (z10) {
                if (zIsConnected && !zIsConnected2 && !zIsConnected3) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable2, i);
                } else if (zIsConnected && !zIsConnected2) {
                    i10 = 8;
                    linearSystem.addEquality(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), 8);
                }
                i10 = 8;
            } else {
                i10 = 8;
            }
            if (!z11) {
                if (i30 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i8 > 0) {
                        iMax = Math.min(i8, iMax);
                    }
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMax, 8);
                    i14 = i7;
                    i12 = i8;
                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                    solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                    z12 = false;
                    i13 = i30;
                } else {
                    if (i7 == -2) {
                        i11 = iMin;
                    } else {
                        i11 = i7;
                    }
                    if (i8 == -2) {
                        i12 = iMin;
                    } else {
                        i12 = i8;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i11 > 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i11, 8);
                        iMin = Math.max(iMin, i11);
                    }
                    if (i12 > 0) {
                        if (z2 || i9 != 1) {
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i12, 8);
                        }
                        iMin = Math.min(iMin, i12);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 8);
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 5);
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 8);
                        }
                        i14 = i11;
                    } else if (i9 == 2) {
                        type = constraintAnchor.getType();
                        type2 = ConstraintAnchor.Type.TOP;
                        if (type != type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                            constraintWidget = this.mParent;
                            type3 = ConstraintAnchor.Type.BOTTOM;
                        } else {
                            solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                            constraintWidget = this.mParent;
                            type3 = ConstraintAnchor.Type.RIGHT;
                        }
                        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintWidget.getAnchor(type3));
                        SolverVariable solverVariable5 = solverVariableCreateObjectVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        int i33 = i11;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        i13 = i30 == true ? 1 : 0;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                        linearSystem.addConstraint(arrayRowCreateRow.createRowDimensionRatio(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable6, solverVariable5, f2));
                        z4 = z4;
                        i14 = i33;
                        z12 = false;
                    } else {
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                        int i34 = i11;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        i13 = i30;
                        i14 = i34;
                        z12 = z11;
                        z4 = true;
                    }
                }
                if (z10 || z7) {
                    i15 = 8;
                    if (i13 >= 2 && z2 && z4) {
                        r10.addGreaterThan(solverVariableCreateObjectVariable2, solverVariable, 0, i15);
                        boolean z21 = z || this.mBaseline.mTarget == null;
                        if (z || (constraintAnchor3 = this.mBaseline.mTarget) == null) {
                            z13 = z21;
                        } else {
                            ConstraintWidget constraintWidget4 = constraintAnchor3.mOwner;
                            if (constraintWidget4.mDimensionRatio != 0.0f) {
                                DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.mListDimensionBehaviors;
                                DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable3, 0, i15);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ((zIsConnected || zIsConnected2 || zIsConnected3) && (!zIsConnected || zIsConnected2)) {
                    if (zIsConnected || !zIsConnected2) {
                        if (zIsConnected && zIsConnected2) {
                            ConstraintWidget constraintWidget5 = constraintAnchor.mTarget.mOwner;
                            ConstraintWidget constraintWidget6 = constraintAnchor2.mTarget.mOwner;
                            ConstraintWidget parent = getParent();
                            int i35 = 6;
                            if (z12) {
                                if (i9 == 0) {
                                    if (i12 == 0 && i14 == 0) {
                                        i28 = 8;
                                        i29 = 8;
                                        z19 = false;
                                        z20 = true;
                                    } else {
                                        i28 = 5;
                                        i29 = 5;
                                        z19 = true;
                                        z20 = false;
                                    }
                                    if ((constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier)) {
                                        z15 = z19;
                                        z16 = z20;
                                        z14 = false;
                                        i17 = 4;
                                        i18 = i28;
                                        i16 = 6;
                                    } else {
                                        z15 = z19;
                                        z16 = z20;
                                        i18 = i28;
                                        i17 = i29;
                                        i16 = 6;
                                        z14 = false;
                                    }
                                } else if (i9 == 1) {
                                    i16 = 6;
                                    z14 = true;
                                    z15 = true;
                                    i17 = 4;
                                    i18 = 8;
                                    z16 = false;
                                } else if (i9 == 3) {
                                    if (this.mResolvedDimensionRatioSide == -1) {
                                        if (z8) {
                                            i16 = z2 ? 5 : 4;
                                        } else {
                                            i16 = 8;
                                        }
                                        z14 = true;
                                        z15 = true;
                                        i17 = 5;
                                        i18 = 8;
                                    } else if (z6) {
                                        if (i6 == 2 || i6 == 1) {
                                            i26 = 5;
                                            i27 = 4;
                                        } else {
                                            i26 = 8;
                                            i27 = 5;
                                        }
                                        i18 = i26;
                                        i17 = i27;
                                        i16 = 6;
                                        z14 = true;
                                        z15 = true;
                                    } else {
                                        if (i12 > 0) {
                                            i16 = 6;
                                            z14 = true;
                                            z15 = true;
                                            i17 = 5;
                                        } else if (i12 != 0 || i14 != 0) {
                                            i16 = 6;
                                            z14 = true;
                                            z15 = true;
                                            i17 = 4;
                                        } else if (z8) {
                                            i18 = (constraintWidget5 == parent || constraintWidget6 == parent) ? 5 : 4;
                                            i16 = 6;
                                            z14 = true;
                                            z15 = true;
                                            i17 = 4;
                                        } else {
                                            i16 = 6;
                                            z14 = true;
                                            z15 = true;
                                            i17 = 8;
                                        }
                                        i18 = 5;
                                    }
                                    z16 = true;
                                } else {
                                    i16 = 6;
                                    z14 = false;
                                    z15 = false;
                                }
                                if (z14 || solverVariableCreateObjectVariable4 != solverVariableCreateObjectVariable5 || constraintWidget5 == parent) {
                                    z17 = z14;
                                    z18 = true;
                                } else {
                                    z17 = false;
                                    z18 = false;
                                }
                                if (z15) {
                                    if (this.mVisibility == 8) {
                                        i25 = 4;
                                    } else {
                                        i25 = i16;
                                    }
                                    i19 = i9;
                                    constraintWidget2 = parent;
                                    i20 = 8;
                                    linearSystem.addCentering(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable3, constraintAnchor2.getMargin(), i25);
                                } else {
                                    i19 = i9;
                                    constraintWidget2 = parent;
                                    i20 = 8;
                                }
                                if (this.mVisibility == i20) {
                                    return;
                                }
                                if (z17) {
                                    if (z2 || solverVariableCreateObjectVariable4 == solverVariableCreateObjectVariable5 || z12 || !((constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier))) {
                                        i24 = i18;
                                    } else {
                                        i24 = 6;
                                    }
                                    linearSystem2 = linearSystem;
                                    solverVariable3 = solverVariableCreateObjectVariable2;
                                    i21 = 8;
                                    linearSystem2.addGreaterThan(solverVariable3, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), i24);
                                    linearSystem2.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, -constraintAnchor2.getMargin(), i24);
                                    i18 = i24;
                                } else {
                                    linearSystem2 = linearSystem;
                                    solverVariable3 = solverVariableCreateObjectVariable2;
                                    i21 = 8;
                                }
                                if (z2 || !z9 || (constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier)) {
                                    iMin2 = i17;
                                    i22 = i18;
                                } else {
                                    iMin2 = 6;
                                    i22 = 6;
                                    z18 = true;
                                }
                                if (z18) {
                                    if (z16 || (z8 && !z3)) {
                                        constraintWidget3 = constraintWidget2;
                                    } else {
                                        constraintWidget3 = constraintWidget2;
                                        if (constraintWidget5 != constraintWidget3 && constraintWidget6 != constraintWidget3) {
                                            i35 = iMin2;
                                        }
                                        if ((constraintWidget5 instanceof Guideline) || (constraintWidget6 instanceof Guideline)) {
                                            i35 = 5;
                                        }
                                        if ((constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier)) {
                                            i35 = 5;
                                        }
                                        iMin2 = Math.max(z8 ? 5 : i35, iMin2);
                                    }
                                    if (z2) {
                                        iMin2 = Math.min(i22, iMin2);
                                        if (z6 && !z8 && (constraintWidget5 == constraintWidget3 || constraintWidget6 == constraintWidget3)) {
                                            iMin2 = 4;
                                        }
                                    }
                                    linearSystem2.addEquality(solverVariable3, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), iMin2);
                                    linearSystem2.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, -constraintAnchor2.getMargin(), iMin2);
                                }
                                if (z2) {
                                    if (solverVariable == solverVariableCreateObjectVariable4) {
                                        margin = constraintAnchor.getMargin();
                                    } else {
                                        margin = 0;
                                    }
                                    if (solverVariableCreateObjectVariable4 != solverVariable) {
                                        linearSystem2.addGreaterThan(solverVariable3, solverVariable, margin, 5);
                                    }
                                }
                                if (!z2 && z12) {
                                    solverVariable4 = solverVariableCreateObjectVariable3;
                                    if (i3 == 0 && i14 == 0) {
                                        if (z12 && i19 == 3) {
                                            i23 = 0;
                                        } else {
                                            i23 = 0;
                                            i21 = 5;
                                        }
                                        linearSystem2.addGreaterThan(solverVariable4, solverVariable3, i23, i21);
                                    }
                                }
                            } else {
                                i16 = 6;
                                z14 = true;
                                z15 = true;
                            }
                            i17 = 4;
                            i18 = 5;
                            z16 = false;
                            if (z14) {
                                z17 = z14;
                                z18 = true;
                            } else {
                                z17 = z14;
                                z18 = true;
                            }
                            if (z15) {
                                if (this.mVisibility == 8) {
                                    i25 = 4;
                                } else {
                                    i25 = i16;
                                }
                                i19 = i9;
                                constraintWidget2 = parent;
                                i20 = 8;
                                linearSystem.addCentering(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable3, constraintAnchor2.getMargin(), i25);
                            } else {
                                i19 = i9;
                                constraintWidget2 = parent;
                                i20 = 8;
                            }
                            if (this.mVisibility == i20) {
                                return;
                            }
                            if (z17) {
                                if (z2) {
                                    i24 = i18;
                                } else {
                                    i24 = i18;
                                }
                                linearSystem2 = linearSystem;
                                solverVariable3 = solverVariableCreateObjectVariable2;
                                i21 = 8;
                                linearSystem2.addGreaterThan(solverVariable3, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), i24);
                                linearSystem2.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, -constraintAnchor2.getMargin(), i24);
                                i18 = i24;
                            } else {
                                linearSystem2 = linearSystem;
                                solverVariable3 = solverVariableCreateObjectVariable2;
                                i21 = 8;
                            }
                            if (z2) {
                                iMin2 = i17;
                                i22 = i18;
                            } else {
                                iMin2 = i17;
                                i22 = i18;
                            }
                            if (z18) {
                                if (z16) {
                                    constraintWidget3 = constraintWidget2;
                                } else {
                                    constraintWidget3 = constraintWidget2;
                                }
                                if (z2) {
                                    iMin2 = Math.min(i22, iMin2);
                                    if (z6) {
                                        iMin2 = 4;
                                    }
                                }
                                linearSystem2.addEquality(solverVariable3, solverVariableCreateObjectVariable4, constraintAnchor.getMargin(), iMin2);
                                linearSystem2.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, -constraintAnchor2.getMargin(), iMin2);
                            }
                            if (z2) {
                                if (solverVariable == solverVariableCreateObjectVariable4) {
                                    margin = constraintAnchor.getMargin();
                                } else {
                                    margin = 0;
                                }
                                if (solverVariableCreateObjectVariable4 != solverVariable) {
                                    linearSystem2.addGreaterThan(solverVariable3, solverVariable, margin, 5);
                                }
                            }
                            if (!z2) {
                            }
                        }
                        solverVariable4 = solverVariableCreateObjectVariable3;
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, -constraintAnchor2.getMargin(), 8);
                        if (z2) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable2, solverVariable, 0, 5);
                        }
                    }
                    linearSystem2 = linearSystem;
                    solverVariable4 = solverVariableCreateObjectVariable3;
                } else {
                    linearSystem2 = linearSystem;
                    solverVariable4 = solverVariableCreateObjectVariable3;
                }
                if (z2 && z4) {
                    int margin2 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                    if (solverVariableCreateObjectVariable5 != solverVariable2) {
                        linearSystem2.addGreaterThan(solverVariable2, solverVariable4, margin2, 5);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z5) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, 0, 3);
                if (i3 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i4, 8);
                }
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, i10);
            }
            i14 = i7;
            i12 = i8;
            z12 = z11;
            i13 = i30;
            if (z10) {
                i15 = 8;
            } else {
                i15 = 8;
            }
            if (i13 >= 2) {
            }
        }
        i9 = i31;
        z11 = false;
        if (this.mVisibility == 8) {
            iMin = 0;
            z11 = false;
        } else {
            iMin = i2;
        }
        if (z10) {
            i10 = 8;
        } else if (zIsConnected) {
            if (zIsConnected) {
                i10 = 8;
            } else {
                i10 = 8;
            }
        } else if (zIsConnected) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (!z11) {
            if (i30 == 2) {
            }
            if (i7 == -2) {
                i11 = iMin;
            } else {
                i11 = i7;
            }
            if (i8 == -2) {
                i12 = iMin;
            } else {
                i12 = i8;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i11 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i11, 8);
                iMin = Math.max(iMin, i11);
            }
            if (i12 > 0) {
                if (z2) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i12, 8);
                } else {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i12, 8);
                }
                iMin = Math.min(iMin, i12);
            }
            if (i9 == 1) {
                if (z2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 8);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, 8);
                }
                i14 = i11;
            } else if (i9 == 2) {
                type = constraintAnchor.getType();
                type2 = ConstraintAnchor.Type.TOP;
                if (type != type2) {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                    constraintWidget = this.mParent;
                    type3 = ConstraintAnchor.Type.BOTTOM;
                } else {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                    constraintWidget = this.mParent;
                    type3 = ConstraintAnchor.Type.BOTTOM;
                }
                SolverVariable solverVariableCreateObjectVariable7 = linearSystem.createObjectVariable(constraintWidget.getAnchor(type3));
                SolverVariable solverVariable6 = solverVariableCreateObjectVariable;
                ArrayRow arrayRowCreateRow2 = linearSystem.createRow();
                int i36 = i11;
                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                i13 = i30 == true ? 1 : 0;
                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                linearSystem.addConstraint(arrayRowCreateRow2.createRowDimensionRatio(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable7, solverVariable6, f2));
                z4 = z4;
                i14 = i36;
                z12 = false;
            } else {
                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                int i37 = i11;
                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                i13 = i30;
                i14 = i37;
                z12 = z11;
                z4 = true;
            }
            if (z10) {
                i15 = 8;
            } else {
                i15 = 8;
            }
            if (i13 >= 2) {
            }
        }
        if (z5) {
            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, 0, 3);
            if (i3 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                linearSystem.addLowerThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, i4, 8);
            }
        } else {
            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, iMin, i10);
        }
        i14 = i7;
        i12 = i8;
        z12 = z11;
        i13 = i30;
        if (z10) {
            i15 = 8;
        } else {
            i15 = 8;
        }
        if (i13 >= 2) {
        }
    }

    private boolean isChainHead(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARN: Code duplicated, block: B:197:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:200:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:221:0x0402  */
    /* JADX WARN: Code duplicated, block: B:224:0x0408  */
    /* JADX WARN: Code duplicated, block: B:229:0x0418  */
    /* JADX WARN: Code duplicated, block: B:231:0x0425  */
    /* JADX WARN: Code duplicated, block: B:233:0x042e  */
    /* JADX WARN: Code duplicated, block: B:235:0x043b  */
    /* JADX WARN: Code duplicated, block: B:237:0x043f  */
    /* JADX WARN: Code duplicated, block: B:240:0x048f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0497  */
    /* JADX WARN: Code duplicated, block: B:245:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    public void addToSolver(LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        SolverVariable solverVariable;
        DependencyNode dependencyNode;
        LinearSystem linearSystem2;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int i4;
        int i5;
        int i6;
        boolean z8;
        boolean z9;
        int i7;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        boolean z10;
        boolean z11;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariableCreateObjectVariable;
        ConstraintAnchor constraintAnchor;
        boolean z12;
        int i8;
        int i9;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        ConstraintWidget constraintWidget2 = this;
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget2.mLeft);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget2.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintWidget2.mTop);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintWidget2.mBottom);
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintWidget2.mBaseline);
        Metrics metrics = LinearSystem.sMetrics;
        if (metrics != null) {
            metrics.widgets++;
        }
        HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.horizontalRun;
        DependencyNode dependencyNode2 = horizontalWidgetRun.start;
        if (dependencyNode2.resolved && horizontalWidgetRun.end.resolved) {
            VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
            if (verticalWidgetRun.start.resolved && verticalWidgetRun.end.resolved) {
                if (metrics != null) {
                    metrics.graphSolved++;
                }
                linearSystem.addEquality(solverVariableCreateObjectVariable2, dependencyNode2.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable3, constraintWidget2.horizontalRun.end.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable4, constraintWidget2.verticalRun.start.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable5, constraintWidget2.verticalRun.end.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable6, constraintWidget2.verticalRun.baseline.value);
                ConstraintWidget constraintWidget3 = constraintWidget2.mParent;
                if (constraintWidget3 != null) {
                    boolean z13 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
                    boolean z14 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
                    if (z13 && constraintWidget2.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mParent.mRight), solverVariableCreateObjectVariable3, 0, 8);
                    }
                    if (z14 && constraintWidget2.isTerminalWidget[1] && !isInVerticalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mParent.mBottom), solverVariableCreateObjectVariable5, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (metrics != null) {
            metrics.linearSolved++;
        }
        ConstraintWidget constraintWidget4 = constraintWidget2.mParent;
        if (constraintWidget4 != null) {
            boolean z15 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            z = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            if (constraintWidget2.isChainHead(0)) {
                ((ConstraintWidgetContainer) constraintWidget2.mParent).addChain(constraintWidget2, 0);
                zIsInHorizontalChain = true;
            } else {
                zIsInHorizontalChain = isInHorizontalChain();
            }
            if (constraintWidget2.isChainHead(1)) {
                ((ConstraintWidgetContainer) constraintWidget2.mParent).addChain(constraintWidget2, 1);
                zIsInVerticalChain = true;
            } else {
                zIsInVerticalChain = isInVerticalChain();
            }
            if (!zIsInHorizontalChain && z15 && constraintWidget2.mVisibility != 8 && constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mParent.mRight), solverVariableCreateObjectVariable3, 0, 1);
            }
            if (!zIsInVerticalChain && z && constraintWidget2.mVisibility != 8 && constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null && constraintWidget2.mBaseline == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mParent.mBottom), solverVariableCreateObjectVariable5, 0, 1);
            }
            z2 = z15;
            z4 = zIsInHorizontalChain;
            z3 = zIsInVerticalChain;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i10 = constraintWidget2.mWidth;
        int i11 = constraintWidget2.mMinWidth;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = constraintWidget2.mHeight;
        int i13 = constraintWidget2.mMinHeight;
        if (i12 >= i13) {
            i13 = i12;
        }
        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        SolverVariable solverVariable9 = solverVariableCreateObjectVariable6;
        boolean z16 = dimensionBehaviour != dimensionBehaviour2;
        DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
        SolverVariable solverVariable10 = solverVariableCreateObjectVariable5;
        SolverVariable solverVariable11 = solverVariableCreateObjectVariable4;
        boolean z17 = dimensionBehaviour3 != dimensionBehaviour2;
        int i14 = constraintWidget2.mDimensionRatioSide;
        constraintWidget2.mResolvedDimensionRatioSide = i14;
        int i15 = i11;
        float f = constraintWidget2.mDimensionRatio;
        constraintWidget2.mResolvedDimensionRatio = f;
        int i16 = i13;
        int i17 = constraintWidget2.mMatchConstraintDefaultWidth;
        int i18 = constraintWidget2.mMatchConstraintDefaultHeight;
        SolverVariable solverVariable12 = solverVariableCreateObjectVariable2;
        if (f <= 0.0f || constraintWidget2.mVisibility == 8) {
            i = i18;
            i17 = i17;
            i2 = i15;
            i3 = i16;
            z5 = false;
        } else {
            if (dimensionBehaviour == dimensionBehaviour2 && i17 == 0) {
                i17 = 3;
            }
            if (dimensionBehaviour3 == dimensionBehaviour2 && i18 == 0) {
                i18 = 3;
            }
            if (dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviour3 == dimensionBehaviour2 && i17 == 3 && i18 == 3) {
                constraintWidget2.setupDimensionRatio(z2, z, z16, z17);
            } else if (dimensionBehaviour == dimensionBehaviour2 && i17 == 3) {
                constraintWidget2.mResolvedDimensionRatioSide = 0;
                i2 = (int) (f * i12);
                i = i18;
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                    i3 = i16;
                    z5 = false;
                    i17 = 4;
                } else {
                    i3 = i16;
                    z5 = true;
                }
            } else if (dimensionBehaviour3 == dimensionBehaviour2 && i18 == 3) {
                constraintWidget2.mResolvedDimensionRatioSide = 1;
                if (i14 == -1) {
                    constraintWidget2.mResolvedDimensionRatio = 1.0f / f;
                }
                i3 = (int) (constraintWidget2.mResolvedDimensionRatio * i10);
                if (dimensionBehaviour != dimensionBehaviour2) {
                    i17 = i17;
                    i2 = i15;
                    z5 = false;
                    i = 4;
                } else {
                    i = i18;
                    i17 = i17;
                    i2 = i15;
                    z5 = true;
                }
            }
            i = i18;
            i2 = i15;
            i3 = i16;
            z5 = true;
        }
        int[] iArr = constraintWidget2.mResolvedMatchConstraintDefault;
        iArr[0] = i17;
        iArr[1] = i;
        constraintWidget2.mResolvedHasRatio = z5;
        boolean z18 = z5 && ((i9 = constraintWidget2.mResolvedDimensionRatioSide) == 0 || i9 == -1);
        DimensionBehaviour dimensionBehaviour4 = constraintWidget2.mListDimensionBehaviors[0];
        DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.WRAP_CONTENT;
        boolean z19 = dimensionBehaviour4 == dimensionBehaviour5 && (constraintWidget2 instanceof ConstraintWidgetContainer);
        int i19 = z19 ? 0 : i2;
        boolean z20 = !constraintWidget2.mCenter.isConnected();
        boolean[] zArr = constraintWidget2.mIsInBarrier;
        boolean z21 = zArr[0];
        boolean z22 = zArr[1];
        if (constraintWidget2.mHorizontalResolution != 2) {
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget2.horizontalRun;
            DependencyNode dependencyNode3 = horizontalWidgetRun2.start;
            if (dependencyNode3.resolved && horizontalWidgetRun2.end.resolved) {
                linearSystem.addEquality(solverVariable12, dependencyNode3.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable3, constraintWidget2.horizontalRun.end.value);
                if (constraintWidget2.mParent != null && z2 && constraintWidget2.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mParent.mRight), solverVariableCreateObjectVariable3, 0, 8);
                }
                z6 = z;
                dimensionBehaviour5 = dimensionBehaviour5;
                z5 = z5;
                solverVariable = solverVariableCreateObjectVariable3;
                solverVariable12 = solverVariable12;
                z7 = z2;
                solverVariable9 = solverVariable9;
                solverVariable10 = solverVariable10;
                solverVariable11 = solverVariable11;
            } else {
                ConstraintWidget constraintWidget5 = constraintWidget2.mParent;
                SolverVariable solverVariableCreateObjectVariable7 = constraintWidget5 != null ? linearSystem.createObjectVariable(constraintWidget5.mRight) : null;
                ConstraintWidget constraintWidget6 = constraintWidget2.mParent;
                z7 = z2;
                z6 = z;
                solverVariable = solverVariableCreateObjectVariable3;
                solverVariable12 = solverVariable12;
                applyConstraints(linearSystem, true, z7, z6, constraintWidget2.isTerminalWidget[0], constraintWidget6 != null ? linearSystem.createObjectVariable(constraintWidget6.mLeft) : null, solverVariableCreateObjectVariable7, constraintWidget2.mListDimensionBehaviors[0], z19, constraintWidget2.mLeft, constraintWidget2.mRight, constraintWidget2.f10086mX, i19, constraintWidget2.mMinWidth, constraintWidget2.mMaxDimension[0], constraintWidget2.mHorizontalBiasPercent, z18, z4, z3, z21, i17, i, constraintWidget2.mMatchConstraintMinWidth, constraintWidget2.mMatchConstraintMaxWidth, constraintWidget2.mMatchConstraintPercentWidth, z20);
            }
            VerticalWidgetRun verticalWidgetRun2 = constraintWidget2.verticalRun;
            dependencyNode = verticalWidgetRun2.start;
            if (dependencyNode.resolved || !verticalWidgetRun2.end.resolved) {
                linearSystem2 = linearSystem;
                solverVariable2 = solverVariable9;
                solverVariable3 = solverVariable10;
                solverVariable4 = solverVariable11;
                i4 = 8;
                i5 = 0;
                i6 = 1;
                z8 = true;
            } else {
                linearSystem2 = linearSystem;
                solverVariable4 = solverVariable11;
                linearSystem2.addEquality(solverVariable4, dependencyNode.value);
                solverVariable3 = solverVariable10;
                linearSystem2.addEquality(solverVariable3, constraintWidget2.verticalRun.end.value);
                solverVariable2 = solverVariable9;
                linearSystem2.addEquality(solverVariable2, constraintWidget2.verticalRun.baseline.value);
                ConstraintWidget constraintWidget7 = constraintWidget2.mParent;
                if (constraintWidget7 == null || z3 || !z6) {
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                } else {
                    i6 = 1;
                    if (constraintWidget2.isTerminalWidget[1]) {
                        i4 = 8;
                        i5 = 0;
                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget7.mBottom), solverVariable3, 0, 8);
                    } else {
                        i4 = 8;
                        i5 = 0;
                    }
                }
                z8 = false;
            }
            if (constraintWidget2.mVerticalResolution == 2) {
                z9 = false;
            } else {
                z9 = z8;
            }
            if (!z9) {
                if (constraintWidget2.mListDimensionBehaviors[i6] == dimensionBehaviour5 || !(constraintWidget2 instanceof ConstraintWidgetContainer)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i3 = 0;
                }
                if (z5 || !((i8 = constraintWidget2.mResolvedDimensionRatioSide) == i6 || i8 == -1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                constraintWidget = constraintWidget2.mParent;
                if (constraintWidget != null) {
                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                ConstraintWidget constraintWidget8 = constraintWidget2.mParent;
                SolverVariable solverVariableCreateObjectVariable8 = constraintWidget8 != null ? linearSystem2.createObjectVariable(constraintWidget8.mTop) : null;
                if (constraintWidget2.mBaselineDistance <= 0 || constraintWidget2.mVisibility == i4) {
                    linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i4);
                    constraintAnchor = constraintWidget2.mBaseline.mTarget;
                    if (constraintAnchor != null) {
                        linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintAnchor), i5, i4);
                        if (z6) {
                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget2.mBottom), i5, 5);
                        }
                        z12 = false;
                    } else {
                        if (constraintWidget2.mVisibility == i4) {
                            linearSystem2.addEquality(solverVariable2, solverVariable4, i5, i4);
                        }
                        z12 = z20;
                    }
                } else {
                    z12 = z20;
                }
                applyConstraints(linearSystem, false, z6, z7, constraintWidget2.isTerminalWidget[i6], solverVariableCreateObjectVariable8, solverVariableCreateObjectVariable, constraintWidget2.mListDimensionBehaviors[i6], z10, constraintWidget2.mTop, constraintWidget2.mBottom, constraintWidget2.f10087mY, i3, constraintWidget2.mMinHeight, constraintWidget2.mMaxDimension[i6], constraintWidget2.mVerticalBiasPercent, z11, z3, z4, z22, i, i17, constraintWidget2.mMatchConstraintMinHeight, constraintWidget2.mMatchConstraintMaxHeight, constraintWidget2.mMatchConstraintPercentHeight, z12);
            }
            if (z5) {
                i7 = this.mResolvedDimensionRatioSide;
                float f2 = this.mResolvedDimensionRatio;
                if (i7 == 1) {
                    solverVariable5 = solverVariable3;
                    solverVariable6 = solverVariable4;
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable12;
                } else {
                    solverVariable5 = solverVariable;
                    solverVariable6 = solverVariable12;
                    solverVariable7 = solverVariable3;
                    solverVariable8 = solverVariable4;
                }
                linearSystem.addRatio(solverVariable5, solverVariable6, solverVariable7, solverVariable8, f2, 8);
            }
            if (this.mCenter.isConnected()) {
                linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
            }
        }
        z6 = z;
        z7 = z2;
        solverVariable = solverVariableCreateObjectVariable3;
        constraintWidget2 = this;
        VerticalWidgetRun verticalWidgetRun3 = constraintWidget2.verticalRun;
        dependencyNode = verticalWidgetRun3.start;
        if (dependencyNode.resolved) {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable9;
            solverVariable3 = solverVariable10;
            solverVariable4 = solverVariable11;
            i4 = 8;
            i5 = 0;
            i6 = 1;
            z8 = true;
        } else {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable9;
            solverVariable3 = solverVariable10;
            solverVariable4 = solverVariable11;
            i4 = 8;
            i5 = 0;
            i6 = 1;
            z8 = true;
        }
        if (constraintWidget2.mVerticalResolution == 2) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if (!z9) {
            if (constraintWidget2.mListDimensionBehaviors[i6] == dimensionBehaviour5) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i3 = 0;
            }
            if (z5) {
                z11 = false;
            } else {
                z11 = false;
            }
            constraintWidget = constraintWidget2.mParent;
            if (constraintWidget != null) {
                solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget.mBottom);
            } else {
                solverVariableCreateObjectVariable = null;
            }
            ConstraintWidget constraintWidget9 = constraintWidget2.mParent;
            if (constraintWidget9 != null) {
            }
            if (constraintWidget2.mBaselineDistance <= 0) {
                linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i4);
                constraintAnchor = constraintWidget2.mBaseline.mTarget;
                if (constraintAnchor != null) {
                    linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintAnchor), i5, i4);
                    if (z6) {
                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget2.mBottom), i5, 5);
                    }
                    z12 = false;
                } else {
                    if (constraintWidget2.mVisibility == i4) {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, i5, i4);
                    }
                    z12 = z20;
                }
            } else {
                linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i4);
                constraintAnchor = constraintWidget2.mBaseline.mTarget;
                if (constraintAnchor != null) {
                    linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintAnchor), i5, i4);
                    if (z6) {
                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(constraintWidget2.mBottom), i5, 5);
                    }
                    z12 = false;
                } else {
                    if (constraintWidget2.mVisibility == i4) {
                        linearSystem2.addEquality(solverVariable2, solverVariable4, i5, i4);
                    }
                    z12 = z20;
                }
            }
            applyConstraints(linearSystem, false, z6, z7, constraintWidget2.isTerminalWidget[i6], solverVariableCreateObjectVariable8, solverVariableCreateObjectVariable, constraintWidget2.mListDimensionBehaviors[i6], z10, constraintWidget2.mTop, constraintWidget2.mBottom, constraintWidget2.f10087mY, i3, constraintWidget2.mMinHeight, constraintWidget2.mMaxDimension[i6], constraintWidget2.mVerticalBiasPercent, z11, z3, z4, z22, i, i17, constraintWidget2.mMatchConstraintMinHeight, constraintWidget2.mMatchConstraintMaxHeight, constraintWidget2.mMatchConstraintPercentHeight, z12);
        }
        if (z5) {
            i7 = this.mResolvedDimensionRatioSide;
            float f3 = this.mResolvedDimensionRatio;
            if (i7 == 1) {
                solverVariable5 = solverVariable3;
                solverVariable6 = solverVariable4;
                solverVariable7 = solverVariable;
                solverVariable8 = solverVariable12;
            } else {
                solverVariable5 = solverVariable;
                solverVariable6 = solverVariable12;
                solverVariable7 = solverVariable3;
                solverVariable8 = solverVariable4;
            }
            linearSystem.addRatio(solverVariable5, solverVariable6, solverVariable7, solverVariable8, f3, 8);
        }
        if (this.mCenter.isConnected()) {
            linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
        }
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.f10086mX = constraintWidget.f10086mX;
        this.f10087mY = constraintWidget.f10087mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mOptimizerMeasurable = constraintWidget.mOptimizerMeasurable;
        this.mGroupsToSolver = constraintWidget.mGroupsToSolver;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C25561.f10088x4c44d048[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = Math.max(this.mMatchConstraintMinHeight, i);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.mHeight = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxHeight;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.mWidth = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxWidth;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getRootX() {
        return this.f10086mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.f10087mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f10086mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.f10086mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f10087mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.f10087mY;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f10086mX = 0;
        this.f10087mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor != anchor5) {
            if (constraintAnchor == anchor6) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                    anchor.reset();
                    anchor2.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor7) {
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                    anchor3.reset();
                    anchor4.reset();
                }
            } else if (constraintAnchor == anchor || constraintAnchor == anchor2 ? !(!anchor.isConnected() || anchor.getTarget() != anchor2.getTarget()) : !((constraintAnchor != anchor3 && constraintAnchor != anchor4) || !anchor3.isConnected() || anchor3.getTarget() != anchor4.getTarget())) {
                anchor5.reset();
            }
            constraintAnchor.reset();
        }
        if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
            anchor.reset();
            anchor2.reset();
        }
        if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor3.reset();
            anchor4.reset();
        }
        this.mHorizontalBiasPercent = 0.5f;
        this.mVerticalBiasPercent = 0.5f;
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mContainerItemSkip = i;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        ConstraintAnchor constraintAnchor;
        int i2 = C25561.f10088x4c44d048[type.ordinal()];
        if (i2 == 1) {
            constraintAnchor = this.mLeft;
        } else if (i2 == 2) {
            constraintAnchor = this.mTop;
        } else if (i2 == 3) {
            constraintAnchor = this.mRight;
        } else if (i2 != 4) {
            return;
        } else {
            constraintAnchor = this.mBottom;
        }
        constraintAnchor.mGoneMargin = i;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f10086mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mMinHeight = i;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mMinWidth = i;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.f10086mX = i;
        this.f10087mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.f10087mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setX(int i) {
        this.f10086mX = i;
    }

    public void setY(int i) {
        this.f10087mY = i;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mType != null ? C0786MA.m3668a(new StringBuilder("type: "), this.mType, " ") : "");
        sb.append(this.mDebugName != null ? C0786MA.m3668a(new StringBuilder("id: "), this.mDebugName, " ") : "");
        sb.append(C1313UP.f3458k);
        sb.append(this.f10086mX);
        sb.append(", ");
        sb.append(this.f10087mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        return C0978P9.m4377a(sb, this.mHeight, C1313UP.f3459l);
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zIsResolved = z & this.horizontalRun.isResolved();
        boolean zIsResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i3 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zIsResolved) {
            this.f10086mX = i3;
        }
        if (zIsResolved2) {
            this.f10087mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        DependencyNode dependencyNode = horizontalWidgetRun.start;
        if (dependencyNode.resolved) {
            DependencyNode dependencyNode2 = horizontalWidgetRun.end;
            if (dependencyNode2.resolved) {
                objectVariableValue = dependencyNode.value;
                objectVariableValue3 = dependencyNode2.value;
            }
        }
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        DependencyNode dependencyNode3 = verticalWidgetRun.start;
        if (dependencyNode3.resolved) {
            DependencyNode dependencyNode4 = verticalWidgetRun.end;
            if (dependencyNode4.resolved) {
                objectVariableValue2 = dependencyNode3.value;
                objectVariableValue4 = dependencyNode4.value;
            }
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc A[PHI: r9 r11
      0x01bc: PHI (r9v3 androidx.constraintlayout.solver.widgets.ConstraintAnchor) = 
      (r9v2 androidx.constraintlayout.solver.widgets.ConstraintAnchor)
      (r9v5 androidx.constraintlayout.solver.widgets.ConstraintAnchor)
     binds: [B:100:0x01ba, B:91:0x0191] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r11v6 androidx.constraintlayout.solver.widgets.ConstraintAnchor) = 
      (r11v5 androidx.constraintlayout.solver.widgets.ConstraintAnchor)
      (r11v9 androidx.constraintlayout.solver.widgets.ConstraintAnchor)
     binds: [B:100:0x01ba, B:91:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor opposite;
        ConstraintAnchor anchor;
        ConstraintAnchor anchor2;
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        ConstraintAnchor anchor3;
        boolean z;
        ConstraintAnchor.Type type5;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER;
        if (type == type6) {
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.LEFT;
            if (type2 == type6) {
                ConstraintAnchor anchor4 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor5 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor6 = getAnchor(type9);
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor7 = getAnchor(type10);
                boolean z2 = true;
                if ((anchor4 == null || !anchor4.isConnected()) && (anchor5 == null || !anchor5.isConnected())) {
                    connect(type7, constraintWidget, type7, 0);
                    connect(type8, constraintWidget, type8, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor6 == null || !anchor6.isConnected()) && (anchor7 == null || !anchor7.isConnected())) {
                    connect(type9, constraintWidget, type9, 0);
                    connect(type10, constraintWidget, type10, 0);
                } else {
                    z2 = false;
                }
                if (!z || !z2) {
                    if (z) {
                        type5 = ConstraintAnchor.Type.CENTER_X;
                    } else if (!z2) {
                        return;
                    } else {
                        type5 = ConstraintAnchor.Type.CENTER_Y;
                    }
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                anchor2 = getAnchor(type6);
                anchor3 = constraintWidget.getAnchor(type6);
            } else {
                if (type2 == type7 || type2 == ConstraintAnchor.Type.RIGHT) {
                    connect(type7, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                } else {
                    ConstraintAnchor.Type type11 = ConstraintAnchor.Type.TOP;
                    if (type2 != type11 && type2 != ConstraintAnchor.Type.BOTTOM) {
                        return;
                    }
                    connect(type11, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                }
                anchor2 = getAnchor(type6);
                anchor3 = constraintWidget.getAnchor(type2);
            }
        } else {
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
            if (type == type12 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor anchor8 = getAnchor(type4);
                anchor3 = constraintWidget.getAnchor(type2);
                ConstraintAnchor anchor9 = getAnchor(ConstraintAnchor.Type.RIGHT);
                anchor8.connect(anchor3, 0);
                anchor9.connect(anchor3, 0);
                anchor2 = getAnchor(type12);
            } else {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                if (type == type13 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                    ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
                    getAnchor(type3).connect(anchor10, 0);
                    getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor10, 0);
                    getAnchor(type13).connect(anchor10, 0);
                    return;
                }
                if (type == type12 && type2 == type12) {
                    ConstraintAnchor.Type type14 = ConstraintAnchor.Type.LEFT;
                    getAnchor(type14).connect(constraintWidget.getAnchor(type14), 0);
                    ConstraintAnchor.Type type15 = ConstraintAnchor.Type.RIGHT;
                    getAnchor(type15).connect(constraintWidget.getAnchor(type15), 0);
                    anchor2 = getAnchor(type12);
                } else {
                    if (type != type13 || type2 != type13) {
                        ConstraintAnchor anchor11 = getAnchor(type);
                        ConstraintAnchor anchor12 = constraintWidget.getAnchor(type2);
                        if (anchor11.isValidConnection(anchor12)) {
                            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BASELINE;
                            if (type == type16) {
                                ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.TOP);
                                ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                                if (anchor13 != null) {
                                    anchor13.reset();
                                }
                                if (anchor14 != null) {
                                    anchor14.reset();
                                }
                                i = 0;
                            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                                ConstraintAnchor anchor15 = getAnchor(type16);
                                if (anchor15 != null) {
                                    anchor15.reset();
                                }
                                ConstraintAnchor anchor16 = getAnchor(type6);
                                if (anchor16.getTarget() != anchor12) {
                                    anchor16.reset();
                                }
                                opposite = getAnchor(type).getOpposite();
                                anchor = getAnchor(type13);
                                if (anchor.isConnected()) {
                                    opposite.reset();
                                    anchor.reset();
                                }
                            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                                ConstraintAnchor anchor17 = getAnchor(type6);
                                if (anchor17.getTarget() != anchor12) {
                                    anchor17.reset();
                                }
                                opposite = getAnchor(type).getOpposite();
                                anchor = getAnchor(type12);
                                if (anchor.isConnected()) {
                                    opposite.reset();
                                    anchor.reset();
                                }
                            }
                            anchor11.connect(anchor12, i);
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor.Type type17 = ConstraintAnchor.Type.TOP;
                    getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
                    ConstraintAnchor.Type type18 = ConstraintAnchor.Type.BOTTOM;
                    getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
                    anchor2 = getAnchor(type13);
                }
                anchor3 = constraintWidget.getAnchor(type2);
            }
        }
        anchor2.connect(anchor3, 0);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087 A[PHI: r0
      0x0087: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:39:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(C1023Ps.f2627j)) {
                i2 = strSubstring.equalsIgnoreCase(C1023Ps.f2628k) ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = 0.0f;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = 0.0f;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = 0.0f;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i3;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f10086mX = i;
        this.f10087mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.f10086mX = i;
        this.f10087mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }
}
