package info.guardianproject.netcipher;

import android.annotation.TargetApi;
import android.net.Uri;
import info.guardianproject.netcipher.client.TlsOnlySocketFactory;
import info.guardianproject.netcipher.proxy.OrbotHelper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class NetCipher {
    public static final Proxy ORBOT_HTTP_PROXY = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", OrbotHelper.DEFAULT_PROXY_HTTP_PORT));
    public static final Proxy ORBOT_SOCKS_PROXY = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", OrbotHelper.DEFAULT_PROXY_SOCKS_PORT));
    private static final String TAG = "NetCipher";
    private static Proxy proxy;

    /* JADX WARN: Invalid debug info offset */
    private NetCipher() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    private static boolean checkIsTor(URLConnection uRLConnection) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void clearProxy() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getCompatibleHttpURLConnection(URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getCompatibleHttpsURLConnection(URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getHttpURLConnection(Uri uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getHttpURLConnection(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getHttpURLConnection(URI uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getHttpURLConnection(URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpURLConnection getHttpURLConnection(URL url, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getHttpsURLConnection(Uri uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getHttpsURLConnection(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getHttpsURLConnection(URI uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getHttpsURLConnection(URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static HttpsURLConnection getHttpsURLConnection(URL url, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Proxy getProxy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TlsOnlySocketFactory getTlsOnlySocketFactory() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0016
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static info.guardianproject.netcipher.client.TlsOnlySocketFactory getTlsOnlySocketFactory(boolean r2) {
        /*
            r0 = 0
            return r0
        L14:
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.NetCipher.getTlsOnlySocketFactory(boolean):info.guardianproject.netcipher.client.TlsOnlySocketFactory");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public static boolean isNetCipherGetHttpURLConnectionUsingTor() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public static boolean isURLConnectionUsingTor() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setProxy(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setProxy(Proxy proxy2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(24)
    public static void useGlobalProxy() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void useTor() {
    }
}
