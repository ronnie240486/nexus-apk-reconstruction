package p000;

/* JADX INFO: renamed from: b60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5930b60 {

    /* JADX INFO: renamed from: b */
    public static final int[] f10156b = new int[256];

    /* JADX INFO: renamed from: a */
    public final int[] f10157a;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 == 1) {
                    i2 ^= -306674912;
                }
            }
            f10156b[i] = i2;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final int m14594a(int i, byte b) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public byte m14595b() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m14596c(char[] cArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m14597d(byte b) {
    }
}
