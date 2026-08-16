package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OriginatorPublicKey extends ASN1Encodable {
    private AlgorithmIdentifier algorithm;
    private DERBitString publicKey;

    /* JADX WARN: Invalid debug info offset */
    public OriginatorPublicKey(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorPublicKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorPublicKey getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
