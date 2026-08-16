package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorityInformationAccess extends ASN1Encodable {
    private AccessDescription[] descriptions;

    /* JADX WARN: Invalid debug info offset */
    public AuthorityInformationAccess(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityInformationAccess(DERObjectIdentifier dERObjectIdentifier, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AuthorityInformationAccess getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AccessDescription[] getAccessDescriptions() {
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
