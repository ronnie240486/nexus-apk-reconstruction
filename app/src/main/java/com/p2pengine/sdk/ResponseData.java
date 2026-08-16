package com.p2pengine.sdk;

import androidx.core.app.NotificationCompat;
import org.httpd.protocols.http.response.IStatus;
import org.jetbrains.annotations.NotNull;
import p000.C1522Xd;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m2920d2 = {"Lcom/p2pengine/sdk/ResponseData;", "", "", "responseUrl", "Ljava/lang/String;", "getResponseUrl", "()Ljava/lang/String;", "Lorg/httpd/protocols/http/response/IStatus;", NotificationCompat.CATEGORY_STATUS, "Lorg/httpd/protocols/http/response/IStatus;", "getStatus", "()Lorg/httpd/protocols/http/response/IStatus;", "contentType", "getContentType", "", "data", "[B", "getData", "()[B", "setData", "([B)V", "", "fromHttp", "Z", "getFromHttp", "()Z", "<init>", "(Ljava/lang/String;Lorg/httpd/protocols/http/response/IStatus;Ljava/lang/String;[BZ)V", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public final class ResponseData {

    @NotNull
    private final String contentType;

    @NotNull
    private byte[] data;
    private final boolean fromHttp;

    @NotNull
    private final String responseUrl;

    @NotNull
    private final IStatus status;

    /* JADX WARN: Invalid debug info offset */
    public ResponseData(@NotNull String str, @NotNull IStatus iStatus, @NotNull String str2, @NotNull byte[] bArr, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ ResponseData(String str, IStatus iStatus, String str2, byte[] bArr, boolean z, int i, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final byte[] getData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean getFromHttp() {
        return false;
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
    public final void setData(@NotNull byte[] bArr) {
    }
}
