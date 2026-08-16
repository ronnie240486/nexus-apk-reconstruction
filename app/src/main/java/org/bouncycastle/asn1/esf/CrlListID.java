package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CrlListID extends ASN1Encodable {
    private ASN1Sequence crls;

    /* JADX WARN: Invalid debug info offset */
    private CrlListID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlListID(CrlValidatedID[] crlValidatedIDArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CrlListID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlValidatedID[] getCrls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
