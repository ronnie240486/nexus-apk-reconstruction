package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12PBEParams extends ASN1Encodable {
    DERInteger iterations;

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f15998iv;

    /* JADX WARN: Invalid debug info offset */
    public PKCS12PBEParams(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS12PBEParams(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKCS12PBEParams getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getIterations() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
