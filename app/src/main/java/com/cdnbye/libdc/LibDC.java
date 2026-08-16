package com.cdnbye.libdc;

import android.media.ViviTV.MainApp;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1051QH;
import p000.C1522Xd;
import p000.InterfaceC0595JC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0595JC(m2919d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m2920d2 = {"Lcom/cdnbye/libdc/LibDC;", "", "()V", "Companion", "data-channel-android_release"}, m2921k = 1, m2922mv = {1, 5, 1}, m2924xi = 48)
public final class LibDC {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u009d\u0001\u0010*\u001a\u00020)2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/cdnbye/libdc/LibDC$Companion;", "", "<init>", "()V", "LPY;", "initialize", "", C1051QH.f2696b, "()Ljava/lang/String;", "url", "hostname", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "Lcom/cdnbye/libdc/IceServerType;", "type", MainApp.f4571l5, "password", "Lcom/cdnbye/libdc/IceServerRelayType;", "relayType", "Lcom/cdnbye/libdc/IceServer;", "rtcIceServer", "(Ljava/lang/String;Ljava/lang/String;SLcom/cdnbye/libdc/IceServerType;Ljava/lang/String;Ljava/lang/String;Lcom/cdnbye/libdc/IceServerRelayType;)Lcom/cdnbye/libdc/IceServer;", "", "iceServers", "Lcom/cdnbye/libdc/ProxyServer;", "proxyServer", "bindAddress", "Lcom/cdnbye/libdc/CertificateType;", "certificateType", "Lcom/cdnbye/libdc/TransportPolicy;", "iceTransportPolicy", "", "enableIceTcp", "enableIceUdpMux", "disableAutoNegotiation", "forceMediaTransport", "", "portRangeBegin", "portRangeEnd", "mtu", "maxMessageSize", "Lcom/cdnbye/libdc/Configuration;", "rtcConfiguration", "(Ljava/util/List;Lcom/cdnbye/libdc/ProxyServer;Ljava/lang/String;Lcom/cdnbye/libdc/CertificateType;Lcom/cdnbye/libdc/TransportPolicy;ZZZZIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/cdnbye/libdc/Configuration;", "data-channel-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX WARN: Invalid debug info offset */
        private Companion() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Companion(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static Configuration rtcConfiguration$default(Companion companion, List list, ProxyServer proxyServer, String str, CertificateType certificateType, TransportPolicy transportPolicy, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Integer num, Integer num2, int i3, Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ IceServer rtcIceServer$default(Companion companion, String str, String str2, short s2, IceServerType iceServerType, String str3, String str4, IceServerRelayType iceServerRelayType, int i, Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public final void initialize() {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final Configuration rtcConfiguration(@NotNull List<IceServer> iceServers, @Nullable ProxyServer proxyServer, @Nullable String bindAddress, @NotNull CertificateType certificateType, @NotNull TransportPolicy iceTransportPolicy, boolean enableIceTcp, boolean enableIceUdpMux, boolean disableAutoNegotiation, boolean forceMediaTransport, int portRangeBegin, int portRangeEnd, @Nullable Integer mtu, @Nullable Integer maxMessageSize) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final IceServer rtcIceServer(@Nullable String url, @NotNull String hostname, short port, @NotNull IceServerType type, @NotNull String username, @NotNull String password, @NotNull IceServerRelayType relayType) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        public final String version() {
            return null;
        }
    }
}
