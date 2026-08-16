package com.p2pengine.sdk;

import android.util.LruCache;
import com.p2pengine.core.abs.m3u8.C3904b;
import com.p2pengine.core.abs.m3u8.C3906d;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.tracking.StreamingType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.httpd.protocols.http.NanoHTTPD;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1522Xd;
import p000.C1549Y3;
import p000.C5295rI;
import p000.InterfaceC0595JC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/p2pengine/sdk/M3u8Proxy;", "Lcom/p2pengine/sdk/AbsProxy;", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "<init>", "(Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;)V", "", "startLocalServer", "()I", "contentId", "", "restartP2p", "(Ljava/lang/String;)Z", "LPY;", "stopP2p", "()V", "url", "signalAddr", "dcVer", "videoId", "prefix", "getChannelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "multiBitrate", "Z", "hasAudioTrack", "", "loadingSN", "J", "initializationSegmentUri", "Ljava/lang/String;", "", "mediaListUrls", "Ljava/util/List;", "", "Lcom/p2pengine/core/abs/m3u8/d$a;", "segmentMapVod", "Ljava/util/Map;", "Landroid/util/LruCache;", "segmentMapLive", "Landroid/util/LruCache;", "Lcom/p2pengine/core/abs/m3u8/b;", "playlistParser", "Lcom/p2pengine/core/abs/m3u8/b;", "", "getStreamHttpHeaders", "()Ljava/util/Map;", "streamHttpHeaders", "Lcom/p2pengine/core/tracking/StreamingType;", "getMediaType", "()Lcom/p2pengine/core/tracking/StreamingType;", "mediaType", "Companion", "HttpServer", "sdk_release"}, k = 1, mv = {1, 5, 1})
public final class M3u8Proxy extends AbsProxy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static M3u8Proxy singleton;
    private boolean hasAudioTrack;

    @Nullable
    private String initializationSegmentUri;
    private long loadingSN;

    @NotNull
    private final List<String> mediaListUrls;
    private boolean multiBitrate;

    @NotNull
    private final C3904b playlistParser;

    @NotNull
    private final LruCache<String, C3906d.a> segmentMapLive;

    @NotNull
    private final Map<String, C3906d.a> segmentMapVod;

    @InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0013\u0010\n\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m2920d2 = {"Lcom/p2pengine/sdk/M3u8Proxy$Companion;", "", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "Lcom/p2pengine/sdk/M3u8Proxy;", "init", "getInstance", "()Lcom/p2pengine/sdk/M3u8Proxy;", "instance", "singleton", "Lcom/p2pengine/sdk/M3u8Proxy;", "<init>", "()V", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Invalid debug info offset */
        private Companion() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Companion(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final M3u8Proxy getInstance() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final M3u8Proxy init(@NotNull String str, @NotNull P2pConfig p2pConfig) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/p2pengine/sdk/M3u8Proxy$HttpServer;", "Lorg/httpd/protocols/http/NanoHTTPD;", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "<init>", "(Lcom/p2pengine/sdk/M3u8Proxy;I)V", "", "uri", "urlString", "", "", "parameters", "LrI;", "", "checkProxyOrigin", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LrI;", "_segmentKey", "mediaUrl", "range", "headers", "Lorg/httpd/protocols/http/response/Response;", "handleMediaFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/httpd/protocols/http/response/Response;", "netUrl", "Lcom/p2pengine/sdk/ResponseData;", "requestPlaylistFromPeer", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p2pengine/sdk/ResponseData;", "Lorg/httpd/protocols/http/IHTTPSession;", "session", "serve", "(Lorg/httpd/protocols/http/IHTTPSession;)Lorg/httpd/protocols/http/response/Response;", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public final class HttpServer extends NanoHTTPD {
        public final /* synthetic */ M3u8Proxy this$0;

        /* JADX WARN: Invalid debug info offset */
        public HttpServer(M3u8Proxy m3u8Proxy, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        private final C5295rI<String, Boolean> checkProxyOrigin(String uri, String urlString, Map<String, ? extends List<String>> parameters) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00e3
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        private final org.httpd.protocols.http.response.Response handleMediaFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.Map<java.lang.String, java.lang.String> r31) {
            /*
                Method dump skipped, instruction units count: 725
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.M3u8Proxy.HttpServer.handleMediaFile(java.lang.String, java.lang.String, java.lang.String, java.util.Map):org.httpd.protocols.http.response.Response");
        }

        /* JADX WARN: Invalid debug info offset */
        private final ResponseData requestPlaylistFromPeer(String urlString, String netUrl) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00cc
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.httpd.protocols.http.NanoHTTPD
        @org.jetbrains.annotations.NotNull
        public org.httpd.protocols.http.response.Response serve(@org.jetbrains.annotations.NotNull org.httpd.protocols.http.IHTTPSession r21) {
            /*
                Method dump skipped, instruction units count: 1758
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.M3u8Proxy.HttpServer.serve(org.httpd.protocols.http.IHTTPSession):org.httpd.protocols.http.response.Response");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private M3u8Proxy(String str, P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ M3u8Proxy(String str, P2pConfig p2pConfig, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ long access$getLoadingSN$p(M3u8Proxy m3u8Proxy) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ List access$getMediaListUrls$p(M3u8Proxy m3u8Proxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ boolean access$getMultiBitrate$p(M3u8Proxy m3u8Proxy) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ C3904b access$getPlaylistParser$p(M3u8Proxy m3u8Proxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ LruCache access$getSegmentMapLive$p(M3u8Proxy m3u8Proxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ Map access$getSegmentMapVod$p(M3u8Proxy m3u8Proxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ M3u8Proxy access$getSingleton$cp() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setHasAudioTrack$p(M3u8Proxy m3u8Proxy, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setInitializationSegmentUri$p(M3u8Proxy m3u8Proxy, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setLoadingSN$p(M3u8Proxy m3u8Proxy, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setMultiBitrate$p(M3u8Proxy m3u8Proxy, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setSingleton$cp(M3u8Proxy m3u8Proxy) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.AbsProxy
    @NotNull
    public String getChannelId(@NotNull String url, @Nullable String signalAddr, @NotNull String dcVer, @NotNull String videoId, @NotNull String prefix) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    @NotNull
    public StreamingType getMediaType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.AbsProxy
    @Nullable
    public Map<String, String> getStreamHttpHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.AbsProxy, com.p2pengine.sdk.Proxy
    public boolean restartP2p(@Nullable String contentId) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.Proxy
    public int startLocalServer() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.sdk.AbsProxy, com.p2pengine.sdk.Proxy
    public void stopP2p() {
    }
}
