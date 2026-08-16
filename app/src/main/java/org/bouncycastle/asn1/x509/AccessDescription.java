package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class AccessDescription extends ASN1Encodable {
    public static final DERObjectIdentifier id_ad_caIssuers = new DERObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final DERObjectIdentifier id_ad_ocsp = new DERObjectIdentifier(OCSPObjectIdentifiers.pkix_ocsp);
    GeneralName accessLocation;
    DERObjectIdentifier accessMethod;

    /* JADX WARN: Invalid debug info offset */
    public AccessDescription(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AccessDescription(DERObjectIdentifier dERObjectIdentifier, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AccessDescription getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getAccessLocation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getAccessMethod() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
