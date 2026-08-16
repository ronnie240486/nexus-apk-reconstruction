package com.p2pengine.sdk;

import android.util.LruCache;
import com.p2pengine.core.abs.m3u8.C3906d;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/p2pengine/sdk/M3u8Proxy$segmentMapLive$1", "Landroid/util/LruCache;", "", "Lcom/p2pengine/core/abs/m3u8/d$a;", "", "evicted", "key", "oldValue", "newValue", "LPY;", "entryRemoved", "(ZLjava/lang/String;Lcom/p2pengine/core/abs/m3u8/d$a;Lcom/p2pengine/core/abs/m3u8/d$a;)V", "sdk_release"}, k = 1, mv = {1, 5, 1})
public final class M3u8Proxy$segmentMapLive$1 extends LruCache<String, C3906d.a> {
    /* JADX WARN: Invalid debug info offset */
    public M3u8Proxy$segmentMapLive$1(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.util.LruCache
    public /* bridge */ /* synthetic */ void entryRemoved(boolean z, String str, C3906d.a aVar, C3906d.a aVar2) {
    }

    /* JADX INFO: renamed from: entryRemoved, reason: avoid collision after fix types in other method */
    public void entryRemoved2(boolean evicted, @Nullable String key, @Nullable C3906d.a oldValue, @Nullable C3906d.a newValue) {
    }
}
