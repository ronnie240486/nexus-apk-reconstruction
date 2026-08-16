package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410ParamSetParameters extends ASN1Encodable {

    /* JADX INFO: renamed from: a */
    DERInteger f15987a;
    int keySize;

    /* JADX INFO: renamed from: p */
    DERInteger f15988p;

    /* JADX INFO: renamed from: q */
    DERInteger f15989q;

    /* JADX WARN: Invalid debug info offset */
    public GOST3410ParamSetParameters(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static GOST3410ParamSetParameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getA() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getKeySize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLKeySize() {
        return 0;
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
