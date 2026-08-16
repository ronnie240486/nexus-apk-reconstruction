package org.bouncycastle.jce.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ExtIOException extends IOException implements ExtException {
    private Throwable cause;

    /* JADX WARN: Invalid debug info offset */
    public ExtIOException(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return null;
    }
}
