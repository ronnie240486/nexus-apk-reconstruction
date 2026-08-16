package org.bouncycastle.x509;

import java.security.cert.CertPath;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes2.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    /* JADX WARN: Invalid debug info offset */
    public CertPathReviewerException(ErrorBundle errorBundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th, CertPath certPath, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertPath getCertPath() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getIndex() {
        return 0;
    }
}
