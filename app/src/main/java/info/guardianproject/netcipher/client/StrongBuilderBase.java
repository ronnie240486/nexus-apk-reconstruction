package info.guardianproject.netcipher.client;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import info.guardianproject.netcipher.client.StrongBuilderBase;
import info.guardianproject.netcipher.proxy.OrbotHelper;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StrongBuilderBase<T extends StrongBuilderBase, C> implements StrongBuilder<T, C> {
    private static final String PROXY_HOST = "127.0.0.1";
    public static final String TOR_CHECK_URL = "https://check.torproject.org/api/ip";
    protected final Context context;
    protected Proxy.Type proxyType;

    @Nullable
    protected SSLContext sslContext;
    protected boolean useWeakCiphers;
    protected boolean validateTor;

    /* JADX INFO: renamed from: info.guardianproject.netcipher.client.StrongBuilderBase$1 */
    public class C45641 extends OrbotHelper.SimpleStatusCallback {
        final /* synthetic */ StrongBuilderBase this$0;
        final /* synthetic */ StrongBuilder.Callback val$callback;

        /* JADX WARN: Invalid debug info offset */
        public C45641(StrongBuilderBase strongBuilderBase, StrongBuilder.Callback callback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // info.guardianproject.netcipher.proxy.OrbotHelper.SimpleStatusCallback, info.guardianproject.netcipher.proxy.StatusCallback
        public void onEnabled(android.content.Intent r4) {
            /*
                r3 = this;
                return
            L20:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.StrongBuilderBase.C45641.onEnabled(android.content.Intent):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // info.guardianproject.netcipher.proxy.OrbotHelper.SimpleStatusCallback, info.guardianproject.netcipher.proxy.StatusCallback
        public void onNotYetInstalled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // info.guardianproject.netcipher.proxy.StatusCallback
        public void onStatusTimeout() {
        }
    }

    /* JADX INFO: renamed from: info.guardianproject.netcipher.client.StrongBuilderBase$2 */
    public class C45652 extends Thread {
        final /* synthetic */ StrongBuilderBase this$0;
        final /* synthetic */ StrongBuilder.Callback val$callback;
        final /* synthetic */ Object val$connection;
        final /* synthetic */ Intent val$status;

        /* JADX WARN: Invalid debug info offset */
        public C45652(StrongBuilderBase strongBuilderBase, Intent intent, Object obj, StrongBuilder.Callback callback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public StrongBuilderBase(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StrongBuilderBase(StrongBuilderBase strongBuilderBase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public void build(StrongBuilder.Callback<C> callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public Proxy buildProxy(Intent intent) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public SSLSocketFactory buildSocketFactory() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkTor(StrongBuilder.Callback<C> callback, Intent intent, C c) {
    }

    public abstract String get(Intent intent, C c, String str) throws Exception;

    /* JADX WARN: Invalid debug info offset */
    public int getHttpPort(Intent intent) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public SSLContext getSSLContext() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSocksPort(Intent intent) {
        return 0;
    }

    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public boolean supportsHttpProxy() {
        return true;
    }

    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public boolean supportsSocksProxy() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withBestProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withBestProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withHttpProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withHttpProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withSocksProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withSocksProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withTorValidation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withTorValidation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withTrustManagers(TrustManager[] trustManagerArr) throws NoSuchAlgorithmException, KeyManagementException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withTrustManagers(TrustManager[] trustManagerArr) throws NoSuchAlgorithmException, KeyManagementException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ StrongBuilder withWeakCiphers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public T withWeakCiphers() {
        return null;
    }
}
