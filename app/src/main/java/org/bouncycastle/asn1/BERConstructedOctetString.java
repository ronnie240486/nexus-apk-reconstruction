package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class BERConstructedOctetString extends DEROctetString {
    private static final int MAX_LENGTH = 1000;
    private Vector octs;

    /* JADX WARN: Invalid debug info offset */
    public BERConstructedOctetString(Vector vector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BERConstructedOctetString(DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BERConstructedOctetString(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BERConstructedOctetString(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static BERConstructedOctetString fromSequence(ASN1Sequence aSN1Sequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Vector generateOcts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static byte[] toBytes(java.util.Vector r3) {
        /*
            r0 = 0
            return r0
        L1c:
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.BERConstructedOctetString.toBytes(java.util.Vector):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DEROctetString, org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public Enumeration getObjects() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1OctetString
    public byte[] getOctets() {
        return null;
    }
}
