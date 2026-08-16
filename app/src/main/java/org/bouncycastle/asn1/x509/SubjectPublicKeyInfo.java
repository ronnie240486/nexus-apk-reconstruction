package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class SubjectPublicKeyInfo extends ASN1Encodable {
    private AlgorithmIdentifier algId;
    private DERBitString keyData;

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectPublicKeyInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgorithmId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getPublicKey() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getPublicKeyData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
