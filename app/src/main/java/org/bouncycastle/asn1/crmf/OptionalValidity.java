package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.Time;

/* JADX INFO: loaded from: classes2.dex */
public class OptionalValidity extends ASN1Encodable {
    private Time notAfter;
    private Time notBefore;

    /* JADX WARN: Invalid debug info offset */
    private OptionalValidity(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OptionalValidity getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
