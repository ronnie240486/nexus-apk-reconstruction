package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Accuracy extends ASN1Encodable {
    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;
    DERInteger micros;
    DERInteger millis;
    DERInteger seconds;

    /* JADX WARN: Invalid debug info offset */
    public Accuracy() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Accuracy(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Accuracy(DERInteger dERInteger, DERInteger dERInteger2, DERInteger dERInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Accuracy getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getMicros() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getMillis() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSeconds() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
