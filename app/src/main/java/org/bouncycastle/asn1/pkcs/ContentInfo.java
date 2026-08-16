package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class ContentInfo extends ASN1Encodable implements PKCSObjectIdentifiers {
    private DEREncodable content;
    private DERObjectIdentifier contentType;

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ContentInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
