package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class Signature extends ASN1Encodable {
    ASN1Sequence certs;
    DERBitString signature;
    AlgorithmIdentifier signatureAlgorithm;

    /* JADX WARN: Invalid debug info offset */
    public Signature(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signature(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Signature getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Signature getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
