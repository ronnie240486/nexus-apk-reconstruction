package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERUnknownTag extends DERObject {
    private byte[] data;
    private boolean isConstructed;
    private int tag;

    /* JADX WARN: Invalid debug info offset */
    public DERUnknownTag(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUnknownTag(boolean z, int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getTag() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isConstructed() {
        return false;
    }
}
