package com.cdnbye.libdc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Configuration {
    final String mBindAddress;
    final CertificateType mCertificateType;
    final boolean mDisableAutoNegotiation;
    final boolean mEnableIceTcp;
    final boolean mEnableIceUdpMux;
    final boolean mForceMediaTransport;
    final ArrayList<IceServer> mIceServers;
    final TransportPolicy mIceTransportPolicy;
    final Integer mMaxMessageSize;
    final Integer mMtu;
    final int mPortRangeBegin;
    final int mPortRangeEnd;
    final ProxyServer mProxyServer;

    /* JADX WARN: Invalid debug info offset */
    public Configuration(@NonNull ArrayList<IceServer> arrayList, @Nullable ProxyServer proxyServer, @Nullable String str, @NonNull CertificateType certificateType, @NonNull TransportPolicy transportPolicy, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, @Nullable Integer num, @Nullable Integer num2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public String getBindAddress() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public CertificateType getCertificateType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getDisableAutoNegotiation() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getEnableIceTcp() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getEnableIceUdpMux() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getForceMediaTransport() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public ArrayList<IceServer> getIceServers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public TransportPolicy getIceTransportPolicy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public Integer getMaxMessageSize() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public Integer getMtu() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPortRangeBegin() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPortRangeEnd() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public ProxyServer getProxyServer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
