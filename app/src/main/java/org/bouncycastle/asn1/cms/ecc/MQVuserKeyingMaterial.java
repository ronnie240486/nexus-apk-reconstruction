package org.bouncycastle.asn1.cms.ecc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class MQVuserKeyingMaterial extends ASN1Encodable {
    private ASN1OctetString addedukm;
    private OriginatorPublicKey ephemeralPublicKey;

    /* JADX WARN: Invalid debug info offset */
    private MQVuserKeyingMaterial(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MQVuserKeyingMaterial(OriginatorPublicKey originatorPublicKey, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MQVuserKeyingMaterial getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static MQVuserKeyingMaterial getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getAddedukm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorPublicKey getEphemeralPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
