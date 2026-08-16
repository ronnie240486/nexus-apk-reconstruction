package com.google.android.exoplayer2.offline;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3307b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
    }
}
