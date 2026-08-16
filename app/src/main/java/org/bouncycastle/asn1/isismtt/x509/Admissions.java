package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class Admissions extends ASN1Encodable {
    private GeneralName admissionAuthority;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionInfos;

    /* JADX WARN: Invalid debug info offset */
    private Admissions(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Admissions(GeneralName generalName, NamingAuthority namingAuthority, ProfessionInfo[] professionInfoArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Admissions getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getAdmissionAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public NamingAuthority getNamingAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ProfessionInfo[] getProfessionInfos() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
