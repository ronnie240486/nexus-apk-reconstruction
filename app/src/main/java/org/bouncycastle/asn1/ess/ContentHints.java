package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes2.dex */
public class ContentHints extends ASN1Encodable {
    private DERUTF8String contentDescription;
    private DERObjectIdentifier contentType;

    /* JADX WARN: Invalid debug info offset */
    private ContentHints(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentHints(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentHints(DERObjectIdentifier dERObjectIdentifier, DERUTF8String dERUTF8String) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ContentHints getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUTF8String getContentDescription() {
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
