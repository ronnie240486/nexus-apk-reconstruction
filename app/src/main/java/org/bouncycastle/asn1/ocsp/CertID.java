package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CertID extends ASN1Encodable {
    AlgorithmIdentifier hashAlgorithm;
    ASN1OctetString issuerKeyHash;
    ASN1OctetString issuerNameHash;
    DERInteger serialNumber;

    /* JADX WARN: Invalid debug info offset */
    public CertID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertID(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2, DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getIssuerKeyHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getIssuerNameHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
