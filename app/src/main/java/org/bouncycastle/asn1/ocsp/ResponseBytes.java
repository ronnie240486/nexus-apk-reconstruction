package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseBytes extends ASN1Encodable {
    ASN1OctetString response;
    DERObjectIdentifier responseType;

    /* JADX WARN: Invalid debug info offset */
    public ResponseBytes(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponseBytes(DERObjectIdentifier dERObjectIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponseBytes getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ResponseBytes getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getResponse() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getResponseType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
