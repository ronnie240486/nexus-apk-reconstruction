package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERUniversalString extends ASN1Object implements DERString {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private byte[] string;

    /* JADX WARN: Invalid debug info offset */
    public DERUniversalString(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERUniversalString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERUniversalString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
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
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.ASN1String
    public java.lang.String getString() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERUniversalString.getString():java.lang.String");
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
