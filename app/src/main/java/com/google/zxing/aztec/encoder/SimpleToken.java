package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import p000.C1002PX;

/* JADX INFO: loaded from: classes2.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    public SimpleToken(Token token, int i, int i2) {
        super(token);
        this.value = (short) i;
        this.bitCount = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s2 = this.value;
        short s3 = this.bitCount;
        return "<" + Integer.toBinaryString((s2 & ((1 << s3) - 1)) | (1 << s3) | (1 << this.bitCount)).substring(1) + C1002PX.f2515f;
    }
}
