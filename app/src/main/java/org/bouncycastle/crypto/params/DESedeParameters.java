package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes2.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    /* JADX WARN: Invalid debug info offset */
    public DESedeParameters(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isWeakKey(byte[] bArr, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isWeakKey(byte[] bArr, int i, int i2) {
        return false;
    }
}
