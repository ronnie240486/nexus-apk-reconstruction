package org.bouncycastle.jce.spec;

import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class MQVPublicKeySpec implements KeySpec, MQVPublicKey {
    private PublicKey ephemeralKey;
    private PublicKey staticKey;

    /* JADX WARN: Invalid debug info offset */
    public MQVPublicKeySpec(PublicKey publicKey, PublicKey publicKey2) {
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

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.MQVPublicKey
    public PublicKey getEphemeralKey() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.MQVPublicKey
    public PublicKey getStaticKey() {
        return null;
    }
}
