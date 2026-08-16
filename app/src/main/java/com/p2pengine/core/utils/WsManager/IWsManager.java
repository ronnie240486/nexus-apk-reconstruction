package com.p2pengine.core.utils.WsManager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000.C5222q8;
import p000.Q30;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/p2pengine/core/utils/WsManager/IWsManager;", "", "LPY;", "startConnect", "()V", "stopConnect", "", "msg", "", "sendMessage", "(Ljava/lang/String;)Z", "Lq8;", "byteString", "(Lq8;)Z", "LQ30;", "getWebSocket", "()LQ30;", "webSocket", "isWsConnected", "()Z", "", "getCurrentStatus", "()I", "setCurrentStatus", "(I)V", "currentStatus", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface IWsManager {
    int getCurrentStatus();

    @NotNull
    Q30 getWebSocket();

    boolean isWsConnected();

    boolean sendMessage(@NotNull String msg);

    boolean sendMessage(@NotNull C5222q8 byteString);

    void setCurrentStatus(int i);

    void startConnect();

    void stopConnect();
}
