package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.DEREncodable;

/* JADX INFO: loaded from: classes2.dex */
public class ContentInfoParser {
    private ASN1TaggedObjectParser content;
    private ASN1ObjectIdentifier contentType;

    /* JADX WARN: Invalid debug info offset */
    public ContentInfoParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getContent(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier getContentType() {
        return null;
    }
}
