package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ECGOST3410ParamSetParameters extends ASN1Encodable {

    /* JADX INFO: renamed from: a */
    DERInteger f15980a;

    /* JADX INFO: renamed from: b */
    DERInteger f15981b;

    /* JADX INFO: renamed from: p */
    DERInteger f15982p;

    /* JADX INFO: renamed from: q */
    DERInteger f15983q;

    /* JADX INFO: renamed from: x */
    DERInteger f15984x;

    /* JADX INFO: renamed from: y */
    DERInteger f15985y;

    /* JADX WARN: Invalid debug info offset */
    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getA() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
