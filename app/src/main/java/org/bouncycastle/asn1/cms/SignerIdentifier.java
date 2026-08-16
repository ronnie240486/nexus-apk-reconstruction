package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class SignerIdentifier extends ASN1Encodable implements ASN1Choice {

    /* JADX INFO: renamed from: id */
    private DEREncodable f15979id;

    /* JADX WARN: Invalid debug info offset */
    public SignerIdentifier(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerIdentifier(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignerIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isTagged() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
