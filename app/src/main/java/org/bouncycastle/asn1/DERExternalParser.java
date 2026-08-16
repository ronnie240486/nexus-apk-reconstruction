package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERExternalParser implements DEREncodable, InMemoryRepresentable {
    private ASN1StreamParser _parser;

    /* JADX WARN: Invalid debug info offset */
    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.DEREncodable
    public org.bouncycastle.asn1.DERObject getDERObject() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L7:
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERExternalParser.getDERObject():org.bouncycastle.asn1.DERObject");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public DERObject getLoadedObject() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable readObject() throws IOException {
        return null;
    }
}
