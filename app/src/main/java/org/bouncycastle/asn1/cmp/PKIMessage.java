package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIMessage extends ASN1Encodable {
    private PKIBody body;
    private ASN1Sequence extraCerts;
    private PKIHeader header;
    private DERBitString protection;

    /* JADX WARN: Invalid debug info offset */
    private PKIMessage(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, DERBitString dERBitString, CMPCertificate[] cMPCertificateArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIMessage getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIBody getBody() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate[] getExtraCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIHeader getHeader() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getProtection() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
