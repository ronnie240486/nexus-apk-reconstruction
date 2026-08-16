package org.bouncycastle.asn1.esf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class CrlIdentifier extends ASN1Encodable {
    private DERUTCTime crlIssuedTime;
    private X500Name crlIssuer;
    private DERInteger crlNumber;

    /* JADX WARN: Invalid debug info offset */
    private CrlIdentifier(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlIdentifier(X500Name x500Name, DERUTCTime dERUTCTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CrlIdentifier(X500Name x500Name, DERUTCTime dERUTCTime, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CrlIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUTCTime getCrlIssuedTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name getCrlIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getCrlNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
