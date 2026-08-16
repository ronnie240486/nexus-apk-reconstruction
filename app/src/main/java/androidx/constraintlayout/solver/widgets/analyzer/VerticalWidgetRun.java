package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Helper;

/* JADX INFO: loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode baseline;
    DimensionDependency baselineDimension;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun$1 */
    public static /* synthetic */ class C25591 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f10094xbf6f0c8e;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f10094xbf6f0c8e = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10094xbf6f0c8e[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10094xbf6f0c8e[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.baseline = dependencyNode;
        this.baselineDimension = null;
        this.start.type = DependencyNode.Type.TOP;
        this.end.type = DependencyNode.Type.BOTTOM;
        dependencyNode.type = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03d5 A[PHI: r0
      0x03d5: PHI (r0v32 androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun) = 
      (r0v23 androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun)
      (r0v47 androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun)
     binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.widget.hasBaseline() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.baseline;
        r1 = r10.start;
        r2 = r10.baselineDimension;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.widget.hasBaseline() != false) goto L110;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void apply() {
        ConstraintWidget parent;
        HorizontalWidgetRun horizontalWidgetRun;
        WidgetRun widgetRun;
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        int baselineDistance;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget.measured) {
            this.dimension.resolve(constraintWidget.getHeight());
        }
        if (!this.dimension.resolved) {
            this.dimensionBehavior = this.widget.getVerticalDimensionBehaviour();
            if (this.widget.hasBaseline()) {
                this.baselineDimension = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.dimensionBehavior;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.widget.getParent()) != null && parent2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int height = (parent2.getHeight() - this.widget.mTop.getMargin()) - this.widget.mBottom.getMargin();
                    addTarget(this.start, parent2.verticalRun.start, this.widget.mTop.getMargin());
                    addTarget(this.end, parent2.verticalRun.end, -this.widget.mBottom.getMargin());
                    this.dimension.resolve(height);
                    return;
                }
                if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.dimension.resolve(this.widget.getHeight());
                }
            }
        } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.widget.getParent()) != null && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.verticalRun.start, this.widget.mTop.getMargin());
            addTarget(this.end, parent.verticalRun.end, -this.widget.mBottom.getMargin());
            return;
        }
        DimensionDependency dimensionDependency = this.dimension;
        boolean z = dimensionDependency.resolved;
        if (z) {
            ConstraintWidget constraintWidget2 = this.widget;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[3].mTarget != null) {
                    if (constraintWidget2.isInVerticalChain()) {
                        this.start.margin = this.widget.mListAnchors[2].getMargin();
                        this.end.margin = -this.widget.mListAnchors[3].getMargin();
                    } else {
                        DependencyNode target = getTarget(this.widget.mListAnchors[2]);
                        if (target != null) {
                            addTarget(this.start, target, this.widget.mListAnchors[2].getMargin());
                        }
                        DependencyNode target2 = getTarget(this.widget.mListAnchors[3]);
                        if (target2 != null) {
                            addTarget(this.end, target2, -this.widget.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if (!this.widget.hasBaseline()) {
                        return;
                    }
                } else if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 == null) {
                        return;
                    }
                    addTarget(this.start, target3, this.widget.mListAnchors[2].getMargin());
                    addTarget(this.end, this.start, this.dimension.value);
                    if (!this.widget.hasBaseline()) {
                        return;
                    }
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.mTarget == null) {
                        ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                        if (constraintAnchor4.mTarget != null) {
                            DependencyNode target4 = getTarget(constraintAnchor4);
                            if (target4 == null) {
                                return;
                            }
                            addTarget(this.baseline, target4, 0);
                            addTarget(this.start, this.baseline, -this.widget.getBaselineDistance());
                            dependencyNode = this.end;
                            dependencyNode2 = this.start;
                            baselineDistance = this.dimension.value;
                        } else {
                            if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                                return;
                            }
                            addTarget(this.start, this.widget.getParent().verticalRun.start, this.widget.getY());
                            addTarget(this.end, this.start, this.dimension.value);
                            if (!this.widget.hasBaseline()) {
                                return;
                            }
                        }
                        addTarget(dependencyNode, dependencyNode2, baselineDistance);
                        return;
                    }
                    DependencyNode target5 = getTarget(constraintAnchor3);
                    if (target5 != null) {
                        addTarget(this.end, target5, -this.widget.mListAnchors[3].getMargin());
                        addTarget(this.start, this.end, -this.dimension.value);
                    }
                    if (!this.widget.hasBaseline()) {
                        return;
                    }
                }
                dependencyNode = this.baseline;
                dependencyNode2 = this.start;
                baselineDistance = this.widget.getBaselineDistance();
                addTarget(dependencyNode, dependencyNode2, baselineDistance);
                return;
            }
        }
        if (z || this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            dimensionDependency.addDependency(this);
        } else {
            ConstraintWidget constraintWidget3 = this.widget;
            int i = constraintWidget3.mMatchConstraintDefaultHeight;
            if (i == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    widgetRun = parent3.verticalRun;
                    DimensionDependency dimensionDependency2 = widgetRun.dimension;
                    this.dimension.targets.add(dimensionDependency2);
                    dimensionDependency2.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency3 = this.dimension;
                    dimensionDependency3.delegateToWidgetRun = true;
                    dimensionDependency3.dependencies.add(this.start);
                    this.dimension.dependencies.add(this.end);
                }
            } else if (i == 3 && !constraintWidget3.isInVerticalChain()) {
                ConstraintWidget constraintWidget4 = this.widget;
                if (constraintWidget4.mMatchConstraintDefaultWidth != 3) {
                    widgetRun = constraintWidget4.horizontalRun;
                    DimensionDependency dimensionDependency4 = widgetRun.dimension;
                    this.dimension.targets.add(dimensionDependency4);
                    dimensionDependency4.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency5 = this.dimension;
                    dimensionDependency5.delegateToWidgetRun = true;
                    dimensionDependency5.dependencies.add(this.start);
                    this.dimension.dependencies.add(this.end);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.widget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.mListAnchors;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
        if (constraintAnchor6 == null || constraintAnchorArr2[3].mTarget == null) {
            if (constraintAnchor6 != null) {
                DependencyNode target6 = getTarget(constraintAnchor5);
                if (target6 != null) {
                    addTarget(this.start, target6, this.widget.mListAnchors[2].getMargin());
                    addTarget(this.end, this.start, 1, this.dimension);
                    if (this.widget.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.baselineDimension);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.dimensionBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour2 == dimensionBehaviour3 && this.widget.getDimensionRatio() > 0.0f) {
                        horizontalWidgetRun = this.widget.horizontalRun;
                        if (horizontalWidgetRun.dimensionBehavior == dimensionBehaviour3) {
                            horizontalWidgetRun.dimension.dependencies.add(this.dimension);
                            this.dimension.targets.add(this.widget.horizontalRun.dimension);
                            this.dimension.updateDelegate = this;
                        }
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
                if (constraintAnchor7.mTarget != null) {
                    DependencyNode target7 = getTarget(constraintAnchor7);
                    if (target7 != null) {
                        addTarget(this.end, target7, -this.widget.mListAnchors[3].getMargin());
                        addTarget(this.start, this.end, -1, this.dimension);
                    }
                } else {
                    ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                    if (constraintAnchor8.mTarget != null) {
                        DependencyNode target8 = getTarget(constraintAnchor8);
                        if (target8 != null) {
                            addTarget(this.baseline, target8, 0);
                            addTarget(this.start, this.baseline, -1, this.baselineDimension);
                            DependencyNode dependencyNode3 = this.end;
                            DependencyNode dependencyNode4 = this.start;
                            DimensionDependency dimensionDependency6 = this.dimension;
                            addTarget(dependencyNode3, dependencyNode4, 1, dimensionDependency6);
                        }
                    } else if (!(constraintWidget5 instanceof Helper) && constraintWidget5.getParent() != null) {
                        addTarget(this.start, this.widget.getParent().verticalRun.start, this.widget.getY());
                        addTarget(this.end, this.start, 1, this.dimension);
                        if (this.widget.hasBaseline()) {
                            addTarget(this.baseline, this.start, 1, this.baselineDimension);
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.dimensionBehavior;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour4 == dimensionBehaviour5 && this.widget.getDimensionRatio() > 0.0f) {
                            horizontalWidgetRun = this.widget.horizontalRun;
                            if (horizontalWidgetRun.dimensionBehavior == dimensionBehaviour5) {
                                horizontalWidgetRun.dimension.dependencies.add(this.dimension);
                                this.dimension.targets.add(this.widget.horizontalRun.dimension);
                                this.dimension.updateDelegate = this;
                            }
                        }
                    }
                }
            }
        } else if (constraintWidget5.isInVerticalChain()) {
            this.start.margin = this.widget.mListAnchors[2].getMargin();
            this.end.margin = -this.widget.mListAnchors[3].getMargin();
        } else {
            DependencyNode target9 = getTarget(this.widget.mListAnchors[2]);
            DependencyNode target10 = getTarget(this.widget.mListAnchors[3]);
            target9.addDependency(this);
            target10.addDependency(this);
            this.mRunType = WidgetRun.RunType.CENTER;
        }
        if (this.dimension.targets.size() == 0) {
            this.dimension.readyToSolve = true;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.widget.setY(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
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
        this.baseline.clear();
        this.baseline.resolved = false;
        this.dimension.resolved = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.widget.mMatchConstraintDefaultHeight == 0;
    }

    public String toString() {
        return "VerticalRun " + this.widget.getDebugName();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        float f;
        float dimensionRatio;
        int dimensionRatio2;
        int i = C25591.f10094xbf6f0c8e[this.mRunType.ordinal()];
        if (i == 1) {
            updateRunStart(dependency);
        } else if (i == 2) {
            updateRunEnd(dependency);
        } else if (i == 3) {
            ConstraintWidget constraintWidget = this.widget;
            updateRunCenter(dependency, constraintWidget.mTop, constraintWidget.mBottom, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.readyToSolve && !dimensionDependency.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.widget;
            int i2 = constraintWidget2.mMatchConstraintDefaultHeight;
            if (i2 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    DimensionDependency dimensionDependency2 = parent.verticalRun.dimension;
                    if (dimensionDependency2.resolved) {
                        f = this.widget.mMatchConstraintPercentHeight;
                        dimensionRatio = dimensionDependency2.value;
                        dimensionRatio2 = (int) ((dimensionRatio * f) + 0.5f);
                        this.dimension.resolve(dimensionRatio2);
                    }
                }
            } else if (i2 == 3 && constraintWidget2.horizontalRun.dimension.resolved) {
                int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                if (dimensionRatioSide == -1) {
                    ConstraintWidget constraintWidget3 = this.widget;
                    dimensionRatio2 = (int) ((constraintWidget3.horizontalRun.dimension.value / constraintWidget3.getDimensionRatio()) + 0.5f);
                } else if (dimensionRatioSide == 0) {
                    ConstraintWidget constraintWidget4 = this.widget;
                    f = constraintWidget4.horizontalRun.dimension.value;
                    dimensionRatio = constraintWidget4.getDimensionRatio();
                    dimensionRatio2 = (int) ((dimensionRatio * f) + 0.5f);
                } else if (dimensionRatioSide != 1) {
                    dimensionRatio2 = 0;
                } else {
                    ConstraintWidget constraintWidget5 = this.widget;
                    dimensionRatio2 = (int) ((constraintWidget5.horizontalRun.dimension.value / constraintWidget5.getDimensionRatio()) + 0.5f);
                }
                this.dimension.resolve(dimensionRatio2);
            }
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (dependencyNode.resolved && dependencyNode2.resolved && this.dimension.resolved) {
                    return;
                }
                if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.widget;
                    if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInVerticalChain()) {
                        DependencyNode dependencyNode3 = this.start.targets.get(0);
                        DependencyNode dependencyNode4 = this.end.targets.get(0);
                        int i3 = dependencyNode3.value;
                        DependencyNode dependencyNode5 = this.start;
                        int i4 = i3 + dependencyNode5.margin;
                        int i5 = dependencyNode4.value + this.end.margin;
                        dependencyNode5.resolve(i4);
                        this.end.resolve(i5);
                        this.dimension.resolve(i5 - i4);
                        return;
                    }
                }
                if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.targets.size() > 0 && this.end.targets.size() > 0) {
                    DependencyNode dependencyNode6 = this.start.targets.get(0);
                    int i6 = (this.end.targets.get(0).value + this.end.margin) - (dependencyNode6.value + this.start.margin);
                    DimensionDependency dimensionDependency3 = this.dimension;
                    int i7 = dimensionDependency3.wrapValue;
                    if (i6 < i7) {
                        dimensionDependency3.resolve(i6);
                    } else {
                        dimensionDependency3.resolve(i7);
                    }
                }
                if (this.dimension.resolved && this.start.targets.size() > 0 && this.end.targets.size() > 0) {
                    DependencyNode dependencyNode7 = this.start.targets.get(0);
                    DependencyNode dependencyNode8 = this.end.targets.get(0);
                    int i8 = dependencyNode7.value + this.start.margin;
                    int i9 = dependencyNode8.value + this.end.margin;
                    float verticalBiasPercent = this.widget.getVerticalBiasPercent();
                    if (dependencyNode7 == dependencyNode8) {
                        i8 = dependencyNode7.value;
                        i9 = dependencyNode8.value;
                        verticalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) ((((i9 - i8) - this.dimension.value) * verticalBiasPercent) + i8 + 0.5f));
                    this.end.resolve(this.start.value + this.dimension.value);
                }
            }
        }
    }
}
