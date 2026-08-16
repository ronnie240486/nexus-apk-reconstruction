package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Evidence extends ASN1Encodable implements ASN1Choice {
    private TimeStampTokenEvidence tstEvidence;

    /* JADX WARN: Invalid debug info offset */
    private Evidence(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Evidence(TimeStampTokenEvidence timeStampTokenEvidence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Evidence getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampTokenEvidence getTstEvidence() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
