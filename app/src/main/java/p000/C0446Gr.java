package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Gr */
/* JADX INFO: loaded from: classes.dex */
public class C0446Gr {

    /* JADX INFO: renamed from: b */
    public static final String f967b = "ImageHeaderParser";

    /* JADX INFO: renamed from: c */
    public static final int f968c = 4671814;

    /* JADX INFO: renamed from: d */
    public static final int f969d = -1991225785;

    /* JADX INFO: renamed from: e */
    public static final int f970e = 65496;

    /* JADX INFO: renamed from: f */
    public static final int f971f = 19789;

    /* JADX INFO: renamed from: g */
    public static final int f972g = 18761;

    /* JADX INFO: renamed from: h */
    public static final String f973h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i */
    public static final byte[] f974i;

    /* JADX INFO: renamed from: j */
    public static final int f975j = 218;

    /* JADX INFO: renamed from: k */
    public static final int f976k = 217;

    /* JADX INFO: renamed from: l */
    public static final int f977l = 255;

    /* JADX INFO: renamed from: m */
    public static final int f978m = 225;

    /* JADX INFO: renamed from: n */
    public static final int f979n = 274;

    /* JADX INFO: renamed from: o */
    public static final int[] f980o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a */
    public final c f981a;

    /* JADX INFO: renamed from: Gr$a */
    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        a(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* JADX INFO: renamed from: Gr$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f982a;

        /* JADX WARN: Invalid debug info offset */
        public b(byte[] bArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public short m2173a(int i) {
            return (short) 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public int m2174b(int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m2175c() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m2176d(ByteOrder byteOrder) {
        }
    }

    /* JADX INFO: renamed from: Gr$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final InputStream f983a;

        /* JADX WARN: Invalid debug info offset */
        public c(InputStream inputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m2177a() throws IOException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public int m2178b() throws IOException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public short m2179c() throws IOException {
            return (short) 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public int m2180d(byte[] bArr) throws IOException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public long m2181e(long j) throws IOException {
            return 0L;
        }
    }

    static {
        byte[] bytes = new byte[0];
        try {
            bytes = f973h.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f974i = bytes;
    }

    /* JADX WARN: Invalid debug info offset */
    public C0446Gr(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m2166a(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static boolean m2167e(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static int m2168g(b bVar) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final byte[] m2169b() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public int m2170c() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public a m2171d() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public boolean m2172f() throws IOException {
        return false;
    }
}
