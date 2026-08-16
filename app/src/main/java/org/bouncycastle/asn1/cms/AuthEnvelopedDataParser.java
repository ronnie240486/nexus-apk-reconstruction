package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;

/* JADX INFO: loaded from: classes2.dex */
public class AuthEnvelopedDataParser {
    private DEREncodable nextObject;
    private boolean originatorInfoCalled;
    private ASN1SequenceParser seq;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public AuthEnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getAuthAttrs() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfoParser getAuthEncryptedContentInfo() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getMac() throws IOException {
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
    public ASN1SetParser getUnauthAttrs() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }
}
