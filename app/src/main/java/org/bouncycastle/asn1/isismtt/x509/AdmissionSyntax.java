package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class AdmissionSyntax extends ASN1Encodable {
    private GeneralName admissionAuthority;
    private ASN1Sequence contentsOfAdmissions;

    /* JADX WARN: Invalid debug info offset */
    private AdmissionSyntax(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AdmissionSyntax(GeneralName generalName, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AdmissionSyntax getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getAdmissionAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Admissions[] getContentsOfAdmissions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
