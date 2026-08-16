package com.p2pengine.core.p2p;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2pengine.core.dash.DashInterceptor;
import com.p2pengine.core.hls.HlsInterceptor;
import com.p2pengine.core.segment.DashSegmentIdGenerator;
import com.p2pengine.core.segment.HlsSegmentIdGenerator;
import com.p2pengine.core.signaling.C3991f;
import com.p2pengine.core.tracking.P2pProtocolVersion;
import com.p2pengine.core.tracking.TrackerZone;
import com.p2pengine.core.utils.LogLevel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.apache.commons.p013io.input.Tailer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1003PY;
import p000.C1023Ps;
import p000.C1051QH;
import p000.C1522Xd;
import p000.C5713xI;
import p000.C6027p10;
import p000.InterfaceC0322Et;
import p000.InterfaceC0401G8;
import p000.InterfaceC4958om;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b#\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 Ö\u00012\u00020\u0001:\u0004×\u0001Ø\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bT\u0010F\u001a\u0004\bU\u0010HR\"\u0010Z\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010N\u001a\u0004\bX\u0010P\"\u0004\bY\u0010RR\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010b\u001a\u00020=8\u0006¢\u0006\f\n\u0004\ba\u0010?\u001a\u0004\bb\u0010AR\u0017\u0010e\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bc\u0010F\u001a\u0004\bd\u0010HR\u0017\u0010h\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bf\u0010F\u001a\u0004\bg\u0010HR2\u0010r\u001a\u0012\u0012\u0004\u0012\u00020j0ij\b\u0012\u0004\u0012\u00020j`k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010F\u001a\u0004\bt\u0010H\"\u0004\bu\u0010JR\"\u0010z\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010F\u001a\u0004\bx\u0010H\"\u0004\by\u0010JR\"\u0010|\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010?\u001a\u0004\b|\u0010A\"\u0004\b}\u0010CR#\u0010\u007f\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010?\u001a\u0004\b\u007f\u0010A\"\u0005\b\u0080\u0001\u0010CR&\u0010\u0082\u0001\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010?\u001a\u0005\b\u0082\u0001\u0010A\"\u0005\b\u0083\u0001\u0010CR\u001a\u0010\u0085\u0001\u001a\u00020=8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010?\u001a\u0005\b\u0085\u0001\u0010AR\u001a\u0010\u0087\u0001\u001a\u00020=8\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010?\u001a\u0005\b\u0087\u0001\u0010AR8\u0010\u008f\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R8\u0010\u0093\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u008c\u0001\"\u0006\b\u0092\u0001\u0010\u008e\u0001R6\u0010\u0097\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00060ij\b\u0012\u0004\u0012\u00020\u0006`k8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010m\u001a\u0005\b\u0095\u0001\u0010o\"\u0005\b\u0096\u0001\u0010qR6\u0010\u009b\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00060ij\b\u0012\u0004\u0012\u00020\u0006`k8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010m\u001a\u0005\b\u0099\u0001\u0010o\"\u0005\b\u009a\u0001\u0010qR,\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0012\u001a\u0005\b\u009e\u0001\u0010\bR&\u0010¡\u0001\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010?\u001a\u0005\b¡\u0001\u0010A\"\u0005\b¢\u0001\u0010CR\u001a\u0010¤\u0001\u001a\u00020=8\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010?\u001a\u0005\b¤\u0001\u0010AR&\u0010¦\u0001\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010?\u001a\u0005\b¦\u0001\u0010A\"\u0005\b§\u0001\u0010CR&\u0010«\u0001\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010?\u001a\u0005\b©\u0001\u0010A\"\u0005\bª\u0001\u0010CR+\u0010²\u0001\u001a\u0005\u0018\u00010¬\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bF\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R)\u0010¹\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bN\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R,\u0010É\u0001\u001a\u0005\u0018\u00010Â\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010Ì\u0001\u001a\u00020D8\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010F\u001a\u0005\bË\u0001\u0010HR\u001a\u0010Ï\u0001\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0012\u001a\u0005\bÎ\u0001\u0010\bR&\u0010Ó\u0001\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÐ\u0001\u0010?\u001a\u0005\bÑ\u0001\u0010A\"\u0005\bÒ\u0001\u0010CR\u0015\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\b¨\u0006Ù\u0001"}, d2 = {"Lcom/p2pengine/core/p2p/P2pConfig;", "", "Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "builder", "<init>", "(Lcom/p2pengine/core/p2p/P2pConfig$Builder;)V", "", "getAnnounce", "()Ljava/lang/String;", "Lcom/p2pengine/core/signaling/f;", "b", "Lcom/p2pengine/core/signaling/f;", "getSignalConfig", "()Lcom/p2pengine/core/signaling/f;", "setSignalConfig", "(Lcom/p2pengine/core/signaling/f;)V", "signalConfig", "c", "Ljava/lang/String;", "getCustomTag", "customTag", "Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "d", "Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "getHlsSegmentIdGenerator", "()Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "setHlsSegmentIdGenerator", "(Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;)V", "hlsSegmentIdGenerator", "Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "e", "Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "getDashSegmentIdGenerator", "()Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "setDashSegmentIdGenerator", "(Lcom/p2pengine/core/segment/DashSegmentIdGenerator;)V", "dashSegmentIdGenerator", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "f", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "getPlayerInteractor", "()Lcom/p2pengine/core/p2p/PlayerInteractor;", "setPlayerInteractor", "(Lcom/p2pengine/core/p2p/PlayerInteractor;)V", "playerInteractor", "Lcom/p2pengine/core/hls/HlsInterceptor;", "g", "Lcom/p2pengine/core/hls/HlsInterceptor;", "getHlsInterceptor", "()Lcom/p2pengine/core/hls/HlsInterceptor;", "setHlsInterceptor", "(Lcom/p2pengine/core/hls/HlsInterceptor;)V", "hlsInterceptor", "Lcom/p2pengine/core/dash/DashInterceptor;", "h", "Lcom/p2pengine/core/dash/DashInterceptor;", "getDashInterceptor", "()Lcom/p2pengine/core/dash/DashInterceptor;", "setDashInterceptor", "(Lcom/p2pengine/core/dash/DashInterceptor;)V", "dashInterceptor", "", "i", "Z", "isP2pEnabled", "()Z", "setP2pEnabled", "(Z)V", "", "j", "I", "getDcDownloadTimeout", "()I", "setDcDownloadTimeout", "(I)V", "dcDownloadTimeout", "", "k", "J", "getHttpLoadTime", "()J", "setHttpLoadTime", "(J)V", "httpLoadTime", C5713xI.f19431f, "getDownloadTimeout", "downloadTimeout", "m", "getDiskCacheLimit", "setDiskCacheLimit", "diskCacheLimit", "Lcom/p2pengine/core/utils/LogLevel;", "n", "Lcom/p2pengine/core/utils/LogLevel;", "getLogLevel", "()Lcom/p2pengine/core/utils/LogLevel;", "logLevel", "o", "isDebug", TtmlNode.TAG_P, "getLocalPortHls", "localPortHls", "q", "getLocalPortDash", "localPortDash", "Ljava/util/ArrayList;", "Lcom/p2pengine/core/p2p/e;", "Lkotlin/collections/ArrayList;", Tailer.f15848j, "Ljava/util/ArrayList;", "getIceServers", "()Ljava/util/ArrayList;", "setIceServers", "(Ljava/util/ArrayList;)V", "iceServers", "s", "getMaxPeerConns", "setMaxPeerConns", "maxPeerConns", C5713xI.f19433h, "getMemoryCacheCountLimit", "setMemoryCacheCountLimit", "memoryCacheCountLimit", "u", "isUseHttpRange", "setUseHttpRange", "v", "isSetTopBox", "setSetTopBox", "w", "isWifiOnly", "setWifiOnly", "x", "isGeoIpPreflight", C6027p10.f18368d, "isICEPreflight", "", "z", "Ljava/util/Map;", "getHttpHeadersForHls", "()Ljava/util/Map;", "setHttpHeadersForHls", "(Ljava/util/Map;)V", "httpHeadersForHls", "A", "getHttpHeadersForDash", "setHttpHeadersForDash", "httpHeadersForDash", "B", "getHlsMediaFiles", "setHlsMediaFiles", "hlsMediaFiles", "C", "getDashMediaFiles", "setDashMediaFiles", "dashMediaFiles", "<set-?>", "D", "getAlternativeTrackerIp", "alternativeTrackerIp", "E", "isSharePlaylist", "setSharePlaylist", "F", "isLogPersistent", "G", "isFastStartup", "setFastStartup", C1023Ps.f2628k, "getUseStrictHlsSegmentId", "setUseStrictHlsSegmentId", "useStrictHlsSegmentId", "", "Ljava/lang/Double;", "getPlaylistTimeOffset", "()Ljava/lang/Double;", "setPlaylistTimeOffset", "(Ljava/lang/Double;)V", "playlistTimeOffset", "Lcom/p2pengine/core/tracking/TrackerZone;", "Lcom/p2pengine/core/tracking/TrackerZone;", "getTrackerZone", "()Lcom/p2pengine/core/tracking/TrackerZone;", "setTrackerZone", "(Lcom/p2pengine/core/tracking/TrackerZone;)V", "trackerZone", "Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "K", "Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "getP2pProtocolVersion", "()Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "setP2pProtocolVersion", "(Lcom/p2pengine/core/tracking/P2pProtocolVersion;)V", "p2pProtocolVersion", "LG8$a;", C5713xI.f19432g, "LG8$a;", "getOkHttpClient", "()LG8$a;", "setOkHttpClient", "(LG8$a;)V", "okHttpClient", "M", "getMaxMediaFilesInPlaylist", "maxMediaFilesInPlaylist", "N", "getMediaFileSeparator", "mediaFileSeparator", "O", "getPrefetchOnly", "setPrefetchOnly", "prefetchOnly", "getWsSignalerAddr", "wsSignalerAddr", "P", "Builder", "Companion", "sdk_release"}, k = 1, mv = {1, 5, 1})
public final class P2pConfig {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> httpHeadersForDash;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public ArrayList<String> hlsMediaFiles;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public ArrayList<String> dashMediaFiles;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public String alternativeTrackerIp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isSharePlaylist;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean isLogPersistent;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean isFastStartup;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean useStrictHlsSegmentId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public Double playlistTimeOffset;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public TrackerZone trackerZone;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public P2pProtocolVersion p2pProtocolVersion;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public InterfaceC0401G8.a okHttpClient;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final int maxMediaFilesInPlaylist;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public final String mediaFileSeparator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean prefetchOnly;

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f11858a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C3991f signalConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String customTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public HlsSegmentIdGenerator hlsSegmentIdGenerator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public DashSegmentIdGenerator dashSegmentIdGenerator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public PlayerInteractor playerInteractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public HlsInterceptor hlsInterceptor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public DashInterceptor dashInterceptor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isP2pEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int dcDownloadTimeout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long httpLoadTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final int downloadTimeout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long diskCacheLimit;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final LogLevel logLevel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean isDebug;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int localPortHls;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int localPortDash;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public ArrayList<C3963e> iceServers;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int maxPeerConns;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int memoryCacheCountLimit;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isUseHttpRange;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isSetTopBox;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean isWifiOnly;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final boolean isGeoIpPreflight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final boolean isICEPreflight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> httpHeadersForHls;

