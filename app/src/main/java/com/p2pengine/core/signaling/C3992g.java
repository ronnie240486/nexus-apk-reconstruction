package com.p2pengine.core.signaling;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.p2pengine.core.signaling.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C3992g implements Signaling {

    /* JADX INFO: renamed from: a */
    @Nullable
    public SignalListener f12102a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Signaling f12103b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Signaling f12104c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12105d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f12106e;

    /* JADX INFO: renamed from: f */
    public boolean f12107f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Timer f12108g;

    /* JADX INFO: renamed from: com.p2pengine.core.signaling.g$a */
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3992g f12109a;

        /* JADX WARN: Invalid debug info offset */
        public a(C3992g c3992g) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.signaling.g$b */
    public static final class b implements SignalListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3992g f12110a;

        /* JADX WARN: Invalid debug info offset */
        public b(C3992g c3992g) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.signaling.SignalListener
        public void onClose() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.signaling.SignalListener
        public void onMessage(@NotNull JsonObject jsonObject, @Nullable String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.signaling.SignalListener
        public void onOpen() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C3992g(@Nullable String str, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final Signaling m18346a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final Signaling m18347a(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m18348a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void connect() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    @NotNull
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean getNormalClosed() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isBackupConnected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isClosed() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public boolean isOpen() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void reconnect() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendReject(@NotNull String str, @Nullable String str2, boolean z, @Nullable String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendSignal(@NotNull String str, @NotNull JsonObject jsonObject, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void sendSignalBatch(@NotNull String str, @NotNull JsonArray jsonArray, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.signaling.Signaling
    public void setListener(@Nullable SignalListener signalListener) {
    }
}
