package com.p2pengine.core.p2p;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C4615jV;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001JA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b \u0010\u001bJ1\u0010!\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b!\u0010\u001bJ9\u0010#\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/p2pengine/core/p2p/DataChannelMsgListener;", "", "Lcom/p2pengine/core/p2p/DataChannel;", "peer", "", "segId", "", "sn", "", FirebaseAnalytics.Param.LEVEL, "", "urgent", "reverse", "LPY;", "onDataChannelRequest", "(Lcom/p2pengine/core/p2p/DataChannel;Ljava/lang/String;JIZZ)V", "SN", "complete", "onDataChannelHave", "(Lcom/p2pengine/core/p2p/DataChannel;JLjava/lang/String;IZZ)V", "onDataChannelLost", "(Lcom/p2pengine/core/p2p/DataChannel;JLjava/lang/String;I)V", C4615jV.f14789c, "uploadSpeed", "onDataChannelPieceAck", "(Lcom/p2pengine/core/p2p/DataChannel;Ljava/lang/String;II)V", "onDataChannelPieceNotFound", "(Lcom/p2pengine/core/p2p/DataChannel;Ljava/lang/String;JI)V", "Lcom/p2pengine/core/p2p/c;", "msg", "onDataChannelPiece", "(Lcom/p2pengine/core/p2p/DataChannel;Lcom/p2pengine/core/p2p/c;)V", "onDataChannelPieceCancel", "onDataChannelDownloadError", "reason", "onDataChannelPieceAbort", "(Lcom/p2pengine/core/p2p/DataChannel;JLjava/lang/String;ILjava/lang/String;)V", "onDataChannelDisconnect", "(Lcom/p2pengine/core/p2p/DataChannel;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface DataChannelMsgListener {
    void onDataChannelDisconnect(@NotNull DataChannel peer);

    void onDataChannelDownloadError(@NotNull DataChannel peer, @Nullable String segId, long SN, int level);

    void onDataChannelHave(@NotNull DataChannel peer, long SN, @NotNull String segId, int level, boolean reverse, boolean complete);

    void onDataChannelLost(@NotNull DataChannel peer, long SN, @Nullable String segId, int level);

    void onDataChannelPiece(@NotNull DataChannel peer, @NotNull C3961c msg);

    void onDataChannelPieceAbort(@NotNull DataChannel peer, long SN, @NotNull String segId, int level, @Nullable String reason);

    void onDataChannelPieceAck(@NotNull DataChannel peer, @NotNull String segId, int size, int uploadSpeed);

    void onDataChannelPieceCancel(@NotNull DataChannel peer, @Nullable String segId, long SN, int level);

    void onDataChannelPieceNotFound(@NotNull DataChannel peer, @Nullable String segId, long SN, int level);

    void onDataChannelRequest(@NotNull DataChannel peer, @Nullable String segId, long sn, int level, boolean urgent, boolean reverse);
}
