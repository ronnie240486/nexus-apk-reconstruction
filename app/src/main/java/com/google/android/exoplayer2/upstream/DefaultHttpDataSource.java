package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Predicate;
import com.google.android.exoplayer2.util.Util;
import com.squareup.picasso.NetworkRequestHandler;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p000.C0305Ec;
import p000.C1025Pu;
import p000.C5312rZ;
import p000.C5577vD;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;

    @Nullable
    private HttpURLConnection connection;

    @Nullable
    private Predicate<String> contentTypePredicate;

    @Nullable
    private DataSpec dataSpec;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private InputStream inputStream;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private final String userAgent;
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> skipBufferReference = new AtomicReference<>();

    public DefaultHttpDataSource(String str) {
        this(str, 8000, 8000);
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.m17583e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private static long getContentLength(HttpURLConnection httpURLConnection) {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.m17582e(TAG, "Unexpected Content-Length [" + headerField + "]");
                j = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = CONTENT_RANGE_HEADER.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            Log.m17586w(TAG, "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            Log.m17582e(TAG, "Unexpected Content-Range [" + headerField2 + "]");
            return j;
        }
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if (NetworkRequestHandler.f12459e.equals(protocol) || NetworkRequestHandler.f12458d.equals(protocol)) {
            return url2;
        }
        throw new ProtocolException(C5312rZ.m27869a("Unsupported protocol redirect: ", protocol));
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.uri.toString());
        int i = dataSpec2.httpMethod;
        byte[] bArr = dataSpec2.httpBody;
        long j = dataSpec2.position;
        long j2 = dataSpec2.length;
        boolean zIsFlagSet = dataSpec2.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, i, bArr, j, j2, zIsFlagSet, true, dataSpec2.httpRequestHeaders);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(C5630w2.m29215a("Too many redirects: ", i3));
            }
            byte[] bArr2 = bArr;
            long j3 = j2;
            long j4 = j;
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(url, i, bArr, j, j2, zIsFlagSet, false, dataSpec2.httpRequestHeaders);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
            if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionMakeConnection.disconnect();
                url = handleRedirect(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionMakeConnection;
                }
                httpURLConnectionMakeConnection.disconnect();
                url = handleRedirect(url, headerField);
                bArr2 = null;
                i = 1;
            }
            i2 = i3;
            bArr = bArr2;
            j2 = j3;
            j = j4;
            dataSpec2 = dataSpec;
        }
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j) {
        int i = Util.SDK_INT;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = this.inputStream.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.bytesToRead == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.bytesRead += (long) i3;
        bytesTransferred(i3);
        return i3;
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped == this.bytesToSkip) {
            return;
        }
        byte[] andSet = skipBufferReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.bytesSkipped;
            long j2 = this.bytesToSkip;
            if (j == j2) {
                skipBufferReference.set(andSet);
                return;
            }
            int i = this.inputStream.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.bytesSkipped += (long) i;
            bytesTransferred(i);
        }
    }

    public final long bytesRead() {
        return this.bytesRead;
    }

    public final long bytesRemaining() {
        long j = this.bytesToRead;
        return j == -1 ? j : j - this.bytesRead;
    }

    public final long bytesSkipped() {
        return this.bytesSkipped;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0015 */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws HttpDataSource.HttpDataSourceException {
        if (this.inputStream != null) {
            maybeTerminateInputStream(this.connection, bytesRemaining());
            try {
                this.inputStream.close();
            } catch (IOException e) {
                throw new HttpDataSource.HttpDataSourceException(e, this.dataSpec, 3);
            }
        }
        this.inputStream = null;
        closeConnectionQuietly();
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesSkipped = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpURLConnectionMakeConnection;
            try {
                this.responseCode = httpURLConnectionMakeConnection.getResponseCode();
                String responseMessage = this.connection.getResponseMessage();
                int i = this.responseCode;
                if (i < 200 || i > 299) {
                    Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                    closeConnectionQuietly();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, headerFields, dataSpec);
                    if (this.responseCode != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = this.connection.getContentType();
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate != null && !predicate.evaluate(contentType)) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                }
                if (this.responseCode == 200) {
                    long j2 = dataSpec.position;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                this.bytesToSkip = j;
                boolean zIsCompressed = isCompressed(this.connection);
                long j3 = dataSpec.length;
                if (zIsCompressed) {
                    this.bytesToRead = j3;
                } else {
                    if (j3 != -1) {
                        this.bytesToRead = j3;
                    } else {
                        long contentLength = getContentLength(this.connection);
                        this.bytesToRead = contentLength != -1 ? contentLength - this.bytesToSkip : -1L;
                    }
                }
                try {
                    this.inputStream = this.connection.getInputStream();
                    if (zIsCompressed) {
                        this.inputStream = new GZIPInputStream(this.inputStream);
                    }
                    this.opened = true;
                    transferStarted(dataSpec);
                    return this.bytesToRead;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e2, dataSpec, 1);
            }
        } catch (IOException e3) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e3, dataSpec, 1);
        }
    }

    @VisibleForTesting
    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, this.dataSpec, 2);
        }
    }

    public void setContentTypePredicate(@Nullable Predicate<String> predicate) {
        this.contentTypePredicate = predicate;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    public DefaultHttpDataSource(String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    public DefaultHttpDataSource(String str, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
        super(true);
        this.userAgent = Assertions.checkNotEmpty(str);
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties;
    }

    @Deprecated
    public DefaultHttpDataSource(String str, @Nullable Predicate<String> predicate) {
        this(str, predicate, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, @Nullable Predicate<String> predicate, int i, int i2) {
        this(str, predicate, i, i2, false, null);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, @Nullable Predicate<String> predicate, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
        super(true);
        this.userAgent = Assertions.checkNotEmpty(str);
        this.contentTypePredicate = predicate;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties;
    }

    private HttpURLConnection makeConnection(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
        httpURLConnectionOpenConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnectionOpenConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.requestProperties.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0 || j2 != -1) {
            String strM28793a = C5577vD.m28793a("bytes=", j, "-");
            if (j2 != -1) {
                StringBuilder sbM1657a = C0305Ec.m1657a(strM28793a);
                sbM1657a.append((j + j2) - 1);
                strM28793a = sbM1657a.toString();
            }
            httpURLConnectionOpenConnection.setRequestProperty("Range", strM28793a);
        }
        httpURLConnectionOpenConnection.setRequestProperty(C1025Pu.a.f2646e, this.userAgent);
        httpURLConnectionOpenConnection.setRequestProperty(C1025Pu.a.f2648g, z ? "gzip" : C1025Pu.a.f2649h);
        httpURLConnectionOpenConnection.setInstanceFollowRedirects(z2);
        httpURLConnectionOpenConnection.setDoOutput(bArr != null);
        httpURLConnectionOpenConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            httpURLConnectionOpenConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionOpenConnection.connect();
            OutputStream outputStream = httpURLConnectionOpenConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionOpenConnection.connect();
        }
        return httpURLConnectionOpenConnection;
    }
}
