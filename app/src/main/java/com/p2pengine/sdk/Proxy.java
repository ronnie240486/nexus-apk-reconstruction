package com.p2pengine.sdk;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p2pengine.core.p2p.P2pStatisticsListener;
import com.p2pengine.core.tracking.StreamingType;
import java.net.URL;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/p2pengine/sdk/Proxy;", "", "", "startLocalServer", "()I", "LPY;", "shutdown", "()V", "", "contentId", "", "restartP2p", "(Ljava/lang/String;)Z", "stopP2p", "Ljava/net/URL;", "url", "videoId", "getProxyUrl", "(Ljava/net/URL;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p2pengine/core/p2p/P2pStatisticsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addP2pStatisticsListener", "(Lcom/p2pengine/core/p2p/P2pStatisticsListener;)V", "notifyPlaybackStalled", "isConnected", "()Z", "isServerRunning", "getPeerId", "()Ljava/lang/String;", "peerId", "Lcom/p2pengine/core/tracking/StreamingType;", "getMediaType", "()Lcom/p2pengine/core/tracking/StreamingType;", "mediaType", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface Proxy {
    void addP2pStatisticsListener(@NotNull P2pStatisticsListener listener);

    @NotNull
    StreamingType getMediaType();

    @Nullable
    String getPeerId();

    @NotNull
    String getProxyUrl(@NotNull URL url, @NotNull String videoId);

    boolean isConnected();

    boolean isServerRunning();

    void notifyPlaybackStalled();

    boolean restartP2p(@Nullable String contentId);

    void shutdown();

    int startLocalServer();

    void stopP2p();
}
