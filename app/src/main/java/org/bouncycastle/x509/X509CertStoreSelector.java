package org.bouncycastle.x509;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertStoreSelector extends X509CertSelector implements Selector {
    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.x509.X509CertStoreSelector getInstance(java.security.cert.X509CertSelector r2) {
        /*
            r0 = 0
            return r0
        L86:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.X509CertStoreSelector.getInstance(java.security.cert.X509CertSelector):org.bouncycastle.x509.X509CertStoreSelector");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        return false;
    }
}
