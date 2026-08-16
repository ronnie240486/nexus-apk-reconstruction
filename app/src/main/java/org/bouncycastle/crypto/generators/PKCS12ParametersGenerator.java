package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* JADX INFO: renamed from: u */
    private int f16276u;

    /* JADX INFO: renamed from: v */
    private int f16277v;

    /* JADX WARN: Invalid debug info offset */
    public PKCS12ParametersGenerator(Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void adjust(byte[] bArr, int i, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] generateDerivedKey(int i, int i2) {
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
}
