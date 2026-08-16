package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CertificationRequest extends ASN1Encodable {
    protected CertificationRequestInfo reqInfo;
    protected AlgorithmIdentifier sigAlgId;
    protected DERBitString sigBits;

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequest(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequest(CertificationRequestInfo certificationRequestInfo, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificationRequest getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificationRequestInfo getCertificationRequestInfo() {
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
