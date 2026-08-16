package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Object;

/* JADX INFO: loaded from: classes2.dex */
public class X509ExtensionUtil {
    /* JADX WARN: Invalid debug info offset */
    public static ASN1Object fromExtensionValue(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static java.util.Collection getAlternativeNames(byte[] r5) throws java.security.cert.CertificateParsingException {
        /*
            r0 = 0
            return r0
        L57:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.extension.X509ExtensionUtil.getAlternativeNames(byte[]):java.util.Collection");
    }

    /* JADX WARN: Invalid debug info offset */
    public static Collection getIssuerAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Collection getSubjectAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return null;
    }
}
