package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SignerInfo extends ASN1Encodable {
    private ASN1Set authenticatedAttributes;
    private AlgorithmIdentifier digAlgorithm;
    private AlgorithmIdentifier digEncryptionAlgorithm;
    private ASN1OctetString encryptedDigest;
    private IssuerAndSerialNumber issuerAndSerialNumber;
    private ASN1Set unauthenticatedAttributes;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public SignerInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignerInfo(DERInteger dERInteger, IssuerAndSerialNumber issuerAndSerialNumber, AlgorithmIdentifier algorithmIdentifier, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignerInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getAuthenticatedAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getDigestAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getDigestEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getEncryptedDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getUnauthenticatedAttributes() {
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
