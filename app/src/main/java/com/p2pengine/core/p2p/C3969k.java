package com.p2pengine.core.p2p;

import com.p2pengine.core.tracking.StreamingType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0322Et;

/* JADX INFO: renamed from: com.p2pengine.core.p2p.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C3969k {

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.k$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11992a;

        static {
            int[] iArr = new int[StreamingType.values().length];
            iArr[StreamingType.HLS.ordinal()] = 1;
            iArr[StreamingType.DASH.ordinal()] = 2;
            f11992a = iArr;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0322Et
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC3968j m18286a(@NotNull StreamingType streamingType, @NotNull P2pConfig p2pConfig, @Nullable P2pStatisticsListener p2pStatisticsListener, boolean z) {
        return null;
    }
}
