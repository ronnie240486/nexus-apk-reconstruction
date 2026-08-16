package android.media.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class FilterLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f9992a;

    /* JADX INFO: renamed from: b */
    public List<HorizontalScrollView> f9993b;

    /* JADX INFO: renamed from: c */
    public List<RadioGroup> f9994c;

    /* JADX INFO: renamed from: d */
    public List<C2387g> f9995d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2390j f9996e;

    /* JADX INFO: renamed from: f */
    public Map<String, InterfaceC2388h> f9997f;

    /* JADX INFO: renamed from: g */
    public Rect f9998g;

    /* JADX INFO: renamed from: h */
    public Rect f9999h;

    /* JADX INFO: renamed from: i */
    public int f10000i;

    /* JADX INFO: renamed from: j */
    public boolean f10001j;

    /* JADX INFO: renamed from: k */
    public String f10002k;

    /* JADX INFO: renamed from: l */
    public HorizontalScrollView f10003l;

    /* JADX INFO: renamed from: m */
    public View.OnFocusChangeListener f10004m;

    /* JADX INFO: renamed from: n */
    public final CompoundButton.OnCheckedChangeListener f10005n;

    /* JADX INFO: renamed from: o */
    public final View.OnKeyListener f10006o;

    /* JADX INFO: renamed from: p */
    public final View.OnClickListener f10007p;

    /* JADX INFO: renamed from: android.media.view.FilterLayout$a */
    public class RunnableC2381a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadioButton f10008a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FilterLayout f10009b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2381a(FilterLayout filterLayout, RadioButton radioButton) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$b */
    public class RunnableC2382b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadioButton f10010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FilterLayout f10011b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2382b(FilterLayout filterLayout, RadioButton radioButton) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$c */
    public class ViewOnFocusChangeListenerC2383c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayout f10012a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC2383c(FilterLayout filterLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$d */
    public class C2384d implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayout f10013a;

        /* JADX WARN: Invalid debug info offset */
        public C2384d(FilterLayout filterLayout) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$e */
    public class ViewOnKeyListenerC2385e implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayout f10014a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2385e(FilterLayout filterLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$f */
    public class ViewOnClickListenerC2386f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FilterLayout f10015a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC2386f(FilterLayout filterLayout) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$g */
    public static class C2387g implements Serializable {

        /* JADX INFO: renamed from: a */
        public String f10016a;

        /* JADX INFO: renamed from: b */
        public List<InterfaceC2388h> f10017b;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m14482a(List<? extends InterfaceC2388h> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m14483b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public List<InterfaceC2388h> m14484c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m14485d(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m14486e(List<InterfaceC2388h> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$h */
    public interface InterfaceC2388h {
        /* JADX INFO: renamed from: a */
        String mo1916a();

        /* JADX INFO: renamed from: d */
        String mo1918d();

        /* JADX INFO: renamed from: f */
        String mo1919f();
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$i */
    public interface InterfaceC2389i {
        /* JADX INFO: renamed from: c */
        boolean mo1917c();
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$j */
    public interface InterfaceC2390j {
        /* JADX INFO: renamed from: b */
        void mo12621b();

        /* JADX INFO: renamed from: d0 */
        void mo12622d0(Map<String, InterfaceC2388h> map);

        /* JADX INFO: renamed from: q */
        void mo12624q(Map<String, InterfaceC2388h> map);
    }

    /* JADX INFO: renamed from: android.media.view.FilterLayout$k */
    public static final class C2391k {

        /* JADX INFO: renamed from: a */
        public HorizontalScrollView f10018a;

        /* JADX INFO: renamed from: b */
        public C2387g f10019b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2388h f10020c;

        /* JADX WARN: Invalid debug info offset */
        public C2391k(HorizontalScrollView horizontalScrollView, C2387g c2387g, InterfaceC2388h interfaceC2388h) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FilterLayout(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 21)
    public FilterLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14459a(FilterLayout filterLayout, RadioButton radioButton, C2391k c2391k) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TextView m14460b(FilterLayout filterLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14461c(FilterLayout filterLayout) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m14462d(FilterLayout filterLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC2390j m14463e(FilterLayout filterLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m14464f(FilterLayout filterLayout, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m14465g(FilterLayout filterLayout, View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14466h(FilterLayout filterLayout, RadioButton radioButton) {
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo14467i(int i, RadioGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: j */
    public abstract void mo14468j(TextView textView);

    /* JADX INFO: renamed from: k */
    public abstract void mo14469k(int i, RelativeLayout.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo14470l(RadioButton radioButton);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m14471m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public Map<String, InterfaceC2388h> m14472n() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final int m14473o() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final boolean m14474p(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final boolean m14475q(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m14476r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m14477s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setConditionBundleList(List<C2387g> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilterLayoutListener(InterfaceC2390j interfaceC2390j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHideSelectLine(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m14478t(RadioGroup radioGroup) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m14479u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final void m14480v(RadioButton radioButton, C2391k c2391k) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m14481w(RadioButton radioButton) {
    }
}
