package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class KeyRecRepContent extends ASN1Encodable {
    private ASN1Sequence caCerts;
    private ASN1Sequence keyPairHist;
    private CMPCertificate newSigCert;
    private PKIStatusInfo status;

    /* JADX WARN: Invalid debug info offset */
    private KeyRecRepContent(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static KeyRecRepContent getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate[] getCaCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertifiedKeyPair[] getKeyPairHist() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CMPCertificate getNewSigCert() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIStatusInfo getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
