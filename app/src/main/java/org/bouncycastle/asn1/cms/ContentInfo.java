package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ContentInfo extends ASN1Encodable implements CMSObjectIdentifiers {
    private DEREncodable content;
    private ASN1ObjectIdentifier contentType;

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo(ASN1Sequence aSN1Sequence) {
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
    public ASN1ObjectIdentifier getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
