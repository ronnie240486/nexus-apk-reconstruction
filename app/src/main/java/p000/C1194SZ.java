package p000;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.commons.p013io.input.XmlStreamReader;

/* JADX INFO: renamed from: SZ */
/* JADX INFO: loaded from: classes.dex */
public final class C1194SZ {

    /* JADX INFO: renamed from: a */
    public static final byte[] f3171a;

    /* JADX INFO: renamed from: c */
    public static final AbstractC5175pO f3173c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC0290EN f3174d;

    /* JADX INFO: renamed from: r */
    public static final Method f3188r;

    /* JADX INFO: renamed from: s */
    public static final Pattern f3189s;

    /* JADX INFO: renamed from: b */
    public static final String[] f3172b = new String[0];

    /* JADX INFO: renamed from: e */
    public static final C5222q8 f3175e = C5222q8.m27601g("efbbbf");

    /* JADX INFO: renamed from: f */
    public static final C5222q8 f3176f = C5222q8.m27601g("feff");

    /* JADX INFO: renamed from: g */
    public static final C5222q8 f3177g = C5222q8.m27601g("fffe");

    /* JADX INFO: renamed from: h */
    public static final C5222q8 f3178h = C5222q8.m27601g("0000ffff");

    /* JADX INFO: renamed from: i */
    public static final C5222q8 f3179i = C5222q8.m27601g("ffff0000");

    /* JADX INFO: renamed from: j */
    public static final Charset f3180j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k */
    public static final Charset f3181k = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: l */
    public static final Charset f3182l = Charset.forName(XmlStreamReader.f15875g);

    /* JADX INFO: renamed from: m */
    public static final Charset f3183m = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: n */
    public static final Charset f3184n = Charset.forName(XmlStreamReader.f15877i);

    /* JADX INFO: renamed from: o */
    public static final Charset f3185o = Charset.forName(XmlStreamReader.f15878j);

    /* JADX INFO: renamed from: p */
    public static final TimeZone f3186p = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: q */
    public static final Comparator<String> f3187q = new b();

    /* JADX INFO: renamed from: SZ$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f3191b;

        /* JADX WARN: Invalid debug info offset */
        public a(String str, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return null;
        }
    }

    /* JADX INFO: renamed from: SZ$b */
    /* JADX INFO: loaded from: classes2.dex */
    public class b implements Comparator<String> {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m5658a(String str, String str2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(String str, String str2) {
            return 0;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f3171a = bArr;
        Method declaredMethod = null;
        f3173c = AbstractC5175pO.create((C4596jC) null, bArr);
        f3174d = AbstractC0290EN.m1573g(null, bArr, 0, bArr.length);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f3188r = declaredMethod;
        f3189s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static String[] m5621A(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static boolean m5622B(AssertionError assertionError) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static boolean m5623C(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D */
    public static javax.net.ssl.X509TrustManager m5624D() {
        /*
            r0 = 0
            return r0
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5624D():javax.net.ssl.X509TrustManager");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: E */
    public static boolean m5625E(p000.InterfaceC5858zS r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L44:
        L46:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5625E(zS, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static int m5626F(String str, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static int m5627G(String str, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static ThreadFactory m5628H(String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static C0189Co m5629I(List<C5201po> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static String m5630J(String str, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static boolean m5631K(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m5632a(java.lang.Throwable r3, java.lang.Throwable r4) {
        /*
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5632a(java.lang.Throwable, java.lang.Throwable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static java.lang.AssertionError m5633b(java.lang.String r1, java.lang.Exception r2) {
        /*
            r0 = 0
            return r0
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5633b(java.lang.String, java.lang.Exception):java.lang.AssertionError");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static Charset m5634c(InterfaceC1166S7 interfaceC1166S7, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x004c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static java.lang.String m5635d(java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L65:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5635d(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static int m5636e(String str, long j, TimeUnit timeUnit) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static void m5637f(long j, long j2, long j3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static void m5638g(java.io.Closeable r0) {
        /*
            return
        L6:
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5638g(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public static void m5639h(java.net.ServerSocket r0) {
        /*
            return
        L6:
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5639h(java.net.ServerSocket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public static void m5640i(java.net.Socket r1) {
        /*
            return
        L6:
        L8:
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5640i(java.net.Socket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static String[] m5641j(String[] strArr, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static boolean m5642k(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static int m5643l(char c) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static boolean m5644m(String str, int i, int i2, byte[] bArr, int i3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x008a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @javax.annotation.Nullable
    /* JADX INFO: renamed from: n */
    public static java.net.InetAddress m5645n(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 0
            return r0
        L8f:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1194SZ.m5645n(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static int m5646o(String str, int i, int i2, char c) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static int m5647p(String str, int i, int i2, String str2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static boolean m5648q(InterfaceC5858zS interfaceC5858zS, int i, TimeUnit timeUnit) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static boolean m5649r(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static String m5650s(String str, Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static String m5651t(C4375fq c4375fq, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static <T> List<T> m5652u(List<T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static <T> List<T> m5653v(T... tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static <K, V> Map<K, V> m5654w(Map<K, V> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static int m5655x(Comparator<String> comparator, String[] strArr, String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static int m5656y(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static String m5657z(byte[] bArr) {
        return null;
    }
}
