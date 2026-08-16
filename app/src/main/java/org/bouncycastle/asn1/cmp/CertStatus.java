package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertStatus extends ASN1Encodable {
    private ASN1OctetString certHash;
    private DERInteger certReqId;
    private PKIStatusInfo statusInfo;

    /* JADX WARN: Invalid debug info offset */
    private CertStatus(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus(byte[] bArr, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus(byte[] bArr, BigInteger bigInteger, PKIStatusInfo pKIStatusInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertStatus getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getCertHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getCertReqId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo getStatusInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
