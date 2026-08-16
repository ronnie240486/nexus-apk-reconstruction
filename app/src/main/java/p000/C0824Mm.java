package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.io.File;

/* JADX INFO: renamed from: Mm */
/* JADX INFO: loaded from: classes.dex */
public class C0824Mm<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: A */
    public boolean f2124A;

    /* JADX INFO: renamed from: B */
    public Drawable f2125B;

    /* JADX INFO: renamed from: C */
    public int f2126C;

    /* JADX INFO: renamed from: a */
    public final Class<ModelType> f2127a;

    /* JADX INFO: renamed from: b */
    public final Context f2128b;

    /* JADX INFO: renamed from: c */
    public final C4896nn f2129c;

    /* JADX INFO: renamed from: d */
    public final Class<TranscodeType> f2130d;

    /* JADX INFO: renamed from: e */
    public final C0992PN f2131e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4253dv f2132f;

    /* JADX INFO: renamed from: g */
    public C0148C9<ModelType, DataType, ResourceType, TranscodeType> f2133g;

    /* JADX INFO: renamed from: h */
    public ModelType f2134h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4903nu f2135i;

    /* JADX INFO: renamed from: j */
    public boolean f2136j;

    /* JADX INFO: renamed from: k */
    public int f2137k;

    /* JADX INFO: renamed from: l */
    public int f2138l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0606JN<? super ModelType, TranscodeType> f2139m;

    /* JADX INFO: renamed from: n */
    public Float f2140n;

    /* JADX INFO: renamed from: o */
    public C0824Mm<?, ?, ?, TranscodeType> f2141o;

    /* JADX INFO: renamed from: p */
    public Float f2142p;

    /* JADX INFO: renamed from: q */
    public Drawable f2143q;

    /* JADX INFO: renamed from: r */
    public Drawable f2144r;

    /* JADX INFO: renamed from: s */
    public EnumC5369sL f2145s;

    /* JADX INFO: renamed from: t */
    public boolean f2146t;

    /* JADX INFO: renamed from: u */
    public InterfaceC5200pn<TranscodeType> f2147u;

    /* JADX INFO: renamed from: v */
    public int f2148v;

    /* JADX INFO: renamed from: w */
    public int f2149w;

    /* JADX INFO: renamed from: x */
    public EnumC3051cf f2150x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1320UW<ResourceType> f2151y;

    /* JADX INFO: renamed from: z */
    public boolean f2152z;

    /* JADX INFO: renamed from: Mm$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RunnableC0480HN f2153a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0824Mm f2154b;

        /* JADX WARN: Invalid debug info offset */
        public a(C0824Mm c0824Mm, RunnableC0480HN runnableC0480HN) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: Mm$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2155a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f2155a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2155a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2155a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2155a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0824Mm(InterfaceC1345Uv<ModelType, DataType, ResourceType, TranscodeType> interfaceC1345Uv, Class<TranscodeType> cls, C0824Mm<ModelType, ?, ?, ?> c0824Mm) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0824Mm(Context context, Class<ModelType> cls, InterfaceC1345Uv<ModelType, DataType, ResourceType, TranscodeType> interfaceC1345Uv, Class<TranscodeType> cls2, C4896nn c4896nn, C0992PN c0992pn, InterfaceC4253dv interfaceC4253dv) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3834A(InterfaceC4347fO<ResourceType> interfaceC4347fO) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3835B(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3836C(Drawable drawable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3837D(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3838E(Drawable drawable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public final EnumC5369sL m3839F() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public InterfaceFutureC0505Hm<TranscodeType> m3840G(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public <Y extends InterfaceC4941oV<TranscodeType>> Y m3841H(Y y) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public InterfaceC4941oV<TranscodeType> mo3842I(ImageView imageView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3843J(InterfaceC0606JN<? super ModelType, TranscodeType> interfaceC0606JN) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3844K(ModelType modeltype) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final InterfaceC0226DN m3845L(InterfaceC4941oV<TranscodeType> interfaceC4941oV, float f, EnumC5369sL enumC5369sL, InterfaceC0416GN interfaceC0416GN) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3846M(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3847N(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3848O(Drawable drawable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public InterfaceC4941oV<TranscodeType> m3849Q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public InterfaceC4941oV<TranscodeType> m3850T(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3851U(EnumC5369sL enumC5369sL) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3852W(InterfaceC4903nu interfaceC4903nu) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3853X(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3854Y(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3855Z(InterfaceC5803yh<DataType> interfaceC5803yh) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3856a0(float f) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3857c0(C0824Mm<?, ?, ?, TranscodeType> c0824Mm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3858d0(InterfaceC4608jO<ResourceType, TranscodeType> interfaceC4608jO) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3859e0(InterfaceC1320UW<ResourceType>... interfaceC1320UWArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3860i(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> m3861l(InterfaceC5200pn<TranscodeType> interfaceC5200pn) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3862m(C5913a30.InterfaceC1682a interfaceC1682a) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: n */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3863n(Animation animation) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final InterfaceC0226DN m3866r(InterfaceC4941oV<TranscodeType> interfaceC4941oV) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final InterfaceC0226DN m3867s(InterfaceC4941oV<TranscodeType> interfaceC4941oV, C5183pW c5183pW) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3868t(InterfaceC4284eO<File, ResourceType> interfaceC4284eO) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3869u() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3870v(InterfaceC4284eO<DataType, ResourceType> interfaceC4284eO) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3871x(EnumC3051cf enumC3051cf) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3872y() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public C0824Mm<ModelType, DataType, ResourceType, TranscodeType> mo3873z() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void mo3864o() {
    }

    /* JADX INFO: renamed from: q */
    public void mo3865q() {
    }
}
