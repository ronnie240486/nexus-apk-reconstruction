package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes2.dex */
class ExtCRLException extends CRLException {
    Throwable cause;

    /* JADX WARN: Invalid debug info offset */
    public ExtCRLException(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return null;
    }
}
