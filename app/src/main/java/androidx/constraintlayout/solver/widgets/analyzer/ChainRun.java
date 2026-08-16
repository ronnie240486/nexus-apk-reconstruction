package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C4515i2;

/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends WidgetRun {
    private int chainStyle;
    ArrayList<WidgetRun> widgets;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.widgets = new ArrayList<>();
        this.orientation = i;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget previousChainMember = this.widget;
        do {
            constraintWidget = previousChainMember;
            previousChainMember = previousChainMember.getPreviousChainMember(this.orientation);
        } while (previousChainMember != null);
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        for (WidgetRun widgetRun : this.widgets) {
            int i = this.orientation;
            if (i == 0) {
                widgetRun.widget.horizontalChainRun = this;
            } else if (i == 1) {
                widgetRun.widget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl() && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) = 
      (r1v2 androidx.constraintlayout.solver.widgets.analyzer.DependencyNode)
      (r1v7 androidx.constraintlayout.solver.widgets.analyzer.DependencyNode)
     binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void apply() {
        DependencyNode target;
        int margin;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.widgets.get(0).widget;
        ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target2 = getTarget(constraintAnchor, 0);
            int margin2 = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin2 = firstVisibleWidget.mLeft.getMargin();
            }
            if (target2 != null) {
                addTarget(this.start, target2, margin2);
            }
            target = getTarget(constraintAnchor2, 0);
            margin = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin = lastVisibleWidget.mRight.getMargin();
            }
            if (target != null) {
                addTarget(this.end, target, -margin);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            target = getTarget(constraintAnchor4, 1);
            margin = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target != null) {
                addTarget(this.end, target, -margin);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            this.widgets.get(i).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.widgets.size();
        long wrapDimension = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            wrapDimension = ((long) widgetRun.end.margin) + widgetRun.getWrapDimension() + wrapDimension + ((long) widgetRun.start.margin);
        }
        return wrapDimension;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i = 0; i < size; i++) {
            if (!this.widgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String strConcat = "ChainRun ".concat(this.orientation == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.widgets) {
            strConcat = C4515i2.m21289a(C4515i2.m21289a(strConcat, "<") + widgetRun, "> ");
        }
        return strConcat;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01d0 A[PHI: r1 r22 r23 r24
      0x01d0: PHI (r1v51 int) = (r1v49 int), (r1v57 int) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x00f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x014f  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        float f2;
        int iMax;
        int i10;
        int i11;
        float f3;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.widget.getParent();
            boolean zIsRtl = (parent == null || !(parent instanceof ConstraintWidgetContainer)) ? false : ((ConstraintWidgetContainer) parent).isRtl();
            int i12 = this.end.value - this.start.value;
            int size = this.widgets.size();
            int i13 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i13 >= size) {
                    i13 = -1;
                    break;
                } else if (this.widgets.get(i13).widget.getVisibility() != 8) {
                    break;
                } else {
                    i13++;
                }
            }
            int i14 = size - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                if (this.widgets.get(i15).widget.getVisibility() != 8) {
                    i = i15;
                    break;
                }
            }
            int i16 = 0;
            while (true) {
                if (i16 >= 2) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f = 0.0f;
                    break;
                }
                int i17 = 0;
                i4 = 0;
                i5 = 0;
                int i18 = 0;
                f = 0.0f;
                while (i17 < size) {
                    WidgetRun widgetRun = this.widgets.get(i17);
                    if (widgetRun.widget.getVisibility() != i2) {
                        i18++;
                        if (i17 > 0 && i17 >= i13) {
                            i4 += widgetRun.start.margin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.dimension;
                        int i19 = dimensionDependency.value;
                        boolean z3 = widgetRun.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i20 = this.orientation;
                            if (i20 == 0 && !widgetRun.widget.horizontalRun.dimension.resolved) {
                                return;
                            }
                            if (i20 == 1 && !widgetRun.widget.verticalRun.dimension.resolved) {
                                return;
                            } else {
                                i10 = i19;
                            }
                        } else {
                            i10 = i19;
                            if (widgetRun.matchConstraintsType == 1 && i16 == 0) {
                                i11 = dimensionDependency.wrapValue;
                                i5++;
                            } else {
                                if (dimensionDependency.resolved) {
                                    i11 = i10;
                                }
                                if (z3) {
                                    i4 += i11;
                                } else {
                                    i5++;
                                    f3 = widgetRun.widget.mWeight[this.orientation];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                }
                                if (i17 >= i14 && i17 < i) {
                                    i4 += -widgetRun.end.margin;
                                }
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                f3 = widgetRun.widget.mWeight[this.orientation];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i11 = i10;
                        if (z3) {
                            i5++;
                            f3 = widgetRun.widget.mWeight[this.orientation];
                            if (f3 >= 0.0f) {
                                f += f3;
                            }
                        } else {
                            i4 += i11;
                        }
                        if (i17 >= i14) {
                        }
                    }
                    i17++;
                    i2 = 8;
                }
                if (i4 < i12 || i5 == 0) {
                    i3 = i18;
                    break;
                } else {
                    i16++;
                    i2 = 8;
                }
            }
            int i21 = this.start.value;
            if (zIsRtl) {
                i21 = this.end.value;
            }
            if (i4 > i12) {
                int i22 = (int) (((i4 - i12) / 2.0f) + 0.5f);
                i21 = zIsRtl ? i21 + i22 : i21 - i22;
            }
            if (i5 > 0) {
                float f4 = i12 - i4;
                int i23 = (int) ((f4 / i5) + 0.5f);
                int i24 = 0;
                int i25 = 0;
                while (i24 < size) {
                    WidgetRun widgetRun2 = this.widgets.get(i24);
                    int i26 = i23;
                    int i27 = i4;
                    if (widgetRun2.widget.getVisibility() != 8 && widgetRun2.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.dimension;
                        if (dimensionDependency2.resolved) {
                            z2 = zIsRtl;
                            i9 = i3;
                            i21 = i21;
                            f2 = f4;
                        } else {
                            int i28 = f > 0.0f ? (int) (((widgetRun2.widget.mWeight[this.orientation] * f4) / f) + 0.5f) : i26;
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.widget;
                                f2 = f4;
                                int i29 = constraintWidget.mMatchConstraintMaxWidth;
                                z2 = zIsRtl;
                                i9 = i3;
                                iMax = Math.max(constraintWidget.mMatchConstraintMinWidth, widgetRun2.matchConstraintsType == 1 ? Math.min(i28, dimensionDependency2.wrapValue) : i28);
                                if (i29 > 0) {
                                    iMax = Math.min(i29, iMax);
                                }
                                if (iMax != i28) {
                                    i25++;
                                    i28 = iMax;
                                }
                            } else {
                                z2 = zIsRtl;
                                i9 = i3;
                                f2 = f4;
                                ConstraintWidget constraintWidget2 = widgetRun2.widget;
                                int i30 = constraintWidget2.mMatchConstraintMaxHeight;
                                iMax = Math.max(constraintWidget2.mMatchConstraintMinHeight, widgetRun2.matchConstraintsType == 1 ? Math.min(i28, dimensionDependency2.wrapValue) : i28);
                                if (i30 > 0) {
                                    iMax = Math.min(i30, iMax);
                                }
                                if (iMax != i28) {
                                    i25++;
                                    i28 = iMax;
                                }
                            }
                            widgetRun2.dimension.resolve(i28);
                        }
                    } else {
                        z2 = zIsRtl;
                        i9 = i3;
                        i21 = i21;
                        f2 = f4;
                    }
                    i24++;
                    i23 = i26;
                    i4 = i27;
                    i21 = i21;
                    f4 = f2;
                    zIsRtl = z2;
                    i3 = i9;
                }
                z = zIsRtl;
                i6 = i3;
                i7 = i21;
                int i31 = i4;
                if (i25 > 0) {
                    i5 -= i25;
                    i4 = 0;
                    for (int i32 = 0; i32 < size; i32++) {
                        WidgetRun widgetRun3 = this.widgets.get(i32);
                        if (widgetRun3.widget.getVisibility() != 8) {
                            if (i32 > 0 && i32 >= i13) {
                                i4 += widgetRun3.start.margin;
                            }
                            i4 += widgetRun3.dimension.value;
                            if (i32 < i14 && i32 < i) {
                                i4 += -widgetRun3.end.margin;
                            }
                        }
                    }
                } else {
                    i4 = i31;
                }
                i8 = 2;
                if (this.chainStyle == 2 && i25 == 0) {
                    this.chainStyle = 0;
                }
            } else {
                z = zIsRtl;
                i6 = i3;
                i7 = i21;
                i8 = 2;
            }
            if (i4 > i12) {
                this.chainStyle = i8;
            }
            if (i6 > 0 && i5 == 0 && i13 == i) {
                this.chainStyle = i8;
            }
            int i33 = this.chainStyle;
            int i34 = i6;
            if (i33 == 1) {
                int i35 = i34 > 1 ? (i12 - i4) / (i34 - 1) : i34 == 1 ? (i12 - i4) / 2 : 0;
                if (i5 > 0) {
                    i35 = 0;
                }
                int i36 = i7;
                for (int i37 = 0; i37 < size; i37++) {
                    WidgetRun widgetRun4 = this.widgets.get(z ? size - (i37 + 1) : i37);
                    if (widgetRun4.widget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i36);
                        widgetRun4.end.resolve(i36);
                    } else {
                        if (i37 > 0) {
                            i36 = z ? i36 - i35 : i36 + i35;
                        }
                        if (i37 > 0 && i37 >= i13) {
                            int i38 = widgetRun4.start.margin;
                            i36 = z ? i36 - i38 : i36 + i38;
                        }
                        (z ? widgetRun4.end : widgetRun4.start).resolve(i36);
                        DimensionDependency dimensionDependency3 = widgetRun4.dimension;
                        int i39 = dimensionDependency3.value;
                        if (widgetRun4.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i39 = dimensionDependency3.wrapValue;
                        }
                        i36 = z ? i36 - i39 : i36 + i39;
                        (z ? widgetRun4.start : widgetRun4.end).resolve(i36);
                        widgetRun4.resolved = true;
                        if (i37 < i14 && i37 < i) {
                            int i40 = -widgetRun4.end.margin;
                            i36 = z ? i36 - i40 : i36 + i40;
                        }
                    }
                }
                return;
            }
            if (i33 == 0) {
                int i41 = (i12 - i4) / (i34 + 1);
                if (i5 > 0) {
                    i41 = 0;
                }
                int i42 = i7;
                for (int i43 = 0; i43 < size; i43++) {
                    WidgetRun widgetRun5 = this.widgets.get(z ? size - (i43 + 1) : i43);
                    if (widgetRun5.widget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i42);
                        widgetRun5.end.resolve(i42);
                    } else {
                        int i44 = z ? i42 - i41 : i42 + i41;
                        if (i43 > 0 && i43 >= i13) {
                            int i45 = widgetRun5.start.margin;
                            i44 = z ? i44 - i45 : i44 + i45;
                        }
                        (z ? widgetRun5.end : widgetRun5.start).resolve(i44);
                        DimensionDependency dimensionDependency4 = widgetRun5.dimension;
                        int iMin = dimensionDependency4.value;
                        if (widgetRun5.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, dimensionDependency4.wrapValue);
                        }
                        i42 = z ? i44 - iMin : i44 + iMin;
                        (z ? widgetRun5.start : widgetRun5.end).resolve(i42);
                        if (i43 < i14 && i43 < i) {
                            int i46 = -widgetRun5.end.margin;
                            i42 = z ? i42 - i46 : i42 + i46;
                        }
                    }
                }
                return;
            }
            if (i33 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.widget.getHorizontalBiasPercent() : this.widget.getVerticalBiasPercent();
                if (z) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i47 = (int) (((i12 - i4) * horizontalBiasPercent) + 0.5f);
                if (i47 < 0 || i5 > 0) {
                    i47 = 0;
                }
                int i48 = z ? i7 - i47 : i7 + i47;
                for (int i49 = 0; i49 < size; i49++) {
                    WidgetRun widgetRun6 = this.widgets.get(z ? size - (i49 + 1) : i49);
                    if (widgetRun6.widget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i48);
                        widgetRun6.end.resolve(i48);
                    } else {
                        if (i49 > 0 && i49 >= i13) {
                            int i50 = widgetRun6.start.margin;
                            i48 = z ? i48 - i50 : i48 + i50;
                        }
                        (z ? widgetRun6.end : widgetRun6.start).resolve(i48);
                        DimensionDependency dimensionDependency5 = widgetRun6.dimension;
                        int i51 = dimensionDependency5.value;
                        if (widgetRun6.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i51 = dimensionDependency5.wrapValue;
                        }
                        i48 = z ? i48 - i51 : i48 + i51;
                        (z ? widgetRun6.start : widgetRun6.end).resolve(i48);
                        if (i49 < i14 && i49 < i) {
                            int i52 = -widgetRun6.end.margin;
                            i48 = z ? i48 - i52 : i48 + i52;
                        }
                    }
                }
            }
        }
    }
}
