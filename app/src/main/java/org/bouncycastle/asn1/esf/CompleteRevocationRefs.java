package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteRevocationRefs extends ASN1Encodable {
    private ASN1Sequence crlOcspRefs;

    /* JADX WARN: Invalid debug info offset */
    private CompleteRevocationRefs(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CompleteRevocationRefs(CrlOcspRef[] crlOcspRefArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CompleteRevocationRefs getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlOcspRef[] getCrlOcspRefs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
