package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PBEParametersGenerator {
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;

    /* JADX WARN: Invalid debug info offset */
    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        return null;
    }

    public abstract CipherParameters generateDerivedMacParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i, int i2);

    /* JADX WARN: Invalid debug info offset */
    public int getIterationCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getPassword() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSalt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(byte[] bArr, byte[] bArr2, int i) {
    }
}
