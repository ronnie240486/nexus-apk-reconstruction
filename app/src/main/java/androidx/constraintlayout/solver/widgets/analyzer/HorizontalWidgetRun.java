package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {
    private static int[] tempDimensions = new int[2];

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun$1 */
    public static /* synthetic */ class C25581 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f10093xbf6f0c8e;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f10093xbf6f0c8e = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10093xbf6f0c8e[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10093xbf6f0c8e[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.type = DependencyNode.Type.LEFT;
        this.end.type = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    private void computeInsetRatio(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0333  */
    /* JADX WARN: Code duplicated, block: B:104:0x0339  */
    /* JADX WARN: Code duplicated, block: B:105:0x0346  */
    /* JADX WARN: Code duplicated, block: B:107:0x034c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0352  */
    /* JADX WARN: Code duplicated, block: B:110:0x036d  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0245  */
    /* JADX WARN: Code duplicated, block: B:85:0x024d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0265  */
    /* JADX WARN: Code duplicated, block: B:88:0x026e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bf  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget parent;
        ConstraintWidget constraintWidget;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        DependencyNode target;
        DependencyNode dependencyNode;
        int x;
        DependencyNode target2;
        DependencyNode dependencyNode2;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget constraintWidget2;
        int i;
        ConstraintWidget parent2;
        List<Dependency> list;
        Dependency dependency;
        DependencyNode dependencyNode3;
        DependencyNode target3;
        DependencyNode dependencyNode4;
        int x2;
        DependencyNode dependencyNode5;
        DependencyNode dependencyNode6;
        int i2;
        ConstraintWidget parent3;
        ConstraintWidget constraintWidget3 = this.widget;
        if (constraintWidget3.measured) {
            this.dimension.resolve(constraintWidget3.getWidth());
        }
        if (this.dimension.resolved) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.dimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (((parent = this.widget.getParent()) != null && parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour2)) {
                addTarget(this.start, parent.horizontalRun.start, this.widget.mLeft.getMargin());
                addTarget(this.end, parent.horizontalRun.end, -this.widget.mRight.getMargin());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.widget.getHorizontalDimensionBehaviour();
            this.dimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour3 && (((parent3 = this.widget.getParent()) != null && parent3.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) || parent3.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                    int width = (parent3.getWidth() - this.widget.mLeft.getMargin()) - this.widget.mRight.getMargin();
                    addTarget(this.start, parent3.horizontalRun.start, this.widget.mLeft.getMargin());
                    addTarget(this.end, parent3.horizontalRun.end, -this.widget.mRight.getMargin());
                    this.dimension.resolve(width);
                    return;
                }
                if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.dimension.resolve(this.widget.getWidth());
                }
            }
        }
        DimensionDependency dimensionDependency = this.dimension;
        if (!dimensionDependency.resolved) {
            if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                constraintWidget2 = this.widget;
                i = constraintWidget2.mMatchConstraintDefaultWidth;
                if (i != 2) {
                    parent2 = constraintWidget2.getParent();
                    if (parent2 != null) {
                        DimensionDependency dimensionDependency2 = parent2.verticalRun.dimension;
                        this.dimension.targets.add(dimensionDependency2);
                        dimensionDependency2.dependencies.add(this.dimension);
                        DimensionDependency dimensionDependency3 = this.dimension;
                        dimensionDependency3.delegateToWidgetRun = true;
                        dimensionDependency3.dependencies.add(this.start);
                        list = this.dimension.dependencies;
                        dependency = this.end;
                        list.add(dependency);
                    }
                } else if (i == 3) {
                    if (constraintWidget2.mMatchConstraintDefaultHeight == 3) {
                        this.start.updateDelegate = this;
                        this.end.updateDelegate = this;
                        VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
                        verticalWidgetRun.start.updateDelegate = this;
                        verticalWidgetRun.end.updateDelegate = this;
                        dimensionDependency.updateDelegate = this;
                        if (constraintWidget2.isInVerticalChain()) {
                            this.dimension.targets.add(this.widget.verticalRun.dimension);
                            this.widget.verticalRun.dimension.dependencies.add(this.dimension);
                            VerticalWidgetRun verticalWidgetRun2 = this.widget.verticalRun;
                            verticalWidgetRun2.dimension.updateDelegate = this;
                            this.dimension.targets.add(verticalWidgetRun2.start);
                            this.dimension.targets.add(this.widget.verticalRun.end);
                            this.widget.verticalRun.start.dependencies.add(this.dimension);
                            list = this.widget.verticalRun.end.dependencies;
                            dependency = this.dimension;
                        } else if (this.widget.isInHorizontalChain()) {
                            this.widget.verticalRun.dimension.targets.add(this.dimension);
                            list = this.dimension.dependencies;
                            dependency = this.widget.verticalRun.dimension;
                        } else {
                            dependencyNode3 = this.widget.verticalRun.dimension;
                        }
                        list.add(dependency);
                    } else {
                        DimensionDependency dimensionDependency4 = constraintWidget2.verticalRun.dimension;
                        dimensionDependency.targets.add(dimensionDependency4);
                        dimensionDependency4.dependencies.add(this.dimension);
                        this.widget.verticalRun.start.dependencies.add(this.dimension);
                        this.widget.verticalRun.end.dependencies.add(this.dimension);
                        DimensionDependency dimensionDependency5 = this.dimension;
                        dimensionDependency5.delegateToWidgetRun = true;
                        dimensionDependency5.dependencies.add(this.start);
                        this.dimension.dependencies.add(this.end);
                        this.start.targets.add(this.dimension);
                        dependencyNode3 = this.end;
                    }
                    list = dependencyNode3.targets;
                    dependency = this.dimension;
                    list.add(dependency);
                }
            }
            constraintWidget = this.widget;
            constraintAnchorArr = constraintWidget.mListAnchors;
            constraintAnchor = constraintAnchorArr[0];
            constraintAnchor2 = constraintAnchor.mTarget;
            if (constraintAnchor2 != null) {
            }
            if (constraintAnchor2 == null) {
                constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.mTarget == null) {
                    if (constraintWidget instanceof Helper) {
                        return;
                    } else {
                        return;
                    }
                }
                target2 = getTarget(constraintAnchor3);
                if (target2 != null) {
                    addTarget(this.end, target2, -this.widget.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -1, this.dimension);
                    return;
                }
                return;
            }
            target = getTarget(constraintAnchor);
            if (target != null) {
                return;
            }
            dependencyNode = this.start;
            x = this.widget.mListAnchors[0].getMargin();
            addTarget(dependencyNode, target, x);
            addTarget(this.end, this.start, 1, this.dimension);
            return;
        }
        ConstraintWidget constraintWidget4 = this.widget;
        if (constraintWidget4.measured) {
            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
            ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[0];
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
            if (constraintAnchor6 == null || constraintAnchorArr2[1].mTarget == null) {
                if (constraintAnchor6 == null) {
                    ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[1];
                    if (constraintAnchor7.mTarget != null) {
                        DependencyNode target4 = getTarget(constraintAnchor7);
                        if (target4 == null) {
                            return;
                        }
                        addTarget(this.end, target4, -this.widget.mListAnchors[1].getMargin());
                        dependencyNode5 = this.start;
                        dependencyNode6 = this.end;
                        i2 = -this.dimension.value;
                    } else {
                        if ((constraintWidget4 instanceof Helper) || constraintWidget4.getParent() == null || this.widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                            return;
                        }
                        target3 = this.widget.getParent().horizontalRun.start;
                        dependencyNode4 = this.start;
                        x2 = this.widget.getX();
                    }
                    addTarget(dependencyNode5, dependencyNode6, i2);
                    return;
                }
                target3 = getTarget(constraintAnchor5);
                if (target3 == null) {
                    return;
                }
                dependencyNode4 = this.start;
                x2 = this.widget.mListAnchors[0].getMargin();
                addTarget(dependencyNode4, target3, x2);
                dependencyNode5 = this.end;
                dependencyNode6 = this.start;
                i2 = this.dimension.value;
                addTarget(dependencyNode5, dependencyNode6, i2);
                return;
            }
            if (!constraintWidget4.isInHorizontalChain()) {
                DependencyNode target5 = getTarget(this.widget.mListAnchors[0]);
                if (target5 != null) {
                    addTarget(this.start, target5, this.widget.mListAnchors[0].getMargin());
                }
                DependencyNode target6 = getTarget(this.widget.mListAnchors[1]);
                if (target6 != null) {
                    addTarget(this.end, target6, -this.widget.mListAnchors[1].getMargin());
                }
                this.start.delegateToWidgetRun = true;
                this.end.delegateToWidgetRun = true;
                return;
            }
            this.start.margin = this.widget.mListAnchors[0].getMargin();
            dependencyNode2 = this.end;
            constraintAnchor4 = this.widget.mListAnchors[1];
        } else {
            if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                constraintWidget2 = this.widget;
                i = constraintWidget2.mMatchConstraintDefaultWidth;
                if (i != 2) {
                    parent2 = constraintWidget2.getParent();
                    if (parent2 != null) {
                        DimensionDependency dimensionDependency6 = parent2.verticalRun.dimension;
                        this.dimension.targets.add(dimensionDependency6);
                        dimensionDependency6.dependencies.add(this.dimension);
                        DimensionDependency dimensionDependency7 = this.dimension;
                        dimensionDependency7.delegateToWidgetRun = true;
                        dimensionDependency7.dependencies.add(this.start);
                        list = this.dimension.dependencies;
                        dependency = this.end;
                        list.add(dependency);
                    }
                } else if (i == 3) {
                    if (constraintWidget2.mMatchConstraintDefaultHeight == 3) {
                        this.start.updateDelegate = this;
                        this.end.updateDelegate = this;
                        VerticalWidgetRun verticalWidgetRun3 = constraintWidget2.verticalRun;
                        verticalWidgetRun3.start.updateDelegate = this;
                        verticalWidgetRun3.end.updateDelegate = this;
                        dimensionDependency.updateDelegate = this;
                        if (constraintWidget2.isInVerticalChain()) {
                            this.dimension.targets.add(this.widget.verticalRun.dimension);
                            this.widget.verticalRun.dimension.dependencies.add(this.dimension);
                            VerticalWidgetRun verticalWidgetRun4 = this.widget.verticalRun;
                            verticalWidgetRun4.dimension.updateDelegate = this;
                            this.dimension.targets.add(verticalWidgetRun4.start);
                            this.dimension.targets.add(this.widget.verticalRun.end);
                            this.widget.verticalRun.start.dependencies.add(this.dimension);
                            list = this.widget.verticalRun.end.dependencies;
                            dependency = this.dimension;
                        } else if (this.widget.isInHorizontalChain()) {
                            this.widget.verticalRun.dimension.targets.add(this.dimension);
                            list = this.dimension.dependencies;
                            dependency = this.widget.verticalRun.dimension;
                        } else {
                            dependencyNode3 = this.widget.verticalRun.dimension;
                        }
                        list.add(dependency);
                    } else {
                        DimensionDependency dimensionDependency8 = constraintWidget2.verticalRun.dimension;
                        dimensionDependency.targets.add(dimensionDependency8);
                        dimensionDependency8.dependencies.add(this.dimension);
                        this.widget.verticalRun.start.dependencies.add(this.dimension);
                        this.widget.verticalRun.end.dependencies.add(this.dimension);
                        DimensionDependency dimensionDependency9 = this.dimension;
                        dimensionDependency9.delegateToWidgetRun = true;
                        dimensionDependency9.dependencies.add(this.start);
                        this.dimension.dependencies.add(this.end);
                        this.start.targets.add(this.dimension);
                        dependencyNode3 = this.end;
                    }
                    list = dependencyNode3.targets;
                    dependency = this.dimension;
                    list.add(dependency);
                }
            }
            constraintWidget = this.widget;
            constraintAnchorArr = constraintWidget.mListAnchors;
            constraintAnchor = constraintAnchorArr[0];
            constraintAnchor2 = constraintAnchor.mTarget;
            if (constraintAnchor2 != null || constraintAnchorArr[1].mTarget == null) {
                if (constraintAnchor2 == null) {
                    target = getTarget(constraintAnchor);
                    if (target != null) {
                        return;
                    }
                    dependencyNode = this.start;
                    x = this.widget.mListAnchors[0].getMargin();
                } else {
                    constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.mTarget == null) {
                        target2 = getTarget(constraintAnchor3);
                        if (target2 != null) {
                            addTarget(this.end, target2, -this.widget.mListAnchors[1].getMargin());
                            addTarget(this.start, this.end, -1, this.dimension);
                            return;
                        }
                        return;
                    }
                    if ((constraintWidget instanceof Helper) || constraintWidget.getParent() == null) {
                        return;
                    }
                    target = this.widget.getParent().horizontalRun.start;
                    dependencyNode = this.start;
                    x = this.widget.getX();
                }
                addTarget(dependencyNode, target, x);
                addTarget(this.end, this.start, 1, this.dimension);
                return;
            }
            if (!constraintWidget.isInHorizontalChain()) {
                DependencyNode target7 = getTarget(this.widget.mListAnchors[0]);
                DependencyNode target8 = getTarget(this.widget.mListAnchors[1]);
                target7.addDependency(this);
                target8.addDependency(this);
                this.mRunType = WidgetRun.RunType.CENTER;
                return;
            }
            this.start.margin = this.widget.mListAnchors[0].getMargin();
            dependencyNode2 = this.end;
            constraintAnchor4 = this.widget.mListAnchors[1];
        }
        dependencyNode2.margin = -constraintAnchor4.getMargin();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.widget.setX(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        this.start.clear();
        this.end.clear();
        this.dimension.clear();
        this.resolved = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void reset() {
        this.resolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.dimension.resolved = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.widget.mMatchConstraintDefaultWidth == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.widget.getDebugName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x029b, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Dependency dependency) {
        float f;
        float dimensionRatio;
        int dimensionRatio2;
        int limitedDimension;
        int limitedDimension2;
        float f2;
        DimensionDependency dimensionDependency;
        int limitedDimension3;
        int limitedDimension4;
        float f3;
        int i = C25581.f10093xbf6f0c8e[this.mRunType.ordinal()];
        if (i == 1) {
            updateRunStart(dependency);
        } else if (i == 2) {
            updateRunEnd(dependency);
        } else if (i == 3) {
            ConstraintWidget constraintWidget = this.widget;
            updateRunCenter(dependency, constraintWidget.mLeft, constraintWidget.mRight, 0);
            return;
        }
        if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.widget;
            int i2 = constraintWidget2.mMatchConstraintDefaultWidth;
            if (i2 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    DimensionDependency dimensionDependency2 = parent.horizontalRun.dimension;
                    if (dimensionDependency2.resolved) {
                        f = this.widget.mMatchConstraintPercentWidth;
                        dimensionRatio = dimensionDependency2.value;
                        dimensionRatio2 = (int) ((dimensionRatio * f) + 0.5f);
                        this.dimension.resolve(dimensionRatio2);
                    }
                }
            } else if (i2 == 3) {
                int i3 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i3 == 0 || i3 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
                    DependencyNode dependencyNode = verticalWidgetRun.start;
                    DependencyNode dependencyNode2 = verticalWidgetRun.end;
                    boolean z = constraintWidget2.mLeft.mTarget != null;
                    boolean z2 = constraintWidget2.mTop.mTarget != null;
                    boolean z3 = constraintWidget2.mRight.mTarget != null;
                    boolean z4 = constraintWidget2.mBottom.mTarget != null;
                    int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                    if (z && z2 && z3 && z4) {
                        float dimensionRatio3 = this.widget.getDimensionRatio();
                        if (dependencyNode.resolved && dependencyNode2.resolved) {
                            DependencyNode dependencyNode3 = this.start;
                            if (dependencyNode3.readyToSolve && this.end.readyToSolve) {
                                computeInsetRatio(tempDimensions, dependencyNode3.targets.get(0).value + this.start.margin, this.end.targets.get(0).value - this.end.margin, dependencyNode.value + dependencyNode.margin, dependencyNode2.value - dependencyNode2.margin, dimensionRatio3, dimensionRatioSide);
                                this.dimension.resolve(tempDimensions[0]);
                                this.widget.verticalRun.dimension.resolve(tempDimensions[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.start;
                        if (dependencyNode4.resolved) {
                            DependencyNode dependencyNode5 = this.end;
                            if (dependencyNode5.resolved) {
                                if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                                    return;
                                }
                                computeInsetRatio(tempDimensions, dependencyNode4.value + dependencyNode4.margin, dependencyNode5.value - dependencyNode5.margin, dependencyNode.targets.get(0).value + dependencyNode.margin, dependencyNode2.targets.get(0).value - dependencyNode2.margin, dimensionRatio3, dimensionRatioSide);
                                this.dimension.resolve(tempDimensions[0]);
                                this.widget.verticalRun.dimension.resolve(tempDimensions[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.start;
                        if (!dependencyNode6.readyToSolve || !this.end.readyToSolve || !dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        computeInsetRatio(tempDimensions, dependencyNode6.targets.get(0).value + this.start.margin, this.end.targets.get(0).value - this.end.margin, dependencyNode.targets.get(0).value + dependencyNode.margin, dependencyNode2.targets.get(0).value - dependencyNode2.margin, dimensionRatio3, dimensionRatioSide);
                        this.dimension.resolve(tempDimensions[0]);
                        dimensionDependency = this.widget.verticalRun.dimension;
                        limitedDimension = tempDimensions[1];
                    } else if (z && z3) {
                        if (!this.start.readyToSolve || !this.end.readyToSolve) {
                            return;
                        }
                        float dimensionRatio4 = this.widget.getDimensionRatio();
                        int i4 = this.start.targets.get(0).value + this.start.margin;
                        int i5 = this.end.targets.get(0).value - this.end.margin;
                        if (dimensionRatioSide == -1 || dimensionRatioSide == 0) {
                            limitedDimension3 = getLimitedDimension(i5 - i4, 0);
                            int i6 = (int) ((limitedDimension3 * dimensionRatio4) + 0.5f);
                            limitedDimension4 = getLimitedDimension(i6, 1);
                            if (i6 != limitedDimension4) {
                                f3 = limitedDimension4 / dimensionRatio4;
                                limitedDimension3 = (int) (f3 + 0.5f);
                            }
                            this.dimension.resolve(limitedDimension3);
                            this.widget.verticalRun.dimension.resolve(limitedDimension4);
                        } else if (dimensionRatioSide == 1) {
                            limitedDimension3 = getLimitedDimension(i5 - i4, 0);
                            int i7 = (int) ((limitedDimension3 / dimensionRatio4) + 0.5f);
                            limitedDimension4 = getLimitedDimension(i7, 1);
                            if (i7 != limitedDimension4) {
                                f3 = limitedDimension4 * dimensionRatio4;
                                limitedDimension3 = (int) (f3 + 0.5f);
                            }
                            this.dimension.resolve(limitedDimension3);
                            this.widget.verticalRun.dimension.resolve(limitedDimension4);
                        }
                    } else if (z2 && z4) {
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        float dimensionRatio5 = this.widget.getDimensionRatio();
                        int i8 = dependencyNode.targets.get(0).value + dependencyNode.margin;
                        int i9 = dependencyNode2.targets.get(0).value - dependencyNode2.margin;
                        if (dimensionRatioSide == -1) {
                            limitedDimension = getLimitedDimension(i9 - i8, 1);
                            int i10 = (int) ((limitedDimension / dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i10, 0);
                            if (i10 != limitedDimension2) {
                                f2 = limitedDimension2 * dimensionRatio5;
                                limitedDimension = (int) (f2 + 0.5f);
                            }
                            this.dimension.resolve(limitedDimension2);
                            dimensionDependency = this.widget.verticalRun.dimension;
                        } else if (dimensionRatioSide == 0) {
                            limitedDimension = getLimitedDimension(i9 - i8, 1);
                            int i11 = (int) ((limitedDimension * dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i11, 0);
                            if (i11 != limitedDimension2) {
                                f2 = limitedDimension2 / dimensionRatio5;
                                limitedDimension = (int) (f2 + 0.5f);
                            }
                            this.dimension.resolve(limitedDimension2);
                            dimensionDependency = this.widget.verticalRun.dimension;
                        }
                    }
                    dimensionDependency.resolve(limitedDimension);
                } else {
                    int dimensionRatioSide2 = constraintWidget2.getDimensionRatioSide();
                    if (dimensionRatioSide2 != -1) {
                        if (dimensionRatioSide2 == 0) {
                            ConstraintWidget constraintWidget3 = this.widget;
                            dimensionRatio2 = (int) ((constraintWidget3.verticalRun.dimension.value / constraintWidget3.getDimensionRatio()) + 0.5f);
                        } else if (dimensionRatioSide2 != 1) {
                            dimensionRatio2 = 0;
                        }
                        this.dimension.resolve(dimensionRatio2);
                    }
                    ConstraintWidget constraintWidget4 = this.widget;
                    f = constraintWidget4.verticalRun.dimension.value;
                    dimensionRatio = constraintWidget4.getDimensionRatio();
                    dimensionRatio2 = (int) ((dimensionRatio * f) + 0.5f);
                    this.dimension.resolve(dimensionRatio2);
                }
            }
        }
        DependencyNode dependencyNode7 = this.start;
        if (dependencyNode7.readyToSolve) {
            DependencyNode dependencyNode8 = this.end;
            if (dependencyNode8.readyToSolve) {
                if (dependencyNode7.resolved && dependencyNode8.resolved && this.dimension.resolved) {
                    return;
                }
                if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.widget;
                    if (constraintWidget5.mMatchConstraintDefaultWidth == 0 && !constraintWidget5.isInHorizontalChain()) {
                        DependencyNode dependencyNode9 = this.start.targets.get(0);
                        DependencyNode dependencyNode10 = this.end.targets.get(0);
                        int i12 = dependencyNode9.value;
                        DependencyNode dependencyNode11 = this.start;
                        int i13 = i12 + dependencyNode11.margin;
                        int i14 = dependencyNode10.value + this.end.margin;
                        dependencyNode11.resolve(i13);
                        this.end.resolve(i14);
                        this.dimension.resolve(i14 - i13);
                        return;
                    }
                }
                if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.targets.size() > 0 && this.end.targets.size() > 0) {
                    int iMin = Math.min((this.end.targets.get(0).value + this.end.margin) - (this.start.targets.get(0).value + this.start.margin), this.dimension.wrapValue);
                    ConstraintWidget constraintWidget6 = this.widget;
                    int i15 = constraintWidget6.mMatchConstraintMaxWidth;
                    int iMax = Math.max(constraintWidget6.mMatchConstraintMinWidth, iMin);
                    if (i15 > 0) {
                        iMax = Math.min(i15, iMax);
                    }
                    this.dimension.resolve(iMax);
                }
                if (this.dimension.resolved) {
                    DependencyNode dependencyNode12 = this.start.targets.get(0);
                    DependencyNode dependencyNode13 = this.end.targets.get(0);
                    int i16 = dependencyNode12.value + this.start.margin;
                    int i17 = dependencyNode13.value + this.end.margin;
                    float horizontalBiasPercent = this.widget.getHorizontalBiasPercent();
                    if (dependencyNode12 == dependencyNode13) {
                        i16 = dependencyNode12.value;
                        i17 = dependencyNode13.value;
                        horizontalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) ((((i17 - i16) - this.dimension.value) * horizontalBiasPercent) + i16 + 0.5f));
                    this.end.resolve(this.start.value + this.dimension.value);
                }
            }
        }
    }
}
