package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: en */
/* JADX INFO: loaded from: classes.dex */
public class C4309en {

    /* JADX INFO: renamed from: a */
    public final c f13766a;

    /* JADX INFO: renamed from: b */
    public final C1531Xm f13767b;

    /* JADX INFO: renamed from: c */
    public final Handler f13768c;

    /* JADX INFO: renamed from: d */
    public boolean f13769d;

    /* JADX INFO: renamed from: e */
    public boolean f13770e;

    /* JADX INFO: renamed from: f */
    public C0824Mm<C1531Xm, C1531Xm, Bitmap, Bitmap> f13771f;

    /* JADX INFO: renamed from: g */
    public b f13772g;

    /* JADX INFO: renamed from: h */
    public boolean f13773h;

    /* JADX INFO: renamed from: en$b */
    public static class b extends AbstractC4612jS<Bitmap> {

        /* JADX INFO: renamed from: d */
        public final Handler f13774d;

        /* JADX INFO: renamed from: e */
        public final int f13775e;

        /* JADX INFO: renamed from: f */
        public final long f13776f;

        /* JADX INFO: renamed from: g */
        public Bitmap f13777g;

        /* JADX WARN: Invalid debug info offset */
        public b(Handler handler, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public static /* synthetic */ int m20136j(b bVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4941oV
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo2292b(Object obj, InterfaceC4959on interfaceC4959on) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public Bitmap m20137k() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m20138l(Bitmap bitmap, InterfaceC4959on<? super Bitmap> interfaceC4959on) {
        }
    }

    /* JADX INFO: renamed from: en$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo8215a(int i);
    }

    /* JADX INFO: renamed from: en$d */
    public class d implements Handler.Callback {

        /* JADX INFO: renamed from: b */
        public static final int f13778b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f13779c = 2;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4309en f13780a;

        /* JADX WARN: Invalid debug info offset */
        public d(C4309en c4309en) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ d(C4309en c4309en, a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    /* JADX INFO: renamed from: en$e */
    public static class e implements InterfaceC4903nu {

        /* JADX INFO: renamed from: b */
        public final UUID f13781b;

        /* JADX WARN: Invalid debug info offset */
        public e() {
        }

        /* JADX WARN: Invalid debug info offset */
        public e(UUID uuid) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4903nu
        /* JADX INFO: renamed from: a */
        public void mo2678a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4903nu
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4903nu
        public int hashCode() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4309en(Context context, c cVar, C1531Xm c1531Xm, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4309en(c cVar, C1531Xm c1531Xm, Handler handler, C0824Mm<C1531Xm, C1531Xm, Bitmap, Bitmap> c0824Mm) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static C0824Mm<C1531Xm, C1531Xm, Bitmap, Bitmap> m20128c(Context context, C1531Xm c1531Xm, int i, int i2, InterfaceC0782M6 interfaceC0782M6) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m20129a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public Bitmap m20130b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m20131d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m20132e(b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m20133f(InterfaceC1320UW<Bitmap> interfaceC1320UW) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m20134g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m20135h() {
    }
}
