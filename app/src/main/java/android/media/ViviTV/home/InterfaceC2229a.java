package android.media.ViviTV.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import java.util.List;
import p000.C0444Gp;
import p000.C4650k3;
import p000.EnumC0533ID;
import p000.InterfaceC4653k6;
import p000.InterfaceC5354s6;

/* JADX INFO: renamed from: android.media.ViviTV.home.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2229a {

    /* JADX INFO: renamed from: android.media.ViviTV.home.a$a */
    public interface a {
        /* JADX INFO: renamed from: B */
        void mo9735B(Drawable drawable);

        /* JADX INFO: renamed from: f */
        void mo9740f();

        /* JADX INFO: renamed from: s */
        void mo9754s();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.a$b */
    public interface b extends InterfaceC5354s6<d> {
        /* JADX INFO: renamed from: k0 */
        boolean mo13182k0();

        /* JADX INFO: renamed from: z */
        void mo13185z();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.a$c */
    public interface c extends InterfaceC5354s6<d>, b {
        /* JADX INFO: renamed from: P */
        void mo13196P(C0444Gp c0444Gp);

        /* JADX INFO: renamed from: W */
        void mo13197W(List<C4650k3> list);

        /* JADX INFO: renamed from: i0 */
        boolean mo13198i0();

        /* JADX INFO: renamed from: y0 */
        void mo13199y0(Drawable drawable);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.a$d */
    public interface d extends InterfaceC4653k6 {
        /* JADX INFO: renamed from: a */
        void mo13310a(String str);

        /* JADX INFO: renamed from: b */
        void mo13311b(e eVar);

        /* JADX INFO: renamed from: c */
        void mo13312c(Context context, Intent intent);

        /* JADX INFO: renamed from: d */
        void mo13313d();

        /* JADX INFO: renamed from: e */
        void mo13314e(float f);

        /* JADX INFO: renamed from: f */
        boolean mo13315f();

        /* JADX INFO: renamed from: g */
        void mo13316g(Context context, Intent intent);

        /* JADX INFO: renamed from: h */
        boolean mo13317h();

        /* JADX INFO: renamed from: i */
        void mo13318i(a aVar);

        /* JADX INFO: renamed from: j */
        void mo13319j();

        /* JADX INFO: renamed from: k */
        void mo13320k(boolean z);

        /* JADX INFO: renamed from: l */
        void mo13321l(b bVar);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.home.a$e */
    public interface e extends InterfaceC5354s6<d> {
        /* JADX INFO: renamed from: S */
        void mo13201S();

        /* JADX INFO: renamed from: e */
        void mo13202e();

        /* JADX INFO: renamed from: f */
        void mo13203f(String str);

        /* JADX INFO: renamed from: s0 */
        void mo13204s0(EnumC0533ID enumC0533ID);

        /* JADX INFO: renamed from: w0 */
        void mo13205w0(boolean z);

        /* JADX INFO: renamed from: x0 */
        void mo13206x0(float f);
    }
}
