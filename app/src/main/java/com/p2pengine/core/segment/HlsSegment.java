package com.p2pengine.core.segment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p2pengine.core.p2p.P2pConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B1\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\t\b\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m2920d2 = {"Lcom/p2pengine/core/segment/HlsSegment;", "Lcom/p2pengine/core/segment/SegmentBase;", "", "toString", "range", "Ljava/lang/String;", "getRange", "()Ljava/lang/String;", "contentType", "getContentType", "setContentType", "(Ljava/lang/String;)V", "", FirebaseAnalytics.Param.LEVEL, "", "sn", "urlString", "Lcom/p2pengine/core/p2p/P2pConfig;", "config", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Lcom/p2pengine/core/p2p/P2pConfig;)V", "()V", "Companion", "a", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
public class HlsSegment extends SegmentBase {

    @NotNull
    public static final C3977a Companion = new C3977a();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f12043a = "video/mp2t";

    @Nullable
    private final String range;

    /* JADX INFO: renamed from: com.p2pengine.core.segment.HlsSegment$a */
    public static final class C3977a {
    }

    /* JADX WARN: Invalid debug info offset */
    public HlsSegment() {
    }

    /* JADX WARN: Invalid debug info offset */
    public HlsSegment(int i, long j, @NotNull String str, @Nullable String str2, @NotNull P2pConfig p2pConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ String access$getDefaultContentType$cp() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final /* synthetic */ void access$setDefaultContentType$cp(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public static final String getDefaultContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final void setDefaultContentType(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.segment.SegmentBase
    @NotNull
    public String getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public final String getRange() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.segment.SegmentBase
    public void setContentType(@NotNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.segment.SegmentBase
    @NotNull
    public String toString() {
        return null;
    }
}
