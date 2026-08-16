package org.bouncycastle.jce.netscape;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class NetscapeCertRequest extends ASN1Encodable {
    String challenge;
    DERBitString content;
    AlgorithmIdentifier keyAlg;
    PublicKey pubkey;
    AlgorithmIdentifier sigAlg;
    byte[] sigBits;

    /* JADX WARN: Invalid debug info offset */
    public NetscapeCertRequest(String str, AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public NetscapeCertRequest(org.bouncycastle.asn1.ASN1Sequence r6) {
        /*
            r5 = this;
            return
        L7d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.netscape.NetscapeCertRequest.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public NetscapeCertRequest(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private org.bouncycastle.asn1.DERObject getKeySpec() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.netscape.NetscapeCertRequest.getKeySpec():org.bouncycastle.asn1.DERObject");
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence getReq(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getChallenge() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PublicKey getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSigningAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChallenge(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setKeyAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPublicKey(PublicKey publicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSigningAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void sign(PrivateKey privateKey) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void sign(java.security.PrivateKey r3, java.security.SecureRandom r4) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
        /*
            r2 = this;
            return
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.netscape.NetscapeCertRequest.sign(java.security.PrivateKey, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.DERObject toASN1Object() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.netscape.NetscapeCertRequest.toASN1Object():org.bouncycastle.asn1.DERObject");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return false;
    }
}
