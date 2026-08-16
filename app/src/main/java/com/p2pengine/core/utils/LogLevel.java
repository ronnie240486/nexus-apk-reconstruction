package com.p2pengine.core.utils;

import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m2920d2 = {"Lcom/p2pengine/core/utils/LogLevel;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6);

    private final int value;

    LogLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final int value() {
        return this.value;
    }
}
