package com.p2pengine.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p2pengine.core.dash.DashInterceptor;
import com.p2pengine.core.hls.HlsInterceptor;
import com.p2pengine.core.nat.NatType;
import com.p2pengine.core.p2p.EngineExceptionListener;
import com.p2pengine.core.p2p.P2pConfig;
import com.p2pengine.core.p2p.P2pStatisticsListener;
import com.p2pengine.core.p2p.PlayerInteractor;
import com.p2pengine.core.segment.DashSegmentIdGenerator;
import com.p2pengine.core.segment.HlsSegmentIdGenerator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1051QH;
import p000.C1522Xd;
import p000.C1549Y3;
import p000.InterfaceC0122Bt;
import p000.InterfaceC0322Et;
import p000.InterfaceC0595JC;
import p000.InterfaceC5750xt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 U2\u00020\u0001:\u0001UB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0012J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010$\u001a\u000201¢\u0006\u0004\b2\u00103J#\u00106\u001a\u00020\u000e2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J#\u00108\u001a\u00020\u000e2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000104¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\u000e¢\u0006\u0004\b9\u0010\u0012J\u0019\u0010;\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b;\u0010\rJ\r\u0010<\u001a\u00020\u000e¢\u0006\u0004\b<\u0010\u0012J\r\u0010=\u001a\u00020\u000e¢\u0006\u0004\b=\u0010\u0012J\r\u0010>\u001a\u00020\u000e¢\u0006\u0004\b>\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0014R\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010T\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bS\u0010O¨\u0006V"}, d2 = {"Lcom/p2pengine/sdk/P2pEngine;", "", "Landroid/content/Context;", "ctx", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;)V", "url", "", "validateParams", "(Ljava/lang/String;)Z", "LPY;", "initInternal", "(Landroid/content/Context;)V", "startLocalServer", "()V", "setP2pConfig", "(Lcom/p2pengine/core/p2p/P2pConfig;)V", "videoId", "Lcom/p2pengine/sdk/MimeType;", "mimeType", "parseStreamUrl", "(Ljava/lang/String;Ljava/lang/String;Lcom/p2pengine/sdk/MimeType;)Ljava/lang/String;", "notifyPlaybackStalled", "Lcom/p2pengine/core/p2p/P2pStatisticsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addP2pStatisticsListener", "(Lcom/p2pengine/core/p2p/P2pStatisticsListener;)V", "Lcom/p2pengine/core/p2p/EngineExceptionListener;", "registerExceptionListener", "(Lcom/p2pengine/core/p2p/EngineExceptionListener;)V", "unregisterExceptionListener", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "cb", "setPlayerInteractor", "(Lcom/p2pengine/core/p2p/PlayerInteractor;)V", "removePlayerInteractor", "Lcom/p2pengine/core/hls/HlsInterceptor;", "setHlsInterceptor", "(Lcom/p2pengine/core/hls/HlsInterceptor;)V", "Lcom/p2pengine/core/dash/DashInterceptor;", "setDashInterceptor", "(Lcom/p2pengine/core/dash/DashInterceptor;)V", "Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;", "setHlsSegmentIdGenerator", "(Lcom/p2pengine/core/segment/HlsSegmentIdGenerator;)V", "Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "setDashSegmentIdGenerator", "(Lcom/p2pengine/core/segment/DashSegmentIdGenerator;)V", "", "headers", "setHttpHeadersForHls", "(Ljava/util/Map;)V", "setHttpHeadersForDash", "stopP2p", "contentId", "restartP2p", "shutdown", "disableP2p", "enableP2p", "Ljava/lang/String;", "Lcom/p2pengine/core/p2p/P2pConfig;", "getConfig", "()Lcom/p2pengine/core/p2p/P2pConfig;", "setConfig", "context", "Landroid/content/Context;", "isvalid", "Z", "Ljava/util/Timer;", "stunTimer", "Ljava/util/Timer;", "Lcom/p2pengine/sdk/Proxy;", "currentProxy", "Lcom/p2pengine/sdk/Proxy;", "getServingMediaType", "()Ljava/lang/String;", "servingMediaType", "isConnected", "()Z", "getPeerId", "peerId", "Companion", "sdk_release"}, k = 1, mv = {1, 5, 1})
public final class P2pEngine {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile P2pEngine INSTANCE = null;

    @NotNull
    public static final String version = "3.8.5";

    @NotNull
    private P2pConfig config;

    @NotNull
    private final Context context;

    @Nullable
    private Proxy currentProxy;
    private boolean isvalid;

    @NotNull
    private final Timer stunTimer;

