package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeCertificateInfo extends ASN1Encodable {
    private AttCertValidityPeriod attrCertValidityPeriod;
    private ASN1Sequence attributes;
    private X509Extensions extensions;
    private Holder holder;
    private AttCertIssuer issuer;
    private DERBitString issuerUniqueID;
    private DERInteger serialNumber;
    private AlgorithmIdentifier signature;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttributeCertificateInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttributeCertificateInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttCertValidityPeriod getAttrCertValidityPeriod() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence getAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Holder getHolder() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AttCertIssuer getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getIssuerUniqueID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
