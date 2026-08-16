package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;

    /* JADX INFO: renamed from: info, reason: collision with root package name */
    private SubjectPublicKeyInfo f19800info;

    /* JADX INFO: renamed from: y */
    private BigInteger f16367y;

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JCEDHPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r4) {
        /*
            r3 = this;
            return
        L9c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEDHPublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPublicKey(DHPublicKeyParameters dHPublicKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isPKCSParam(ASN1Sequence aSN1Sequence) {
        return false;
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
    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return null;
    }
}
