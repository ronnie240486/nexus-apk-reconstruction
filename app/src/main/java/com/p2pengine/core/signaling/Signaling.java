package com.p2pengine.core.signaling;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/p2pengine/core/signaling/Signaling;", "", "Lcom/p2pengine/core/signaling/SignalListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LPY;", "setListener", "(Lcom/p2pengine/core/signaling/SignalListener;)V", "reconnect", "()V", "connect", "destroy", "close", "", "remotePeerId", "Lcom/google/gson/JsonObject;", "data", "name", "sendSignal", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "Lcom/google/gson/JsonArray;", "sendSignalBatch", "(Ljava/lang/String;Lcom/google/gson/JsonArray;Ljava/lang/String;)V", "reason", "", "fatal", "sendReject", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "isClosed", "()Z", "isOpen", "isBackupConnected", "getNormalClosed", "normalClosed", "getName", "()Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface Signaling {
    void close();

    void connect();

    void destroy();

    @Nullable
    String getName();

    boolean getNormalClosed();

    boolean isBackupConnected();

    boolean isClosed();

    boolean isOpen();

    void reconnect();

    void sendReject(@NotNull String remotePeerId, @Nullable String reason, boolean fatal, @Nullable String name);

    void sendSignal(@NotNull String remotePeerId, @NotNull JsonObject data, @Nullable String name);

    void sendSignalBatch(@NotNull String remotePeerId, @NotNull JsonArray data, @Nullable String name);

    void setListener(@Nullable SignalListener listener);
}
