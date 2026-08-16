package org.bouncycastle.asn1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ASN1InputStream extends FilterInputStream implements DERTags {
    private final boolean lazyEvaluate;
    private final int limit;

    /* JADX WARN: Invalid debug info offset */
    public ASN1InputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1InputStream(InputStream inputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1InputStream(InputStream inputStream, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1InputStream(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1InputStream(byte[] bArr, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObject createPrimitiveDERObject(int i, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int findLimit(InputStream inputStream) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int readLength(InputStream inputStream, int i) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int readTagNumber(InputStream inputStream, int i) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1EncodableVector buildEncodableVector() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject buildObject(int i, int i2, int i3) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void readFully(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public int readLength() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0097
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public org.bouncycastle.asn1.DERObject readObject() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L9c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1InputStream.readObject():org.bouncycastle.asn1.DERObject");
    }
}
