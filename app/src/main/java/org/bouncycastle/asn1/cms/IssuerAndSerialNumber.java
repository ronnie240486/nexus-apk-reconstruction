package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes2.dex */
public class IssuerAndSerialNumber extends ASN1Encodable {
    private X500Name name;
    private DERInteger serialNumber;

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber(X500Name x500Name, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber(X509Name x509Name, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber(X509Name x509Name, DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static IssuerAndSerialNumber getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
