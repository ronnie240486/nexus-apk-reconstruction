package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CompressedDataParser {
    private AlgorithmIdentifier _compressionAlgorithm;
    private ContentInfoParser _encapContentInfo;
    private DERInteger _version;

    /* JADX WARN: Invalid debug info offset */
    public CompressedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfoParser getEncapContentInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }
}
