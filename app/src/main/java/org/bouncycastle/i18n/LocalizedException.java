package org.bouncycastle.i18n;

/* JADX INFO: loaded from: classes2.dex */
public class LocalizedException extends Exception {
    private Throwable cause;
    protected ErrorBundle message;

    /* JADX WARN: Invalid debug info offset */
    public LocalizedException(ErrorBundle errorBundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LocalizedException(ErrorBundle errorBundle, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ErrorBundle getErrorMessage() {
        return null;
    }
}
