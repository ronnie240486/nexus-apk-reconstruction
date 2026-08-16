package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERNumericString extends ASN1Object implements DERString {
    String string;

    /* JADX WARN: Invalid debug info offset */
    public DERNumericString(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERNumericString(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERNumericString(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERNumericString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERNumericString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isNumericString(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean asn1Equals(DERObject dERObject) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getOctets() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
