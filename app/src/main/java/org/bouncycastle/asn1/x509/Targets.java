package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Targets extends ASN1Encodable {
    private ASN1Sequence targets;

    /* JADX WARN: Invalid debug info offset */
    private Targets(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Targets(Target[] targetArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Targets getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Target[] getTargets() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
