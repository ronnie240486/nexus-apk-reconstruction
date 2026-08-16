package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException implements ExtException {
    private Throwable cause;

    /* JADX WARN: Invalid debug info offset */
    public ExtCertificateEncodingException(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return null;
    }
}
