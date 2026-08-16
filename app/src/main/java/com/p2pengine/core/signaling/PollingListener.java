package com.p2pengine.core.signaling;

import com.google.gson.JsonArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C1051QH;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/p2pengine/core/signaling/PollingListener;", "", "", C1051QH.f2696b, "LPY;", "onOpen", "(I)V", "Lcom/google/gson/JsonArray;", "msgs", "onMessage", "(Lcom/google/gson/JsonArray;)V", "onClose", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface PollingListener {
    void onClose();

    void onError(@Nullable Exception e);

    void onMessage(@NotNull JsonArray msgs);

    void onOpen(int version);
}
