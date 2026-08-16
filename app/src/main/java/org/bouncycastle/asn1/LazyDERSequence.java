package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public class LazyDERSequence extends DERSequence {
    private byte[] encoded;
    private boolean parsed;
    private int size;

    /* JADX WARN: Invalid debug info offset */
    public LazyDERSequence(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void parse() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERSequence, org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Sequence
    public synchronized DEREncodable getObjectAt(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Sequence
    public synchronized Enumeration getObjects() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Sequence
    public int size() {
        return 0;
    }
}
