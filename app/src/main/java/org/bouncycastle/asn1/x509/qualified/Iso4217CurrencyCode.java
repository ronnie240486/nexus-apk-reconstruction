package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Iso4217CurrencyCode extends ASN1Encodable implements ASN1Choice {
    final int ALPHABETIC_MAXSIZE;
    final int NUMERIC_MAXSIZE;
    final int NUMERIC_MINSIZE;
    int numeric;
    DEREncodable obj;

    /* JADX WARN: Invalid debug info offset */
    public Iso4217CurrencyCode(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Iso4217CurrencyCode(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Iso4217CurrencyCode getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAlphabetic() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getNumeric() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isAlphabetic() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
