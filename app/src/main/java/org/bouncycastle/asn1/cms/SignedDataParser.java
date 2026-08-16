package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.DERInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SignedDataParser {
    private boolean _certsCalled;
    private boolean _crlsCalled;
    private Object _nextObject;
    private ASN1SequenceParser _seq;
    private DERInteger _version;

    /* JADX WARN: Invalid debug info offset */
    private SignedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignedDataParser getInstance(Object obj) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getCertificates() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getCrls() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getDigestAlgorithms() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfoParser getEncapContentInfo() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser getSignerInfos() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }
}
