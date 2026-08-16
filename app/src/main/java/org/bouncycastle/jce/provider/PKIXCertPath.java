package org.bouncycastle.jce.provider;

import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public PKIXCertPath(java.io.InputStream r4, java.lang.String r5) throws java.security.cert.CertificateException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPath.<init>(java.io.InputStream, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIXCertPath(List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    private List sortCerts(List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DERObject toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] toDEREncoded(ASN1Encodable aSN1Encodable) throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00a4
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.cert.CertPath
    public byte[] getEncoded(java.lang.String r10) throws java.security.cert.CertificateEncodingException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPath.getEncoded(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return null;
    }
}
