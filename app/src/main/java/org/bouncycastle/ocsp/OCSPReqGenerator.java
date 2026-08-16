package org.bouncycastle.ocsp;

import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPReqGenerator {
    private List list;
    private X509Extensions requestExtensions;
    private GeneralName requestorName;

    public class RequestObject {
        CertificateID certId;
        X509Extensions extensions;
        final /* synthetic */ OCSPReqGenerator this$0;

        /* JADX WARN: Invalid debug info offset */
        public RequestObject(OCSPReqGenerator oCSPReqGenerator, CertificateID certificateID, X509Extensions x509Extensions) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Request toRequest() throws Exception {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private org.bouncycastle.ocsp.OCSPReq generateRequest(org.bouncycastle.asn1.DERObjectIdentifier r5, java.security.PrivateKey r6, java.security.cert.X509Certificate[] r7, java.lang.String r8, java.security.SecureRandom r9) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReqGenerator.generateRequest(org.bouncycastle.asn1.DERObjectIdentifier, java.security.PrivateKey, java.security.cert.X509Certificate[], java.lang.String, java.security.SecureRandom):org.bouncycastle.ocsp.OCSPReq");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addRequest(CertificateID certificateID) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addRequest(CertificateID certificateID, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public org.bouncycastle.ocsp.OCSPReq generate() throws org.bouncycastle.ocsp.OCSPException {
        /*
            r6 = this;
            r0 = 0
            return r0
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReqGenerator.generate():org.bouncycastle.ocsp.OCSPReq");
    }

    /* JADX WARN: Invalid debug info offset */
    public OCSPReq generate(String str, PrivateKey privateKey, X509Certificate[] x509CertificateArr, String str2) throws OCSPException, IllegalArgumentException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public org.bouncycastle.ocsp.OCSPReq generate(java.lang.String r7, java.security.PrivateKey r8, java.security.cert.X509Certificate[] r9, java.lang.String r10, java.security.SecureRandom r11) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.OCSPReqGenerator.generate(java.lang.String, java.security.PrivateKey, java.security.cert.X509Certificate[], java.lang.String, java.security.SecureRandom):org.bouncycastle.ocsp.OCSPReq");
    }

    /* JADX WARN: Invalid debug info offset */
    public Iterator getSignatureAlgNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRequestExtensions(X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRequestorName(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRequestorName(GeneralName generalName) {
    }
}
