package org.bouncycastle.asn1.x509;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedKeyUsage extends ASN1Encodable {
    ASN1Sequence seq;
    Hashtable usageTable;

    /* JADX WARN: Invalid debug info offset */
    public ExtendedKeyUsage(Vector vector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedKeyUsage(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedKeyUsage(KeyPurposeId keyPurposeId) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ExtendedKeyUsage getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ExtendedKeyUsage getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getUsages() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasKeyPurposeId(KeyPurposeId keyPurposeId) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
