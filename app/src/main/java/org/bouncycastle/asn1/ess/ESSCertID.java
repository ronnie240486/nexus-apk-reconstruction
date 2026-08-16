package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes2.dex */
public class ESSCertID extends ASN1Encodable {
    private ASN1OctetString certHash;
    private IssuerSerial issuerSerial;

    /* JADX WARN: Invalid debug info offset */
    public ESSCertID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ESSCertID(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ESSCertID(byte[] bArr, IssuerSerial issuerSerial) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ESSCertID getInstance(Object obj) {
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
