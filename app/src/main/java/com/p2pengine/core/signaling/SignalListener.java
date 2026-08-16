package com.p2pengine.core.signaling;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/p2pengine/core/signaling/SignalListener;", "", "LPY;", "onOpen", "()V", "Lcom/google/gson/JsonObject;", "msg", "", "signalName", "onMessage", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "onClose", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface SignalListener {
    void onClose();

    void onMessage(@NotNull JsonObject msg, @Nullable String signalName);

    void onOpen();
}
