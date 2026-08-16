package org.bouncycastle.asn1.p015x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OtherInfo extends ASN1Encodable {
    private KeySpecificInfo keyInfo;
    private ASN1OctetString partyAInfo;
    private ASN1OctetString suppPubInfo;

    /* JADX WARN: Invalid debug info offset */
    public OtherInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherInfo(KeySpecificInfo keySpecificInfo, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeySpecificInfo getKeyInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getPartyAInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getSuppPubInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
