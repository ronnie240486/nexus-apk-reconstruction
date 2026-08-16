package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CompressedData extends ASN1Encodable {
    private AlgorithmIdentifier compressionAlgorithm;
    private ContentInfo encapContentInfo;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public CompressedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CompressedData(AlgorithmIdentifier algorithmIdentifier, ContentInfo contentInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CompressedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CompressedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo getEncapContentInfo() {
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
