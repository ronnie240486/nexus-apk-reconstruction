package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Holder extends ASN1Encodable {
    IssuerSerial baseCertificateID;
    GeneralNames entityName;
    ObjectDigestInfo objectDigestInfo;
    private int version;

    /* JADX WARN: Invalid debug info offset */
    public Holder(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(GeneralNames generalNames) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(GeneralNames generalNames, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(IssuerSerial issuerSerial) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(IssuerSerial issuerSerial, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder(ObjectDigestInfo objectDigestInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Holder getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial getBaseCertificateID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getEntityName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDigestInfo getObjectDigestInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
