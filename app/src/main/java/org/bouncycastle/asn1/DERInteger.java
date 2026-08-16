package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DERInteger extends ASN1Object {
    byte[] bytes;

    /* JADX WARN: Invalid debug info offset */
    public DERInteger(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger(BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERInteger getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERInteger getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean asn1Equals(DERObject dERObject) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getPositiveValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
