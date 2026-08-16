package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public class CertifiedKeyPair extends ASN1Encodable {
    private CertOrEncCert certOrEncCert;
    private EncryptedValue privateKey;
    private PKIPublicationInfo publicationInfo;

    /* JADX WARN: Invalid debug info offset */
    private CertifiedKeyPair(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertifiedKeyPair(CertOrEncCert certOrEncCert) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedValue encryptedValue, PKIPublicationInfo pKIPublicationInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertifiedKeyPair getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertOrEncCert getCertOrEncCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedValue getPrivateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIPublicationInfo getPublicationInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
