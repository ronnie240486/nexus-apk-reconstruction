package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public class MQVPrivateKeySpec implements KeySpec, MQVPrivateKey {
    private PrivateKey ephemeralPrivateKey;
    private PublicKey ephemeralPublicKey;
    private PrivateKey staticPrivateKey;

    /* JADX WARN: Invalid debug info offset */
    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2, PublicKey publicKey) {
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
    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getEphemeralPrivateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PublicKey getEphemeralPublicKey() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getStaticPrivateKey() {
        return null;
    }
}
