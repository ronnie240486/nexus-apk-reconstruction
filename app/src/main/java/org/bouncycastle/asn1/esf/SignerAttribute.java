package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;

/* JADX INFO: loaded from: classes2.dex */
public class SignerAttribute extends ASN1Encodable {
    private AttributeCertificate certifiedAttributes;
    private ASN1Sequence claimedAttributes;

    /* JADX WARN: Invalid debug info offset */
    private SignerAttribute(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerAttribute(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerAttribute(AttributeCertificate attributeCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignerAttribute getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificate getCertifiedAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getClaimedAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
