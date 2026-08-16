package com.p2pengine.core.segment;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, m2920d2 = {"Lcom/p2pengine/core/segment/DashSegmentIdGenerator;", "", "", "segmentUrl", "range", "onSegmentId", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public interface DashSegmentIdGenerator {
    @NotNull
    String onSegmentId(@NotNull String str, @Nullable String str2);
}
