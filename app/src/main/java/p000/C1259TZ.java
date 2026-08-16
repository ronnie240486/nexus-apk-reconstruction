package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C1259TZ {

    /* JADX INFO: renamed from: a */
    public static final char[] f3271a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f3272b = new char[64];

    /* JADX INFO: renamed from: c */
    public static final char[] f3273c = new char[40];

    /* JADX INFO: renamed from: TZ$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3274a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3274a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3274a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3274a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3274a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m5910a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m5911b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m5912c(byte[] bArr, char[] cArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static <T> Queue<T> m5913d(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static int m5914e(int i, int i2, Bitmap.Config config) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(19)
    /* JADX INFO: renamed from: f */
    public static int m5915f(Bitmap bitmap) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static int m5916g(Bitmap.Config config) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: h */
    public static int m5917h(Bitmap bitmap) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static <T> List<T> m5918i(Collection<T> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static boolean m5919j() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static boolean m5920k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static boolean m5921l(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static boolean m5922m(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public static java.lang.String m5923n(byte[] r1) {
        /*
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1259TZ.m5923n(byte[]):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public static java.lang.String m5924o(byte[] r1) {
        /*
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1259TZ.m5924o(byte[]):java.lang.String");
    }
}
