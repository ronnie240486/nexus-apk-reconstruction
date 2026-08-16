package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

/* JADX INFO: loaded from: classes2.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException implements ExtException {
    private Throwable cause;

    /* JADX WARN: Invalid debug info offset */
    public ExtCertPathBuilderException(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtCertPathBuilderException(String str, Throwable th, CertPath certPath, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return null;
    }
}
