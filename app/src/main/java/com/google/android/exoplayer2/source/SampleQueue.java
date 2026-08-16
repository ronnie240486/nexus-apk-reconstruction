package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class SampleQueue implements TrackOutput {

    @VisibleForTesting
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private int absoluteFirstIndex;

    @Nullable
    private DrmSession<?> currentDrmSession;

    @Nullable
    private Format downstreamFormat;
    private final DrmSessionManager<?> drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean pendingSplice;
    private boolean pendingUpstreamFormatAdjustment;
    private final Looper playbackLooper;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private Format unadjustedUpstreamFormat;
    private Format upstreamCommittedFormat;
    private Format upstreamFormat;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private int upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private Format[] formats = new Format[1000];
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, Looper looper, DrmSessionManager<?> drmSessionManager) {
        this.sampleDataQueue = new SampleDataQueue(allocator);
        this.playbackLooper = looper;
        this.drmSessionManager = drmSessionManager;
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.length == 0) {
            return j > this.largestDiscardedTimestampUs;
        }
        if (Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition)) >= j) {
            return false;
        }
        int i = this.length;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + i);
        return true;
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, TrackOutput.CryptoData cryptoData) {
        try {
            if (this.upstreamKeyframeRequired) {
                if ((i & 1) == 0) {
                    return;
                } else {
                    this.upstreamKeyframeRequired = false;
                }
            }
            Assertions.checkState(!this.upstreamFormatRequired);
            this.isLastSampleQueued = (536870912 & i) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j);
            int relativeIndex = getRelativeIndex(this.length);
            this.timesUs[relativeIndex] = j;
            long[] jArr = this.offsets;
            jArr[relativeIndex] = j2;
            this.sizes[relativeIndex] = i2;
            this.flags[relativeIndex] = i;
            this.cryptoDatas[relativeIndex] = cryptoData;
            Format[] formatArr = this.formats;
            Format format = this.upstreamFormat;
            formatArr[relativeIndex] = format;
            this.sourceIds[relativeIndex] = this.upstreamSourceId;
            this.upstreamCommittedFormat = format;
            int i3 = this.length + 1;
            this.length = i3;
            int i4 = this.capacity;
            if (i3 == i4) {
                int i5 = i4 + 1000;
                int[] iArr = new int[i5];
                long[] jArr2 = new long[i5];
                long[] jArr3 = new long[i5];
                int[] iArr2 = new int[i5];
                int[] iArr3 = new int[i5];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i5];
                Format[] formatArr2 = new Format[i5];
                int i6 = this.relativeFirstIndex;
                int i7 = i4 - i6;
                System.arraycopy(jArr, i6, jArr2, 0, i7);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i7);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i7);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i7);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i7);
                System.arraycopy(this.formats, this.relativeFirstIndex, formatArr2, 0, i7);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i7);
                int i8 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i7, i8);
                System.arraycopy(this.timesUs, 0, jArr3, i7, i8);
                System.arraycopy(this.flags, 0, iArr2, i7, i8);
                System.arraycopy(this.sizes, 0, iArr3, i7, i8);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i7, i8);
                System.arraycopy(this.formats, 0, formatArr2, i7, i8);
                System.arraycopy(this.sourceIds, 0, iArr, i7, i8);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr2;
                this.sizes = iArr3;
                this.cryptoDatas = cryptoDataArr;
                this.formats = formatArr2;
                this.sourceIds = iArr;
                this.relativeFirstIndex = 0;
                this.capacity = i5;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.length;
            if (i2 != 0) {
                long[] jArr = this.timesUs;
                int i3 = this.relativeFirstIndex;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.readPosition) != i2) {
                        i2 = i + 1;
                    }
                    int iFindSampleBefore = findSampleBefore(i3, i2, j, z);
                    if (iFindSampleBefore == -1) {
                        return -1L;
                    }
                    return discardSamples(iFindSampleBefore);
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private long discardSamples(int i) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        int i2 = this.length - i;
        this.length = i2;
        this.absoluteFirstIndex += i;
        int i3 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i3;
        int i4 = this.capacity;
        if (i3 >= i4) {
            this.relativeFirstIndex = i3 - i4;
        }
        int i5 = this.readPosition - i;
        this.readPosition = i5;
        if (i5 < 0) {
            this.readPosition = 0;
        }
        if (i2 != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i6 = this.relativeFirstIndex;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.offsets[i7] + ((long) this.sizes[i7]);
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i2 = this.length - writeIndex;
        this.length = i2;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z = true;
        }
        this.isLastSampleQueued = z;
        int i3 = this.length;
        if (i3 == 0) {
            return 0L;
        }
        int relativeIndex = getRelativeIndex(i3 - 1);
        return this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]);
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.timesUs[i] <= j; i4++) {
            if (!z || (this.flags[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    private long getLargestTimestamp(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean mayReadSample(int i) {
        DrmSession<?> drmSession;
        if (this.drmSessionManager == DrmSessionManager.DUMMY || (drmSession = this.currentDrmSession) == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onFormatResult(Format format, FormatHolder formatHolder) {
        formatHolder.format = format;
        Format format2 = this.downstreamFormat;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.drmInitData;
        this.downstreamFormat = format;
        if (this.drmSessionManager == DrmSessionManager.DUMMY) {
            return;
        }
        DrmInitData drmInitData2 = format.drmInitData;
        formatHolder.includesDrmSession = true;
        formatHolder.drmSession = this.currentDrmSession;
        if (z || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession<?> drmSession = this.currentDrmSession;
            DrmSession drmSessionAcquireSession = drmInitData2 != null ? this.drmSessionManager.acquireSession(this.playbackLooper, drmInitData2) : this.drmSessionManager.acquirePlaceholderSession(this.playbackLooper, MimeTypes.getTrackType(format.sampleMimeType));
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release();
            }
        }
    }

    private synchronized int readSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, long j, SampleExtrasHolder sampleExtrasHolder) {
        boolean zHasNextSample;
        try {
            decoderInputBuffer.waitingForKeys = false;
            int relativeIndex = -1;
            while (true) {
                zHasNextSample = hasNextSample();
                if (!zHasNextSample) {
                    break;
                }
                relativeIndex = getRelativeIndex(this.readPosition);
                if (this.timesUs[relativeIndex] >= j || !MimeTypes.allSamplesAreSyncSamples(this.formats[relativeIndex].sampleMimeType)) {
                    break;
                }
                this.readPosition++;
            }
            if (!zHasNextSample) {
                if (!z2 && !this.isLastSampleQueued) {
                    Format format = this.upstreamFormat;
                    if (format == null || (!z && format == this.downstreamFormat)) {
                        return -3;
                    }
                    onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                    return -5;
                }
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            if (!z && this.formats[relativeIndex] == this.downstreamFormat) {
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                long j2 = this.timesUs[relativeIndex];
                decoderInputBuffer.timeUs = j2;
                if (j2 < j) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                if (decoderInputBuffer.isFlagsOnly()) {
                    return -4;
                }
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                this.readPosition++;
                return -4;
            }
            onFormatResult(this.formats[relativeIndex], formatHolder);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession<?> drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release();
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            if (format == null) {
                this.upstreamFormatRequired = true;
                return false;
            }
            this.upstreamFormatRequired = false;
            if (Util.areEqual(format, this.upstreamFormat)) {
                return false;
            }
            if (Util.areEqual(format, this.upstreamCommittedFormat)) {
                this.upstreamFormat = this.upstreamCommittedFormat;
                return true;
            }
            this.upstreamFormat = format;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int advanceTo(long j) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex]) {
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            if (iFindSampleBefore == -1) {
                return 0;
            }
            this.readPosition += iFindSampleBefore;
            return iFindSampleBefore;
        }
        return 0;
    }

    public final synchronized int advanceToEnd() {
        int i;
        int i2 = this.length;
        i = i2 - this.readPosition;
        this.readPosition = i2;
        return i;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamSamples(int i) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.pendingUpstreamFormatAdjustment = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @CallSuper
    public Format getAdjustedUpstreamFormat(Format format) {
        long j = this.sampleOffsetUs;
        if (j == 0) {
            return format;
        }
        long j2 = format.subsampleOffsetUs;
        return j2 != Long.MAX_VALUE ? format.copyWithSubsampleOffsetUs(j2 + j) : format;
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.pendingUpstreamFormatAdjustment = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    @CallSuper
    public synchronized boolean isReady(boolean z) {
        Format format;
        boolean z2 = true;
        if (hasNextSample()) {
            int relativeIndex = getRelativeIndex(this.readPosition);
            if (this.formats[relativeIndex] != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(relativeIndex);
        }
        if (!z && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
            z2 = false;
        }
        return z2;
    }

    @CallSuper
    public void maybeThrowError() throws IOException {
        DrmSession<?> drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final synchronized int peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    @CallSuper
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, long j) {
        int sampleMetadata = readSampleMetadata(formatHolder, decoderInputBuffer, z, z2, j, this.extrasHolder);
        if (sampleMetadata == -4 && !decoderInputBuffer.isEndOfStream() && !decoderInputBuffer.isFlagsOnly()) {
            this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
        }
        return sampleMetadata;
    }

    @CallSuper
    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(ExtractorInput extractorInput, int i, boolean z) throws InterruptedException, IOException {
        return this.sampleDataQueue.sampleData(extractorInput, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleMetadata(long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.pendingUpstreamFormatAdjustment) {
            format(this.unadjustedUpstreamFormat);
        }
        long j2 = j + this.sampleOffsetUs;
        if (this.pendingSplice) {
            if ((i & 1) == 0 || !attemptSplice(j2)) {
                return;
            } else {
                this.pendingSplice = false;
            }
        }
        commitSample(j2, i, (this.sampleDataQueue.getTotalBytesWritten() - ((long) i2)) - ((long) i3), i2, cryptoData);
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.absoluteFirstIndex;
        if (i >= i2 && i <= this.length + i2) {
            this.readPosition = i - i2;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final void sourceId(int i) {
        this.upstreamSourceId = i;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @CallSuper
    public void reset(boolean z) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.upstreamCommittedFormat = null;
        if (z) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i) {
        this.sampleDataQueue.sampleData(parsableByteArray, i);
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        rewind();
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex] && (j <= this.largestQueuedTimestampUs || z)) {
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            if (iFindSampleBefore == -1) {
                return false;
            }
            this.readPosition += iFindSampleBefore;
            return true;
        }
        return false;
    }
}
