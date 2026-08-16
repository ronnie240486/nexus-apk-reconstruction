package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralSubtree extends ASN1Encodable {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private GeneralName base;
    private DERInteger maximum;
    private DERInteger minimum;

    /* JADX WARN: Invalid debug info offset */
    public GeneralSubtree(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralSubtree(GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralSubtree(GeneralName generalName, BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static GeneralSubtree getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static GeneralSubtree getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getBase() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getMaximum() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getMinimum() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
