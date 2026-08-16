package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RC2CBCParameter extends ASN1Encodable {

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f15999iv;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public RC2CBCParameter(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RC2CBCParameter(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RC2CBCParameter(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RC2CBCParameter getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getRC2ParameterVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
