package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERBitString;

/* JADX INFO: loaded from: classes2.dex */
public class KeyUsage extends DERBitString {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;

    /* JADX WARN: Invalid debug info offset */
    public KeyUsage(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyUsage(DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERBitString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERBitString
    public String toString() {
        return null;
    }
}
