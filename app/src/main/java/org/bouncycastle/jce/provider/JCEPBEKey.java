package org.bouncycastle.jce.provider;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class JCEPBEKey implements PBEKey {
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    DERObjectIdentifier oid;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;

    /* JADX WARN: Invalid debug info offset */
    public JCEPBEKey(String str, DERObjectIdentifier dERObjectIdentifier, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getDigest() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getIvSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getKeySize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CipherParameters getParam() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTryWrongPKCS12Zero(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean shouldTryWrongPKCS12() {
        return false;
    }
}
