package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DistributionPoint extends ASN1Encodable {
    GeneralNames cRLIssuer;
    DistributionPointName distributionPoint;
    ReasonFlags reasons;

    /* JADX WARN: Invalid debug info offset */
    public DistributionPoint(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPoint(DistributionPointName distributionPointName, ReasonFlags reasonFlags, GeneralNames generalNames) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DistributionPoint getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getCRLIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName getDistributionPoint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ReasonFlags getReasons() {
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
