package android.media.ViviTV.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.ViviTV.databinding.PlayerMenuContrlBinding;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.dolit.baselibrary.utils.SafePopupWindow;
import java.util.ArrayList;
import p000.C5932c10;
import p000.C6027p10;
import p000.EnumC0674KQ;
import p000.EnumC6006m10;

/* JADX INFO: renamed from: android.media.ViviTV.player.b */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnKeyListenerC2293b extends SafePopupWindow implements View.OnKeyListener, View.OnClickListener {

    /* JADX INFO: renamed from: t */
    public static LinearLayout f9290t;

    /* JADX INFO: renamed from: u */
    public static TextView f9291u;

    /* JADX INFO: renamed from: d */
    public Context f9292d;

    /* JADX INFO: renamed from: e */
    public Handler f9293e;

    /* JADX INFO: renamed from: f */
    public ImageView[] f9294f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C6027p10> f9295g;

    /* JADX INFO: renamed from: h */
    public int f9296h;

    /* JADX INFO: renamed from: i */
    public int f9297i;

    /* JADX INFO: renamed from: j */
    public AudioManager f9298j;

    /* JADX INFO: renamed from: k */
    public int f9299k;

    /* JADX INFO: renamed from: l */
    public int f9300l;

    /* JADX INFO: renamed from: m */
    public ArrayList<C5932c10> f9301m;

    /* JADX INFO: renamed from: n */
    public boolean f9302n;

    /* JADX INFO: renamed from: o */
    public b f9303o;

    /* JADX INFO: renamed from: p */
    public d f9304p;

    /* JADX INFO: renamed from: q */
    public c f9305q;

    /* JADX INFO: renamed from: r */
    public PlayerMenuContrlBinding f9306r;

    /* JADX INFO: renamed from: s */
    public Runnable f9307s;

    /* JADX INFO: renamed from: android.media.ViviTV.player.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewOnKeyListenerC2293b f9308a;

        /* JADX WARN: Invalid debug info offset */
        public a(ViewOnKeyListenerC2293b viewOnKeyListenerC2293b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo13073a(ArrayList<String> arrayList);

        /* JADX INFO: renamed from: b */
        void mo13074b();

        /* JADX INFO: renamed from: c */
        void mo13075c();

        /* JADX INFO: renamed from: d */
        String mo13076d();

        /* JADX INFO: renamed from: e */
        String mo13077e(int i);

        /* JADX INFO: renamed from: f */
        int mo13078f();

        /* JADX INFO: renamed from: g */
        ArrayList<String> mo13079g();

        int getCurrentPosition();

        /* JADX INFO: renamed from: h */
        void mo13080h(ViewOnKeyListenerC2293b viewOnKeyListenerC2293b);

        /* JADX INFO: renamed from: i */
        void mo13081i();

        /* JADX INFO: renamed from: j */
        int mo13082j();

        /* JADX INFO: renamed from: k */
        void mo13083k(boolean z);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.b$c */
    public interface c {
        /* JADX INFO: renamed from: A */
        String mo12891A(String str);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.b$d */
    public interface d {
        /* JADX INFO: renamed from: p */
        void mo13024p(int i);

        /* JADX INFO: renamed from: p0 */
        boolean mo13025p0();
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewOnKeyListenerC2293b(Context context, Handler handler, int i, b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static void m13819F(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    private void m13820q() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m13821A(d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m13822B(ArrayList<C5932c10> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m13823C(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m13824D(ArrayList<C6027p10> arrayList, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final void m13825E(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m13826G(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m13827H(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.PopupWindow
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m13828k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public ArrayList<C5932c10> m13829l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public int m13830m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m13831n(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m13832o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    @SuppressLint({"NonConstantResourceId"})
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m13833p(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m13834r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m13835s() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.baselibrary.utils.SafePopupWindow, android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m13836t(b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m13837u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m13838v(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m13839w(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m13840x(EnumC6006m10 enumC6006m10) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m13841y(ArrayList<C5932c10> arrayList, EnumC0674KQ enumC0674KQ) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m13842z(c cVar) {
    }
}
