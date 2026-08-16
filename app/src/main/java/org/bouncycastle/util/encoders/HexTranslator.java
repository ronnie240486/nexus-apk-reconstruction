package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes2.dex */
public class HexTranslator implements Translator {
    private static final byte[] hexTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}
