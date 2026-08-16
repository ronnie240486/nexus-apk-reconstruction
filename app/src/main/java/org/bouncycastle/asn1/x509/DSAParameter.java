package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DSAParameter extends ASN1Encodable {

    /* JADX INFO: renamed from: g */
    DERInteger f16019g;

    /* JADX INFO: renamed from: p */
    DERInteger f16020p;

    /* JADX INFO: renamed from: q */
    DERInteger f16021q;

    /* JADX WARN: Invalid debug info offset */
    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DSAParameter(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DSAParameter getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getG() {
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
