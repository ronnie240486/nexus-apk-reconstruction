package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertificateList extends ASN1Encodable {
    DERBitString sig;
    AlgorithmIdentifier sigAlgId;
    TBSCertList tbsCertList;

    /* JADX WARN: Invalid debug info offset */
    public CertificateList(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificateList getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificateList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Time getNextUpdate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Enumeration getRevokedCertificateEnumeration() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSCertList.CRLEntry[] getRevokedCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSCertList getTBSCertList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Time getThisUpdate() {
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
