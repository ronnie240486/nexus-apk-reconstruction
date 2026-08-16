package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;

    @Nullable
    private String currentSessionId;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();
    private final HashMap<String, SessionDescriptor> sessions = new HashMap<>();
    private Timeline currentTimeline = Timeline.EMPTY;

    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(String str, @Nullable int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
            if (i >= timeline.getWindowCount()) {
                if (i < timeline2.getWindowCount()) {
                    return i;
                }
                return -1;
            }
            timeline.getWindow(i, DefaultPlaybackSessionManager.this.window);
            for (int i2 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                if (indexOfPeriod != -1) {
                    return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                }
            }
            return -1;
        }

        public boolean belongsToSession(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i == this.windowIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
            if (mediaPeriodId2 == null) {
                return !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber;
            }
            return mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            boolean zIsAd = mediaPeriodId2.isAd();
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            if (!zIsAd) {
                int i = mediaPeriodId3.nextAdGroupIndex;
                return i == -1 || i > this.adMediaPeriodId.adGroupIndex;
            }
            int i2 = mediaPeriodId3.adGroupIndex;
            int i3 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
            int i4 = mediaPeriodId4.adGroupIndex;
            return i2 > i4 || (i2 == i4 && i3 > mediaPeriodId4.adIndexInAdGroup);
        }

        public void maybeSetWindowSequenceNumber(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i == this.windowIndex && mediaPeriodId != null) {
                this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    private static String generateSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private SessionDescriptor getOrAddSession(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (j2 == j && ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String strGenerateSessionId = generateSessionId();
        SessionDescriptor sessionDescriptor3 = new SessionDescriptor(strGenerateSessionId, i, mediaPeriodId);
        this.sessions.put(strGenerateSessionId, sessionDescriptor3);
        return sessionDescriptor3;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void handlePositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        try {
            Assertions.checkNotNull(this.listener);
            boolean z = i == 0 || i == 3;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    if (next.isCreated) {
                        boolean zEquals = next.sessionId.equals(this.currentSessionId);
                        boolean z2 = z && zEquals && next.isActive;
                        if (zEquals) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.sessionId, z2);
                    }
                }
            }
            SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
            SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
            this.currentSessionId = orAddSession.sessionId;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd() && (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber != eventTime.mediaPeriodId.windowSequenceNumber || sessionDescriptor.adMediaPeriodId == null || sessionDescriptor.adMediaPeriodId.adGroupIndex != eventTime.mediaPeriodId.adGroupIndex || sessionDescriptor.adMediaPeriodId.adIndexInAdGroup != eventTime.mediaPeriodId.adIndexInAdGroup)) {
                MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
                SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber));
                if (orAddSession2.isCreated && orAddSession.isCreated) {
                    this.listener.onAdPlaybackStarted(eventTime, orAddSession2.sessionId, orAddSession.sessionId);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void handleTimelineUpdate(AnalyticsListener.EventTime eventTime) {
        try {
            Assertions.checkNotNull(this.listener);
            Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline)) {
                    it.remove();
                    if (next.isCreated) {
                        if (next.sessionId.equals(this.currentSessionId)) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.sessionId, false);
                    }
                }
            }
            handlePositionDiscontinuity(eventTime, 4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r7.mediaPeriodId.windowSequenceNumber < r0.windowSequenceNumber) goto L16;
     */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        try {
            Assertions.checkNotNull(this.listener);
            SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
            if (eventTime.mediaPeriodId != null && sessionDescriptor != null) {
                if (sessionDescriptor.windowSequenceNumber == -1) {
                    if (sessionDescriptor.windowIndex != eventTime.windowIndex) {
                        return;
                    }
                }
            }
            SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
            if (this.currentSessionId == null) {
                this.currentSessionId = orAddSession.sessionId;
            }
            if (!orAddSession.isCreated) {
                orAddSession.isCreated = true;
                this.listener.onSessionCreated(eventTime, orAddSession.sessionId);
            }
            if (orAddSession.sessionId.equals(this.currentSessionId) && !orAddSession.isActive) {
                orAddSession.isActive = true;
                this.listener.onSessionActive(eventTime, orAddSession.sessionId);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
