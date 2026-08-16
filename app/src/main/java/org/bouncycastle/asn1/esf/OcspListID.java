package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OcspListID extends ASN1Encodable {
    private ASN1Sequence ocspResponses;

    /* JADX WARN: Invalid debug info offset */
    private OcspListID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspListID(OcspResponsesID[] ocspResponsesIDArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OcspListID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspResponsesID[] getOcspResponses() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
