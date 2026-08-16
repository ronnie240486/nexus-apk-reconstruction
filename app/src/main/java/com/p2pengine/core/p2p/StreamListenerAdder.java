package com.p2pengine.core.p2p;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/p2pengine/core/p2p/StreamListenerAdder;", "", "", "reverse", "Lcom/p2pengine/core/p2p/StreamListener;", "handler", "LPY;", "addStreamListener", "(ZLcom/p2pengine/core/p2p/StreamListener;)V", "", "peerId", "removeStreamListener", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface StreamListenerAdder {
    void addStreamListener(boolean reverse, @NotNull StreamListener handler);

    void removeStreamListener(@NotNull String peerId);
}
