package org.bouncycastle.asn1.x509.qualified;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class MonetaryValue extends ASN1Encodable {
    DERInteger amount;
    Iso4217CurrencyCode currency;
    DERInteger exponent;

    /* JADX WARN: Invalid debug info offset */
    public MonetaryValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MonetaryValue(Iso4217CurrencyCode iso4217CurrencyCode, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MonetaryValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getAmount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Iso4217CurrencyCode getCurrency() {
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
