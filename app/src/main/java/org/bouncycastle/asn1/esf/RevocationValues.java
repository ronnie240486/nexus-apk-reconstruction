package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes2.dex */
public class RevocationValues extends ASN1Encodable {
    private ASN1Sequence crlVals;
    private ASN1Sequence ocspVals;
    private OtherRevVals otherRevVals;

    /* JADX WARN: Invalid debug info offset */
    private RevocationValues(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevocationValues(CertificateList[] certificateListArr, BasicOCSPResponse[] basicOCSPResponseArr, OtherRevVals otherRevVals) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RevocationValues getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateList[] getCrlVals() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPResponse[] getOcspVals() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherRevVals getOtherRevVals() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