    @Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0003\b¬\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010+\u001a\u00020.¢\u0006\u0004\b/\u00100J%\u00105\u001a\u00020\u00002\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`3¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0011¢\u0006\u0004\b8\u0010\u001eJ\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0011¢\u0006\u0004\b:\u0010\u001eJ\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b<\u0010\u0010J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b=\u0010\u0010J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b>\u0010\u0010J#\u0010A\u001a\u00020\u00002\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u00020\u00002\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010?¢\u0006\u0004\bC\u0010BJ%\u0010E\u001a\u00020\u00002\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u000401j\b\u0012\u0004\u0012\u00020\u0004`3¢\u0006\u0004\bE\u00106J%\u0010F\u001a\u00020\u00002\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u000401j\b\u0012\u0004\u0012\u00020\u0004`3¢\u0006\u0004\bF\u00106J\u0015\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010H\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0018¢\u0006\u0004\bO\u0010\u001bJ\u0015\u0010P\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\bP\u0010\u0010J\u0015\u0010Q\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\bQ\u0010\u0010J\u0015\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\bV\u0010\u0010J\u0015\u0010W\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\bW\u0010\u0010J\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b\\\u0010\u0010J\u0015\u0010]\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b]\u0010\u0010J\u0015\u0010_\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u0011¢\u0006\u0004\b_\u0010\u001eJ\u0015\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\bf\u0010gJ\u0015\u0010i\u001a\u00020\u00002\u0006\u0010h\u001a\u00020\u0004¢\u0006\u0004\bi\u0010\u0006J\u0015\u0010j\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\bj\u0010\u0010J\r\u0010l\u001a\u00020k¢\u0006\u0004\bl\u0010mR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010\t\u001a\u00020t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010~\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010o\u001a\u0004\b|\u0010q\"\u0004\b}\u0010sR(\u0010\u0085\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010,\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R(\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R(\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0006\b \u0001\u0010\u009d\u0001R(\u0010O\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R(\u0010\u001a\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¢\u0001\u001a\u0006\b¨\u0001\u0010¤\u0001\"\u0006\b©\u0001\u0010¦\u0001R(\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0099\u0001\u001a\u0006\b«\u0001\u0010\u009b\u0001\"\u0006\b¬\u0001\u0010\u009d\u0001R(\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010\u0099\u0001\u001a\u0006\b®\u0001\u0010\u009b\u0001\"\u0006\b¯\u0001\u0010\u009d\u0001R(\u0010$\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R(\u0010 \u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0093\u0001\u001a\u0006\b·\u0001\u0010\u0095\u0001\"\u0006\b¸\u0001\u0010\u0097\u0001R(\u00108\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010\u0099\u0001\u001a\u0006\bº\u0001\u0010\u009b\u0001\"\u0006\b»\u0001\u0010\u009d\u0001R(\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010\u0099\u0001\u001a\u0006\b½\u0001\u0010\u009b\u0001\"\u0006\b¾\u0001\u0010\u009d\u0001R(\u0010_\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u0099\u0001\u001a\u0006\bÀ\u0001\u0010\u009b\u0001\"\u0006\bÁ\u0001\u0010\u009d\u0001R(\u0010<\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010\u0093\u0001\u001a\u0006\bÃ\u0001\u0010\u0095\u0001\"\u0006\bÄ\u0001\u0010\u0097\u0001R'\u0010=\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÅ\u0001\u0010\u0093\u0001\u001a\u0005\b=\u0010\u0095\u0001\"\u0006\bÆ\u0001\u0010\u0097\u0001R(\u0010\\\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010\u0093\u0001\u001a\u0006\bÈ\u0001\u0010\u0095\u0001\"\u0006\bÉ\u0001\u0010\u0097\u0001R(\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010\u0093\u0001\u001a\u0006\bË\u0001\u0010\u0095\u0001\"\u0006\bÌ\u0001\u0010\u0097\u0001R(\u0010j\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010\u0093\u0001\u001a\u0006\bÎ\u0001\u0010\u0095\u0001\"\u0006\bÏ\u0001\u0010\u0097\u0001R(\u0010>\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0093\u0001\u001a\u0006\bÑ\u0001\u0010\u0095\u0001\"\u0006\bÒ\u0001\u0010\u0097\u0001R+\u0010Ù\u0001\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R(\u0010b\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R7\u0010æ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R7\u0010ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010á\u0001\u001a\u0006\bè\u0001\u0010ã\u0001\"\u0006\bé\u0001\u0010å\u0001R*\u0010I\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R(\u0010L\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R(\u0010ú\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010o\u001a\u0005\bø\u0001\u0010q\"\u0005\bù\u0001\u0010sR(\u0010P\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010\u0093\u0001\u001a\u0006\bü\u0001\u0010\u0095\u0001\"\u0006\bý\u0001\u0010\u0097\u0001R(\u0010Q\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bþ\u0001\u0010\u0093\u0001\u001a\u0006\bÿ\u0001\u0010\u0095\u0001\"\u0006\b\u0080\u0002\u0010\u0097\u0001R(\u0010V\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010\u0093\u0001\u001a\u0006\b\u0082\u0002\u0010\u0095\u0001\"\u0006\b\u0083\u0002\u0010\u0097\u0001R(\u0010W\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0093\u0001\u001a\u0006\b\u0084\u0002\u0010\u0095\u0001\"\u0006\b\u0085\u0002\u0010\u0097\u0001R(\u0010T\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R*\u0010Z\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R%\u0010i\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0002\u0010o\u001a\u0005\b\u0092\u0002\u0010q\"\u0005\b\u0093\u0002\u0010sR8\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u000401j\b\u0012\u0004\u0012\u00020\u0004`38\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R8\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u000401j\b\u0012\u0004\u0012\u00020\u0004`38\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0002\u0010\u0095\u0002\u001a\u0006\b\u009b\u0002\u0010\u0097\u0002\"\u0006\b\u009c\u0002\u0010\u0099\u0002R8\u00105\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`38\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010\u0095\u0002\u001a\u0006\b\u009e\u0002\u0010\u0097\u0002\"\u0006\b\u009f\u0002\u0010\u0099\u0002¨\u0006 \u0002"}, d2 = {"Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "", "<init>", "()V", "", "announce", "(Ljava/lang/String;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "main", "backup", "signalConfig", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "tag", "withTag", "", "enabled", "p2pEnabled", "(Z)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "dcDownloadTimeout", "(ILjava/util/concurrent/TimeUnit;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "downloadTimeout", "", "limit", "diskCacheLimit", "(J)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "localPortHls", "(I)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "localPortDash", "debug", "logEnabled", "Lcom/p2pengine/core/utils/LogLevel;", FirebaseAnalytics.Param.LEVEL, "logLevel", "(Lcom/p2pengine/core/utils/LogLevel;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "playStats", "playerInteractor", "(Lcom/p2pengine/core/p2p/PlayerInteractor;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "Lcom/p2pengine/core/hls/HlsInterceptor;", "interceptor", "hlsInterceptor", "(Lcom/p2pengine/core/hls/HlsInterceptor;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "Lcom/p2pengine/core/dash/DashInterceptor;", "dashInterceptor", "(Lcom/p2pengine/core/dash/DashInterceptor;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "Ljava/util/ArrayList;", "Lcom/p2pengine/core/p2p/e;", "Lkotlin/collections/ArrayList;", "servers", "iceServers", "(Ljava/util/ArrayList;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "conns", "maxPeerConnections", "count", "memoryCacheCountLimit", "flag", "useHttpRange", "isSetTopBox", "wifiOnly", "", "headers", "httpHeadersForHls", "(Ljava/util/Map;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "httpHeadersForDash", "files", "hlsMediaFiles", "dashMediaFiles", "Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "generator", "hlsSegmentIdGenerator", "(Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "dashSegmentIdGenerator", "(Lcom/p2pengine/core/segment/DashSegmentIdGenerator;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "time", "httpLoadTime", "sharePlaylist", "logPersistent", "Lcom/p2pengine/core/tracking/TrackerZone;", "zone", "trackerZone", "(Lcom/p2pengine/core/tracking/TrackerZone;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "geoIpPreflight", "ICEPreflight", "LG8$a;", "client", "okHttpClient", "(LG8$a;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "fastStartup", "prefetchOnly", "value", "maxMediaFilesInPlaylist", "Lcom/p2pengine/core/tracking/P2pProtocolVersion;", C1051QH.f2696b, "p2pProtocolVersion", "(Lcom/p2pengine/core/tracking/P2pProtocolVersion;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "", "timeOffset", "insertTimeOffsetTag", "(Ljava/lang/Double;)Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "separator", "mediaFileSeparator", "useStrictHlsSegmentId", "Lcom/p2pengine/core/p2p/P2pConfig;", "build", "()Lcom/p2pengine/core/p2p/P2pConfig;", "a", "Ljava/lang/String;", "getAnnounce", "()Ljava/lang/String;", "setAnnounce", "(Ljava/lang/String;)V", "Lcom/p2pengine/core/signaling/f;", "b", "Lcom/p2pengine/core/signaling/f;", "getSignalConfig", "()Lcom/p2pengine/core/signaling/f;", "setSignalConfig", "(Lcom/p2pengine/core/signaling/f;)V", "c", "getMTag", "setMTag", "mTag", "d", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "getPlayerStats", "()Lcom/p2pengine/core/p2p/PlayerInteractor;", "setPlayerStats", "(Lcom/p2pengine/core/p2p/PlayerInteractor;)V", "playerStats", "e", "Lcom/p2pengine/core/hls/HlsInterceptor;", "getHlsInterceptor", "()Lcom/p2pengine/core/hls/HlsInterceptor;", "setHlsInterceptor", "(Lcom/p2pengine/core/hls/HlsInterceptor;)V", "f", "Lcom/p2pengine/core/dash/DashInterceptor;", "getDashInterceptor", "()Lcom/p2pengine/core/dash/DashInterceptor;", "setDashInterceptor", "(Lcom/p2pengine/core/dash/DashInterceptor;)V", "g", "Z", "getP2pEnabled", "()Z", "setP2pEnabled", "(Z)V", "h", "I", "getDcDownloadTimeout", "()I", "setDcDownloadTimeout", "(I)V", "i", "getDownloadTimeout", "setDownloadTimeout", "j", "J", "getHttpLoadTime", "()J", "setHttpLoadTime", "(J)V", "k", "getDiskCacheLimit", "setDiskCacheLimit", C5713xI.f19431f, "getLocalPortHls", "setLocalPortHls", "m", "getLocalPortDash", "setLocalPortDash", "n", "Lcom/p2pengine/core/utils/LogLevel;", "getLogLevel", "()Lcom/p2pengine/core/utils/LogLevel;", "setLogLevel", "(Lcom/p2pengine/core/utils/LogLevel;)V", "o", "getDebug", "setDebug", TtmlNode.TAG_P, "getMaxPeerConnections", "setMaxPeerConnections", "q", "getMemoryCacheCountLimit", "setMemoryCacheCountLimit", Tailer.f15848j, "getMaxMediaFilesInPlaylist", "setMaxMediaFilesInPlaylist", "s", "getUseHttpRange", "setUseHttpRange", C5713xI.f19433h, "setSetTopBox", "u", "getFastStartup", "setFastStartup", "v", "getPrefetchOnly", "setPrefetchOnly", "w", "getUseStrictHlsSegmentId", "setUseStrictHlsSegmentId", "x", "getWifiOnly", "setWifiOnly", C6027p10.f18368d, "Ljava/lang/Double;", "getPlaylistTimeOffset", "()Ljava/lang/Double;", "setPlaylistTimeOffset", "(Ljava/lang/Double;)V", "playlistTimeOffset", "z", "Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "getP2pProtocolVersion", "()Lcom/p2pengine/core/tracking/P2pProtocolVersion;", "setP2pProtocolVersion", "(Lcom/p2pengine/core/tracking/P2pProtocolVersion;)V", "A", "Ljava/util/Map;", "getHttpHeadersHls", "()Ljava/util/Map;", "setHttpHeadersHls", "(Ljava/util/Map;)V", "httpHeadersHls", "B", "getHttpHeadersDash", "setHttpHeadersDash", "httpHeadersDash", "C", "Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "getHlsSegmentIdGenerator", "()Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "setHlsSegmentIdGenerator", "(Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;)V", "D", "Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "getDashSegmentIdGenerator", "()Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "setDashSegmentIdGenerator", "(Lcom/p2pengine/core/segment/DashSegmentIdGenerator;)V", "E", "getAlternativeTrackerIp", "setAlternativeTrackerIp", "alternativeTrackerIp", "F", "getSharePlaylist", "setSharePlaylist", "G", "getLogPersistent", "setLogPersistent", C1023Ps.f2628k, "getGeoIpPreflight", "setGeoIpPreflight", "getICEPreflight", "setICEPreflight", "Lcom/p2pengine/core/tracking/TrackerZone;", "getTrackerZone", "()Lcom/p2pengine/core/tracking/TrackerZone;", "setTrackerZone", "(Lcom/p2pengine/core/tracking/TrackerZone;)V", "K", "LG8$a;", "getOkHttpClient", "()LG8$a;", "setOkHttpClient", "(LG8$a;)V", C5713xI.f19432g, "getMediaFileSeparator", "setMediaFileSeparator", "M", "Ljava/util/ArrayList;", "getHlsMediaFiles", "()Ljava/util/ArrayList;", "setHlsMediaFiles", "(Ljava/util/ArrayList;)V", "N", "getDashMediaFiles", "setDashMediaFiles", "O", "getIceServers", "setIceServers", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @Nullable
        public Map<String, String> httpHeadersHls;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public Map<String, String> httpHeadersDash;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public HlsSegmentIdGenerator hlsSegmentIdGenerator;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @NotNull
        public DashSegmentIdGenerator dashSegmentIdGenerator;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public String alternativeTrackerIp;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        public boolean sharePlaylist;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        public boolean logPersistent;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        public boolean geoIpPreflight;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        public boolean ICEPreflight;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @NotNull
        public TrackerZone trackerZone;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public InterfaceC0401G8.a okHttpClient;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @NotNull
        public String mediaFileSeparator;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @NotNull
        public ArrayList<String> hlsMediaFiles;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @NotNull
        public ArrayList<String> dashMediaFiles;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        @NotNull
        public ArrayList<C3963e> iceServers;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String announce;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public C3991f signalConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String mTag;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public PlayerInteractor playerStats;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public HlsInterceptor hlsInterceptor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public DashInterceptor dashInterceptor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean p2pEnabled;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public int dcDownloadTimeout;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int downloadTimeout;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public long httpLoadTime;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public long diskCacheLimit;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public int localPortHls;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int localPortDash;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public LogLevel logLevel;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public boolean debug;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public int maxPeerConnections;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public int memoryCacheCountLimit;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public int maxMediaFilesInPlaylist;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public boolean useHttpRange;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public boolean isSetTopBox;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        public boolean fastStartup;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        public boolean prefetchOnly;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        public boolean useStrictHlsSegmentId;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        public boolean wifiOnly;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public Double playlistTimeOffset;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @NotNull
        public P2pProtocolVersion p2pProtocolVersion;

        /* JADX INFO: renamed from: com.p2pengine.core.p2p.P2pConfig$Builder$a */
        /* JADX INFO: loaded from: classes2.dex */
        public /* synthetic */ class C3952a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f11925a;

            static {
                int[] iArr = new int[TrackerZone.values().length];
                iArr[TrackerZone.USA.ordinal()] = 1;
                iArr[TrackerZone.Europe.ordinal()] = 2;
                iArr[TrackerZone.HongKong.ordinal()] = 3;
                f11925a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.p2pengine.core.p2p.P2pConfig$Builder$b */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C3953b extends DashInterceptor {
        }

        /* JADX INFO: renamed from: com.p2pengine.core.p2p.P2pConfig$Builder$c */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C3954c extends HlsInterceptor {
        }

        /* JADX INFO: renamed from: com.p2pengine.core.p2p.P2pConfig$Builder$d */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C3955d extends PlayerInteractor {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static final String m18229a(String str, String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ Builder signalConfig$default(Builder builder, String str, String str2, int i, Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder ICEPreflight(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder announce(@NotNull String announce) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final P2pConfig build() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder dashInterceptor(@NotNull DashInterceptor interceptor) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder dashMediaFiles(@NotNull ArrayList<String> files) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder dashSegmentIdGenerator(@NotNull DashSegmentIdGenerator generator) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder dcDownloadTimeout(int timeout, @NotNull TimeUnit unit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder diskCacheLimit(long limit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder downloadTimeout(int timeout, @NotNull TimeUnit unit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder fastStartup(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder geoIpPreflight(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final String getAlternativeTrackerIp() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final String getAnnounce() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final DashInterceptor getDashInterceptor() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final ArrayList<String> getDashMediaFiles() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final DashSegmentIdGenerator getDashSegmentIdGenerator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getDcDownloadTimeout() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getDebug() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final long getDiskCacheLimit() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getDownloadTimeout() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getFastStartup() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getGeoIpPreflight() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final HlsInterceptor getHlsInterceptor() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final ArrayList<String> getHlsMediaFiles() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final HlsSegmentIdGenerator getHlsSegmentIdGenerator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final Map<String, String> getHttpHeadersDash() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final Map<String, String> getHttpHeadersHls() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final long getHttpLoadTime() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getICEPreflight() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final ArrayList<C3963e> getIceServers() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getLocalPortDash() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getLocalPortHls() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final LogLevel getLogLevel() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getLogPersistent() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final String getMTag() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getMaxMediaFilesInPlaylist() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getMaxPeerConnections() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final String getMediaFileSeparator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final int getMemoryCacheCountLimit() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final InterfaceC0401G8.a getOkHttpClient() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getP2pEnabled() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final P2pProtocolVersion getP2pProtocolVersion() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final PlayerInteractor getPlayerStats() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final Double getPlaylistTimeOffset() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getPrefetchOnly() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getSharePlaylist() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final C3991f getSignalConfig() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final TrackerZone getTrackerZone() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getUseHttpRange() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getUseStrictHlsSegmentId() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean getWifiOnly() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder hlsInterceptor(@NotNull HlsInterceptor interceptor) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder hlsMediaFiles(@NotNull ArrayList<String> files) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder hlsSegmentIdGenerator(@NotNull HlsSegmentIdGenerator generator) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder httpHeadersForDash(@Nullable Map<String, String> headers) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder httpHeadersForHls(@Nullable Map<String, String> headers) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder httpLoadTime(long time) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder iceServers(@NotNull ArrayList<C3963e> servers) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder insertTimeOffsetTag(@Nullable Double timeOffset) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder isSetTopBox(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean isSetTopBox() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder localPortDash(int port) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder localPortHls(int port) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder logEnabled(boolean debug) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder logLevel(@NotNull LogLevel level) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder logPersistent(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder maxMediaFilesInPlaylist(int value) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder maxPeerConnections(int conns) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder mediaFileSeparator(@NotNull String separator) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder memoryCacheCountLimit(int count) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder okHttpClient(@NotNull InterfaceC0401G8.a client) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder p2pEnabled(boolean enabled) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder p2pProtocolVersion(@NotNull P2pProtocolVersion version) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder playerInteractor(@NotNull PlayerInteractor playStats) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder prefetchOnly(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setAlternativeTrackerIp(@Nullable String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setAnnounce(@Nullable String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDashInterceptor(@NotNull DashInterceptor dashInterceptor) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDashMediaFiles(@NotNull ArrayList<String> arrayList) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDashSegmentIdGenerator(@NotNull DashSegmentIdGenerator dashSegmentIdGenerator) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDcDownloadTimeout(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDebug(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDiskCacheLimit(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setDownloadTimeout(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setFastStartup(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setGeoIpPreflight(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHlsInterceptor(@NotNull HlsInterceptor hlsInterceptor) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHlsMediaFiles(@NotNull ArrayList<String> arrayList) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHlsSegmentIdGenerator(@Nullable HlsSegmentIdGenerator hlsSegmentIdGenerator) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHttpHeadersDash(@Nullable Map<String, String> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHttpHeadersHls(@Nullable Map<String, String> map) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setHttpLoadTime(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setICEPreflight(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setIceServers(@NotNull ArrayList<C3963e> arrayList) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setLocalPortDash(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setLocalPortHls(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setLogLevel(@NotNull LogLevel logLevel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setLogPersistent(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setMTag(@Nullable String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setMaxMediaFilesInPlaylist(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setMaxPeerConnections(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setMediaFileSeparator(@NotNull String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setMemoryCacheCountLimit(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setOkHttpClient(@Nullable InterfaceC0401G8.a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setP2pEnabled(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setP2pProtocolVersion(@NotNull P2pProtocolVersion p2pProtocolVersion) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setPlayerStats(@NotNull PlayerInteractor playerInteractor) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setPlaylistTimeOffset(@Nullable Double d) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setPrefetchOnly(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setSetTopBox(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setSharePlaylist(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setSignalConfig(@NotNull C3991f c3991f) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setTrackerZone(@NotNull TrackerZone trackerZone) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setUseHttpRange(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setUseStrictHlsSegmentId(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final void setWifiOnly(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder sharePlaylist(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder signalConfig(@NotNull String main, @Nullable String backup) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder trackerZone(@NotNull TrackerZone zone) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder useHttpRange(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder useStrictHlsSegmentId(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder wifiOnly(boolean flag) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Builder withTag(@Nullable String tag) {
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lcom/p2pengine/core/p2p/P2pConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/p2pengine/core/p2p/P2pConfig$Builder;", "LPY;", "Lui;", "block", "Lcom/p2pengine/core/p2p/P2pConfig;", "build", "(Lom;)Lcom/p2pengine/core/p2p/P2pConfig;", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Invalid debug info offset */
        private Companion() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Companion(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        @InterfaceC0322Et
        @NotNull
        public final P2pConfig build(@NotNull InterfaceC4958om<? super Builder, C1003PY> block) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.P2pConfig$a */
    /* JADX INFO: loaded from: classes2.dex */
    public /* synthetic */ class C3956a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11926a;

        static {
            int[] iArr = new int[TrackerZone.values().length];
            iArr[TrackerZone.USA.ordinal()] = 1;
            iArr[TrackerZone.Europe.ordinal()] = 2;
            iArr[TrackerZone.HongKong.ordinal()] = 3;
            f11926a = iArr;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public P2pConfig(Builder builder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ P2pConfig(Builder builder, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0322Et
    @NotNull
    public static final P2pConfig build(@NotNull InterfaceC4958om<? super Builder, C1003PY> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final String getAlternativeTrackerIp() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getAnnounce() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final String getCustomTag() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final DashInterceptor getDashInterceptor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final ArrayList<String> getDashMediaFiles() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final DashSegmentIdGenerator getDashSegmentIdGenerator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getDcDownloadTimeout() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getDiskCacheLimit() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getDownloadTimeout() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final HlsInterceptor getHlsInterceptor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final ArrayList<String> getHlsMediaFiles() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final HlsSegmentIdGenerator getHlsSegmentIdGenerator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final Map<String, String> getHttpHeadersForDash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final Map<String, String> getHttpHeadersForHls() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getHttpLoadTime() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final ArrayList<C3963e> getIceServers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getLocalPortDash() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getLocalPortHls() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final LogLevel getLogLevel() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getMaxMediaFilesInPlaylist() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getMaxPeerConns() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getMediaFileSeparator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getMemoryCacheCountLimit() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final InterfaceC0401G8.a getOkHttpClient() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final P2pProtocolVersion getP2pProtocolVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final PlayerInteractor getPlayerInteractor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final Double getPlaylistTimeOffset() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean getPrefetchOnly() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final C3991f getSignalConfig() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final TrackerZone getTrackerZone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean getUseStrictHlsSegmentId() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final String getWsSignalerAddr() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isDebug() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isFastStartup() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isGeoIpPreflight() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isICEPreflight() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isLogPersistent() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isP2pEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isSetTopBox() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isSharePlaylist() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isUseHttpRange() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isWifiOnly() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDashInterceptor(@NotNull DashInterceptor dashInterceptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDashMediaFiles(@NotNull ArrayList<String> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDashSegmentIdGenerator(@NotNull DashSegmentIdGenerator dashSegmentIdGenerator) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDcDownloadTimeout(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDiskCacheLimit(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setFastStartup(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHlsInterceptor(@NotNull HlsInterceptor hlsInterceptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHlsMediaFiles(@NotNull ArrayList<String> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHlsSegmentIdGenerator(@Nullable HlsSegmentIdGenerator hlsSegmentIdGenerator) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHttpHeadersForDash(@Nullable Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHttpHeadersForHls(@Nullable Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHttpLoadTime(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setIceServers(@NotNull ArrayList<C3963e> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setMaxPeerConns(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setMemoryCacheCountLimit(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setOkHttpClient(@Nullable InterfaceC0401G8.a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setP2pEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setP2pProtocolVersion(@NotNull P2pProtocolVersion p2pProtocolVersion) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setPlayerInteractor(@NotNull PlayerInteractor playerInteractor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setPlaylistTimeOffset(@Nullable Double d) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setPrefetchOnly(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSetTopBox(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSharePlaylist(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSignalConfig(@NotNull C3991f c3991f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setTrackerZone(@NotNull TrackerZone trackerZone) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setUseHttpRange(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setUseStrictHlsSegmentId(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setWifiOnly(boolean z) {
    }
}
