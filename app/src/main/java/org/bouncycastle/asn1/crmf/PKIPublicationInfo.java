package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIPublicationInfo extends ASN1Encodable {
    private DERInteger action;
    private ASN1Sequence pubInfos;

    /* JADX WARN: Invalid debug info offset */
    private PKIPublicationInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIPublicationInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getAction() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SinglePubInfo[] getPubInfos() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
