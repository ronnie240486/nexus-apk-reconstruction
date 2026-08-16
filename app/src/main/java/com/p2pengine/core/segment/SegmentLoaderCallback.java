package com.p2pengine.core.segment;

import com.p2pengine.core.p2p.LoaderCallback;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/p2pengine/core/segment/SegmentLoaderCallback;", "Lcom/p2pengine/core/p2p/LoaderCallback;", "Ljava/io/InputStream;", "stream", "", "contentType", "", "contentLength", "Lcom/p2pengine/core/segment/e;", "builder", "LPY;", "onResponseStream", "(Ljava/io/InputStream;Ljava/lang/String;JLcom/p2pengine/core/segment/e;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface SegmentLoaderCallback extends LoaderCallback {
    void onResponseStream(@NotNull InputStream stream, @NotNull String contentType, long contentLength, @Nullable C3983e builder);
}
