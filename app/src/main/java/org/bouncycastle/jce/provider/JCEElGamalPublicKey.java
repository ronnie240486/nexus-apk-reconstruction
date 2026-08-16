package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private ElGamalParameterSpec elSpec;

    /* JADX INFO: renamed from: y */
    private BigInteger f16371y;

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JCEElGamalPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r3) {
        /*
            r2 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEElGamalPublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(ElGamalPublicKeyParameters elGamalPublicKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPublicKey(ElGamalPublicKeySpec elGamalPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
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
    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public ElGamalParameterSpec getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return null;
    }
}
