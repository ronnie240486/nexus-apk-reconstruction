package com.p2pengine.core.logger;

import com.p2pengine.core.utils.WsManager.C4005a;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0314El;

/* JADX INFO: renamed from: com.p2pengine.core.logger.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3946e implements InterfaceC0314El {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C4005a f11770a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f11771b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BlockingQueue<Map<String, Object>> f11772c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SimpleDateFormat f11773d;

    /* JADX WARN: Invalid debug info offset */
    public C3946e(@NotNull C4005a c4005a) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0314El
    public void log(int i, @Nullable String str, @NotNull String str2) {
    }
}
