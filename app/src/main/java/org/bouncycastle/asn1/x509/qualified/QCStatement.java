package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class QCStatement extends ASN1Encodable implements ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers {
    DERObjectIdentifier qcStatementId;
    ASN1Encodable qcStatementInfo;

    /* JADX WARN: Invalid debug info offset */
    public QCStatement(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public QCStatement(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public QCStatement(DERObjectIdentifier dERObjectIdentifier, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static QCStatement getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getStatementId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getStatementInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
