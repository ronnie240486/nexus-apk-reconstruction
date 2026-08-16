package p000;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Predicate;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: wD */
/* JADX INFO: loaded from: classes.dex */
public class C5641wD extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: q */
    public static final int f19248q = 8000;

    /* JADX INFO: renamed from: r */
    public static final int f19249r = 8000;

    /* JADX INFO: renamed from: s */
    public static final String f19250s = "MyHttpDataSource";

    /* JADX INFO: renamed from: t */
    public static final int f19251t = 20;

    /* JADX INFO: renamed from: u */
    public static final int f19252u = 307;

    /* JADX INFO: renamed from: v */
    public static final int f19253v = 308;

    /* JADX INFO: renamed from: w */
    public static final long f19254w = 2048;

    /* JADX INFO: renamed from: a */
    public final boolean f19258a;

    /* JADX INFO: renamed from: b */
    public final int f19259b;

    /* JADX INFO: renamed from: c */
    public final int f19260c;

    /* JADX INFO: renamed from: d */
    public final String f19261d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Predicate<String> f19262e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final HttpDataSource.RequestProperties f19263f;

    /* JADX INFO: renamed from: g */
    public final HttpDataSource.RequestProperties f19264g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DataSpec f19265h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public HttpURLConnection f19266i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InputStream f19267j;

    /* JADX INFO: renamed from: k */
    public boolean f19268k;

    /* JADX INFO: renamed from: l */
    public long f19269l;

    /* JADX INFO: renamed from: m */
    public long f19270m;

    /* JADX INFO: renamed from: n */
    public long f19271n;

    /* JADX INFO: renamed from: o */
    public long f19272o;

    /* JADX INFO: renamed from: p */
    public int f19273p;

    /* JADX INFO: renamed from: x */
    public static final Pattern f19255x = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: y */
    public static final AtomicReference<byte[]> f19256y = new AtomicReference<>();

    /* JADX INFO: renamed from: z */
    public static final TrustManager[] f19257z = {new a()};

    /* JADX INFO: renamed from: A */
    public static final HostnameVerifier f19247A = new b();

    /* JADX INFO: renamed from: wD$b */
    public class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C5641wD(String str, @Nullable Predicate<String> predicate) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5641wD(String str, @Nullable Predicate<String> predicate, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5641wD(String str, @Nullable Predicate<String> predicate, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public C5641wD(String str, @Nullable Predicate<String> predicate, @Nullable TransferListener transferListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public C5641wD(String str, @Nullable Predicate<String> predicate, @Nullable TransferListener transferListener, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public C5641wD(String str, @Nullable Predicate<String> predicate, @Nullable TransferListener transferListener, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static long getContentLength(java.net.HttpURLConnection r11) {
        /*
            r0 = 0
            return r0
        L17:
        L86:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5641wD.getContentLength(java.net.HttpURLConnection):long");
    }

    /* JADX WARN: Invalid debug info offset */
    public static URL handleRedirect(URL url, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void maybeTerminateInputStream(java.net.HttpURLConnection r3, long r4) {
        /*
            return
        L52:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5641wD.maybeTerminateInputStream(java.net.HttpURLConnection, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: a */
    public final String m29226a(DataSpec dataSpec) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final HttpURLConnection m29227b(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long bytesRead() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long bytesRemaining() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long bytesSkipped() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        /*
            r6 = this;
            return
        L15:
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5641wD.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final void closeConnectionQuietly() {
        /*
            r3 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5641wD.closeConnectionQuietly():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final HttpURLConnection getConnection() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r8) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5641wD.open(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int readInternal(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void skipInternal() throws IOException {
    }

    /* JADX INFO: renamed from: wD$a */
    public class a implements X509TrustManager {
        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }
}
