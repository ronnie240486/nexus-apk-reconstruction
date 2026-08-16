package com.p2pengine.core.p2p;

import android.media.ViviTV.activity.ShoppingItemDetailsActivity;
import com.p2pengine.core.segment.SegmentBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/p2pengine/core/p2p/SynthesizerListener;", "", "Lcom/p2pengine/core/p2p/c;", "pieceMsg", "Lcom/p2pengine/core/segment/SegmentBase;", "segment", "LPY;", "onSynthesizerError", "(Lcom/p2pengine/core/p2p/c;Lcom/p2pengine/core/segment/SegmentBase;)V", "Lcom/p2pengine/core/p2p/p;", ShoppingItemDetailsActivity.f5303A, "onSynthesizerOutput", "(Lcom/p2pengine/core/segment/SegmentBase;Lcom/p2pengine/core/p2p/p;)V", "onSynthesizerAbort", "(Lcom/p2pengine/core/p2p/c;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public interface SynthesizerListener {
    void onSynthesizerAbort(@NotNull C3961c pieceMsg);

    void onSynthesizerError(@NotNull C3961c pieceMsg, @Nullable SegmentBase segment);

    void onSynthesizerOutput(@NotNull SegmentBase segment, @NotNull C3974p info2);
}
