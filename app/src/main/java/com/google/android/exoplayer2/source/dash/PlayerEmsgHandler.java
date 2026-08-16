package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.C0499Hg;
import p000.C4331f8;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = Util.createHandler(this);
    private final EventMessageDecoder decoder = new EventMessageDecoder();
    private long lastLoadedChunkEndTimeUs = C3219C.TIME_UNSET;
    private long lastLoadedChunkEndTimeBeforeRefreshUs = C3219C.TIME_UNSET;

    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j, long j2) {
            this.eventTimeUs = j;
            this.manifestPublishTimeMsInEmsg = j2;
        }
    }

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final MetadataInputBuffer buffer = new MetadataInputBuffer();

        public PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = new SampleQueue(allocator, PlayerEmsgHandler.this.handler.getLooper(), C0499Hg.m2391d());
        }

        @Nullable
        private MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, false, false, 0L) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void onManifestExpiredMessageEncountered(long j, long j2) {
            PlayerEmsgHandler.this.handler.sendMessage(PlayerEmsgHandler.this.handler.obtainMessage(1, new ManifestExpiryEventInfo(j, j2)));
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                MetadataInputBuffer metadataInputBufferDequeueSample = dequeueSample();
                if (metadataInputBufferDequeueSample != null) {
                    long j = metadataInputBufferDequeueSample.timeUs;
                    EventMessage eventMessage = (EventMessage) PlayerEmsgHandler.this.decoder.decode(metadataInputBufferDequeueSample).get(0);
                    if (PlayerEmsgHandler.isPlayerEmsgEvent(eventMessage.schemeIdUri, eventMessage.value)) {
                        parsePlayerEmsgEvent(j, eventMessage);
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private void parsePlayerEmsgEvent(long j, EventMessage eventMessage) {
            long manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventMessage);
            if (manifestPublishTimeMsInEmsg == C3219C.TIME_UNSET) {
                return;
            }
            onManifestExpiredMessageEncountered(j, manifestPublishTimeMsInEmsg);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            this.sampleQueue.format(format);
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j);
        }

        public boolean maybeRefreshManifestOnLoadingError(Chunk chunk) {
            return PlayerEmsgHandler.this.maybeRefreshManifestOnLoadingError(chunk);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public void release() {
            this.sampleQueue.release();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(ExtractorInput extractorInput, int i, boolean z) throws InterruptedException, IOException {
            return this.sampleQueue.sampleData(extractorInput, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j, i, i2, i3, cryptoData);
            parseAndDiscardSamples();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i) {
            this.sampleQueue.sampleData(parsableByteArray, i);
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    @Nullable
    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
        try {
            return Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (ParserException unused) {
            return C3219C.TIME_UNSET;
        }
    }

    private void handleManifestExpiredMessage(long j, long j2) {
        Long l = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j2));
        if (l != null && l.longValue() <= j) {
            return;
        }
        this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
    }

    public static boolean isPlayerEmsgEvent(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || C4331f8.f13908k.equals(str2));
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        long j = this.lastLoadedChunkEndTimeBeforeRefreshUs;
        if (j == C3219C.TIME_UNSET || j != this.lastLoadedChunkEndTimeUs) {
            this.isWaitingForManifestRefresh = true;
            this.lastLoadedChunkEndTimeBeforeRefreshUs = this.lastLoadedChunkEndTimeUs;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        DashManifest dashManifest = this.manifest;
        boolean z = false;
        if (!dashManifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(dashManifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z = true;
        }
        if (z) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z;
    }

    public boolean maybeRefreshManifestOnLoadingError(Chunk chunk) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        long j = this.lastLoadedChunkEndTimeUs;
        if (j == C3219C.TIME_UNSET || j >= chunk.startTimeUs) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.allocator);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        long j = this.lastLoadedChunkEndTimeUs;
        if (j != C3219C.TIME_UNSET || chunk.endTimeUs > j) {
            this.lastLoadedChunkEndTimeUs = chunk.endTimeUs;
        }
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    public void updateManifest(DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = C3219C.TIME_UNSET;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }
}
