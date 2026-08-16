package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.HashMap;
import p000.C0305Ec;
import p000.C4515i2;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i4];
            constraintAnchor2.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor2);
            i4++;
        }
        int i5 = this.mBarrierType;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i5];
        int i6 = 0;
        while (true) {
            if (i6 >= this.mWidgetsCount) {
                z = false;
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i6];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i2 = this.mBarrierType) == 0 || i2 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i3 = this.mBarrierType) == 2 || i3 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z = true;
                break;
            }
            i6++;
        }
        boolean z2 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z3 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i7 = !(!z && (((i = this.mBarrierType) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i8];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i9 = this.mBarrierType;
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr3[i9];
                constraintAnchor4.mSolverVariable = solverVariableCreateObjectVariable;
                ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
                int i10 = (constraintAnchor5 == null || constraintAnchor5.mOwner != this) ? 0 : constraintAnchor4.mMargin;
                if (i9 == 0 || i9 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor3.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin - i10, z);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor3.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i10, z);
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i10, i7);
            }
        }
        int i11 = this.mBarrierType;
        if (i11 == 0) {
            linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
            solverVariable = this.mLeft.mSolverVariable;
            constraintAnchor = this.mParent.mLeft;
        } else if (i11 == 1) {
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
            solverVariable = this.mLeft.mSolverVariable;
            constraintAnchor = this.mParent.mRight;
        } else if (i11 == 2) {
            linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
            solverVariable = this.mTop.mSolverVariable;
            constraintAnchor = this.mParent.mTop;
        } else {
            if (i11 != 3) {
                return;
            }
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
            solverVariable = this.mTop.mSolverVariable;
            constraintAnchor = this.mParent.mBottom;
        }
        linearSystem.addEquality(solverVariable, constraintAnchor.mSolverVariable, 0, 0);
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public void markWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            int i2 = this.mBarrierType;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.setInBarrier(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.setInBarrier(1, true);
            }
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mAllowsGoneWidget = z;
    }

    public void setBarrierType(int i) {
        this.mBarrierType = i;
    }

    public void setMargin(int i) {
        this.mMargin = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String toString() {
        String string = "[Barrier] " + getDebugName() + " {";
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (i > 0) {
                string = C4515i2.m21289a(string, ", ");
            }
            StringBuilder sbM1657a = C0305Ec.m1657a(string);
            sbM1657a.append(constraintWidget.getDebugName());
            string = sbM1657a.toString();
        }
        return C4515i2.m21289a(string, "}");
    }
}
