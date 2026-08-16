package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CommitmentTypeIndication extends ASN1Encodable {
    private DERObjectIdentifier commitmentTypeId;
    private ASN1Sequence commitmentTypeQualifier;

    /* JADX WARN: Invalid debug info offset */
    public CommitmentTypeIndication(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CommitmentTypeIndication(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CommitmentTypeIndication(DERObjectIdentifier dERObjectIdentifier, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CommitmentTypeIndication getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getCommitmentTypeId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getCommitmentTypeQualifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
