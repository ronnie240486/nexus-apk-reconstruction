package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class TBSCertList extends ASN1Encodable {
    X509Extensions crlExtensions;
    X509Name issuer;
    Time nextUpdate;
    ASN1Sequence revokedCertificates;
    ASN1Sequence seq;
    AlgorithmIdentifier signature;
    Time thisUpdate;
    DERInteger version;

    public static class CRLEntry extends ASN1Encodable {
        X509Extensions crlEntryExtensions;
        Time revocationDate;
        ASN1Sequence seq;
        DERInteger userCertificate;

        /* JADX WARN: Invalid debug info offset */
        public CRLEntry(ASN1Sequence aSN1Sequence) {
        }

        /* JADX WARN: Invalid debug info offset */
        public X509Extensions getExtensions() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Time getRevocationDate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public DERInteger getUserCertificate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.ASN1Encodable
        public DERObject toASN1Object() {
            return null;
        }
    }

    public class EmptyEnumeration implements Enumeration {
        final /* synthetic */ TBSCertList this$0;

        /* JADX WARN: Invalid debug info offset */
        private EmptyEnumeration(TBSCertList tBSCertList) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ EmptyEnumeration(TBSCertList tBSCertList, C50161 c50161) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return null;
        }
    }

    public class RevokedCertificatesEnumeration implements Enumeration {

        /* JADX INFO: renamed from: en */
        private final Enumeration f16022en;
        final /* synthetic */ TBSCertList this$0;

        /* JADX WARN: Invalid debug info offset */
        public RevokedCertificatesEnumeration(TBSCertList tBSCertList, Enumeration enumeration) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public Object nextElement() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSCertList(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSCertList getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TBSCertList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
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
    public CRLEntry[] getRevokedCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignature() {
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
    public DERInteger getVersionNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
