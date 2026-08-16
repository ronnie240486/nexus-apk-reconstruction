package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampedDataParser {
    private ASN1OctetStringParser content;
    private DERIA5String dataUri;
    private MetaData metaData;
    private ASN1SequenceParser parser;
    private Evidence temporalEvidence;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private TimeStampedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampedDataParser getInstance(Object obj) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetStringParser getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERIA5String getDataUri() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public MetaData getMetaData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Evidence getTemporalEvidence() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject toASN1Object() {
        return null;
    }
}
