package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIBody extends ASN1Encodable implements ASN1Choice {
    public static final int TYPE_CA_KEY_UPDATE_ANN = 15;
    public static final int TYPE_CERT_ANN = 16;
    public static final int TYPE_CERT_CONFIRM = 24;
    public static final int TYPE_CERT_REP = 3;
    public static final int TYPE_CERT_REQ = 2;
    public static final int TYPE_CONFIRM = 19;
    public static final int TYPE_CRL_ANN = 18;
    public static final int TYPE_CROSS_CERT_REP = 14;
    public static final int TYPE_CROSS_CERT_REQ = 13;
    public static final int TYPE_ERROR = 23;
    public static final int TYPE_GEN_MSG = 21;
    public static final int TYPE_GEN_REP = 22;
    public static final int TYPE_INIT_REP = 1;
    public static final int TYPE_INIT_REQ = 0;
    public static final int TYPE_KEY_RECOVERY_REP = 10;
    public static final int TYPE_KEY_RECOVERY_REQ = 9;
    public static final int TYPE_KEY_UPDATE_REP = 8;
    public static final int TYPE_KEY_UPDATE_REQ = 7;
    public static final int TYPE_NESTED = 20;
    public static final int TYPE_P10_CERT_REQ = 4;
    public static final int TYPE_POLL_REP = 26;
    public static final int TYPE_POLL_REQ = 25;
    public static final int TYPE_POPO_CHALL = 5;
    public static final int TYPE_POPO_REP = 6;
    public static final int TYPE_REVOCATION_ANN = 17;
    public static final int TYPE_REVOCATION_REP = 12;
    public static final int TYPE_REVOCATION_REQ = 11;
    private ASN1Encodable body;
    private int tagNo;

    /* JADX WARN: Invalid debug info offset */
    public PKIBody(int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PKIBody(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Encodable getBodyForType(int i, ASN1Encodable aSN1Encodable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIBody getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
