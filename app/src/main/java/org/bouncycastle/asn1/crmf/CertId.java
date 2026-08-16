package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class CertId extends ASN1Encodable {
    private GeneralName issuer;
    private DERInteger serialNumber;

    /* JADX WARN: Invalid debug info offset */
    private CertId(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertId getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertId getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getIssuer() {
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
