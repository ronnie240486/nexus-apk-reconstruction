package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OOBCertHash extends ASN1Encodable {
    private CertId certId;
    private AlgorithmIdentifier hashAlg;
    private DERBitString hashVal;

    /* JADX WARN: Invalid debug info offset */
    private OOBCertHash(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OOBCertHash getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertId getCertId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
