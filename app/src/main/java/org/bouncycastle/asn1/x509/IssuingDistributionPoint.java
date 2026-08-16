package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class IssuingDistributionPoint extends ASN1Encodable {
    private DistributionPointName distributionPoint;
    private boolean indirectCRL;
    private boolean onlyContainsAttributeCerts;
    private boolean onlyContainsCACerts;
    private boolean onlyContainsUserCerts;
    private ReasonFlags onlySomeReasons;
    private ASN1Sequence seq;

    /* JADX WARN: Invalid debug info offset */
    public IssuingDistributionPoint(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z, boolean z2, ReasonFlags reasonFlags, boolean z3, boolean z4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private String booleanToString(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static IssuingDistributionPoint getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static IssuingDistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName getDistributionPoint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ReasonFlags getOnlySomeReasons() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isIndirectCRL() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean onlyContainsAttributeCerts() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean onlyContainsCACerts() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean onlyContainsUserCerts() {
        return false;
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
