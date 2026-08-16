package org.bouncycastle.jce.provider;

import org.bouncycastle.jce.exception.ExtException;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotatedException extends Exception implements ExtException {
    private Throwable _underlyingException;

    /* JADX WARN: Invalid debug info offset */
    public AnnotatedException(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AnnotatedException(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Throwable getUnderlyingException() {
        return null;
    }
}
