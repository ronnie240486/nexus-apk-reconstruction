package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedContentInfoParser {
    private AlgorithmIdentifier _contentEncryptionAlgorithm;
    private DERObjectIdentifier _contentType;
    private ASN1TaggedObjectParser _encryptedContent;

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfoParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getEncryptedContent(int i) throws IOException {
        return null;
    }
}
