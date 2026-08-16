package com.tencent.smtt.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ boolean f13177a = true;

    /* JADX INFO: renamed from: com.tencent.smtt.utils.Base64$a */
    public static abstract class AbstractC4144a {

        /* JADX INFO: renamed from: a */
        public byte[] f13178a;

        /* JADX INFO: renamed from: b */
        public int f13179b;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.Base64$b */
    public static class C4145b extends AbstractC4144a {

        /* JADX INFO: renamed from: c */
        private static final int[] f13180c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: d */
        private static final int[] f13181d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: e */
        private int f13182e;

        /* JADX INFO: renamed from: f */
        private int f13183f;

        /* JADX INFO: renamed from: g */
        private final int[] f13184g;

        /* JADX WARN: Invalid debug info offset */
        public C4145b(int i, byte[] bArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m19337a(byte[] bArr, int i, int i2, boolean z) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.Base64$c */
    public static class C4146c extends AbstractC4144a {

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ boolean f13185g = true;

        /* JADX INFO: renamed from: h */
        private static final byte[] f13186h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: i */
        private static final byte[] f13187i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c */
        int f13188c;

        /* JADX INFO: renamed from: d */
        public final boolean f13189d;

        /* JADX INFO: renamed from: e */
        public final boolean f13190e;

        /* JADX INFO: renamed from: f */
        public final boolean f13191f;

        /* JADX INFO: renamed from: j */
        private final byte[] f13192j;

        /* JADX INFO: renamed from: k */
        private int f13193k;

        /* JADX INFO: renamed from: l */
        private final byte[] f13194l;

        /* JADX WARN: Invalid debug info offset */
        public C4146c(int i, byte[] bArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m19338a(byte[] bArr, int i, int i2, boolean z) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private Base64() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static byte[] m19332a(String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static byte[] m19333a(byte[] bArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static byte[] m19334a(byte[] bArr, int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static byte[] m19335b(byte[] bArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static byte[] m19336b(byte[] bArr, int i, int i2, int i3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String encodeToString(byte[] bArr, int i) {
        return null;
    }
}
