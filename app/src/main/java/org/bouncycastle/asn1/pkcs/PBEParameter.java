package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PBEParameter extends ASN1Encodable {
    DERInteger iterations;
    ASN1OctetString salt;

    /* JADX WARN: Invalid debug info offset */
    public PBEParameter(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PBEParameter(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PBEParameter getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getIterationCount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSalt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
