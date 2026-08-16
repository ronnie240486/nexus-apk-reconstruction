package com.p2pengine.core.p2p;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p2pengine.core.tracking.C3994b;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\nJ%\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/p2pengine/core/p2p/DataChannelListener;", "", "Lcom/p2pengine/core/p2p/DataChannel;", "peer", "Lcom/google/gson/JsonArray;", "data", "LPY;", "onDataChannelSignal", "(Lcom/p2pengine/core/p2p/DataChannel;Lcom/google/gson/JsonArray;)V", "onDataChannelOpen", "(Lcom/p2pengine/core/p2p/DataChannel;)V", "", "fatal", "onDataChannelClose", "(Lcom/p2pengine/core/p2p/DataChannel;Z)V", "onDataChannelFail", "onDataChannelTimeout", "Lcom/google/gson/JsonObject;", "fields", "onDataChannelMetaData", "(Lcom/p2pengine/core/p2p/DataChannel;Lcom/google/gson/JsonObject;)V", "onDataChannelGetPeers", "", "Lcom/p2pengine/core/tracking/b;", "peers", "onDataChannelPeers", "(Lcom/p2pengine/core/p2p/DataChannel;Ljava/util/List;)V", "", "action", "toPeerId", "fromPeerId", "reason", "onDataChannelPeerSignal", "(Lcom/p2pengine/core/p2p/DataChannel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;Z)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface DataChannelListener {
    void onDataChannelClose(@NotNull DataChannel peer, boolean fatal);

    void onDataChannelFail(@NotNull DataChannel peer, boolean fatal);

    void onDataChannelGetPeers(@NotNull DataChannel peer);

    void onDataChannelMetaData(@NotNull DataChannel peer, @NotNull JsonObject fields);

    void onDataChannelOpen(@NotNull DataChannel peer);

    void onDataChannelPeerSignal(@NotNull DataChannel peer, @NotNull String action, @NotNull String toPeerId, @NotNull String fromPeerId, @Nullable JsonObject data, @Nullable String reason, boolean fatal);

    void onDataChannelPeers(@NotNull DataChannel peer, @NotNull List<C3994b> peers);

    void onDataChannelSignal(@NotNull DataChannel peer, @NotNull JsonArray data);

    void onDataChannelTimeout(@NotNull DataChannel peer);
}
