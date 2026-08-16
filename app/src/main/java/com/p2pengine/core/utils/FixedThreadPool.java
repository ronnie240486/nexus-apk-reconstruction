package com.p2pengine.core.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC4245dm;

/* JADX INFO: loaded from: classes2.dex */
public final class FixedThreadPool {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C4002a f12205b = new C4002a();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC4245dm<FixedThreadPool> f12206c = FixedThreadPool$Companion$creator$1.INSTANCE;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ExecutorService f12207a;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.FixedThreadPool$a */
    public static final class C4002a extends AbstractC4014g<FixedThreadPool> {
        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.AbstractC4014g
        @NotNull
        /* JADX INFO: renamed from: b */
        public InterfaceC4245dm<FixedThreadPool> mo18389b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.FixedThreadPool$b */
    public static final class ThreadFactoryC4003b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ThreadGroup f12208a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final AtomicInteger f12209b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f12210c;

        /* JADX WARN: Invalid debug info offset */
        public ThreadFactoryC4003b(@NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18392a(@Nullable Runnable runnable) {
    }
}
