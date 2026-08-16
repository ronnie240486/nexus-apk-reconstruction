package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Target extends ASN1Encodable implements ASN1Choice {
    public static final int targetGroup = 1;
    public static final int targetName = 0;
    private GeneralName targGroup;
    private GeneralName targName;

    /* JADX WARN: Invalid debug info offset */
    public Target(int i, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Target(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Target getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getTargetGroup() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getTargetName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
