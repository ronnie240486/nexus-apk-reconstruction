package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class ResponderID extends ASN1Encodable implements ASN1Choice {
    private DEREncodable value;

    /* JADX WARN: Invalid debug info offset */
    public ResponderID(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponderID(X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponderID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponderID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getKeyHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
