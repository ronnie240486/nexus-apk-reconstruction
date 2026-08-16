package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedData extends ASN1Encodable {
    private EncryptedContentInfo encryptedContentInfo;
    private ASN1Set unprotectedAttrs;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    private EncryptedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedData(EncryptedContentInfo encryptedContentInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedData(EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncryptedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfo getEncryptedContentInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getUnprotectedAttrs() {
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
