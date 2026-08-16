package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes2.dex */
public class NamingAuthority extends ASN1Encodable {
    public static final DERObjectIdentifier id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern = new DERObjectIdentifier(ISISMTTObjectIdentifiers.id_isismtt_at_namingAuthorities + ".1");
    private DERObjectIdentifier namingAuthorityId;
    private DirectoryString namingAuthorityText;
    private String namingAuthorityUrl;

    /* JADX WARN: Invalid debug info offset */
    private NamingAuthority(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NamingAuthority(DERObjectIdentifier dERObjectIdentifier, String str, DirectoryString directoryString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static NamingAuthority getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static NamingAuthority getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getNamingAuthorityId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getNamingAuthorityText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getNamingAuthorityUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
