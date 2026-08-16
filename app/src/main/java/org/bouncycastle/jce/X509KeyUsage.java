package org.bouncycastle.jce;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class X509KeyUsage extends ASN1Encodable {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private int usage;

    /* JADX WARN: Invalid debug info offset */
    public X509KeyUsage(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
