package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;

/* JADX INFO: loaded from: classes2.dex */
public class V2AttributeCertificateInfoGenerator {
    private ASN1EncodableVector attributes;
    private DERGeneralizedTime endDate;
    private X509Extensions extensions;
    private Holder holder;
    private AttCertIssuer issuer;
    private DERBitString issuerUniqueID;
    private DERInteger serialNumber;
    private AlgorithmIdentifier signature;
    private DERGeneralizedTime startDate;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public void addAttribute(String str, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addAttribute(Attribute attribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttributeCertificateInfo generateAttributeCertificateInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndDate(DERGeneralizedTime dERGeneralizedTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtensions(X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHolder(Holder holder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(AttCertIssuer attCertIssuer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuerUniqueID(DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSerialNumber(DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartDate(DERGeneralizedTime dERGeneralizedTime) {
    }
}
