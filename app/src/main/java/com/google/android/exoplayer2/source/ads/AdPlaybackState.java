package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final AdPlaybackState NONE = new AdPlaybackState(new long[0]);
    public final int adGroupCount;
    public final long[] adGroupTimesUs;
    public final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final long contentDurationUs;

    public static final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final int[] states;
        public final Uri[] uris;

        public AdGroup() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        @CheckResult
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C3219C.TIME_UNSET);
            return jArrCopyOf;
        }

        @CheckResult
        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.count == adGroup.count && Arrays.equals(this.uris, adGroup.uris) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs);
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public int hashCode() {
            return Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + (((this.count * 31) + Arrays.hashCode(this.uris)) * 31)) * 31);
        }

        @CheckResult
        public AdGroup withAdCount(int i) {
            return new AdGroup(i, copyStatesWithSpaceForAdCount(this.states, i), (Uri[]) Arrays.copyOf(this.uris, i), copyDurationsUsWithSpaceForAdCount(this.durationsUs, i));
        }

        @CheckResult
        public AdGroup withAdDurationsUs(long[] jArr) {
            Assertions.checkArgument(this.count == -1 || jArr.length <= this.uris.length);
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            }
            return new AdGroup(this.count, this.states, this.uris, jArr);
        }

        @CheckResult
        public AdGroup withAdState(int i, int i2) {
            int i3 = this.count;
            Assertions.checkArgument(i3 == -1 || i2 < i3);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int i4 = iArrCopyStatesWithSpaceForAdCount[i2];
            Assertions.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = this.uris;
            if (uriArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            iArrCopyStatesWithSpaceForAdCount[i2] = i;
            return new AdGroup(this.count, iArrCopyStatesWithSpaceForAdCount, uriArr, jArrCopyDurationsUsWithSpaceForAdCount);
        }

        @CheckResult
        public AdGroup withAdUri(Uri uri, int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, iArrCopyStatesWithSpaceForAdCount.length);
            uriArr[i] = uri;
            iArrCopyStatesWithSpaceForAdCount[i] = 1;
            return new AdGroup(this.count, iArrCopyStatesWithSpaceForAdCount, uriArr, jArrCopyDurationsUsWithSpaceForAdCount);
        }

        @CheckResult
        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 1 || i2 == 0) {
                    iArrCopyOf[i] = 2;
                }
            }
            return new AdGroup(length, iArrCopyOf, this.uris, this.durationsUs);
        }

        private AdGroup(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.count = i;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.adGroupCount = length;
        this.adGroupTimesUs = Arrays.copyOf(jArr, length);
        this.adGroups = new AdGroup[length];
        for (int i = 0; i < length; i++) {
            this.adGroups[i] = new AdGroup();
        }
        this.adResumePositionUs = 0L;
        this.contentDurationUs = C3219C.TIME_UNSET;
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.adGroupTimesUs[i];
        if (j3 == Long.MIN_VALUE) {
            return j2 == C3219C.TIME_UNSET || j < j2;
        }
        return j < j3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && Arrays.equals(this.adGroupTimesUs, adPlaybackState.adGroupTimesUs) && Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != C3219C.TIME_UNSET && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.adGroupTimesUs;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE || (j < j3 && this.adGroups[i].hasUnplayedAds())) {
                break;
            }
            i++;
        }
        if (i < this.adGroupTimesUs.length) {
            return i;
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int length = this.adGroupTimesUs.length - 1;
        while (length >= 0 && isPositionBeforeAdGroup(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.adGroups[length].hasUnplayedAds()) {
            return -1;
        }
        return length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.adGroups) + ((Arrays.hashCode(this.adGroupTimesUs) + (((((this.adGroupCount * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31)) * 31);
    }

    public boolean isAdInErrorState(int i, int i2) {
        AdGroup adGroup;
        int i3;
        AdGroup[] adGroupArr = this.adGroups;
        return i < adGroupArr.length && (i3 = (adGroup = adGroupArr[i]).count) != -1 && i2 < i3 && adGroup.states[i2] == 4;
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder("AdPlaybackState(adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.adGroups.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroupTimesUs[i]);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.adGroups[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.adGroups[i].states[i2];
                if (i3 == 0) {
                    c = '_';
                } else if (i3 == 1) {
                    c = 'R';
                } else if (i3 == 2) {
                    c = 'S';
                } else if (i3 != 3) {
                    c = i3 != 4 ? '?' : '!';
                } else {
                    c = 'P';
                }
                sb.append(c);
                sb.append(", durationUs=");
                sb.append(this.adGroups[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < this.adGroups[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @CheckResult
    public AdPlaybackState withAdCount(int i, int i2) {
        Assertions.checkArgument(i2 > 0);
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i].count == i2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = this.adGroups[i].withAdCount(i2);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i = 0; i < this.adGroupCount; i++) {
            adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i]);
        }
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withAdLoadError(int i, int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = adGroupArr2[i].withAdState(4, i2);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new AdPlaybackState(this.adGroupTimesUs, this.adGroups, j, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withAdUri(int i, int i2, Uri uri) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = adGroupArr2[i].withAdUri(uri, i2);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new AdPlaybackState(this.adGroupTimesUs, this.adGroups, this.adResumePositionUs, j);
    }

    @CheckResult
    public AdPlaybackState withPlayedAd(int i, int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = adGroupArr2[i].withAdState(3, i2);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withSkippedAd(int i, int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = adGroupArr2[i].withAdState(2, i2);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    @CheckResult
    public AdPlaybackState withSkippedAdGroup(int i) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = adGroupArr2[i].withAllAdsSkipped();
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    private AdPlaybackState(long[] jArr, AdGroup[] adGroupArr, long j, long j2) {
        this.adGroupCount = adGroupArr.length;
        this.adGroupTimesUs = jArr;
        this.adGroups = adGroupArr;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
    }
}
