package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;

/* JADX INFO: loaded from: classes2.dex */
public class CertOrEncCert extends ASN1Encodable implements ASN1Choice {
    private CMPCertificate certificate;
    private EncryptedValue encryptedCert;

    /* JADX WARN: Invalid debug info offset */
    private CertOrEncCert(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertOrEncCert(CMPCertificate cMPCertificate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertOrEncCert(EncryptedValue encryptedValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertOrEncCert getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate getCertificate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedValue getEncryptedCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
