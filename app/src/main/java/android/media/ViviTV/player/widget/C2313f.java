package android.media.ViviTV.player.widget;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: renamed from: android.media.ViviTV.player.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C2313f extends AbstractC2308a {

    /* JADX INFO: renamed from: e0 */
    public static final String f9569e0 = "android.media.ViviTV.player.widget.f";

    /* JADX INFO: renamed from: f0 */
    public static final String f9570f0 = "DolitOTTClientKEY_1";

    /* JADX INFO: renamed from: g0 */
    public static String f9571g0 = "EE5EC0320AF257DE5608063D115E9B966B8DE7ABE0196D22AD0BAB378CF36F7CDEB7A0D0D73DB29FA530237A32F690D204F610D2E4B12590F2FA0E45028245DB820C72F746178F8E303C1446F4BF997A875EC84448ADD0CC819ED225DE34F85551B7DC1C5873F75901B3EF27F62A93D1D4DF12BB390E38A011C20422B29EB4877DCAE0B3F3475F41F594B7C68B62A5432941807D24B5DCB6EFDF481CF3BD998F80EAFAA48183F1CB23D6266FD6583C01899F837030B2AC88294AEDB2B59E1FFC17C79FD0E1CC81396FAF74B8EA16D6A55DA46A494933CD7E9B524D2BFE643D635022D57A8912B3C76E98AD2A15F835FB4FE70A4FAA8BB59C039B70FF5E8AA623E705982175FD1086045B53683100ACB434DB86D1BD16764AF472F173B2F53C7BDEB4F184C86AB29FF334752E69F29AD208AD1F84E3E02E91F6AD594707CA178AD15874FF445B848F3D684347F8EE9A78875E99431FA2819A859D8D758D37B10605B78E195927BA540AE4EB26A97D98D784D845BD3E5C38A340970471B6CFB0C971CDB7B4A44B590AF0C4E3C78D66F1432B15852E78B381B3EA874D4DA6B5C48ACEBCA7F189DEF6CB6E832735D65F695A8F98D07632E1A8892E46BBEEE19F43F514D9998BB196D6383BE224ECBE13D7FC5CA43F494B30C97E9D5D177AAD343965532BC871DA1BB7C16A9BB77241A462AA40E75915ADDFE5C9069F25F45FDFA426ED57C86B7BFD1380040A55763503FBB73E84818BBF162519F322F423E4F4392B8CB1A385D73DB8CFF367237B2DA598D60BFB1DD2E6E024CDF4AF0C45029D4088D30B70AE4310808A3B644942FAA29B2D8708C8411BA6899887CA8120DA62B20357B7814D0373F7505CB6B873A478D6D1D68E42B9680A62F417975573B29CE5CA27CEE2B4A4490E47A39DB6C98A6AF7097F14D3207DB0D2B5B5D64C1CF9E4C48D9EBAFAA3D0D8A09125872134D1523E5CC19FD27532B5A98E2B43B9BCE4CA49A74E88CC81E3C2D1386AFB76BDE91786F254BC384F4C36CA759A594C7EF4323A6653709B25DB14E7C6329CFB7741A034F84FE743";

    /* JADX INFO: renamed from: L */
    public IMediaPlayer f9572L;

    /* JADX INFO: renamed from: M */
    public AbstractC2308a.d f9573M;

    /* JADX INFO: renamed from: N */
    public AbstractC2308a.b f9574N;

    /* JADX INFO: renamed from: O */
    public AbstractC2308a.g f9575O;

    /* JADX INFO: renamed from: P */
    public AbstractC2308a.a f9576P;

    /* JADX INFO: renamed from: Q */
    public AbstractC2308a.h f9577Q;

    /* JADX INFO: renamed from: R */
    public AbstractC2308a.c f9578R;

    /* JADX INFO: renamed from: S */
    public AbstractC2308a.i f9579S;

    /* JADX INFO: renamed from: T */
    public boolean f9580T;

    /* JADX INFO: renamed from: U */
    public Timer f9581U;

    /* JADX INFO: renamed from: V */
    public long f9582V;

    /* JADX INFO: renamed from: W */
    public long f9583W;

    /* JADX INFO: renamed from: X */
    public IMediaPlayer.OnVideoSizeChangedListener f9584X;

    /* JADX INFO: renamed from: Y */
    public IMediaPlayer.OnInfoListener f9585Y;

    /* JADX INFO: renamed from: Z */
    public IMediaPlayer.OnCompletionListener f9586Z;

    /* JADX INFO: renamed from: a0 */
    public IMediaPlayer.OnErrorListener f9587a0;

    /* JADX INFO: renamed from: b0 */
    public IMediaPlayer.OnPreparedListener f9588b0;

    /* JADX INFO: renamed from: c0 */
    public IMediaPlayer.OnBufferingUpdateListener f9589c0;

    /* JADX INFO: renamed from: d0 */
    public IMediaPlayer.OnSeekCompleteListener f9590d0;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$a */
    public class a implements IMediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9591a;

        /* JADX WARN: Invalid debug info offset */
        public a(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$b */
    public class b implements IMediaPlayer.OnInfoListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9592a;

        /* JADX WARN: Invalid debug info offset */
        public b(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$c */
    public class c implements IMediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9593a;

        /* JADX WARN: Invalid debug info offset */
        public c(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$d */
    public class d implements IMediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9594a;

        /* JADX WARN: Invalid debug info offset */
        public d(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$e */
    public class e implements IMediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9595a;

        /* JADX WARN: Invalid debug info offset */
        public e(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$f */
    public class f implements IMediaPlayer.OnBufferingUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9596a;

        /* JADX WARN: Invalid debug info offset */
        public f(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$g */
    public class g implements IMediaPlayer.OnSeekCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2313f f9597a;

        /* JADX WARN: Invalid debug info offset */
        public g(C2313f c2313f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.f$h */
    public class h extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IjkMediaPlayer f9598a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2313f f9599b;

        /* JADX WARN: Invalid debug info offset */
        public h(C2313f c2313f, IjkMediaPlayer ijkMediaPlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C2313f(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ AbstractC2308a.i m14077c0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ AbstractC2308a.d m14078d0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ AbstractC2308a.b m14079e0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ AbstractC2308a.c m14080f0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ AbstractC2308a.g m14081g0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ AbstractC2308a.a m14082h0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ AbstractC2308a.h m14083i0(C2313f c2313f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m14084j0(C2313f c2313f, IjkMediaPlayer ijkMediaPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public static boolean m14085m0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: A */
    public void mo13946A(Context context, String str, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: B */
    public void mo13947B(SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
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

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: T */
    public void mo13964T(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: U */
    public void mo13965U(float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: V */
    public void mo13966V(Surface surface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: W */
    public void mo13967W(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Y */
    public void mo13969Y(float f2, float f3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Z */
    public void mo13970Z(Context context, int i) {
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
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: f */
    public String mo13977f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: g */
    public long mo13978g() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: k */
    public Object mo13981k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final void m14086k0(IjkMediaPlayer ijkMediaPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public final void m14087l0(IjkMediaPlayer ijkMediaPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: m */
    public int mo13983m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: n */
    public int mo13984n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: o */
    public boolean mo13985o(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: r */
    public boolean mo13987r() {
        return false;
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

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: z */
    public void mo13994z(int i) {
    }
}
