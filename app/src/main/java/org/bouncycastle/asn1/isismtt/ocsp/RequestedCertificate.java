package org.bouncycastle.asn1.isismtt.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

/* JADX INFO: loaded from: classes2.dex */
public class RequestedCertificate extends ASN1Encodable implements ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private byte[] attributeCert;
    private X509CertificateStructure cert;
    private byte[] publicKeyCert;

    /* JADX WARN: Invalid debug info offset */
    public RequestedCertificate(int i, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private RequestedCertificate(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RequestedCertificate(X509CertificateStructure x509CertificateStructure) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RequestedCertificate getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static RequestedCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] getCertificateBytes() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate.getCertificateBytes():byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
