package com.p2pengine.sdk;

import androidx.core.app.NotificationCompat;
import java.io.InputStream;
import org.httpd.protocols.http.response.IStatus;
import org.jetbrains.annotations.NotNull;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m2920d2 = {"Lcom/p2pengine/sdk/ResponseStream;", "", "", "responseUrl", "Ljava/lang/String;", "getResponseUrl", "()Ljava/lang/String;", "Lorg/httpd/protocols/http/response/IStatus;", NotificationCompat.CATEGORY_STATUS, "Lorg/httpd/protocols/http/response/IStatus;", "getStatus", "()Lorg/httpd/protocols/http/response/IStatus;", "contentType", "getContentType", "", "contentLength", "J", "getContentLength", "()J", "Ljava/io/InputStream;", "stream", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "<init>", "(Ljava/lang/String;Lorg/httpd/protocols/http/response/IStatus;Ljava/lang/String;JLjava/io/InputStream;)V", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public final class ResponseStream {
    private final long contentLength;

    @NotNull
    private final String contentType;

    @NotNull
    private final String responseUrl;

    @NotNull
    private final IStatus status;

    @NotNull
    private final InputStream stream;

    /* JADX WARN: Invalid debug info offset */
    public ResponseStream(@NotNull String str, @NotNull IStatus iStatus, @NotNull String str2, long j, @NotNull InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getContentLength() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getResponseUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final IStatus getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final InputStream getStream() {
        return null;
    }
}
