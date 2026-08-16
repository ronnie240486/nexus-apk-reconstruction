package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class SemanticsInformation extends ASN1Encodable {
    GeneralName[] nameRegistrationAuthorities;
    DERObjectIdentifier semanticsIdentifier;

    /* JADX WARN: Invalid debug info offset */
    public SemanticsInformation(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SemanticsInformation(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SemanticsInformation(DERObjectIdentifier dERObjectIdentifier, GeneralName[] generalNameArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SemanticsInformation(GeneralName[] generalNameArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SemanticsInformation getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName[] getNameRegistrationAuthorities() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getSemanticsIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
