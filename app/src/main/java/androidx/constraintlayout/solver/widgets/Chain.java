package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r8 r15
      0x002f: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r15v31 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r8 r15
      0x0031: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x030c  */
    /* JADX WARN: Code duplicated, block: B:189:0x031e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0326  */
    /* JADX WARN: Code duplicated, block: B:192:0x0329  */
    /* JADX WARN: Code duplicated, block: B:195:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x033a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0402  */
    /* JADX WARN: Code duplicated, block: B:255:0x040a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0417  */
    /* JADX WARN: Code duplicated, block: B:259:0x041a  */
    /* JADX WARN: Code duplicated, block: B:265:0x043a  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.constraintlayout.solver.LinearSystem] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        int i3;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable2;
        int margin;
        int i4;
        ConstraintAnchor constraintAnchor3;
        int margin2;
        int i5;
        int margin3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ?? r5;
        SolverVariable solverVariable5;
        int size;
        ConstraintAnchor constraintAnchor5;
        int i6;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f = chainHead.mTotalWeight;
        boolean z4 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            int i7 = constraintWidget5.mHorizontalChainStyle;
            z = i7 == 0;
            z2 = i7 == 1;
            if (i7 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i8 = constraintWidget5.mVerticalChainStyle;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        boolean z5 = z2;
        boolean z6 = false;
        boolean z7 = z;
        ?? r8 = constraintWidget;
        while (true) {
            obj = null;
            if (z6) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r8.mListAnchors[i2];
            int i9 = z3 ? 1 : 4;
            int margin4 = constraintAnchor6.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r8.mListDimensionBehaviors[i];
            float f2 = f;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z8 = dimensionBehaviour == dimensionBehaviour2 && r8.mResolvedMatchConstraintDefault[i] == 0;
            ConstraintAnchor constraintAnchor7 = constraintAnchor6.mTarget;
            if (constraintAnchor7 != null && r8 != constraintWidget) {
                margin4 = constraintAnchor7.getMargin() + margin4;
            }
            int i10 = margin4;
            if (z3 && r8 != constraintWidget && r8 != constraintWidget3) {
                i9 = 5;
            }
            ConstraintAnchor constraintAnchor8 = constraintAnchor6.mTarget;
            ConstraintWidget constraintWidget6 = constraintWidget5;
            if (constraintAnchor8 != null) {
                if (r8 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i10, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i10, 8);
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i10, (!z8 || z3) ? i9 : 5);
            } else {
                constraintWidget = constraintWidget;
            }
            if (z4) {
                if (r8.getVisibility() == 8 || r8.mListDimensionBehaviors[i] != dimensionBehaviour2) {
                    i6 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r8.mListAnchors;
                    i6 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i2 + 1].mSolverVariable, constraintAnchorArr[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r8.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i6, 8);
            }
            ConstraintAnchor constraintAnchor9 = r8.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor9 != null) {
                ConstraintWidget constraintWidget7 = constraintAnchor9.mOwner;
                ConstraintAnchor constraintAnchor10 = constraintWidget7.mListAnchors[i2].mTarget;
                if (constraintAnchor10 != null && constraintAnchor10.mOwner == r8) {
                    obj = constraintWidget7;
                }
            }
            if (obj != null) {
                r8 = obj;
                z6 = z6;
            } else {
                z6 = true;
            }
            z7 = z7;
            f = f2;
            constraintWidget5 = constraintWidget6;
            constraintWidget = constraintWidget;
            r8 = r8;
        }
        ConstraintWidget constraintWidget8 = constraintWidget5;
        float f3 = f;
        ConstraintWidget constraintWidget9 = constraintWidget;
        boolean z9 = z7;
        if (constraintWidget4 != null) {
            int i11 = i2 + 1;
            if (constraintWidget2.mListAnchors[i11].mTarget != null) {
                ConstraintAnchor constraintAnchor11 = constraintWidget4.mListAnchors[i11];
                if (constraintWidget4.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i] == 0 && !z3) {
                    ConstraintAnchor constraintAnchor12 = constraintAnchor11.mTarget;
                    if (constraintAnchor12.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, -constraintAnchor11.getMargin(), 5);
                    } else if (z3) {
                        constraintAnchor5 = constraintAnchor11.mTarget;
                        if (constraintAnchor5.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor5.mSolverVariable, -constraintAnchor11.getMargin(), 4);
                        }
                    }
                } else if (z3) {
                    constraintAnchor5 = constraintAnchor11.mTarget;
                    if (constraintAnchor5.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor5.mSolverVariable, -constraintAnchor11.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor11.mSolverVariable, constraintWidget2.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor11.getMargin(), 6);
            }
        }
        if (z4) {
            int i12 = i2 + 1;
            SolverVariable solverVariable6 = constraintWidgetContainer.mListAnchors[i12].mSolverVariable;
            ConstraintAnchor constraintAnchor13 = constraintWidget2.mListAnchors[i12];
            linearSystem.addGreaterThan(solverVariable6, constraintAnchor13.mSolverVariable, constraintAnchor13.getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f4 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f3 : chainHead.mWidgetsMatchCount;
            float f5 = 0.0f;
            ConstraintWidget constraintWidget10 = null;
            int i13 = 0;
            float f6 = 0.0f;
            while (i13 < size) {
                ConstraintWidget constraintWidget11 = arrayList.get(i13);
                float f7 = constraintWidget11.mWeight[i];
                if (f7 < f5) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.mListAnchors;
                        linearSystem.addEquality(constraintAnchorArr2[i2 + 1].mSolverVariable, constraintAnchorArr2[i2].mSolverVariable, 0, 4);
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList = arrayList;
                    i13++;
                    arrayList = arrayList;
                    f5 = 0.0f;
                }
                if (f7 == f5) {
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget11.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr3[i2 + 1].mSolverVariable, constraintAnchorArr3[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (constraintWidget10 != null) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget10.mListAnchors;
                        SolverVariable solverVariable7 = constraintAnchorArr4[i2].mSolverVariable;
                        int i14 = i2 + 1;
                        SolverVariable solverVariable8 = constraintAnchorArr4[i14].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget11.mListAnchors;
                        SolverVariable solverVariable9 = constraintAnchorArr5[i2].mSolverVariable;
                        SolverVariable solverVariable10 = constraintAnchorArr5[i14].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f6, f4, f7, solverVariable7, solverVariable8, solverVariable9, solverVariable10);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    constraintWidget10 = constraintWidget11;
                    f6 = f7;
                }
                i13++;
                arrayList = arrayList;
                f5 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z3)) {
            ConstraintAnchor constraintAnchor14 = constraintWidget9.mListAnchors[i2];
            int i15 = i2 + 1;
            ConstraintAnchor constraintAnchor15 = constraintWidget2.mListAnchors[i15];
            ConstraintAnchor constraintAnchor16 = constraintAnchor14.mTarget;
            SolverVariable solverVariable11 = constraintAnchor16 != null ? constraintAnchor16.mSolverVariable : null;
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.mTarget;
            SolverVariable solverVariable12 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
            ConstraintAnchor constraintAnchor18 = constraintWidget3.mListAnchors[i2];
            ConstraintAnchor constraintAnchor19 = constraintWidget4.mListAnchors[i15];
            if (solverVariable11 != null && solverVariable12 != null) {
                linearSystem.addCentering(constraintAnchor18.mSolverVariable, solverVariable11, constraintAnchor18.getMargin(), i == 0 ? constraintWidget8.mHorizontalBiasPercent : constraintWidget8.mVerticalBiasPercent, solverVariable12, constraintAnchor19.mSolverVariable, constraintAnchor19.getMargin(), 7);
            }
        } else if (!z9 || constraintWidget3 == null) {
            int i16 = 8;
            if (z5 && constraintWidget3 != null) {
                int i17 = chainHead.mWidgetsMatchCount;
                boolean z10 = i17 > 0 && chainHead.mWidgetsCount == i17;
                ConstraintWidget constraintWidget12 = constraintWidget3;
                ConstraintWidget constraintWidget13 = constraintWidget12;
                while (constraintWidget12 != null) {
                    ConstraintWidget constraintWidget14 = constraintWidget12.mNextChainWidget[i];
                    while (constraintWidget14 != null && constraintWidget14.getVisibility() == i16) {
                        constraintWidget14 = constraintWidget14.mNextChainWidget[i];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget14 == null) {
                        constraintWidget13 = constraintWidget13;
                        i3 = 8;
                    } else {
                        ConstraintWidget constraintWidget15 = constraintWidget14 == constraintWidget4 ? null : constraintWidget14;
                        ConstraintAnchor constraintAnchor20 = constraintWidget12.mListAnchors[i2];
                        SolverVariable solverVariable13 = constraintAnchor20.mSolverVariable;
                        ConstraintAnchor constraintAnchor21 = constraintAnchor20.mTarget;
                        if (constraintAnchor21 != null) {
                            SolverVariable solverVariable14 = constraintAnchor21.mSolverVariable;
                        }
                        int i18 = i2 + 1;
                        SolverVariable solverVariable15 = constraintWidget13.mListAnchors[i18].mSolverVariable;
                        int margin5 = constraintAnchor20.getMargin();
                        int margin6 = constraintWidget12.mListAnchors[i18].getMargin();
                        if (constraintWidget15 != null) {
                            constraintAnchor = constraintWidget15.mListAnchors[i2];
                            solverVariable = constraintAnchor.mSolverVariable;
                            constraintAnchor2 = constraintAnchor.mTarget;
                            if (constraintAnchor2 == null) {
                                solverVariable2 = null;
                            }
                            if (constraintAnchor != null) {
                                margin = constraintAnchor.getMargin() + margin6;
                            } else {
                                margin = margin6;
                            }
                            int margin7 = constraintWidget13.mListAnchors[i18].getMargin() + margin5;
                            if (z10) {
                                i4 = 8;
                            } else {
                                i4 = 4;
                            }
                            if (solverVariable13 != null || solverVariable15 == null || solverVariable == null || solverVariable2 == null) {
                                i3 = 8;
                            } else {
                                i3 = 8;
                                linearSystem.addCentering(solverVariable13, solverVariable15, margin7, 0.5f, solverVariable, solverVariable2, margin, i4);
                            }
                            constraintWidget14 = constraintWidget15;
                        } else {
                            constraintAnchor = constraintWidget4.mListAnchors[i2];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            constraintAnchor2 = constraintWidget12.mListAnchors[i18];
                        }
                        solverVariable2 = constraintAnchor2.mSolverVariable;
                        if (constraintAnchor != null) {
                            margin = constraintAnchor.getMargin() + margin6;
                        } else {
                            margin = margin6;
                        }
                        int margin8 = constraintWidget13.mListAnchors[i18].getMargin() + margin5;
                        if (z10) {
                            i4 = 8;
                        } else {
                            i4 = 4;
                        }
                        if (solverVariable13 != null) {
                            i3 = 8;
                        } else {
                            i3 = 8;
                        }
                        constraintWidget14 = constraintWidget15;
                    }
                    if (constraintWidget12.getVisibility() == i3) {
                        constraintWidget12 = constraintWidget13;
                    }
                    constraintWidget13 = constraintWidget12;
                    i16 = 8;
                    constraintWidget12 = constraintWidget14;
                }
                ConstraintAnchor constraintAnchor22 = constraintWidget3.mListAnchors[i2];
                ConstraintAnchor constraintAnchor23 = constraintWidget9.mListAnchors[i2].mTarget;
                int i19 = i2 + 1;
                ConstraintAnchor constraintAnchor24 = constraintWidget4.mListAnchors[i19];
                ConstraintAnchor constraintAnchor25 = constraintWidget2.mListAnchors[i19].mTarget;
                if (constraintAnchor23 != null) {
                    if (constraintWidget3 != constraintWidget4) {
                        linearSystem.addEquality(constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, constraintAnchor22.getMargin(), 5);
                    } else if (constraintAnchor25 != null) {
                        linearSystem.addCentering(constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, constraintAnchor22.getMargin(), 0.5f, constraintAnchor24.mSolverVariable, constraintAnchor25.mSolverVariable, constraintAnchor24.getMargin(), 5);
                    }
                }
                if (constraintAnchor25 != null && constraintWidget3 != constraintWidget4) {
                    linearSystem.addEquality(constraintAnchor24.mSolverVariable, constraintAnchor25.mSolverVariable, -constraintAnchor24.getMargin(), 5);
                }
            }
        } else {
            int i20 = chainHead.mWidgetsMatchCount;
            boolean z11 = i20 > 0 && chainHead.mWidgetsCount == i20;
            ConstraintWidget constraintWidget16 = constraintWidget3;
            ConstraintWidget constraintWidget17 = constraintWidget16;
            while (constraintWidget16 != null) {
                ConstraintWidget constraintWidget18 = constraintWidget16.mNextChainWidget[i];
                while (constraintWidget18 != null && constraintWidget18.getVisibility() == 8) {
                    constraintWidget18 = constraintWidget18.mNextChainWidget[i];
                }
                if (constraintWidget18 != null || constraintWidget16 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor26 = constraintWidget16.mListAnchors[i2];
                    SolverVariable solverVariable16 = constraintAnchor26.mSolverVariable;
                    ConstraintAnchor constraintAnchor27 = constraintAnchor26.mTarget;
                    SolverVariable solverVariable17 = constraintAnchor27 != null ? constraintAnchor27.mSolverVariable : null;
                    if (constraintWidget17 != constraintWidget16) {
                        constraintAnchor3 = constraintWidget17.mListAnchors[i2 + 1];
                    } else {
                        if (constraintWidget16 == constraintWidget3 && constraintWidget17 == constraintWidget16) {
                            constraintAnchor3 = constraintWidget9.mListAnchors[i2].mTarget;
                            if (constraintAnchor3 == null) {
                                solverVariable17 = null;
                            }
                        }
                        margin2 = constraintAnchor26.getMargin();
                        i5 = i2 + 1;
                        margin3 = constraintWidget16.mListAnchors[i5].getMargin();
                        if (constraintWidget18 != null) {
                            constraintAnchor4 = constraintWidget18.mListAnchors[i2];
                            SolverVariable solverVariable18 = constraintAnchor4.mSolverVariable;
                            solverVariable4 = constraintWidget16.mListAnchors[i5].mSolverVariable;
                            solverVariable3 = solverVariable18;
                        } else {
                            constraintAnchor4 = constraintWidget2.mListAnchors[i5].mTarget;
                            if (constraintAnchor4 != null) {
                                solverVariable3 = constraintAnchor4.mSolverVariable;
                            } else {
                                solverVariable3 = null;
                            }
                            solverVariable4 = constraintWidget16.mListAnchors[i5].mSolverVariable;
                        }
                        if (constraintAnchor4 != null) {
                            margin3 += constraintAnchor4.getMargin();
                        }
                        if (constraintWidget17 != null) {
                            margin2 += constraintWidget17.mListAnchors[i5].getMargin();
                        }
                        if (solverVariable16 == null && solverVariable17 != null && solverVariable3 != null && solverVariable4 != null) {
                            if (constraintWidget16 == constraintWidget3) {
                                margin2 = constraintWidget3.mListAnchors[i2].getMargin();
                            }
                            linearSystem.addCentering(solverVariable16, solverVariable17, margin2, 0.5f, solverVariable3, solverVariable4, constraintWidget16 == constraintWidget4 ? constraintWidget4.mListAnchors[i5].getMargin() : margin3, z11 ? 8 : 5);
                        }
                    }
                    solverVariable17 = constraintAnchor3.mSolverVariable;
                    margin2 = constraintAnchor26.getMargin();
                    i5 = i2 + 1;
                    margin3 = constraintWidget16.mListAnchors[i5].getMargin();
                    if (constraintWidget18 != null) {
                        constraintAnchor4 = constraintWidget18.mListAnchors[i2];
                        SolverVariable solverVariable19 = constraintAnchor4.mSolverVariable;
                        solverVariable4 = constraintWidget16.mListAnchors[i5].mSolverVariable;
                        solverVariable3 = solverVariable19;
                    } else {
                        constraintAnchor4 = constraintWidget2.mListAnchors[i5].mTarget;
                        if (constraintAnchor4 != null) {
                            solverVariable3 = constraintAnchor4.mSolverVariable;
                        } else {
                            solverVariable3 = null;
                        }
                        solverVariable4 = constraintWidget16.mListAnchors[i5].mSolverVariable;
                    }
                    if (constraintAnchor4 != null) {
                        margin3 += constraintAnchor4.getMargin();
                    }
                    if (constraintWidget17 != null) {
                        margin2 += constraintWidget17.mListAnchors[i5].getMargin();
                    }
                    if (solverVariable16 == null) {
                    }
                }
                if (constraintWidget16.getVisibility() != 8) {
                    constraintWidget17 = constraintWidget16;
                }
                constraintWidget16 = constraintWidget18;
            }
        }
        if ((!z9 && !z5) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
            return;
        }
        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget3.mListAnchors;
        ConstraintAnchor constraintAnchor28 = constraintAnchorArr6[i2];
        int i21 = i2 + 1;
        ConstraintAnchor constraintAnchor29 = constraintWidget4.mListAnchors[i21];
        ConstraintAnchor constraintAnchor30 = constraintAnchor28.mTarget;
        SolverVariable solverVariable20 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
        ConstraintAnchor constraintAnchor31 = constraintAnchor29.mTarget;
        if (constraintAnchor31 != null) {
            solverVariable5 = constraintAnchor31.mSolverVariable;
        } else {
            r5 = 0;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor32 = constraintWidget2.mListAnchors[i21].mTarget;
            if (constraintAnchor32 != null) {
                r5 = solverVariable5;
                obj = constraintAnchor32.mSolverVariable;
            }
            r5 = solverVariable5;
            r5 = obj;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor29 = constraintAnchorArr6[i21];
        }
        if (solverVariable20 == null || r5 == 0) {
            return;
        }
        linearSystem.addCentering(constraintAnchor28.mSolverVariable, solverVariable20, constraintAnchor28.getMargin(), 0.5f, r5, constraintAnchor29.mSolverVariable, constraintWidget4.mListAnchors[i21].getMargin(), 5);
    }
}
