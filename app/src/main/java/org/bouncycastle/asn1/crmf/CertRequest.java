package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertRequest extends ASN1Encodable {
    private DERInteger certReqId;
    private CertTemplate certTemplate;
    private Controls controls;

    /* JADX WARN: Invalid debug info offset */
    public CertRequest(int i, CertTemplate certTemplate, Controls controls) {
    }

    /* JADX WARN: Invalid debug info offset */
    private CertRequest(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertRequest(DERInteger dERInteger, CertTemplate certTemplate, Controls controls) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertRequest getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getCertReqId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertTemplate getCertTemplate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Controls getControls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
