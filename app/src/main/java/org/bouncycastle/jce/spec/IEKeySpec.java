package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.IESKey;

/* JADX INFO: loaded from: classes2.dex */
public class IEKeySpec implements KeySpec, IESKey {
    private PrivateKey privKey;
    private PublicKey pubKey;

    /* JADX WARN: Invalid debug info offset */
    public IEKeySpec(PrivateKey privateKey, PublicKey publicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PrivateKey getPrivate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PublicKey getPublic() {
        return null;
    }
}