    @NotNull
    private final String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    @InterfaceC5750xt
    public static NatType natType = NatType.Unknown;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u0003R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/p2pengine/sdk/P2pEngine$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", C1549Y3.f3924a, "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "Lcom/p2pengine/sdk/P2pEngine;", "init", "(Landroid/content/Context;Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;)Lcom/p2pengine/sdk/P2pEngine;", "LPY;", "destroy", "getInstance", "()Lcom/p2pengine/sdk/P2pEngine;", "getInstance$annotations", "instance", "INSTANCE", "Lcom/p2pengine/sdk/P2pEngine;", "Lcom/p2pengine/core/nat/NatType;", "natType", "Lcom/p2pengine/core/nat/NatType;", C1051QH.f2696b, "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Invalid debug info offset */
        private Companion() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Companion(C1522Xd c1522Xd) {
        }

        @InterfaceC0322Et
        public static /* synthetic */ void getInstance$annotations() {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ P2pEngine init$default(Companion companion, Context context, String str, P2pConfig p2pConfig, int i, Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @InterfaceC0322Et
        public final void destroy() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        public final P2pEngine getInstance() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @p000.InterfaceC0322Et
        @org.jetbrains.annotations.NotNull
        public final com.p2pengine.sdk.P2pEngine init(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable com.p2pengine.core.p2p.P2pConfig r6) {
            /*
                r3 = this;
                r0 = 0
                return r0
            L2e:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.P2pEngine.Companion.init(android.content.Context, java.lang.String, com.p2pengine.core.p2p.P2pConfig):com.p2pengine.sdk.P2pEngine");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.sdk.P2pEngine$initInternal$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p2pengine/sdk/P2pEngine$initInternal$1", "Ljava/util/TimerTask;", "LPY;", "run", "()V", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class C40251 extends TimerTask {
        public final /* synthetic */ Context $ctx;

        /* JADX WARN: Invalid debug info offset */
        public C40251(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x006b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.P2pEngine.C40251.run():void");
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.sdk.P2pEngine$initInternal$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p2pengine/sdk/P2pEngine$initInternal$2", "Ljava/util/TimerTask;", "LPY;", "run", "()V", "sdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class C40262 extends TimerTask {
        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.sdk.P2pEngine$removePlayerInteractor$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m2920d2 = {"com/p2pengine/sdk/P2pEngine$removePlayerInteractor$1", "Lcom/p2pengine/core/p2p/PlayerInteractor;", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
    public static final class C40271 extends PlayerInteractor {
    }

    /* JADX WARN: Invalid debug info offset */
    private P2pEngine(Context context, String str, P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ P2pEngine(Context context, String str, P2pConfig p2pConfig, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ P2pEngine access$getINSTANCE$cp() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setINSTANCE$cp(P2pEngine p2pEngine) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0322Et
    public static final void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public static final P2pEngine getInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0322Et
    @NotNull
    public static final P2pEngine init(@NotNull Context context, @NotNull String str, @Nullable P2pConfig p2pConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private final void initInternal(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.P2pEngine.initInternal(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ String parseStreamUrl$default(P2pEngine p2pEngine, String str, String str2, MimeType mimeType, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean restartP2p$default(P2pEngine p2pEngine, String str, int i, Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private final void startLocalServer() {
    }

    /* JADX WARN: Invalid debug info offset */
    private final boolean validateParams(String url) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void addP2pStatisticsListener(@NotNull P2pStatisticsListener listener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void disableP2p() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void enableP2p() {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final P2pConfig getConfig() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getPeerId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final String getServingMediaType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isConnected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyPlaybackStalled() {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0122Bt
    @NotNull
    public final String parseStreamUrl(@NotNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0122Bt
    @NotNull
    public final String parseStreamUrl(@NotNull String str, @NotNull String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @p000.InterfaceC0122Bt
    @org.jetbrains.annotations.NotNull
    public final java.lang.String parseStreamUrl(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull com.p2pengine.sdk.MimeType r10) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L71:
        La7:
        Lb2:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.sdk.P2pEngine.parseStreamUrl(java.lang.String, java.lang.String, com.p2pengine.sdk.MimeType):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void registerExceptionListener(@NotNull EngineExceptionListener listener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void removePlayerInteractor() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean restartP2p(@Nullable String contentId) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setConfig(@NotNull P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDashInterceptor(@NotNull DashInterceptor cb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setDashSegmentIdGenerator(@NotNull DashSegmentIdGenerator cb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHlsInterceptor(@NotNull HlsInterceptor cb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHlsSegmentIdGenerator(@NotNull HlsSegmentIdGenerator cb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHttpHeadersForDash(@Nullable Map<String, String> headers) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHttpHeadersForHls(@Nullable Map<String, String> headers) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setP2pConfig(@NotNull P2pConfig config) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setPlayerInteractor(@NotNull PlayerInteractor cb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void shutdown() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void stopP2p() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void unregisterExceptionListener() {
    }
}
