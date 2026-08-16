package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes2.dex */
public class SignerLocation extends ASN1Encodable {
    private DERUTF8String countryName;
    private DERUTF8String localityName;
    private ASN1Sequence postalAddress;

    /* JADX WARN: Invalid debug info offset */
    public SignerLocation(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerLocation(DERUTF8String dERUTF8String, DERUTF8String dERUTF8String2, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignerLocation getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUTF8String getCountryName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUTF8String getLocalityName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getPostalAddress() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
