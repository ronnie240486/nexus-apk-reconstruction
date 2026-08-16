package android.media.ViviTV.player.widget;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.List;
import java.util.Map;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.IVLCVout;

/* JADX INFO: renamed from: android.media.ViviTV.player.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C2311d extends AbstractC2308a implements MediaPlayer.EventListener {

    /* JADX INFO: renamed from: Z */
    public static final String f9531Z = "udp://";

    /* JADX INFO: renamed from: L */
    public LibVLC f9532L;

    /* JADX INFO: renamed from: M */
    public MediaPlayer f9533M;

    /* JADX INFO: renamed from: N */
    public IVLCVout f9534N;

    /* JADX INFO: renamed from: O */
    public Media f9535O;

    /* JADX INFO: renamed from: P */
    public int f9536P;

    /* JADX INFO: renamed from: Q */
    public int f9537Q;

    /* JADX INFO: renamed from: R */
    public AbstractC2308a.d f9538R;

    /* JADX INFO: renamed from: S */
    public AbstractC2308a.b f9539S;

    /* JADX INFO: renamed from: T */
    public AbstractC2308a.g f9540T;

    /* JADX INFO: renamed from: U */
    public AbstractC2308a.h f9541U;

    /* JADX INFO: renamed from: V */
    public AbstractC2308a.c f9542V;

    /* JADX INFO: renamed from: W */
    public AbstractC2308a.i f9543W;

    /* JADX INFO: renamed from: X */
    public boolean f9544X;

    /* JADX INFO: renamed from: Y */
    public boolean f9545Y;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.d$a */
    public class a implements IVLCVout.OnNewVideoLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2311d f9546a;

        /* JADX WARN: Invalid debug info offset */
        public a(C2311d c2311d) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener
        /* JADX INFO: renamed from: a */
        public void mo14068a(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C2311d(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m14051c0(C2311d c2311d, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ int m14052d0(C2311d c2311d, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m14053e0(C2311d c2311d) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: A */
    public void mo13946A(Context context, String str, Map<String, String> map) throws IllegalStateException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: B */
    public void mo13947B(SurfaceHolder surfaceHolder) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: L */
    public void mo13956L(AbstractC2308a.a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: M */
    public void mo13957M(AbstractC2308a.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: N */
    public void mo13958N(AbstractC2308a.c cVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: O */
    public void mo13959O(AbstractC2308a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Q */
    public void mo13961Q(AbstractC2308a.g gVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: R */
    public void mo13962R(AbstractC2308a.h hVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: S */
    public void mo13963S(AbstractC2308a.i iVar) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: T */
    public void mo13964T(boolean z) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: V */
    public void mo13966V(Surface surface) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: W */
    public void mo13967W(String str) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Y */
    public void mo13969Y(float f, float f2) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Z */
    public void mo13970Z(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo14054a(AbstractVLCEvent abstractVLCEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: a0 */
    public void mo13971a0() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: b0 */
    public void mo13973b0() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: d */
    public long mo13975d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: e */
    public long mo13976e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: f */
    public java.lang.String mo13977f() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2311d.mo13977f():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public final String m14055f0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: g */
    public long mo13978g() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final List<String> m14056g0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public final void m14057h0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public final void m14058i0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public final void m14059j0(MediaPlayer.Event event) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: k */
    public Object mo13981k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final void m14060k0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public final void m14061l0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: m */
    public int mo13983m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public final void m14062m0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: n */
    public int mo13984n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public final void m14063n0() {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: o */
    public boolean mo13985o(Context context) {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m14064o0(MediaPlayer.Event event) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public final void m14065p0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public final void m14066q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: r */
    public boolean mo13987r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public final void m14067r0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: t */
    public void mo13988t() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: u */
    public void mo13989u() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: v */
    public void mo13990v() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: w */
    public void mo13991w() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: x */
    public void mo13992x(long j) throws IllegalStateException {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: z */
    public void mo13994z(int i) {
    }
}
