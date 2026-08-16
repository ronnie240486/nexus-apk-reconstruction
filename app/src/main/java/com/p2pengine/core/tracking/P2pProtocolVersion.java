package com.p2pengine.core.tracking;

import org.jetbrains.annotations.NotNull;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, m2920d2 = {"Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "V8", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public enum P2pProtocolVersion {
    V8("8");


    @NotNull
    private final String value;

    P2pProtocolVersion(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String value() {
        return this.value;
    }
}
