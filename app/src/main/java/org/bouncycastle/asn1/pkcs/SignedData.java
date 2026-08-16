package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class SignedData extends ASN1Encodable implements PKCSObjectIdentifiers {
    private ASN1Set certificates;
    private ContentInfo contentInfo;
    private ASN1Set crls;
    private ASN1Set digestAlgorithms;
    private ASN1Set signerInfos;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public SignedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignedData(DERInteger dERInteger, ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3, ASN1Set aSN1Set4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignedData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getCRLs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo getContentInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getDigestAlgorithms() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getSignerInfos() {
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
