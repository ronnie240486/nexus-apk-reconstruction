package com.p2pengine.core.p2p;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/p2pengine/core/p2p/StreamListener;", "", "", "Ljava/nio/ByteBuffer;", "bufArr", "LPY;", "onInitialBufferArray", "(Ljava/util/List;)V", "data", "", "finished", "onData", "(Ljava/nio/ByteBuffer;Z)V", "", "reason", "segId", "onAbort", "(Ljava/lang/String;Ljava/lang/String;)V", "getPeerId", "()Ljava/lang/String;", "peerId", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface StreamListener {
    @NotNull
    String getPeerId();

    void onAbort(@NotNull String reason, @Nullable String segId);

    void onData(@NotNull ByteBuffer data, boolean finished);

    void onInitialBufferArray(@NotNull List<? extends ByteBuffer> bufArr);
}
