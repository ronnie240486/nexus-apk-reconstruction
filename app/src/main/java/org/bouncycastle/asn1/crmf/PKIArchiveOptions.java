package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIArchiveOptions extends ASN1Encodable implements ASN1Choice {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;
    private ASN1Encodable value;

    /* JADX WARN: Invalid debug info offset */
    public PKIArchiveOptions(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PKIArchiveOptions(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIArchiveOptions(EncryptedKey encryptedKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIArchiveOptions(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PKIArchiveOptions getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
