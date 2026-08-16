package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CrlOcspRef extends ASN1Encodable {
    private CrlListID crlids;
    private OcspListID ocspids;
    private OtherRevRefs otherRev;

    /* JADX WARN: Invalid debug info offset */
    private CrlOcspRef(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlOcspRef(CrlListID crlListID, OcspListID ocspListID, OtherRevRefs otherRevRefs) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CrlOcspRef getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlListID getCrlids() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OcspListID getOcspids() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherRevRefs getOtherRev() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
