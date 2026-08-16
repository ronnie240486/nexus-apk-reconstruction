package org.bouncycastle.mozilla;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SignedPublicKeyAndChallenge extends ASN1Encodable {
    private PublicKeyAndChallenge pkac;
    private DERBitString signature;
    private AlgorithmIdentifier signatureAlgorithm;
    private ASN1Sequence spkacSeq;

    /* JADX WARN: Invalid debug info offset */
    public SignedPublicKeyAndChallenge(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence toDERSequence(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.PublicKey getPublicKey(java.lang.String r4) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.mozilla.SignedPublicKeyAndChallenge.getPublicKey(java.lang.String):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    public PublicKeyAndChallenge getPublicKeyAndChallenge() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean verify() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return false;
    }
}
