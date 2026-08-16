package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: nS */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class C4873nS implements InterfaceC1541Xw {

    /* JADX INFO: renamed from: d */
    public static final int f15298d = 8;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f15299e = {Bitmap.Config.ARGB_8888, null};

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f15300f = {Bitmap.Config.RGB_565};

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f15301g = {Bitmap.Config.ARGB_4444};

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f15302h = {Bitmap.Config.ALPHA_8};

    /* JADX INFO: renamed from: a */
    public final c f15303a;

    /* JADX INFO: renamed from: b */
    public final C2934ao<b, Bitmap> f15304b;

    /* JADX INFO: renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f15305c;

    /* JADX INFO: renamed from: nS$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15306a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f15306a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15306a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15306a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15306a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: nS$b */
    public static final class b implements InterfaceC4930oK {

        /* JADX INFO: renamed from: a */
        public final c f15307a;

        /* JADX INFO: renamed from: b */
        public int f15308b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f15309c;

        /* JADX WARN: Invalid debug info offset */
        public b(c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        public b(c cVar, int i, Bitmap.Config config) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ int m22368b(b bVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4930oK
        /* JADX INFO: renamed from: a */
        public void mo22369a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public void m22370c(int i, Bitmap.Config config) {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX INFO: renamed from: nS$c */
    public static class c extends AbstractC4456h6<b> {
        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4456h6
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC4930oK mo20948a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public b m22371d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public b m22372e(int i, Bitmap.Config config) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m22362g(int i, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static String m22363j(int i, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static Bitmap.Config[] m22364k(Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: a */
    public Bitmap mo8023a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: b */
    public void mo8024b(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: c */
    public String mo8025c(int i, int i2, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: d */
    public Bitmap mo8026d(int i, int i2, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: e */
    public int mo8027e(Bitmap bitmap) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1541Xw
    /* JADX INFO: renamed from: f */
    public String mo8028f(Bitmap bitmap) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m22365h(Integer num, Bitmap.Config config) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final b m22366i(b bVar, int i, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final NavigableMap<Integer, Integer> m22367l(Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
