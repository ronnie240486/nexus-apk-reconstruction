package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.math.p018ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private GOST3410PublicKeyAlgParameters gostParams;

    /* JADX INFO: renamed from: q */
    private ECPoint f16369q;
    private boolean withCompression;

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(ECPublicKey eCPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEECPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, ECDomainParameters eCDomainParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void populateFromPubKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r14) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPublicKey.populateFromPubKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPoint engineGetQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        return null;
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
    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
