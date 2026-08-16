package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes2.dex */
public class OtherCertID extends ASN1Encodable {
    private IssuerSerial issuerSerial;
    private ASN1Encodable otherCertHash;

    /* JADX WARN: Invalid debug info offset */
    public OtherCertID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherCertID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgorithmHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getCertHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial getIssuerSerial() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
