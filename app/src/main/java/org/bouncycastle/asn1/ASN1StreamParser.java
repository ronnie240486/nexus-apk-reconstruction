package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;

    /* JADX WARN: Invalid debug info offset */
    public ASN1StreamParser(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1StreamParser(InputStream inputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1StreamParser(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void set00Check(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable readImplicit(boolean z, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable readIndef(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00c5
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public org.bouncycastle.asn1.DEREncodable readObject() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1StreamParser.readObject():org.bouncycastle.asn1.DEREncodable");
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject readTaggedObject(boolean z, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1EncodableVector readVector() throws IOException {
        return null;
    }
}
