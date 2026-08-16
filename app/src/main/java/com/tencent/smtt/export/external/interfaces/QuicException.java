package com.tencent.smtt.export.external.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QuicException extends NetworkException {
    /* JADX WARN: Invalid debug info offset */
    public QuicException(String str, Throwable th) {
    }

    public abstract int getQuicDetailedErrorCode();
}
