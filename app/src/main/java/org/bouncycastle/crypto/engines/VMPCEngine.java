package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamCipher;

/* JADX INFO: loaded from: classes2.dex */
public class VMPCEngine implements StreamCipher {

    /* JADX INFO: renamed from: P */
    protected byte[] f16268P;

    /* JADX INFO: renamed from: n */
    protected byte f16269n;

    /* JADX INFO: renamed from: s */
    protected byte f16270s;
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void initKey(byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) 0;
    }
}
