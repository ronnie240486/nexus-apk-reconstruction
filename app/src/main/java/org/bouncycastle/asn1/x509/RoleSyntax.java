package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RoleSyntax extends ASN1Encodable {
    private GeneralNames roleAuthority;
    private GeneralName roleName;

    /* JADX WARN: Invalid debug info offset */
    public RoleSyntax(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private RoleSyntax(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoleSyntax(GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RoleSyntax(GeneralNames generalNames, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RoleSyntax getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getRoleAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String[] getRoleAuthorityAsString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getRoleName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getRoleNameAsString() {
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
