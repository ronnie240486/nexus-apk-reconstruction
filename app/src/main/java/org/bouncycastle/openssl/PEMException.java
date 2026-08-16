package org.bouncycastle.openssl;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class PEMException extends IOException {
    Exception underlying;

    /* JADX WARN: Invalid debug info offset */
    public PEMException(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PEMException(String str, Exception exc) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Exception getUnderlyingException() {
        return null;
    }
}
