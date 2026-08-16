package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class JCERSAPublicKey implements RSAPublicKey {
    static final long serialVersionUID = 2675817738516720772L;
    private BigInteger modulus;
    private BigInteger publicExponent;

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPublicKey(RSAPublicKey rSAPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JCERSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r2) {
        /*
            r1 = this;
            return
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSAPublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPublicKey(RSAKeyParameters rSAKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
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
    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
