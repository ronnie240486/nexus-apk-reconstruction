package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1Object extends DERObject {
    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.asn1.ASN1Object fromByteArray(byte[] r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1Object.fromByteArray(byte[]):org.bouncycastle.asn1.ASN1Object");
    }

    public abstract boolean asn1Equals(DERObject dERObject);

    @Override // org.bouncycastle.asn1.DERObject
    public abstract void encode(DEROutputStream dEROutputStream) throws IOException;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public final boolean equals(Object obj) {
        return false;
    }

    @Override // org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public abstract int hashCode();
}
