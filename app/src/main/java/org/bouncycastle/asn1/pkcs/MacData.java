package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.DigestInfo;

/* JADX INFO: loaded from: classes2.dex */
public class MacData extends ASN1Encodable {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    DigestInfo digInfo;
    BigInteger iterationCount;
    byte[] salt;

    /* JADX WARN: Invalid debug info offset */
    public MacData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MacData(DigestInfo digestInfo, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MacData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getIterationCount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DigestInfo getMac() {
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
