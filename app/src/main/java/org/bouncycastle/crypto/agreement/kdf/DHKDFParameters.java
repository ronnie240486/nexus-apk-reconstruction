package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHKDFParameters implements DerivationParameters {
    private final DERObjectIdentifier algorithm;
    private final byte[] extraInfo;
    private final int keySize;

    /* JADX INFO: renamed from: z */
    private final byte[] f16045z;

    /* JADX WARN: Invalid debug info offset */
    public DHKDFParameters(DERObjectIdentifier dERObjectIdentifier, int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHKDFParameters(DERObjectIdentifier dERObjectIdentifier, int i, byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getExtraInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getKeySize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getZ() {
        return null;
    }
}
