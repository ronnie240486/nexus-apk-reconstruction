package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OtherHashAlgAndValue extends ASN1Encodable {
    private AlgorithmIdentifier hashAlgorithm;
    private ASN1OctetString hashValue;

    /* JADX WARN: Invalid debug info offset */
    private OtherHashAlgAndValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHashAlgAndValue(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherHashAlgAndValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getHashValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
