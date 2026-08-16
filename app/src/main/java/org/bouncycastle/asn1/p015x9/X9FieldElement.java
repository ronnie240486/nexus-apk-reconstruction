package org.bouncycastle.asn1.p015x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.math.p018ec.ECFieldElement;

/* JADX INFO: loaded from: classes2.dex */
public class X9FieldElement extends ASN1Encodable {
    private static X9IntegerConverter converter = new X9IntegerConverter();

    /* JADX INFO: renamed from: f */
    protected ECFieldElement f16043f;

    /* JADX WARN: Invalid debug info offset */
    public X9FieldElement(int i, int i2, int i3, int i4, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9FieldElement(BigInteger bigInteger, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9FieldElement(ECFieldElement eCFieldElement) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECFieldElement getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
