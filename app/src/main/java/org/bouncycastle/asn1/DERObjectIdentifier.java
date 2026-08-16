package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DERObjectIdentifier extends ASN1Object {
    String identifier;

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObjectIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObjectIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isValidIdentifier(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeField(OutputStream outputStream, long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeField(OutputStream outputStream, BigInteger bigInteger) throws IOException {
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
    public String getId() {
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
