package com.p2pengine.core.p2p;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000.C4312eq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/p2pengine/core/p2p/LoaderCallback;", "", "", "segId", "", C4312eq.f13789r, "", "reuse", "LPY;", "onFailure", "(Ljava/lang/String;IZ)V", "", "data", "contentType", "", "elapsedMs", "onResponse", "([BLjava/lang/String;J)V", "contentLength", "fileSize", "onHeader", "(Ljava/lang/String;JJ)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface LoaderCallback {
    void onFailure(@NotNull String segId, int code, boolean reuse);

    void onHeader(@NotNull String contentType, long contentLength, long fileSize);

    void onResponse(@NotNull byte[] data, @NotNull String contentType, long elapsedMs);
}
