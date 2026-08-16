package org.bouncycastle.jce.provider;

import java.security.cert.CertPathBuilderSpi;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.cert.CertPathBuilderResult build(java.security.cert.X509Certificate r6, org.bouncycastle.x509.ExtendedPKIXBuilderParameters r7, java.util.List r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi.build(java.security.cert.X509Certificate, org.bouncycastle.x509.ExtendedPKIXBuilderParameters, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0051
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertPathBuilderSpi
    public java.security.cert.CertPathBuilderResult engineBuild(java.security.cert.CertPathParameters r5) throws java.security.cert.CertPathBuilderException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters):java.security.cert.CertPathBuilderResult");
    }
}
