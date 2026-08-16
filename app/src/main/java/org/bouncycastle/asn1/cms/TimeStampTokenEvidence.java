package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampTokenEvidence extends ASN1Encodable {
    private TimeStampAndCRL[] timeStampAndCRLs;

    /* JADX WARN: Invalid debug info offset */
    private TimeStampTokenEvidence(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampTokenEvidence(TimeStampAndCRL timeStampAndCRL) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampTokenEvidence(TimeStampAndCRL[] timeStampAndCRLArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampTokenEvidence getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampTokenEvidence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampAndCRL[] toTimeStampAndCRLArray() {
        return null;
    }
}
