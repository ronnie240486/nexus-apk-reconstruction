package com.p2pengine.core.tracking;

import org.jetbrains.annotations.NotNull;
import p000.InterfaceC0595JC;
import p000.InterfaceC4408gL;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m2920d2 = {"Lcom/p2pengine/core/tracking/TrackerZone;", "", "", InterfaceC4408gL.f14120d, "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Europe", "HongKong", "USA", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public enum TrackerZone {
    Europe(C3999g.f12191a),
    HongKong(C3999g.f12192b),
    USA(C3999g.f12193c);


    @NotNull
    private final String value;

    TrackerZone(String str) {
        this.value = str;
    }

    @NotNull
    public final String address() {
        return this.value;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
