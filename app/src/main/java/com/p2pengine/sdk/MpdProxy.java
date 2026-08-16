package com.p2pengine.sdk;

import android.util.LruCache;
import com.p2pengine.core.abs.mpd.manifest.C3911b;
import com.p2pengine.core.abs.mpd.manifest.C3912c;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.tracking.StreamingType;
import java.util.Map;
import kotlin.Metadata;
import org.httpd.protocols.http.NanoHTTPD;
import org.httpd.protocols.http.response.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1522Xd;
import p000.C1549Y3;
import p000.InterfaceC0595JC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/p2pengine/sdk/MpdProxy;", "Lcom/p2pengine/sdk/AbsProxy;", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "<init>", "(Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;)V", "url", "signalAddr", "dcVer", "videoId", "prefix", "getChannelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "startLocalServer", "()I", "contentId", "", "restartP2p", "(Ljava/lang/String;)Z", "LPY;", "stopP2p", "()V", "Lcom/p2pengine/core/abs/mpd/manifest/c;", "manifestParser", "Lcom/p2pengine/core/abs/mpd/manifest/c;", "", "Lcom/p2pengine/core/abs/mpd/manifest/b$a;", "segmentMapVod", "Ljava/util/Map;", "Landroid/util/LruCache;", "segmentMapLive", "Landroid/util/LruCache;", "", "getStreamHttpHeaders", "()Ljava/util/Map;", "streamHttpHeaders", "Lcom/p2pengine/core/tracking/StreamingType;", "getMediaType", "()Lcom/p2pengine/core/tracking/StreamingType;", "mediaType", "Companion", "HttpServer", "sdk_release"}, k = 1, mv = {1, 5, 1})
public final class MpdProxy extends AbsProxy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static MpdProxy singleton;

    @NotNull
    private final C3912c manifestParser;

    @NotNull
    private final LruCache<String, C3911b.a> segmentMapLive;

    @NotNull
    private final Map<String, C3911b.a> segmentMapVod;

    @InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0013\u0010\n\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m2920d2 = {"Lcom/p2pengine/sdk/MpdProxy$Companion;", "", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "Lcom/p2pengine/sdk/MpdProxy;", "init", "getInstance", "()Lcom/p2pengine/sdk/MpdProxy;", "instance", "singleton", "Lcom/p2pengine/sdk/MpdProxy;", "<init>", "()V", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Invalid debug info offset */
        private Companion() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Companion(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final MpdProxy getInstance() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final MpdProxy init(@NotNull String str, @NotNull P2pConfig p2pConfig) {
            return null;
        }
    }

    @InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¨\u0006\u0010"}, m2920d2 = {"Lcom/p2pengine/sdk/MpdProxy$HttpServer;", "Lorg/httpd/protocols/http/NanoHTTPD;", "", "mediaUrl", "range", "", "headers", "Lorg/httpd/protocols/http/response/Response;", "handleMediaFile", "Lorg/httpd/protocols/http/IHTTPSession;", "session", "serve", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "<init>", "(Lcom/p2pengine/sdk/MpdProxy;I)V", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
    public final class HttpServer extends NanoHTTPD {
        public final /* synthetic */ MpdProxy this$0;

        /* JADX WARN: Invalid debug info offset */
        public HttpServer(MpdProxy mpdProxy, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m18487b(C3911b c3911b, MpdProxy mpdProxy) {
        }

        /* JADX WARN: Invalid debug info offset */
        private final Response handleMediaFile(String str, String str2, Map<String, String> map) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: serve$lambda-1, reason: not valid java name */
        private static final void m30218serve$lambda1(C3911b c3911b, MpdProxy mpdProxy) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00c9
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.httpd.protocols.http.NanoHTTPD
        @org.jetbrains.annotations.NotNull
        public org.httpd.protocols.http.response.Response serve(@org.jetbrains.annotations.NotNull org.httpd.protocols.http.IHTTPSession r17) {
            /*
                Method dump skipped, instruction units count: 998
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.MpdProxy.HttpServer.serve(org.httpd.protocols.http.IHTTPSession):org.httpd.protocols.http.response.Response");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private MpdProxy(String str, P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ MpdProxy(String str, P2pConfig p2pConfig, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ C3912c access$getManifestParser$p(MpdProxy mpdProxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ LruCache access$getSegmentMapLive$p(MpdProxy mpdProxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ Map access$getSegmentMapVod$p(MpdProxy mpdProxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ MpdProxy access$getSingleton$cp() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setSingleton$cp(MpdProxy mpdProxy) {
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
