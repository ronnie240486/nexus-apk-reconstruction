package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedPrivateKeyInfo extends ASN1Encodable {
    private AlgorithmIdentifier algId;
    private ASN1OctetString data;

    /* JADX WARN: Invalid debug info offset */
    public EncryptedPrivateKeyInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedPrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncryptedPrivateKeyInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getEncryptedData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
