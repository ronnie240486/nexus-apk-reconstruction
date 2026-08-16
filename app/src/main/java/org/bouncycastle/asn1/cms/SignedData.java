package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SignedData extends ASN1Encodable {
    private ASN1Set certificates;
    private boolean certsBer;
    private ContentInfo contentInfo;
    private ASN1Set crls;
    private boolean crlsBer;
    private ASN1Set digestAlgorithms;
    private ASN1Set signerInfos;
    private DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public SignedData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignedData(ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3, ASN1Set aSN1Set4) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DERInteger calculateVersion(DERObjectIdentifier dERObjectIdentifier, ASN1Set aSN1Set, ASN1Set aSN1Set2, ASN1Set aSN1Set3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean checkForVersion3(ASN1Set aSN1Set) {
        return false;
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
    public ASN1Set getDigestAlgorithms() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo getEncapContentInfo() {
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
