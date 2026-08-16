package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class RecipientInfo extends ASN1Encodable implements ASN1Choice {

    /* JADX INFO: renamed from: info, reason: collision with root package name */
    DEREncodable f19796info;

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(KEKRecipientInfo kEKRecipientInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(KeyAgreeRecipientInfo keyAgreeRecipientInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(KeyTransRecipientInfo keyTransRecipientInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(OtherRecipientInfo otherRecipientInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RecipientInfo(PasswordRecipientInfo passwordRecipientInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RecipientInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private KEKRecipientInfo getKEKInfo(ASN1TaggedObject aSN1TaggedObject) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isTagged() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
