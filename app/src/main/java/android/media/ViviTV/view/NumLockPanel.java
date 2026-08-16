package android.media.ViviTV.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NumLockPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public String[] f9735a;

    /* JADX INFO: renamed from: b */
    public int f9736b;

    /* JADX INFO: renamed from: c */
    public int f9737c;

    /* JADX INFO: renamed from: d */
    public ArrayList<CircleImageView> f9738d;

    /* JADX INFO: renamed from: e */
    public List<RelativeLayout> f9739e;

    /* JADX INFO: renamed from: f */
    public TextView f9740f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f9741g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f9742h;

    /* JADX INFO: renamed from: i */
    public int f9743i;

    /* JADX INFO: renamed from: j */
    public int f9744j;

    /* JADX INFO: renamed from: k */
    public int f9745k;

    /* JADX INFO: renamed from: l */
    public int f9746l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2338g f9747m;

    /* JADX INFO: renamed from: n */
    public InterfaceC2336e f9748n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2337f f9749o;

    public class CircleImageView extends AppCompatImageView {

        /* JADX INFO: renamed from: a */
        public Paint f9750a;

        /* JADX INFO: renamed from: b */
        public int f9751b;

        /* JADX INFO: renamed from: c */
        public int f9752c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ NumLockPanel f9753d;

        /* JADX WARN: Invalid debug info offset */
        public CircleImageView(NumLockPanel numLockPanel, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        public CircleImageView(NumLockPanel numLockPanel, Context context, AttributeSet attributeSet) {
        }

        /* JADX WARN: Invalid debug info offset */
        public CircleImageView(NumLockPanel numLockPanel, Context context, AttributeSet attributeSet, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m14286a(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View
        public void draw(Canvas canvas) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setFillCircle() {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setStrokeCircle() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$a */
    public class ViewOnClickListenerC2332a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9754a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f9755b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ NumLockPanel f9756c;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2332a(NumLockPanel numLockPanel, int i, TextView textView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$b */
    public class ViewOnClickListenerC2333b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NumLockPanel f9757a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2333b(NumLockPanel numLockPanel) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$c */
    public class ViewOnClickListenerC2334c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NumLockPanel f9758a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2334c(NumLockPanel numLockPanel) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$d */
    public class C2335d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NumLockPanel f9759a;

        /* JADX WARN: Invalid debug info offset */
        public C2335d(NumLockPanel numLockPanel) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$e */
    public interface InterfaceC2336e {
        /* JADX INFO: renamed from: b */
        void mo10170b();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$f */
    public interface InterfaceC2337f {
        /* JADX INFO: renamed from: a */
        void mo10169a();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.view.NumLockPanel$g */
    public interface InterfaceC2338g {
        /* JADX INFO: renamed from: c */
        void mo10171c(String str);
    }

    /* JADX WARN: Invalid debug info offset */
    public NumLockPanel(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NumLockPanel(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NumLockPanel(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2338g m14273a(NumLockPanel numLockPanel) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ StringBuilder m14274b(NumLockPanel numLockPanel) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ TextView m14275c(NumLockPanel numLockPanel) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC2336e m14276d(NumLockPanel numLockPanel) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC2337f m14277e(NumLockPanel numLockPanel) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m14278f(NumLockPanel numLockPanel) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m14279g(NumLockPanel numLockPanel) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static int m14280j(Context context, float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m14281h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m14282i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m14283k(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m14284l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m14285m() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCancelListener(InterfaceC2336e interfaceC2336e) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setConfirmListener(InterfaceC2337f interfaceC2337f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInputListener(InterfaceC2338g interfaceC2338g) {
    }
}
