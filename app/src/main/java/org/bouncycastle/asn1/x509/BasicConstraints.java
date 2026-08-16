package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class BasicConstraints extends ASN1Encodable {

    /* JADX INFO: renamed from: cA */
    DERBoolean f16018cA;
    DERInteger pathLenConstraint;

    /* JADX WARN: Invalid debug info offset */
    public BasicConstraints(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicConstraints(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicConstraints(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicConstraints(boolean z, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static BasicConstraints getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BasicConstraints getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPathLenConstraint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isCA() {
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
