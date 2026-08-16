package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class SubjectKeyIdentifier extends ASN1Encodable {
    private byte[] keyidentifier;

    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifier(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifier(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectKeyIdentifier createSHA1KeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectKeyIdentifier createTruncatedSHA1KeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectKeyIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
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
}
