package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampedData extends ASN1Encodable {
    private ASN1OctetString content;
    private DERIA5String dataUri;
    private MetaData metaData;
    private Evidence temporalEvidence;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private TimeStampedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampedData(DERIA5String dERIA5String, MetaData metaData, ASN1OctetString aSN1OctetString, Evidence evidence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getContent() {
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
    public Evidence getTemporalEvidence() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
