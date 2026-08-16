package com.p2pengine.core.segment;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000.C1715aZ;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/p2pengine/core/segment/ProgressListener;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "done", "LPY;", C1715aZ.f4285d, "(Ljava/nio/ByteBuffer;Z)V", "", "reason", "onError", "(Ljava/lang/String;)V", "", "data", "contentType", "bodyComplete", "([BLjava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface ProgressListener {
    void bodyComplete(@NotNull byte[] data, @NotNull String contentType);

    void onError(@NotNull String reason);

    void update(@NotNull ByteBuffer buffer, boolean done);
}
