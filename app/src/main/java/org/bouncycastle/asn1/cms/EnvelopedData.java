package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class EnvelopedData extends ASN1Encodable {
    private EncryptedContentInfo encryptedContentInfo;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unprotectedAttrs;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public EnvelopedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EnvelopedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static EnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfo getEncryptedContentInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorInfo getOriginatorInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getRecipientInfos() {
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
