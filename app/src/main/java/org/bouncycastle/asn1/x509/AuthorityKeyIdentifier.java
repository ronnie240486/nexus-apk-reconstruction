package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorityKeyIdentifier extends ASN1Encodable {
    GeneralNames certissuer;
    DERInteger certserno;
    ASN1OctetString keyidentifier;

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(GeneralNames generalNames, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo, GeneralNames generalNames, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthorityKeyIdentifier(byte[] bArr, GeneralNames generalNames, BigInteger bigInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AuthorityKeyIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AuthorityKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getAuthorityCertIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getAuthorityCertSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getKeyIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
