package org.bouncycastle.asn1.isismtt.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERPrintableString;

/* JADX INFO: loaded from: classes2.dex */
public class MonetaryLimit extends ASN1Encodable {
    DERInteger amount;
    DERPrintableString currency;
    DERInteger exponent;

    /* JADX WARN: Invalid debug info offset */
    public MonetaryLimit(String str, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private MonetaryLimit(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MonetaryLimit getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getAmount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCurrency() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
