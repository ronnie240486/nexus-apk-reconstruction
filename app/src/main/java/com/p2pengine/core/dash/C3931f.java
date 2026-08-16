package com.p2pengine.core.dash;

import com.p2pengine.core.p2p.C3961c;
import com.p2pengine.core.p2p.DataChannel;
import com.p2pengine.core.p2p.StreamListener;
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.p2pengine.core.dash.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C3931f implements StreamListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DataChannel f11727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3961c f11728b;

    /* JADX WARN: Invalid debug info offset */
    public C3931f(DataChannel dataChannel, C3961c c3961c) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.StreamListener
    @NotNull
    public String getPeerId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.StreamListener
    public void onAbort(@NotNull String str, @Nullable String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.StreamListener
    public void onData(@NotNull ByteBuffer byteBuffer, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.p2p.StreamListener
    public void onInitialBufferArray(@NotNull List<? extends ByteBuffer> list) {
    }
}
