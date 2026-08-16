package com.google.android.exoplayer2.source;

import java.io.IOException;
import p000.C1367VB;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class DefaultMediaSourceEventListener implements MediaSourceEventListener {
    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        C1367VB.m6488a(this, i, mediaPeriodId, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        C1367VB.m6489b(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        C1367VB.m6490c(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        C1367VB.m6491d(this, i, mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        C1367VB.m6492e(this, i, mediaPeriodId, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        C1367VB.m6493f(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        C1367VB.m6494g(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        C1367VB.m6495h(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public /* synthetic */ void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        C1367VB.m6496i(this, i, mediaPeriodId, mediaLoadData);
    }
}
