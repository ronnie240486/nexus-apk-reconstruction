package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;

    /* JADX INFO: renamed from: y */
    private BigInteger f16377y;

    /* JADX WARN: Invalid debug info offset */
    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JDKDSAPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r4) {
        /*
            r3 = this;
            return
        L40:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKDSAPublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKDSAPublicKey(DSAPublicKeyParameters dSAPublicKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isNotNull(DEREncodable dEREncodable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
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
    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
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
