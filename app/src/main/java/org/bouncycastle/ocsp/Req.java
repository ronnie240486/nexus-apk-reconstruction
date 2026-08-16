package org.bouncycastle.ocsp;

import java.security.cert.X509Extension;
import java.util.Set;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class Req implements X509Extension {
    private Request req;

    /* JADX WARN: Invalid debug info offset */
    public Req(Request request) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Set getExtensionOIDs(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificateID getCertID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.Req.getExtensionValue(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getSingleRequestExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return false;
    }
}
