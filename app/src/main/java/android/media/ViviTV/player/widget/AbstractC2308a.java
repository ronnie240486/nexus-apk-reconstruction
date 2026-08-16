package android.media.ViviTV.player.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: renamed from: android.media.ViviTV.player.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2308a {

    /* JADX INFO: renamed from: A */
    public static final int f9443A = 1000000;

    /* JADX INFO: renamed from: B */
    public static boolean f9444B = false;

    /* JADX INFO: renamed from: C */
    public static int f9445C = 2500;

    /* JADX INFO: renamed from: D */
    public static int f9446D = 50000;

    /* JADX INFO: renamed from: E */
    public static int f9447E = 2500;

    /* JADX INFO: renamed from: F */
    public static int f9448F = 2500;

    /* JADX INFO: renamed from: G */
    public static int f9449G = 5000;

    /* JADX INFO: renamed from: H */
    public static int f9450H = 50000;

    /* JADX INFO: renamed from: I */
    public static int f9451I = 2000;

    /* JADX INFO: renamed from: J */
    public static int f9452J = 5000;

    /* JADX INFO: renamed from: K */
    public static Exception f9453K = null;

    /* JADX INFO: renamed from: s */
    public static final String f9454s = "android.media.ViviTV.player.widget.a";

    /* JADX INFO: renamed from: t */
    public static final int f9455t = -700001;

    /* JADX INFO: renamed from: u */
    public static final int f9456u = -700002;

    /* JADX INFO: renamed from: v */
    public static final int f9457v = -700003;

    /* JADX INFO: renamed from: w */
    public static final int f9458w = -700004;

    /* JADX INFO: renamed from: x */
    public static final int f9459x = -700005;

    /* JADX INFO: renamed from: y */
    public static final int f9460y = -700006;

    /* JADX INFO: renamed from: z */
    public static final int f9461z = -700010;

    /* JADX INFO: renamed from: a */
    public Context f9462a;

    /* JADX INFO: renamed from: b */
    public String f9463b;

    /* JADX INFO: renamed from: c */
    public String f9464c;

    /* JADX INFO: renamed from: d */
    public String f9465d;

    /* JADX INFO: renamed from: e */
    public String f9466e;

    /* JADX INFO: renamed from: f */
    public String f9467f;

    /* JADX INFO: renamed from: g */
    public String f9468g;

    /* JADX INFO: renamed from: h */
    public String f9469h;

    /* JADX INFO: renamed from: i */
    public String f9470i;

    /* JADX INFO: renamed from: j */
    public String f9471j;

    /* JADX INFO: renamed from: k */
    public String f9472k;

    /* JADX INFO: renamed from: l */
    public boolean f9473l;

    /* JADX INFO: renamed from: m */
    public long f9474m;

    /* JADX INFO: renamed from: n */
    public float f9475n;

    /* JADX INFO: renamed from: o */
    public boolean f9476o;

    /* JADX INFO: renamed from: p */
    public f f9477p;

    /* JADX INFO: renamed from: q */
    public long f9478q;

    /* JADX INFO: renamed from: r */
    public long f9479r;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13911a(Object obj, int i);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$b */
    public interface b {
        /* JADX INFO: renamed from: h0 */
        void mo1548h0(Object obj);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$c */
    public interface c {
        /* JADX INFO: renamed from: j */
        boolean mo10404j(Object obj, int i, int i2, long j);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$d */
    public interface d {
        /* JADX INFO: renamed from: B0 */
        boolean mo12401B0(Object obj, int i, int i2);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$e */
    public interface e {
        /* JADX INFO: renamed from: c */
        void mo13586c(AbstractC2308a abstractC2308a);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$f */
    public interface f {
        /* JADX INFO: renamed from: n0 */
        void mo12390n0(AbstractC2308a abstractC2308a, String str, String str2, Object obj);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$g */
    public interface g {
        /* JADX INFO: renamed from: u */
        void mo1331u(Object obj, int i, int i2);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$h */
    public interface h {
        /* JADX INFO: renamed from: t */
        void mo12403t(Object obj);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.a$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo12402a(Object obj, int i, int i2, int i3, int i4, int i5, int i6);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static void m13942C(Exception exc) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static Exception m13943h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static final boolean m13944p(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static boolean m13945s(String str, String str2) {
        return false;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo13946A(Context context, String str, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    /* JADX INFO: renamed from: B */
    public abstract void mo13947B(SurfaceHolder surfaceHolder);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m13948D(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m13949E(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m13950F(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m13951G(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m13952H(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m13953I(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m13954J(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m13955K(String str) {
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo13956L(a aVar);

    /* JADX INFO: renamed from: M */
    public abstract void mo13957M(b bVar);

    /* JADX INFO: renamed from: N */
    public abstract void mo13958N(c cVar);

    /* JADX INFO: renamed from: O */
    public abstract void mo13959O(d dVar);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m13960P(f fVar) {
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo13961Q(g gVar);

    /* JADX INFO: renamed from: R */
    public abstract void mo13962R(h hVar);

    /* JADX INFO: renamed from: S */
    public abstract void mo13963S(i iVar);

    /* JADX INFO: renamed from: T */
    public abstract void mo13964T(boolean z);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public void mo13965U(float f2) {
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: V */
    public abstract void mo13966V(Surface surface);

    /* JADX INFO: renamed from: W */
    public abstract void mo13967W(String str);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m13968X(String str) {
    }

    /* JADX INFO: renamed from: Y */
    public abstract void mo13969Y(float f2, float f3);

    @Deprecated
    /* JADX INFO: renamed from: Z */
    public abstract void mo13970Z(Context context, int i2);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo13971a0() throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public String m13972b(String str) {
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo13973b0() throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final String m13974c(String str) throws UnsupportedEncodingException {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo13975d();

    /* JADX INFO: renamed from: e */
    public abstract long mo13976e();

    /* JADX INFO: renamed from: f */
    public abstract String mo13977f();

    /* JADX INFO: renamed from: g */
    public abstract long mo13978g();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public f m13979i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public Map<String, String> m13980j(String str, Map<String, String> map) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo13981k();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public float m13982l() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo13983m();

    /* JADX INFO: renamed from: n */
    public abstract int mo13984n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo13985o(Context context);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m13986q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo13987r();

    /* JADX INFO: renamed from: t */
    public abstract void mo13988t() throws IllegalStateException;

    /* JADX INFO: renamed from: u */
    public abstract void mo13989u() throws IllegalStateException;

    /* JADX INFO: renamed from: v */
    public abstract void mo13990v();

    /* JADX INFO: renamed from: w */
    public abstract void mo13991w();

    /* JADX INFO: renamed from: x */
    public abstract void mo13992x(long j) throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m13993y(long j) {
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo13994z(int i2);
}
