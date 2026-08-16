package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class IssuerSerial extends ASN1Encodable {
    GeneralNames issuer;
    DERBitString issuerUID;
    DERInteger serial;

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial(GeneralNames generalNames, DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static IssuerSerial getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static IssuerSerial getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getIssuerUID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerial() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
