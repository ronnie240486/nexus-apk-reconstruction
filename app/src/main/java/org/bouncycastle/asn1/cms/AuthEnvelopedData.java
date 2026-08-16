package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthEnvelopedData extends ASN1Encodable {
    private ASN1Set authAttrs;
    private EncryptedContentInfo authEncryptedContentInfo;
    private ASN1OctetString mac;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unauthAttrs;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public AuthEnvelopedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AuthEnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AuthEnvelopedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AuthEnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getAuthAttrs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedContentInfo getAuthEncryptedContentInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getMac() {
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
    public ASN1Set getUnauthAttrs() {
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
