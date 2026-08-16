package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.HelperReference;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.HelperWidget;

/* JADX INFO: loaded from: classes.dex */
public class BarrierReference extends HelperReference {
    private Barrier mBarrierWidget;
    private State.Direction mDirection;
    private int mMargin;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.state.helpers.BarrierReference$1 */
    public static /* synthetic */ class C25521 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$solver$state$State$Direction */
        static final /* synthetic */ int[] f10084xf452c4aa;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f10084xf452c4aa = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10084xf452c4aa[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10084xf452c4aa[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10084xf452c4aa[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10084xf452c4aa[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10084xf452c4aa[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public void apply() {
        getHelperWidget();
        int i = 0;
        switch (C25521.f10084xf452c4aa[this.mDirection.ordinal()]) {
            case 3:
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
        }
        this.mBarrierWidget.setBarrierType(i);
        this.mBarrierWidget.setMargin(this.mMargin);
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new Barrier();
        }
        return this.mBarrierWidget;
    }

    public void margin(int i) {
        this.mMargin = i;
    }

    public void setBarrierDirection(State.Direction direction) {
        this.mDirection = direction;
    }

    public void margin(Object obj) {
        margin(this.mState.convertDimension(obj));
    }
}
