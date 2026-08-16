package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERApplicationSpecific extends ASN1Object {
    private final boolean isConstructed;
    private final byte[] octets;
    private final int tag;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public DERApplicationSpecific(int r3, org.bouncycastle.asn1.ASN1EncodableVector r4) {
        /*
            r2 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERApplicationSpecific.<init>(int, org.bouncycastle.asn1.ASN1EncodableVector):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public DERApplicationSpecific(int i, DEREncodable dEREncodable) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERApplicationSpecific(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERApplicationSpecific(boolean z, int i, DEREncodable dEREncodable) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERApplicationSpecific(boolean z, int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int getLengthOfLength(byte[] bArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] replaceTagNumber(int i, byte[] bArr) throws IOException {
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
    public int getApplicationTag() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getContents() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getObject() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getObject(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isConstructed() {
        return false;
    }
}
