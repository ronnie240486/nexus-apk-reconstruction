package org.bouncycastle.asn1.p015x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DHDomainParameters extends ASN1Encodable {

    /* JADX INFO: renamed from: g */
    private DERInteger f16034g;

    /* JADX INFO: renamed from: j */
    private DERInteger f16035j;

    /* JADX INFO: renamed from: p */
    private DERInteger f16036p;

    /* JADX INFO: renamed from: q */
    private DERInteger f16037q;
    private DHValidationParms validationParms;

    /* JADX WARN: Invalid debug info offset */
    private DHDomainParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHDomainParameters(DERInteger dERInteger, DERInteger dERInteger2, DERInteger dERInteger3, DERInteger dERInteger4, DHValidationParms dHValidationParms) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DHDomainParameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DHDomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static DEREncodable getNext(Enumeration enumeration) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getG() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getJ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DHValidationParms getValidationParms() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
