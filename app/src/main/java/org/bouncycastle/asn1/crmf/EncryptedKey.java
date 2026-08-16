package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedKey extends ASN1Encodable implements ASN1Choice {
    private EncryptedValue encryptedValue;
    private EnvelopedData envelopedData;

    /* JADX WARN: Invalid debug info offset */
    public EncryptedKey(EnvelopedData envelopedData) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedKey(EncryptedValue encryptedValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncryptedKey getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isEncryptedValue() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
