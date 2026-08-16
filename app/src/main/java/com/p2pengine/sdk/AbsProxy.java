package com.p2pengine.sdk;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.p2p.P2pStatisticsListener;
import com.p2pengine.core.tracking.C3995c;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.httpd.protocols.http.NanoHTTPD;
import org.httpd.protocols.http.response.IStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1549Y3;
import p000.C4934oO;
import p000.C5295rI;
import p000.InterfaceC0401G8;
import p000.InterfaceC0591J8;
import p000.InterfaceC5750xt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b%\u0010&J9\u0010*\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001dH\u0004¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010\u001bJ7\u00102\u001a\u0002012\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0004¢\u0006\u0004\b2\u00103J7\u00105\u001a\u0002042\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0004¢\u0006\u0004\b5\u00106J7\u00108\u001a\u0002072\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0004¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0007\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00068\u0004X\u0085D¢\u0006\u0006\n\u0004\bG\u0010BR\"\u0010\u0014\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0014\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010&R$\u0010\"\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010$R$\u0010N\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020T8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bY\u0010OR\"\u0010Z\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010B\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b^\u0010_R*\u0010a\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020\u001d8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c\"\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u001d8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bi\u0010bR\"\u0010k\u001a\u00020j8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010-\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010b\u001a\u0004\b-\u0010c\"\u0004\bq\u0010eR\u0014\u0010r\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010cR\u0016\u0010t\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010<R\"\u0010w\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/p2pengine/sdk/AbsProxy;", "Lcom/p2pengine/sdk/Proxy;", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "", "currentPort", "<init>", "(Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;I)V", "url", "range", "", "headers", "LrI;", "Lorg/httpd/protocols/http/response/IStatus;", "LoO;", "requestByOkHttp", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LrI;", "Ljava/net/URL;", "videoId", "getProxyUrl", "(Ljava/net/URL;Ljava/lang/String;)Ljava/lang/String;", "formatLocalUrlStr", "(Ljava/net/URL;)Ljava/lang/String;", "LPY;", "shutdown", "()V", "contentId", "", "restartP2p", "(Ljava/lang/String;)Z", "stopP2p", "Lcom/p2pengine/core/p2p/P2pStatisticsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addP2pStatisticsListener", "(Lcom/p2pengine/core/p2p/P2pStatisticsListener;)V", "performRangeRequest", "(Ljava/lang/String;)V", "signalAddr", "dcVer", "prefix", "getChannelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "multiBitrate", "isLive", "initTrackerClient", "(ZZ)V", "notifyPlaybackStalled", "Lcom/p2pengine/sdk/ResponseStream;", "requestStreamFromNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/p2pengine/sdk/ResponseStream;", "Lorg/httpd/protocols/http/response/Response;", "handleOtherFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/httpd/protocols/http/response/Response;", "Lcom/p2pengine/sdk/ResponseData;", "requestFromNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/p2pengine/sdk/ResponseData;", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "Lcom/p2pengine/core/p2p/P2pConfig;", "getConfig", "()Lcom/p2pengine/core/p2p/P2pConfig;", "setConfig", "(Lcom/p2pengine/core/p2p/P2pConfig;)V", "I", "getCurrentPort", "()I", "setCurrentPort", "(I)V", "PROXY_READ_TIMEOUT", "getVideoId", "setVideoId", "Lcom/p2pengine/core/p2p/P2pStatisticsListener;", "getListener", "()Lcom/p2pengine/core/p2p/P2pStatisticsListener;", "setListener", "originalURL", "Ljava/net/URL;", "getOriginalURL", "()Ljava/net/URL;", "setOriginalURL", "(Ljava/net/URL;)V", "", "playListUrls", "Ljava/util/Set;", "getPlayListUrls", "()Ljava/util/Set;", "originalLocation", "mediaRequestCount", "getMediaRequestCount", "setMediaRequestCount", "Lcom/p2pengine/core/tracking/c;", "tracker", "Lcom/p2pengine/core/tracking/c;", "<set-?>", "isServerRunning", "Z", "()Z", "setServerRunning", "(Z)V", "Lorg/httpd/protocols/http/NanoHTTPD;", "localServer", "Lorg/httpd/protocols/http/NanoHTTPD;", "rangeTested", "", "targetDurationMs", "J", "getTargetDurationMs", "()J", "setTargetDurationMs", "(J)V", "setLive", "isConnected", "getPeerId", "peerId", "getStreamHttpHeaders", "()Ljava/util/Map;", "streamHttpHeaders", "sdk_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsProxy implements Proxy {

    @InterfaceC5750xt
    public final int PROXY_READ_TIMEOUT;

    @NotNull
    private P2pConfig config;
    private int currentPort;
    private boolean isLive;
    private boolean isServerRunning;

    @Nullable
    private P2pStatisticsListener listener;

    @Nullable
    @InterfaceC5750xt
    public NanoHTTPD localServer;
    private int mediaRequestCount;

    @Nullable
    @InterfaceC5750xt
    public URL originalLocation;

    @Nullable
    private URL originalURL;

    @NotNull
    private final Set<String> playListUrls;

    @InterfaceC5750xt
    public boolean rangeTested;
    private long targetDurationMs;

    @NotNull
    private final String token;

    @Nullable
    @InterfaceC5750xt
    public volatile C3995c tracker;
    public String videoId;

    /* JADX INFO: renamed from: com.p2pengine.sdk.AbsProxy$performRangeRequest$2 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p2pengine/sdk/AbsProxy$performRangeRequest$2", "LJ8;", "LG8;", NotificationCompat.CATEGORY_CALL, "Ljava/io/IOException;", "e", "LPY;", "onFailure", "(LG8;Ljava/io/IOException;)V", "LoO;", "response", "onResponse", "(LG8;LoO;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class C40242 implements InterfaceC0591J8 {
        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onFailure(@NotNull InterfaceC0401G8 call, @NotNull IOException e) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0591J8
        public void onResponse(@NotNull InterfaceC0401G8 call, @NotNull C4934oO response) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbsProxy(@NotNull String str, @NotNull P2pConfig p2pConfig, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18486a(AbsProxy absProxy) {
    }

    /* JADX WARN: Invalid debug info offset */
    private final C5295rI<IStatus, C4934oO> requestByOkHttp(String url, String range, Map<String, String> headers) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: restartP2p$lambda-0, reason: not valid java name */
    private static final void m30217restartP2p$lambda0(AbsProxy absProxy) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public void addP2pStatisticsListener(@NotNull P2pStatisticsListener listener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String formatLocalUrlStr(@NotNull URL url) {
        return null;
    }

    @NotNull
    public abstract String getChannelId(@NotNull String url, @Nullable String signalAddr, @NotNull String dcVer, @NotNull String videoId, @NotNull String prefix);

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final P2pConfig getConfig() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getCurrentPort() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final P2pStatisticsListener getListener() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getMediaRequestCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final URL getOriginalURL() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    @Nullable
    public String getPeerId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final Set<String> getPlayListUrls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    @NotNull
    public String getProxyUrl(@NotNull URL url, @NotNull String videoId) {
        return null;
    }

    @Nullable
    public abstract Map<String, String> getStreamHttpHeaders();

    /* JADX WARN: Invalid debug info offset */
    public final long getTargetDurationMs() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getToken() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getVideoId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @org.jetbrains.annotations.NotNull
    public final org.httpd.protocols.http.response.Response handleOtherFile(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.AbsProxy.handleOtherFile(java.lang.String, java.lang.String, java.util.Map):org.httpd.protocols.http.response.Response");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final void initTrackerClient(boolean r19, boolean r20) {
        /*
            r18 = this;
            return
        L51:
        L5d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.AbsProxy.initTrackerClient(boolean, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public boolean isConnected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isLive() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public boolean isServerRunning() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public void notifyPlaybackStalled() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void performRangeRequest(@Nullable String url) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final ResponseData requestFromNetwork(@NotNull String url, @Nullable String range, @Nullable Map<String, String> headers) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final ResponseStream requestStreamFromNetwork(@NotNull String url, @Nullable String range, @Nullable Map<String, String> headers) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.p2pengine.sdk.Proxy
    public boolean restartP2p(@org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.AbsProxy.restartP2p(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setConfig(@NotNull P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setCurrentPort(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setListener(@Nullable P2pStatisticsListener p2pStatisticsListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setLive(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setMediaRequestCount(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setOriginalURL(@Nullable URL url) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setServerRunning(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setTargetDurationMs(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setVideoId(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public void shutdown() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public void stopP2p() {
    }
}
