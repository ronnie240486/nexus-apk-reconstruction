package org.bouncycastle.jce.provider;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class CertStatus {
    public static final int UNDETERMINED = 12;
    public static final int UNREVOKED = 11;
    int certStatus;
    Date revocationDate;

    /* JADX WARN: Invalid debug info offset */
    public int getCertStatus() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getRevocationDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCertStatus(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRevocationDate(Date date) {
    }
}
