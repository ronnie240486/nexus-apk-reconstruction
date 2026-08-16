package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CAST5CBCParameters extends ASN1Encodable {

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f15990iv;
    DERInteger keyLength;

    /* JADX WARN: Invalid debug info offset */
    public CAST5CBCParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CAST5CBCParameters(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CAST5CBCParameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getKeyLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
