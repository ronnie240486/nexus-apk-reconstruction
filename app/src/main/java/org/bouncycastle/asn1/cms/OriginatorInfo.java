package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OriginatorInfo extends ASN1Encodable {
    private ASN1Set certs;
    private ASN1Set crls;

    /* JADX WARN: Invalid debug info offset */
    public OriginatorInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorInfo(ASN1Set aSN1Set, ASN1Set aSN1Set2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getCRLs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
