package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;

/* JADX INFO: loaded from: classes2.dex */
public class EnvelopedDataParser {
    private DEREncodable _nextObject;
    private boolean _originatorInfoCalled;
    private ASN1SequenceParser _seq;
    private DERInteger _version;

    /* JADX WARN: Invalid debug info offset */
    public EnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfoParser getEncryptedContentInfo() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorInfo getOriginatorInfo() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getRecipientInfos() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getUnprotectedAttrs() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }
}
