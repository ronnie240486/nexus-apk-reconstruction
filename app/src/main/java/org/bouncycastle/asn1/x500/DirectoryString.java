package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUniversalString;

/* JADX INFO: loaded from: classes2.dex */
public class DirectoryString extends ASN1Encodable implements ASN1Choice, ASN1String {
    private ASN1String string;

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DirectoryString(DERBMPString dERBMPString) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DirectoryString(DERPrintableString dERPrintableString) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DirectoryString(DERT61String dERT61String) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DirectoryString(DERUTF8String dERUTF8String) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DirectoryString(DERUniversalString dERUniversalString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DirectoryString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DirectoryString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
