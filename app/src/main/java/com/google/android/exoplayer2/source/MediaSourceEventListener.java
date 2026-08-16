package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaSourceEventListener {

    public static final class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public final Handler handler;
            public final MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long adjustMediaTime(long j) {
            long jUsToMs = C3219C.usToMs(j);
            return jUsToMs == C3219C.TIME_UNSET ? C3219C.TIME_UNSET : this.mediaTimeOffsetMs + jUsToMs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$8(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$4(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$3(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$5(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$2(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$mediaPeriodCreated$0(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onMediaPeriodCreated(this.windowIndex, mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$mediaPeriodReleased$1(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onMediaPeriodReleased(this.windowIndex, mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$readingStarted$6(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
            mediaSourceEventListener.onReadingStarted(this.windowIndex, mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$7(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        private void postOrRun(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkArgument((handler == null || mediaSourceEventListener == null) ? false : true);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
            downstreamFormatChanged(new MediaLoadData(1, i, format, i2, obj, adjustMediaTime(j), C3219C.TIME_UNSET));
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, loadEventInfo, mediaLoadData) { // from class: cC

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f10332a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f10333b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSourceEventListener.LoadEventInfo f10334c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f10335d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, loadEventInfo, mediaLoadData) { // from class: ZB

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f4094a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f4095b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSourceEventListener.LoadEventInfo f4096c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f4097d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z) { // from class: YB

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f3939a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f3940b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSourceEventListener.LoadEventInfo f3941c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f3942d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ IOException f3943e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ boolean f3944f;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, loadEventInfo, mediaLoadData) { // from class: bC

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f10164a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f10165b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSourceEventListener.LoadEventInfo f10166c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f10167d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void mediaPeriodCreated() {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, mediaPeriodId) { // from class: aC

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f4237a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f4238b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSource.MediaPeriodId f4239c;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void mediaPeriodReleased() {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, mediaPeriodId) { // from class: WB

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f3696a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f3697b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSource.MediaPeriodId f3698c;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void readingStarted() {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, mediaPeriodId) { // from class: XB

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f3818a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f3819b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSource.MediaPeriodId f3820c;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new MediaLoadData(1, i, null, 3, null, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId, j);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j;
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, mediaLoadData) { // from class: eC

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f13711a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f13712b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f13713c;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void loadCanceled(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            loadCanceled(new LoadEventInfo(dataSpec, uri, map, j3, j4, j5), new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void loadCompleted(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
            loadCompleted(new LoadEventInfo(dataSpec, uri, map, j3, j4, j5), new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void loadError(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            loadError(new LoadEventInfo(dataSpec, uri, map, j3, j4, j5), new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)), iOException, z);
        }

        public void loadStarted(DataSpec dataSpec, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
            loadStarted(new LoadEventInfo(dataSpec, dataSpec.uri, Collections.emptyMap(), j3, 0L, 0L), new MediaLoadData(i, i2, format, i3, obj, adjustMediaTime(j), adjustMediaTime(j2)));
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                postOrRun(listenerAndHandler.handler, new Runnable(this, mediaSourceEventListener, mediaPeriodId, mediaLoadData) { // from class: dC

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f13589a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MediaSourceEventListener f13590b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MediaSource.MediaPeriodId f13591c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ MediaSourceEventListener.MediaLoadData f13592d;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public void loadCanceled(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            loadCanceled(dataSpec, uri, map, i, -1, null, 0, null, C3219C.TIME_UNSET, C3219C.TIME_UNSET, j, j2, j3);
        }

        public void loadCompleted(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            loadCompleted(dataSpec, uri, map, i, -1, null, 0, null, C3219C.TIME_UNSET, C3219C.TIME_UNSET, j, j2, j3);
        }

        public void loadError(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            loadError(dataSpec, uri, map, i, -1, null, 0, null, C3219C.TIME_UNSET, C3219C.TIME_UNSET, j, j2, j3, iOException, z);
        }

        public void loadStarted(DataSpec dataSpec, int i, long j) {
            loadStarted(dataSpec, i, -1, null, 0, null, C3219C.TIME_UNSET, C3219C.TIME_UNSET, j);
        }
    }

    public static final class LoadEventInfo {
        public final long bytesLoaded;
        public final DataSpec dataSpec;
        public final long elapsedRealtimeMs;
        public final long loadDurationMs;
        public final Map<String, List<String>> responseHeaders;
        public final Uri uri;

        public LoadEventInfo(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.dataSpec = dataSpec;
            this.uri = uri;
            this.responseHeaders = map;
            this.elapsedRealtimeMs = j;
            this.loadDurationMs = j2;
            this.bytesLoaded = j3;
        }
    }

    public static final class MediaLoadData {
        public final int dataType;
        public final long mediaEndTimeMs;
        public final long mediaStartTimeMs;

        @Nullable
        public final Format trackFormat;

        @Nullable
        public final Object trackSelectionData;
        public final int trackSelectionReason;
        public final int trackType;

        public MediaLoadData(int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            this.dataType = i;
            this.trackType = i2;
            this.trackFormat = format;
            this.trackSelectionReason = i3;
            this.trackSelectionData = obj;
            this.mediaStartTimeMs = j;
            this.mediaEndTimeMs = j2;
        }
    }

    void onDownstreamFormatChanged(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onReadingStarted(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
