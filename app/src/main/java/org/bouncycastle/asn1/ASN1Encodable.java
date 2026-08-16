package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1Encodable implements DEREncodable {
    public static final String BER = "BER";
    public static final String DER = "DER";

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getDEREncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DEREncodable
    public DERObject getDERObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getEncoded() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getEncoded(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    public abstract DERObject toASN1Object();
}
