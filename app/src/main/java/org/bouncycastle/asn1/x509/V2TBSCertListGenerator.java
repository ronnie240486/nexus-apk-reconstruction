package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class V2TBSCertListGenerator {
    private Vector crlentries;
    X509Extensions extensions;
    X509Name issuer;
    Time nextUpdate;
    AlgorithmIdentifier signature;
    Time thisUpdate;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(DERInteger dERInteger, DERUTCTime dERUTCTime, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(DERInteger dERInteger, Time time, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void addCRLEntry(org.bouncycastle.asn1.DERInteger r6, org.bouncycastle.asn1.x509.Time r7, int r8, org.bouncycastle.asn1.DERGeneralizedTime r9) {
        /*
            r5 = this;
            return
        L29:
        L4f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.V2TBSCertListGenerator.addCRLEntry(org.bouncycastle.asn1.DERInteger, org.bouncycastle.asn1.x509.Time, int, org.bouncycastle.asn1.DERGeneralizedTime):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addCRLEntry(DERInteger dERInteger, Time time, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TBSCertList generateTBSCertList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtensions(X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIssuer(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNextUpdate(DERUTCTime dERUTCTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNextUpdate(Time time) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setThisUpdate(DERUTCTime dERUTCTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setThisUpdate(Time time) {
    }
}
