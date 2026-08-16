package org.bouncycastle.ocsp;

import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.ocsp.CertStatus;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class BasicOCSPRespGenerator {
    private List list;
    private RespID responderID;
    private X509Extensions responseExtensions;

    public class ResponseObject {
        CertificateID certId;
        CertStatus certStatus;
        X509Extensions extensions;
        DERGeneralizedTime nextUpdate;
        final /* synthetic */ BasicOCSPRespGenerator this$0;
        DERGeneralizedTime thisUpdate;

        /* JADX WARN: Invalid debug info offset */
        public ResponseObject(BasicOCSPRespGenerator basicOCSPRespGenerator, CertificateID certificateID, CertificateStatus certificateStatus, Date date, Date date2, X509Extensions x509Extensions) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SingleResponse toResponse() throws Exception {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPRespGenerator(PublicKey publicKey) throws OCSPException {
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPRespGenerator(RespID respID) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private org.bouncycastle.ocsp.BasicOCSPResp generateResponse(java.lang.String r6, java.security.PrivateKey r7, java.security.cert.X509Certificate[] r8, java.util.Date r9, java.lang.String r10, java.security.SecureRandom r11) throws org.bouncycastle.ocsp.OCSPException, java.security.NoSuchProviderException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.BasicOCSPRespGenerator.generateResponse(java.lang.String, java.security.PrivateKey, java.security.cert.X509Certificate[], java.util.Date, java.lang.String, java.security.SecureRandom):org.bouncycastle.ocsp.BasicOCSPResp");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addResponse(CertificateID certificateID, CertificateStatus certificateStatus) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Date date, Date date2, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Date date, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addResponse(CertificateID certificateID, CertificateStatus certificateStatus, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPResp generate(String str, PrivateKey privateKey, X509Certificate[] x509CertificateArr, Date date, String str2) throws OCSPException, IllegalArgumentException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BasicOCSPResp generate(String str, PrivateKey privateKey, X509Certificate[] x509CertificateArr, Date date, String str2, SecureRandom secureRandom) throws OCSPException, IllegalArgumentException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Iterator getSignatureAlgNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setResponseExtensions(X509Extensions x509Extensions) {
    }
}
