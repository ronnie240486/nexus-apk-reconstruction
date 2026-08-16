package com.p2pengine.core.signaling;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0162CN;
import p000.C4927oH;
import p000.C4934oO;
import p000.InterfaceC0401G8;
import p000.InterfaceC0591J8;

/* JADX INFO: renamed from: com.p2pengine.core.signaling.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C3988c {

    /* JADX INFO: renamed from: a */
    public volatile boolean f12081a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f12082b;

    /* JADX INFO: renamed from: c */
    public int f12083c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ConcurrentLinkedQueue<Map<String, Object>> f12084d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f12085e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public PollingListener f12086f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public String f12087g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C4927oH f12088h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC0401G8 f12089i;

    /* JADX INFO: renamed from: com.p2pengine.core.signaling.c$a */
    public static final class a implements InterfaceC0591J8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3988c f12090a;

        /* JADX WARN: Invalid debug info offset */
        public a(C3988c c3988c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull IOException iOException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onResponse(@NotNull InterfaceC0401G8 interfaceC0401G8, @NotNull C4934oO c4934oO) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C3988c(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18335a(C3988c c3988c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final C0162CN m18336a(boolean z, boolean z2, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18337a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18338b() {
    }
}
