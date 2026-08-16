package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class NameConstraints extends ASN1Encodable {
    private ASN1Sequence excluded;
    private ASN1Sequence permitted;

    /* JADX WARN: Invalid debug info offset */
    public NameConstraints(Vector vector, Vector vector2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NameConstraints(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DERSequence createSequence(Vector vector) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getExcludedSubtrees() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getPermittedSubtrees() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
