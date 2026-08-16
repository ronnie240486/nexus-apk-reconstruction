package org.bouncycastle.ocsp;

import java.util.Date;
import org.bouncycastle.asn1.ocsp.RevokedInfo;

/* JADX INFO: loaded from: classes2.dex */
public class RevokedStatus implements CertificateStatus {

    /* JADX INFO: renamed from: info, reason: collision with root package name */
    RevokedInfo f19801info;

    /* JADX WARN: Invalid debug info offset */
    public RevokedStatus(Date date, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RevokedStatus(RevokedInfo revokedInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getRevocationReason() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getRevocationTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasRevocationReason() {
        return false;
    }
}
