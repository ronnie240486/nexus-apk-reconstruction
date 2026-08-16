package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PBKDF2Params extends ASN1Encodable {
    DERInteger iterationCount;
    DERInteger keyLength;
    ASN1OctetString octStr;

    /* JADX WARN: Invalid debug info offset */
    public PBKDF2Params(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PBKDF2Params(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PBKDF2Params getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getIterationCount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getKeyLength() {
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
