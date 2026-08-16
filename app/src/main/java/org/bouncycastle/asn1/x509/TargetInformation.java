package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class TargetInformation extends ASN1Encodable {
    private ASN1Sequence targets;

    /* JADX WARN: Invalid debug info offset */
    private TargetInformation(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TargetInformation(Targets targets) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TargetInformation(Target[] targetArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TargetInformation getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Targets[] getTargetsObjects() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
