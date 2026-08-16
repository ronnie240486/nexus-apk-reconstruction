package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.p013io.IOUtils;
import p000.C0060Av;
import p000.C0305Ec;
import p000.C0835Mx;
import p000.C0978P9;
import p000.C1262Tc;
import p000.C4515i2;
import p000.C5532ud;

/* JADX INFO: loaded from: classes.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer container;
    private ConstraintWidgetContainer mContainer;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> runGroups = new ArrayList<>();
    private BasicMeasure.Measurer mMeasurer = null;
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    ArrayList<RunGroup> mGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.container = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun.runGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            if (widgetRun == constraintWidgetContainer.horizontalRun || widgetRun == constraintWidgetContainer.verticalRun) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i2);
                arrayList.add(runGroup);
            }
            widgetRun.runGroup = runGroup;
            runGroup.add(widgetRun);
            for (Dependency dependency : widgetRun.start.dependencies) {
                if (dependency instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency, i, 0, dependencyNode2, arrayList, runGroup);
                }
            }
            for (Dependency dependency2 : widgetRun.end.dependencies) {
                if (dependency2 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency2, i, 1, dependencyNode2, arrayList, runGroup);
                }
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                    if (dependency3 instanceof DependencyNode) {
                        applyGroup((DependencyNode) dependency3, i, 2, dependencyNode2, arrayList, runGroup);
                    }
                }
            }
            for (DependencyNode dependencyNode3 : widgetRun.start.targets) {
                if (dependencyNode3 == dependencyNode2) {
                    runGroup.dual = true;
                }
                applyGroup(dependencyNode3, i, 0, dependencyNode2, arrayList, runGroup);
            }
            for (DependencyNode dependencyNode4 : widgetRun.end.targets) {
                if (dependencyNode4 == dependencyNode2) {
                    runGroup.dual = true;
                }
                applyGroup(dependencyNode4, i, 1, dependencyNode2, arrayList, runGroup);
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator<DependencyNode> it = ((VerticalWidgetRun) widgetRun).baseline.targets.iterator();
                while (it.hasNext()) {
                    applyGroup(it.next(), i, 2, dependencyNode2, arrayList, runGroup);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    private boolean basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
        int width;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int height;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        DimensionDependency dimensionDependency;
        int height2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr2[1];
            if (constraintWidget.getVisibility() != 8) {
                if (constraintWidget.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultWidth = 2;
                }
                if (constraintWidget.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultHeight = 2;
                }
                if (constraintWidget.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget.mMatchConstraintDefaultWidth == 1 && (constraintWidget.mLeft.mTarget == null || constraintWidget.mRight.mTarget == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget.mMatchConstraintDefaultHeight == 1 && (constraintWidget.mTop.mTarget == null || constraintWidget.mBottom.mTarget == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.horizontalRun;
                horizontalWidgetRun.dimensionBehavior = dimensionBehaviour10;
                int i = constraintWidget.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.verticalRun;
                verticalWidgetRun.dimensionBehavior = dimensionBehaviour11;
                int i2 = constraintWidget.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour10 == dimensionBehaviour12 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviour11 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour11 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int width2 = constraintWidget.getWidth();
                    if (dimensionBehaviour10 == dimensionBehaviour12) {
                        width = (constraintWidgetContainer.getWidth() - constraintWidget.mLeft.mMargin) - constraintWidget.mRight.mMargin;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        width = width2;
                        dimensionBehaviour = dimensionBehaviour10;
                    }
                    int height3 = constraintWidget.getHeight();
                    if (dimensionBehaviour11 == dimensionBehaviour12) {
                        height = (constraintWidgetContainer.getHeight() - constraintWidget.mTop.mMargin) - constraintWidget.mBottom.mMargin;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        height = height3;
                        dimensionBehaviour2 = dimensionBehaviour11;
                    }
                    this = this;
                    constraintWidget = constraintWidget;
                    this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                    constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                    constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                } else if (dimensionBehaviour10 == dimensionBehaviour9 && (dimensionBehaviour11 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour11 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                    if (i == 3) {
                        if (dimensionBehaviour11 == dimensionBehaviour5) {
                            measure(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                        }
                        height = constraintWidget.getHeight();
                        width = (int) ((height * constraintWidget.mDimensionRatio) + 0.5f);
                    } else {
                        if (i == 1) {
                            measure(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour11, 0);
                            dimensionDependency = constraintWidget.horizontalRun.dimension;
                            height2 = constraintWidget.getWidth();
                        } else if (i == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = constraintWidgetContainer.mListDimensionBehaviors[0];
                            dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour5 || dimensionBehaviour13 == dimensionBehaviour12) {
                                width = (int) ((constraintWidget.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f);
                                height = constraintWidget.getHeight();
                                dimensionBehaviour = dimensionBehaviour5;
                                dimensionBehaviour2 = dimensionBehaviour11;
                                this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                                constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                                constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            } else if (dimensionBehaviour11 != dimensionBehaviour9) {
                                if (dimensionBehaviour10 != dimensionBehaviour9) {
                                }
                            } else if (dimensionBehaviour10 != dimensionBehaviour9) {
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
                            if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                width = 0;
                                height = 0;
                                dimensionBehaviour = dimensionBehaviour5;
                                dimensionBehaviour2 = dimensionBehaviour11;
                                this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                                constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                                constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            } else if (dimensionBehaviour11 != dimensionBehaviour9) {
                                if (dimensionBehaviour10 != dimensionBehaviour9) {
                                }
                            } else if (dimensionBehaviour10 != dimensionBehaviour9) {
                            }
                        }
                        dimensionDependency.wrapValue = height2;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    this = this;
                    constraintWidget = constraintWidget;
                    dimensionBehaviour = dimensionBehaviour2;
                    this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                    constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                    constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                } else if (dimensionBehaviour11 != dimensionBehaviour9 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                    if (i2 == 3) {
                        if (dimensionBehaviour10 == dimensionBehaviour4) {
                            measure(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        width = constraintWidget.getWidth();
                        float f = constraintWidget.mDimensionRatio;
                        if (constraintWidget.getDimensionRatioSide() == -1) {
                            f = 1.0f / f;
                        }
                        height = (int) ((width * f) + 0.5f);
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                        this = this;
                        constraintWidget = constraintWidget;
                        dimensionBehaviour = dimensionBehaviour2;
                    } else {
                        if (i2 == 1) {
                            measure(constraintWidget, dimensionBehaviour10, 0, dimensionBehaviour4, 0);
                        } else {
                            if (i2 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = constraintWidgetContainer.mListDimensionBehaviors[1];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour14 == dimensionBehaviour15 || dimensionBehaviour14 == dimensionBehaviour12) {
                                    float f2 = constraintWidget.mMatchConstraintPercentHeight;
                                    width = constraintWidget.getWidth();
                                    this = this;
                                    constraintWidget = constraintWidget;
                                    dimensionBehaviour = dimensionBehaviour10;
                                    dimensionBehaviour2 = dimensionBehaviour15;
                                    height = (int) ((f2 * constraintWidgetContainer.getHeight()) + 0.5f);
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.mListAnchors;
                                if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[3].mTarget == null) {
                                    width = 0;
                                    height = 0;
                                    dimensionBehaviour = dimensionBehaviour4;
                                    dimensionBehaviour2 = dimensionBehaviour11;
                                }
                            }
                            if (dimensionBehaviour10 != dimensionBehaviour9) {
                            }
                        }
                        dimensionDependency = constraintWidget.verticalRun.dimension;
                        height2 = constraintWidget.getHeight();
                        dimensionDependency.wrapValue = height2;
                    }
                    this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                    constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                    constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                } else if (dimensionBehaviour10 != dimensionBehaviour9 && dimensionBehaviour11 == dimensionBehaviour9) {
                    if (i == 1 || i2 == 1) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measure(constraintWidget, dimensionBehaviour16, 0, dimensionBehaviour16, 0);
                        constraintWidget.horizontalRun.dimension.wrapValue = constraintWidget.getWidth();
                        dimensionDependency = constraintWidget.verticalRun.dimension;
                        height2 = constraintWidget.getHeight();
                        dimensionDependency.wrapValue = height2;
                    } else if (i2 == 2 && i == 2 && ((dimensionBehaviour3 = (dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors)[0]) == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED) || dimensionBehaviour3 == dimensionBehaviour2)) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr[1];
                        if (dimensionBehaviour17 == dimensionBehaviour2 || dimensionBehaviour17 == dimensionBehaviour2) {
                            float f3 = constraintWidget.mMatchConstraintPercentWidth;
                            float f4 = constraintWidget.mMatchConstraintPercentHeight;
                            width = (int) ((f3 * constraintWidgetContainer.getWidth()) + 0.5f);
                            height = (int) ((f4 * constraintWidgetContainer.getHeight()) + 0.5f);
                            this = this;
                            constraintWidget = constraintWidget;
                            dimensionBehaviour = dimensionBehaviour2;
                            this.measure(constraintWidget, dimensionBehaviour, width, dimensionBehaviour2, height);
                            constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                            constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                        }
                    }
                }
            }
            constraintWidget.measured = true;
        }
        return false;
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.mGroups.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.mGroups.get(i2).computeWrapSize(constraintWidgetContainer, i));
        }
        return (int) jMax;
    }

    private void displayGraph() {
        Iterator<WidgetRun> it = this.mRuns.iterator();
        String strGenerateDisplayGraph = "digraph {\n";
        while (it.hasNext()) {
            strGenerateDisplayGraph = generateDisplayGraph(it.next(), strGenerateDisplayGraph);
        }
        String strM21289a = C4515i2.m21289a(strGenerateDisplayGraph, "\n}\n");
        System.out.println("content:<<\n" + strM21289a + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i, ArrayList<RunGroup> arrayList) {
        for (Dependency dependency : widgetRun.start.dependencies) {
            if (dependency instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if (dependency2 instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (dependency3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i = chainRun.orientation;
        String strM278a = C0060Av.m278a("subgraph ", C4515i2.m21289a("cluster_" + chainRun.widget.getDebugName(), i == 0 ? "_h" : "_v"), " {\n");
        String strGenerateDisplayGraph = "";
        for (WidgetRun widgetRun : chainRun.widgets) {
            strM278a = C5532ud.m28671a(strM278a, C4515i2.m21289a(widgetRun.widget.getDebugName(), i == 0 ? "_HORIZONTAL" : "_VERTICAL"), ";\n");
            strGenerateDisplayGraph = generateDisplayGraph(widgetRun, strGenerateDisplayGraph);
        }
        return C5532ud.m28671a(str, strGenerateDisplayGraph, C4515i2.m21289a(strM278a, "}\n"));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    private String generateDisplayGraph(WidgetRun widgetRun, String str) {
        StringBuilder sb;
        String strName;
        boolean z;
        DependencyNode dependencyNode = widgetRun.start;
        DependencyNode dependencyNode2 = widgetRun.end;
        if (!(widgetRun instanceof HelperReferences) && dependencyNode.dependencies.isEmpty() && (dependencyNode2.dependencies.isEmpty() && dependencyNode.targets.isEmpty()) && dependencyNode2.targets.isEmpty()) {
            return str;
        }
        StringBuilder sbM1657a = C0305Ec.m1657a(str);
        sbM1657a.append(nodeDefinition(widgetRun));
        String string = sbM1657a.toString();
        boolean zIsCenteredConnection = isCenteredConnection(dependencyNode, dependencyNode2);
        String strGenerateDisplayNode = generateDisplayNode(dependencyNode2, zIsCenteredConnection, generateDisplayNode(dependencyNode, zIsCenteredConnection, string));
        boolean z2 = widgetRun instanceof VerticalWidgetRun;
        if (z2) {
            strGenerateDisplayNode = generateDisplayNode(((VerticalWidgetRun) widgetRun).baseline, zIsCenteredConnection, strGenerateDisplayNode);
        }
        if ((widgetRun instanceof HorizontalWidgetRun) || (((z = widgetRun instanceof ChainRun)) && ((ChainRun) widgetRun).orientation == 0)) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = widgetRun.widget.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    sb = new StringBuilder(IOUtils.f15646e);
                    sb.append(dependencyNode2.name());
                    sb.append(" -> ");
                    strName = dependencyNode.name();
                    sb.append(strName);
                    sb.append(IOUtils.f15646e);
                    strGenerateDisplayNode = C4515i2.m21289a(strGenerateDisplayNode, sb.toString());
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    sb = new StringBuilder(IOUtils.f15646e);
                    sb.append(dependencyNode.name());
                    sb.append(" -> ");
                    strName = dependencyNode2.name();
                    sb.append(strName);
                    sb.append(IOUtils.f15646e);
                    strGenerateDisplayNode = C4515i2.m21289a(strGenerateDisplayNode, sb.toString());
                }
            } else if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        } else if (z2 || (z && ((ChainRun) widgetRun).orientation == 1)) {
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = widgetRun.widget.getVerticalDimensionBehaviour();
            if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    sb = new StringBuilder(IOUtils.f15646e);
                    sb.append(dependencyNode2.name());
                    sb.append(" -> ");
                    strName = dependencyNode.name();
                    sb.append(strName);
                    sb.append(IOUtils.f15646e);
                    strGenerateDisplayNode = C4515i2.m21289a(strGenerateDisplayNode, sb.toString());
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    sb = new StringBuilder(IOUtils.f15646e);
                    sb.append(dependencyNode.name());
                    sb.append(" -> ");
                    strName = dependencyNode2.name();
                    sb.append(strName);
                    sb.append(IOUtils.f15646e);
                    strGenerateDisplayNode = C4515i2.m21289a(strGenerateDisplayNode, sb.toString());
                }
            } else if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        }
        return widgetRun instanceof ChainRun ? generateChainDisplayGraph((ChainRun) widgetRun, strGenerateDisplayNode) : strGenerateDisplayNode;
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z, String str) {
        for (DependencyNode dependencyNode2 : dependencyNode.targets) {
            StringBuilder sbM3902a = C0835Mx.m3902a(IOUtils.f15646e + dependencyNode.name(), " -> ");
            sbM3902a.append(dependencyNode2.name());
            String string = sbM3902a.toString();
            if (dependencyNode.margin > 0 || z || (dependencyNode.run instanceof HelperReferences)) {
                String strM21289a = C4515i2.m21289a(string, "[");
                if (dependencyNode.margin > 0) {
                    strM21289a = C0978P9.m4377a(C0835Mx.m3902a(strM21289a, "label=\""), dependencyNode.margin, "\"");
                    if (z) {
                        strM21289a = C4515i2.m21289a(strM21289a, C1262Tc.f3278g);
                    }
                }
                if (z) {
                    strM21289a = C4515i2.m21289a(strM21289a, " style=dashed ");
                }
                if (dependencyNode.run instanceof HelperReferences) {
                    strM21289a = C4515i2.m21289a(strM21289a, " style=bold,color=gray ");
                }
                string = C4515i2.m21289a(strM21289a, "]");
            }
            str = C4515i2.m21289a(str, C4515i2.m21289a(string, IOUtils.f15646e));
        }
        return str;
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        Iterator<DependencyNode> it = dependencyNode.targets.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i++;
            }
        }
        Iterator<DependencyNode> it2 = dependencyNode2.targets.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    private String nodeDefinition(WidgetRun widgetRun) {
        String strM21289a;
        String str;
        String str2;
        String strM4377a;
        String str3;
        String strM21289a2;
        String strM21289a3;
        String str4;
        boolean z = widgetRun instanceof VerticalWidgetRun;
        String debugName = widgetRun.widget.getDebugName();
        ConstraintWidget constraintWidget = widgetRun.widget;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = !z ? constraintWidget.getHorizontalDimensionBehaviour() : constraintWidget.getVerticalDimensionBehaviour();
        RunGroup runGroup = widgetRun.runGroup;
        String strM21289a4 = C4515i2.m21289a(C4515i2.m21289a(C4515i2.m21289a(C4515i2.m21289a(debugName, !z ? "_HORIZONTAL" : "_VERTICAL"), " [shape=none, label=<"), "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"), "  <TR>");
        if (z) {
            strM21289a = C4515i2.m21289a(strM21289a4, "    <TD ");
            if (widgetRun.start.resolved) {
                strM21289a = C4515i2.m21289a(strM21289a, " BGCOLOR=\"green\"");
            }
            str = " PORT=\"TOP\" BORDER=\"1\">T</TD>";
        } else {
            strM21289a = C4515i2.m21289a(strM21289a4, "    <TD ");
            if (widgetRun.start.resolved) {
                strM21289a = C4515i2.m21289a(strM21289a, " BGCOLOR=\"green\"");
            }
            str = " PORT=\"LEFT\" BORDER=\"1\">L</TD>";
        }
        String strM21289a5 = C4515i2.m21289a(C4515i2.m21289a(strM21289a, str), "    <TD BORDER=\"1\" ");
        boolean z2 = widgetRun.dimension.resolved;
        if (z2 && !widgetRun.widget.measured) {
            str2 = " BGCOLOR=\"green\" ";
        } else {
            if (!z2 || !widgetRun.widget.measured) {
                if (!z2 && widgetRun.widget.measured) {
                    str2 = " BGCOLOR=\"yellow\" ";
                }
                if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    strM21289a5 = C4515i2.m21289a(strM21289a5, "style=\"dashed\"");
                }
                if (runGroup != null) {
                    StringBuilder sb = new StringBuilder(" [");
                    sb.append(runGroup.groupIndex + 1);
                    sb.append("/");
                    strM4377a = C0978P9.m4377a(sb, RunGroup.index, "]");
                } else {
                    strM4377a = "";
                }
                str3 = strM21289a5 + ">" + debugName + strM4377a + " </TD>";
                if (z) {
                    strM21289a2 = C4515i2.m21289a(str3, "    <TD ");
                    if ((widgetRun instanceof VerticalWidgetRun) && ((VerticalWidgetRun) widgetRun).baseline.resolved) {
                        strM21289a2 = C4515i2.m21289a(strM21289a2, " BGCOLOR=\"green\"");
                    }
                    strM21289a3 = C4515i2.m21289a(C4515i2.m21289a(strM21289a2, " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"), "    <TD ");
                    if (widgetRun.end.resolved) {
                        strM21289a3 = C4515i2.m21289a(strM21289a3, " BGCOLOR=\"green\"");
                    }
                    str4 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>";
                } else {
                    strM21289a3 = C4515i2.m21289a(str3, "    <TD ");
                    if (widgetRun.end.resolved) {
                        strM21289a3 = C4515i2.m21289a(strM21289a3, " BGCOLOR=\"green\"");
                    }
                    str4 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>";
                }
                return C4515i2.m21289a(C4515i2.m21289a(C4515i2.m21289a(strM21289a3, str4), "  </TR></TABLE>"), ">];\n");
            }
            str2 = " BGCOLOR=\"lightgray\" ";
        }
        strM21289a5 = C4515i2.m21289a(strM21289a5, str2);
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            strM21289a5 = C4515i2.m21289a(strM21289a5, "style=\"dashed\"");
        }
        if (runGroup != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(runGroup.groupIndex + 1);
            sb2.append("/");
            strM4377a = C0978P9.m4377a(sb2, RunGroup.index, "]");
        } else {
            strM4377a = "";
        }
        str3 = strM21289a5 + ">" + debugName + strM4377a + " </TD>";
        if (z) {
            strM21289a3 = C4515i2.m21289a(str3, "    <TD ");
            if (widgetRun.end.resolved) {
                strM21289a3 = C4515i2.m21289a(strM21289a3, " BGCOLOR=\"green\"");
            }
            str4 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>";
        } else {
            strM21289a2 = C4515i2.m21289a(str3, "    <TD ");
            if (widgetRun instanceof VerticalWidgetRun) {
                strM21289a2 = C4515i2.m21289a(strM21289a2, " BGCOLOR=\"green\"");
            }
            strM21289a3 = C4515i2.m21289a(C4515i2.m21289a(strM21289a2, " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"), "    <TD ");
            if (widgetRun.end.resolved) {
                strM21289a3 = C4515i2.m21289a(strM21289a3, " BGCOLOR=\"green\"");
            }
            str4 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>";
        }
        return C4515i2.m21289a(C4515i2.m21289a(C4515i2.m21289a(strM21289a3, str4), "  </TR></TABLE>"), ">];\n");
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.container.horizontalRun, 0, this.mGroups);
        findGroup(this.container.verticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            boolean z = false;
            for (ConstraintWidget constraintWidget : this.container.mChildren) {
                boolean[] zArr = constraintWidget.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (constraintWidget instanceof Barrier) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            for (RunGroup runGroup : this.mGroups) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                runGroup.defineTerminalWidgets(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            for (ConstraintWidget constraintWidget : this.container.mChildren) {
                constraintWidget.measured = false;
                constraintWidget.horizontalRun.reset();
                constraintWidget.verticalRun.reset();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.reset();
            this.container.verticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x = this.container.getX();
        int y = this.container.getY();
        this.container.horizontalRun.start.resolve(x);
        this.container.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z) {
                Iterator<WidgetRun> it = this.mRuns.iterator();
                while (it.hasNext()) {
                    if (!it.next().supportsWrapComputation()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.horizontalRun.dimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
                constraintWidgetContainer5.verticalRun.dimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.container;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.container.horizontalRun.end.resolve(width);
            this.container.horizontalRun.dimension.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.container;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        for (WidgetRun widgetRun : this.mRuns) {
            if (widgetRun.widget != this.container || widgetRun.resolved) {
                widgetRun.applyToWidget();
            }
        }
        for (WidgetRun widgetRun2 : this.mRuns) {
            if (z2 || widgetRun2.widget != this.container) {
                if (!widgetRun2.start.resolved || ((!widgetRun2.end.resolved && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.dimension.resolved && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                    this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    return z3;
                }
            }
        }
        z3 = true;
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.mNeedBuildGraph) {
            for (ConstraintWidget constraintWidget : this.container.mChildren) {
                constraintWidget.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.horizontalRun;
                horizontalWidgetRun.dimension.resolved = false;
                horizontalWidgetRun.resolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = constraintWidget.verticalRun;
                verticalWidgetRun.dimension.resolved = false;
                verticalWidgetRun.resolved = false;
                verticalWidgetRun.reset();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.dimension.resolved = false;
            horizontalWidgetRun2.resolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.container.verticalRun;
            verticalWidgetRun2.dimension.resolved = false;
            verticalWidgetRun2.resolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        this.container.horizontalRun.start.resolve(0);
        this.container.verticalRun.start.resolve(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        DimensionDependency dimensionDependency;
        int height;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.container.getDimensionBehaviour(1);
        int x = this.container.getX();
        int y = this.container.getY();
        if (z && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : this.mRuns) {
                if (widgetRun.orientation == i && !widgetRun.supportsWrapComputation()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.container;
                    constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                    dimensionDependency = constraintWidgetContainer2.horizontalRun.dimension;
                    height = constraintWidgetContainer2.getWidth();
                    dimensionDependency.resolve(height);
                }
            } else if (z && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.setHeight(computeWrap(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                dimensionDependency = constraintWidgetContainer4.verticalRun.dimension;
                height = constraintWidgetContainer4.getHeight();
                dimensionDependency.resolve(height);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x;
                this.container.horizontalRun.end.resolve(width);
                this.container.horizontalRun.dimension.resolve(width - x);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer5.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height2 = constraintWidgetContainer5.getHeight() + y;
                this.container.verticalRun.end.resolve(height2);
                this.container.verticalRun.dimension.resolve(height2 - y);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        measureWidgets();
        for (WidgetRun widgetRun2 : this.mRuns) {
            if (widgetRun2.orientation == i && (widgetRun2.widget != this.container || widgetRun2.resolved)) {
                widgetRun2.applyToWidget();
            }
        }
        for (WidgetRun widgetRun3 : this.mRuns) {
            if (widgetRun3.orientation == i && (z2 || widgetRun3.widget != this.container)) {
                if (!widgetRun3.start.resolved || !widgetRun3.end.resolved || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.dimension.resolved)) {
                    this.container.setHorizontalDimensionBehaviour(dimensionBehaviour2);
                    this.container.setVerticalDimensionBehaviour(dimensionBehaviour3);
                    return z3;
                }
            }
        }
        z3 = true;
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z3;
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        DimensionDependency dimensionDependency;
        int width;
        DimensionDependency dimensionDependency2;
        int width2;
        DimensionDependency dimensionDependency3;
        for (ConstraintWidget constraintWidget : this.container.mChildren) {
            if (!constraintWidget.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.mMatchConstraintDefaultWidth;
                int i2 = constraintWidget.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency4 = constraintWidget.horizontalRun.dimension;
                boolean z3 = dimensionDependency4.resolved;
                DimensionDependency dimensionDependency5 = constraintWidget.verticalRun.dimension;
                boolean z4 = dimensionDependency5.resolved;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(constraintWidget, dimensionBehaviour4, dimensionDependency4.value, dimensionBehaviour4, dimensionDependency5.value);
                } else {
                    if (z3 && z) {
                        measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency4.value, dimensionBehaviour3, dimensionDependency5.value);
                        if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            dimensionDependency2 = constraintWidget.verticalRun.dimension;
                            width2 = constraintWidget.getHeight();
                            dimensionDependency2.wrapValue = width2;
                        } else {
                            dimensionDependency = constraintWidget.verticalRun.dimension;
                            width = constraintWidget.getHeight();
                            dimensionDependency.resolve(width);
                        }
                    } else if (z4 && z2) {
                        measure(constraintWidget, dimensionBehaviour3, dimensionDependency4.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency5.value);
                        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            dimensionDependency2 = constraintWidget.horizontalRun.dimension;
                            width2 = constraintWidget.getWidth();
                            dimensionDependency2.wrapValue = width2;
                        } else {
                            dimensionDependency = constraintWidget.horizontalRun.dimension;
                            width = constraintWidget.getWidth();
                            dimensionDependency.resolve(width);
                        }
                    }
                    if (!constraintWidget.measured && (dimensionDependency3 = constraintWidget.verticalRun.baselineDimension) != null) {
                        dimensionDependency3.resolve(constraintWidget.getBaselineDistance());
                    }
                }
                constraintWidget.measured = true;
                if (!constraintWidget.measured) {
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        WidgetRun guidelineReference;
        arrayList.clear();
        this.mContainer.horizontalRun.clear();
        this.mContainer.verticalRun.clear();
        arrayList.add(this.mContainer.horizontalRun);
        arrayList.add(this.mContainer.verticalRun);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.mContainer.mChildren) {
            if (constraintWidget instanceof Guideline) {
                guidelineReference = new GuidelineReference(constraintWidget);
            } else {
                if (constraintWidget.isInHorizontalChain()) {
                    if (constraintWidget.horizontalChainRun == null) {
                        constraintWidget.horizontalChainRun = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget.horizontalRun);
                }
                if (constraintWidget.isInVerticalChain()) {
                    if (constraintWidget.verticalChainRun == null) {
                        constraintWidget.verticalChainRun = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget.verticalRun);
                }
                if (constraintWidget instanceof HelperWidget) {
                    guidelineReference = new HelperReferences(constraintWidget);
                }
            }
            arrayList.add(guidelineReference);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.widget != this.mContainer) {
                widgetRun.apply();
            }
        }
    }
}
