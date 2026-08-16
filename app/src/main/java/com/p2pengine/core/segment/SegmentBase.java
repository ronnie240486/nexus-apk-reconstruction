package com.p2pengine.core.segment;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Externalizable;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b*\u0010\u0012R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u001aR\"\u00105\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010)R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001e\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"¨\u0006K"}, d2 = {"Lcom/p2pengine/core/segment/SegmentBase;", "Ljava/io/Externalizable;", "", "SN", "", "segId", "", FirebaseAnalytics.Param.LEVEL, "urlString", "<init>", "(JLjava/lang/String;ILjava/lang/String;)V", "()V", "", "isExpired", "()Z", "getBufLength", "()I", "toString", "()Ljava/lang/String;", "Ljava/io/ObjectOutput;", "p0", "LPY;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "newSegId", "changeSegId", "(Ljava/lang/String;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "J", "getSN", "()J", "setSN", "(J)V", "Ljava/lang/String;", "getSegId", "setSegId", "I", "getLevel", "setLevel", "(I)V", "getUrlString", "", "headers", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "contentType", "getContentType", "setContentType", "statusCode", "getStatusCode", "setStatusCode", "timestamp", "getTimestamp", "", "buffer", "[B", "getBuffer", "()[B", "setBuffer", "([B)V", "Ljava/io/InputStream;", "stream", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", "setStream", "(Ljava/io/InputStream;)V", "contentLength", "getContentLength", "setContentLength", "sdk_release"}, k = 1, mv = {1, 5, 1})
public class SegmentBase implements Externalizable {
    private long SN;

    @Nullable
    private byte[] buffer;
    private long contentLength;

    @NotNull
    private String contentType;

    @Nullable
    private Map<String, String> headers;
    private int level;

    @NotNull
    private String segId;
    private int statusCode;

    @Nullable
    private InputStream stream;
    private final long timestamp;

    @NotNull
    private final String urlString;

    /* JADX WARN: Invalid debug info offset */
    public SegmentBase() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SegmentBase(long j, @NotNull String str, int i, @NotNull String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void changeSegId(@NotNull String newSegId) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getBufLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final byte[] getBuffer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getContentLength() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final Map<String, String> getHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getLevel() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getSN() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getSegId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getStatusCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final InputStream getStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long getTimestamp() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public final String getUrlString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isExpired() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Externalizable
    public void readExternal(@Nullable ObjectInput p0) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setBuffer(@Nullable byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setContentLength(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setContentType(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setHeaders(@Nullable Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setLevel(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSN(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setSegId(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStatusCode(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void setStream(@Nullable InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Externalizable
    public void writeExternal(@Nullable ObjectOutput p0) {
    }
}
