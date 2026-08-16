package org.bouncycastle.ocsp;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ocsp.OCSPResponse;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPResp {
    private OCSPResponse resp;

    /* JADX WARN: Invalid debug info offset */
    public OCSPResp(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private OCSPResp(org.bouncycastle.asn1.ASN1InputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            return
        L10:
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPResp.<init>(org.bouncycastle.asn1.ASN1InputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPResp(OCSPResponse oCSPResponse) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPResp(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getEncoded() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.Object getResponseObject() throws org.bouncycastle.ocsp.OCSPException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPResp.getResponseObject():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getStatus() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
