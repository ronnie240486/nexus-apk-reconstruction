package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class OpenSSLPBEParametersGenerator extends PBEParametersGenerator {
    private Digest digest;

    /* JADX WARN: Invalid debug info offset */
    private byte[] generateDerivedKey(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(byte[] bArr, byte[] bArr2) {
    }
}
