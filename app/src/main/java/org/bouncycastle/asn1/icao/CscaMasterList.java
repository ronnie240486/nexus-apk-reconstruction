package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

/* JADX INFO: loaded from: classes2.dex */
public class CscaMasterList extends ASN1Encodable {
    private X509CertificateStructure[] certList;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private CscaMasterList(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CscaMasterList(X509CertificateStructure[] x509CertificateStructureArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private X509CertificateStructure[] copyCertList(X509CertificateStructure[] x509CertificateStructureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CscaMasterList getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificateStructure[] getCertStructs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
