package com.p2pengine.core.p2p;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/p2pengine/core/p2p/PeerChannelListener;", "", "Lcom/google/gson/JsonObject;", "json", "LPY;", "onSignal", "(Lcom/google/gson/JsonObject;)V", "Lcom/google/gson/JsonArray;", "onSignalBatch", "(Lcom/google/gson/JsonArray;)V", "peerChannelDidOpen", "()V", "peerChannelDidClose", "peerChannelDidFail", "peerChannelDidDisconnect", "Ljava/nio/ByteBuffer;", "data", "didReceiveBinaryMessage", "(Ljava/nio/ByteBuffer;)V", "didReceiveJSONMessage", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface PeerChannelListener {
    void didReceiveBinaryMessage(@NotNull ByteBuffer data);

    void didReceiveJSONMessage(@NotNull JsonObject json);

    void onSignal(@NotNull JsonObject json);

    void onSignalBatch(@NotNull JsonArray json);

    void peerChannelDidClose();

    void peerChannelDidDisconnect();

    void peerChannelDidFail();

    void peerChannelDidOpen();
}
