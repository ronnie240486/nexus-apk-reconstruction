package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectDigestInfo extends ASN1Encodable {
    public static final int otherObjectDigest = 2;
    public static final int publicKey = 0;
    public static final int publicKeyCert = 1;
    AlgorithmIdentifier digestAlgorithm;
    DEREnumerated digestedObjectType;
    DERBitString objectDigest;
    DERObjectIdentifier otherObjectTypeID;

    /* JADX WARN: Invalid debug info offset */
    public ObjectDigestInfo(int i, String str, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ObjectDigestInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ObjectDigestInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ObjectDigestInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getDigestAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREnumerated getDigestedObjectType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getObjectDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getOtherObjectTypeID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
