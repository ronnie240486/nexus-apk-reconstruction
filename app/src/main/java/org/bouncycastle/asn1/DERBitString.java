package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERBitString extends ASN1Object implements DERString {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected byte[] data;
    protected int padBits;

    /* JADX WARN: Invalid debug info offset */
    public DERBitString(byte b, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public DERBitString(org.bouncycastle.asn1.DEREncodable r4) {
        /*
            r3 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERBitString.<init>(org.bouncycastle.asn1.DEREncodable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERBitString fromOctetString(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] getBytes(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERBitString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERBitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getPadBits(int i) {
        return 0;
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
    public byte[] getBytes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPadBits() {
        return 0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERBitString.getString():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int intValue() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
