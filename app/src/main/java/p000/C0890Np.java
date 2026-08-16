package p000;

import java.io.IOException;

/* JADX INFO: renamed from: Np */
/* JADX INFO: loaded from: classes2.dex */
public final class C0890Np {

    /* JADX INFO: renamed from: b */
    public static final int f2274b = 16384;

    /* JADX INFO: renamed from: c */
    public static final byte f2275c = 0;

    /* JADX INFO: renamed from: d */
    public static final byte f2276d = 1;

    /* JADX INFO: renamed from: e */
    public static final byte f2277e = 2;

    /* JADX INFO: renamed from: f */
    public static final byte f2278f = 3;

    /* JADX INFO: renamed from: g */
    public static final byte f2279g = 4;

    /* JADX INFO: renamed from: h */
    public static final byte f2280h = 5;

    /* JADX INFO: renamed from: i */
    public static final byte f2281i = 6;

    /* JADX INFO: renamed from: j */
    public static final byte f2282j = 7;

    /* JADX INFO: renamed from: k */
    public static final byte f2283k = 8;

    /* JADX INFO: renamed from: l */
    public static final byte f2284l = 9;

    /* JADX INFO: renamed from: m */
    public static final byte f2285m = 0;

    /* JADX INFO: renamed from: n */
    public static final byte f2286n = 1;

    /* JADX INFO: renamed from: o */
    public static final byte f2287o = 1;

    /* JADX INFO: renamed from: p */
    public static final byte f2288p = 4;

    /* JADX INFO: renamed from: q */
    public static final byte f2289q = 4;

    /* JADX INFO: renamed from: r */
    public static final byte f2290r = 8;

    /* JADX INFO: renamed from: s */
    public static final byte f2291s = 32;

    /* JADX INFO: renamed from: t */
    public static final byte f2292t = 32;

    /* JADX INFO: renamed from: a */
    public static final C5222q8 f2273a = C5222q8.m27604k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: u */
    public static final String[] f2293u = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: v */
    public static final String[] f2294v = new String[64];

    /* JADX INFO: renamed from: w */
    public static final String[] f2295w = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f2295w;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C1194SZ.m5650s("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f2294v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = C0786MA.m3668a(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f2294v;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = C0786MA.m3668a(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f2294v;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f2295w[i];
            }
            i++;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m4042a(byte b, byte b2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m4043b(boolean z, int i, int i2, byte b, byte b2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static IllegalArgumentException m4044c(String str, Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static IOException m4045d(String str, Object... objArr) throws IOException {
        return null;
    }
}
