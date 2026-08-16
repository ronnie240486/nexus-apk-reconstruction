package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.TreeSet;
import p000.C0372Fg;

/* JADX INFO: loaded from: classes2.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* JADX INFO: renamed from: id */
    public final int f11137id;
    public final String key;
    private boolean locked;
    private DefaultContentMetadata metadata;

    public CachedContent(int i, String str) {
        this(i, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        return this.f11137id == cachedContent.f11137id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata);
    }

    public long getCachedBytesLength(long j, long j2) {
        Assertions.checkArgument(j >= 0);
        Assertions.checkArgument(j2 >= 0);
        SimpleCacheSpan span = getSpan(j);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j4) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j5 = simpleCacheSpan.position;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + simpleCacheSpan.length);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j) {
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j);
        SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        return simpleCacheSpanCeiling == null ? SimpleCacheSpan.createOpenHole(this.key, j) : SimpleCacheSpan.createClosedHole(this.key, j, simpleCacheSpanCeiling.position - j);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return this.metadata.hashCode() + C0372Fg.m1897a(this.key, this.f11137id * 31, 31);
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isLocked() {
        return this.locked;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        cacheSpan.file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j, boolean z) {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = simpleCacheSpan.file;
        if (z) {
            File cacheFile = SimpleCacheSpan.getCacheFile(file.getParentFile(), this.f11137id, simpleCacheSpan.position, j);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.m17586w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        }
        SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }

    public void setLocked(boolean z) {
        this.locked = z;
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f11137id = i;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
    }
}
