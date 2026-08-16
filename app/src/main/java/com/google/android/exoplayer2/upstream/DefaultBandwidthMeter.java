package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.SlidingPercentile;
import com.google.android.exoplayer2.util.Util;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;

    @Nullable
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;

    @Nullable
    private final Context context;
    private final EventDispatcher<BandwidthMeter.EventListener> eventDispatcher;
    private final SparseArray<Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final Map<String, int[]> DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS = createInitialBitrateCountryGroupAssignment();
    public static final long[] DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = {5800000, 3500000, 1900000, 1000000, 520000};
    public static final long[] DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = {204000, 154000, 139000, 122000, 102000};
    public static final long[] DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = {2200000, 1150000, 810000, 640000, 450000};
    public static final long[] DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = {4900000, 2300000, 1500000, 970000, 540000};

    public static final class Builder {
        private Clock clock;

        @Nullable
        private final Context context;
        private SparseArray<Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static int[] getCountryGroupIndices(String str) {
            int[] iArr = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        private static SparseArray<Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] countryGroupIndices = getCountryGroupIndices(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            sparseArray.append(2, Long.valueOf(jArr[countryGroupIndices[0]]));
            sparseArray.append(3, Long.valueOf(DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G[countryGroupIndices[1]]));
            sparseArray.append(4, Long.valueOf(DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G[countryGroupIndices[2]]));
            long[] jArr2 = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
            sparseArray.append(5, Long.valueOf(jArr2[countryGroupIndices[3]]));
            sparseArray.append(7, Long.valueOf(jArr[countryGroupIndices[0]]));
            sparseArray.append(9, Long.valueOf(jArr2[countryGroupIndices[3]]));
            return sparseArray;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(i, Long.valueOf(j));
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        public Builder setInitialBitrateEstimate(long j) {
            for (int i = 0; i < this.initialBitrateEstimates.size(); i++) {
                this.initialBitrateEstimates.setValueAt(i, Long.valueOf(j));
            }
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.toUpperInvariant(str));
            return this;
        }
    }

    public static class ConnectivityActionReceiver extends BroadcastReceiver {
        private static ConnectivityActionReceiver staticInstance;
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final ArrayList<WeakReference<DefaultBandwidthMeter>> bandwidthMeters = new ArrayList<>();

        private ConnectivityActionReceiver() {
        }

        public static synchronized ConnectivityActionReceiver getInstance(Context context) {
            try {
                if (staticInstance == null) {
                    staticInstance = new ConnectivityActionReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(staticInstance, intentFilter);
                }
            } catch (Throwable th) {
                throw th;
            }
            return staticInstance;
        }

        private void removeClearedReferences() {
            for (int size = this.bandwidthMeters.size() - 1; size >= 0; size--) {
                if (this.bandwidthMeters.get(size).get() == null) {
                    this.bandwidthMeters.remove(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: updateBandwidthMeter, reason: merged with bridge method [inline-methods] */
        public void lambda$register$0(DefaultBandwidthMeter defaultBandwidthMeter) {
            defaultBandwidthMeter.onConnectivityAction();
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            removeClearedReferences();
            for (int i = 0; i < this.bandwidthMeters.size(); i++) {
                DefaultBandwidthMeter defaultBandwidthMeter = this.bandwidthMeters.get(i).get();
                if (defaultBandwidthMeter != null) {
                    lambda$register$0(defaultBandwidthMeter);
                }
            }
        }

        public synchronized void register(final DefaultBandwidthMeter defaultBandwidthMeter) {
            removeClearedReferences();
            this.bandwidthMeters.add(new WeakReference<>(defaultBandwidthMeter));
            this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11135a.lambda$register$0(defaultBandwidthMeter);
                }
            });
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, new SparseArray(), 2000, Clock.DEFAULT, false);
    }

    private static Map<String, int[]> createInitialBitrateCountryGroupAssignment() {
        HashMap map = new HashMap();
        map.put("AD", new int[]{0, 2, 0, 0});
        map.put("AE", new int[]{2, 4, 4, 4});
        map.put("AF", new int[]{4, 4, 3, 3});
        map.put("AG", new int[]{4, 2, 2, 3});
        map.put("AI", new int[]{0, 3, 2, 4});
        map.put("AL", new int[]{1, 2, 0, 1});
        map.put("AM", new int[]{2, 2, 1, 2});
        map.put("AO", new int[]{3, 4, 3, 1});
        map.put("AQ", new int[]{4, 2, 2, 2});
        map.put("AR", new int[]{2, 3, 1, 2});
        map.put("AS", new int[]{2, 2, 4, 2});
        map.put("AT", new int[]{0, 3, 0, 0});
        map.put("AU", new int[]{0, 2, 0, 1});
        map.put("AW", new int[]{1, 1, 2, 4});
        map.put("AX", new int[]{0, 1, 0, 0});
        map.put("AZ", new int[]{3, 3, 3, 3});
        map.put("BA", new int[]{1, 1, 0, 1});
        map.put("BB", new int[]{0, 3, 0, 0});
        map.put("BD", new int[]{2, 0, 4, 3});
        map.put("BE", new int[]{0, 1, 2, 3});
        map.put("BF", new int[]{4, 4, 4, 1});
        map.put("BG", new int[]{0, 1, 0, 0});
        map.put("BH", new int[]{1, 0, 3, 4});
        map.put("BI", new int[]{4, 4, 4, 4});
        map.put("BJ", new int[]{4, 4, 3, 4});
        map.put("BL", new int[]{1, 0, 4, 3});
        map.put("BM", new int[]{0, 1, 0, 0});
        map.put("BN", new int[]{4, 0, 2, 4});
        map.put("BO", new int[]{1, 3, 3, 3});
        map.put("BQ", new int[]{1, 0, 1, 0});
        map.put("BR", new int[]{2, 4, 3, 1});
        map.put("BS", new int[]{3, 1, 1, 3});
        map.put("BT", new int[]{3, 0, 3, 1});
        map.put("BW", new int[]{3, 4, 3, 3});
        map.put("BY", new int[]{0, 1, 1, 1});
        map.put("BZ", new int[]{1, 3, 2, 1});
        map.put("CA", new int[]{0, 3, 2, 2});
        map.put("CD", new int[]{3, 4, 2, 2});
        map.put("CF", new int[]{4, 3, 2, 2});
        map.put("CG", new int[]{3, 4, 1, 1});
        map.put("CH", new int[]{0, 0, 0, 0});
        map.put("CI", new int[]{3, 4, 3, 3});
        map.put("CK", new int[]{2, 0, 1, 0});
        map.put("CL", new int[]{1, 2, 2, 3});
        map.put("CM", new int[]{3, 4, 3, 2});
        map.put("CN", new int[]{1, 0, 1, 1});
        map.put("CO", new int[]{2, 3, 3, 2});
        map.put("CR", new int[]{2, 2, 4, 4});
        map.put("CU", new int[]{4, 4, 2, 1});
        map.put("CV", new int[]{2, 3, 3, 2});
        map.put("CW", new int[]{1, 1, 0, 0});
        map.put("CY", new int[]{1, 1, 0, 0});
        map.put("CZ", new int[]{0, 1, 0, 0});
        map.put("DE", new int[]{0, 1, 2, 3});
        map.put("DJ", new int[]{4, 2, 4, 4});
        map.put("DK", new int[]{0, 0, 1, 0});
        map.put("DM", new int[]{1, 1, 0, 2});
        map.put("DO", new int[]{3, 3, 4, 4});
        map.put("DZ", new int[]{3, 3, 4, 4});
        map.put("EC", new int[]{2, 3, 4, 2});
        map.put("EE", new int[]{0, 0, 0, 0});
        map.put("EG", new int[]{3, 4, 2, 1});
        map.put("EH", new int[]{2, 0, 3, 1});
        map.put("ER", new int[]{4, 2, 4, 4});
        map.put("ES", new int[]{0, 1, 1, 1});
        map.put("ET", new int[]{4, 4, 4, 1});
        map.put("FI", new int[]{0, 0, 1, 0});
        map.put("FJ", new int[]{3, 0, 4, 4});
        map.put("FK", new int[]{2, 2, 2, 1});
        map.put("FM", new int[]{3, 2, 4, 1});
        map.put("FO", new int[]{1, 1, 0, 0});
        map.put("FR", new int[]{1, 1, 1, 1});
        map.put("GA", new int[]{3, 2, 2, 2});
        map.put("GB", new int[]{0, 1, 1, 1});
        map.put("GD", new int[]{1, 1, 3, 1});
        map.put("GE", new int[]{1, 0, 1, 4});
        map.put("GF", new int[]{2, 0, 1, 3});
        map.put("GG", new int[]{1, 0, 0, 0});
        map.put("GH", new int[]{3, 3, 3, 3});
        map.put("GI", new int[]{4, 4, 0, 0});
        map.put("GL", new int[]{2, 1, 1, 2});
        map.put("GM", new int[]{4, 3, 2, 4});
        map.put("GN", new int[]{3, 4, 4, 2});
        map.put("GP", new int[]{2, 1, 3, 4});
        map.put("GQ", new int[]{4, 4, 4, 0});
        map.put("GR", new int[]{1, 1, 0, 1});
        map.put("GT", new int[]{3, 2, 2, 2});
        map.put("GU", new int[]{1, 0, 2, 2});
        map.put("GW", new int[]{3, 4, 4, 3});
        map.put("GY", new int[]{3, 2, 1, 1});
        map.put("HK", new int[]{0, 2, 3, 4});
        map.put("HN", new int[]{3, 1, 3, 3});
        map.put("HR", new int[]{1, 1, 0, 1});
        map.put("HT", new int[]{4, 4, 4, 4});
        map.put("HU", new int[]{0, 1, 0, 0});
        map.put("ID", new int[]{2, 2, 2, 3});
        map.put("IE", new int[]{1, 0, 1, 1});
        map.put("IL", new int[]{1, 0, 2, 3});
        map.put("IM", new int[]{0, 0, 0, 1});
        map.put("IN", new int[]{2, 2, 4, 3});
        map.put("IO", new int[]{4, 4, 2, 3});
        map.put("IQ", new int[]{3, 3, 4, 2});
        map.put("IR", new int[]{3, 0, 2, 1});
        map.put("IS", new int[]{0, 1, 0, 0});
        map.put("IT", new int[]{1, 1, 1, 2});
        map.put("JE", new int[]{1, 0, 0, 1});
        map.put("JM", new int[]{3, 3, 3, 4});
        map.put("JO", new int[]{1, 2, 1, 1});
        map.put("JP", new int[]{0, 2, 0, 0});
        map.put("KE", new int[]{3, 4, 3, 3});
        map.put(ExpandedProductParsedResult.KILOGRAM, new int[]{2, 0, 2, 2});
        map.put("KH", new int[]{1, 0, 4, 3});
        map.put("KI", new int[]{4, 4, 4, 0});
        map.put("KM", new int[]{4, 3, 2, 4});
        map.put("KN", new int[]{1, 0, 2, 4});
        map.put("KP", new int[]{4, 2, 0, 2});
        map.put("KR", new int[]{0, 1, 0, 1});
        map.put("KW", new int[]{2, 3, 1, 2});
        map.put("KY", new int[]{3, 1, 2, 3});
        map.put("KZ", new int[]{1, 2, 2, 2});
        map.put("LA", new int[]{2, 2, 1, 1});
        map.put(ExpandedProductParsedResult.POUND, new int[]{3, 2, 0, 0});
        map.put("LC", new int[]{1, 1, 0, 0});
        map.put("LI", new int[]{0, 0, 1, 1});
        map.put("LK", new int[]{2, 0, 2, 3});
        map.put("LR", new int[]{3, 4, 4, 2});
        map.put("LS", new int[]{3, 3, 2, 2});
        map.put("LT", new int[]{0, 0, 0, 0});
        map.put("LU", new int[]{0, 0, 0, 0});
        map.put("LV", new int[]{0, 0, 0, 0});
        map.put("LY", new int[]{3, 3, 4, 3});
        map.put("MA", new int[]{3, 2, 3, 2});
        map.put("MC", new int[]{0, 4, 0, 0});
        map.put("MD", new int[]{1, 1, 0, 0});
        map.put("ME", new int[]{1, 3, 1, 2});
        map.put("MF", new int[]{2, 3, 1, 1});
        map.put("MG", new int[]{3, 4, 2, 3});
        map.put("MH", new int[]{4, 0, 2, 4});
        map.put("MK", new int[]{1, 0, 0, 0});
        map.put("ML", new int[]{4, 4, 2, 0});
        map.put("MM", new int[]{3, 3, 2, 2});
        map.put("MN", new int[]{2, 3, 1, 1});
        map.put("MO", new int[]{0, 0, 4, 4});
        map.put("MP", new int[]{0, 2, 1, 2});
        map.put("MQ", new int[]{2, 1, 1, 3});
        map.put("MR", new int[]{4, 2, 4, 4});
        map.put("MS", new int[]{1, 4, 3, 4});
        map.put("MT", new int[]{0, 0, 0, 0});
        map.put("MU", new int[]{2, 2, 4, 4});
        map.put("MV", new int[]{4, 3, 2, 4});
        map.put("MW", new int[]{3, 1, 1, 1});
        map.put("MX", new int[]{2, 4, 3, 3});
        map.put("MY", new int[]{2, 1, 3, 3});
        map.put("MZ", new int[]{3, 3, 3, 3});
        map.put("NA", new int[]{4, 3, 3, 3});
        map.put("NC", new int[]{2, 0, 4, 4});
        map.put("NE", new int[]{4, 4, 4, 4});
        map.put("NF", new int[]{1, 2, 2, 0});
        map.put("NG", new int[]{3, 3, 2, 2});
        map.put("NI", new int[]{3, 2, 4, 3});
        map.put("NL", new int[]{0, 2, 3, 2});
        map.put("NO", new int[]{0, 2, 1, 0});
        map.put("NP", new int[]{2, 2, 2, 2});
        map.put("NR", new int[]{4, 0, 3, 2});
        map.put("NZ", new int[]{0, 0, 1, 2});
        map.put("OM", new int[]{2, 3, 0, 2});
        map.put("PA", new int[]{1, 3, 3, 3});
        map.put("PE", new int[]{2, 4, 4, 4});
        map.put("PF", new int[]{2, 1, 1, 1});
        map.put("PG", new int[]{4, 3, 3, 2});
        map.put("PH", new int[]{3, 0, 3, 4});
        map.put("PK", new int[]{3, 2, 3, 2});
        map.put("PL", new int[]{1, 0, 1, 2});
        map.put("PM", new int[]{0, 2, 2, 0});
        map.put("PR", new int[]{2, 2, 2, 2});
        map.put("PS", new int[]{3, 3, 1, 4});
        map.put("PT", new int[]{1, 1, 0, 0});
        map.put("PW", new int[]{1, 1, 3, 0});
        map.put("PY", new int[]{2, 0, 3, 3});
        map.put("QA", new int[]{2, 3, 1, 1});
        map.put("RE", new int[]{1, 0, 2, 2});
        map.put("RO", new int[]{0, 1, 1, 2});
        map.put("RS", new int[]{1, 2, 0, 0});
        map.put("RU", new int[]{0, 1, 0, 1});
        map.put("RW", new int[]{4, 4, 4, 4});
        map.put("SA", new int[]{2, 2, 2, 1});
        map.put("SB", new int[]{4, 4, 4, 1});
        map.put("SC", new int[]{4, 2, 0, 1});
        map.put("SD", new int[]{4, 4, 4, 4});
        map.put("SE", new int[]{0, 1, 0, 0});
        map.put("SG", new int[]{1, 0, 3, 3});
        map.put("SH", new int[]{4, 2, 2, 2});
        map.put("SI", new int[]{0, 1, 0, 0});
        map.put("SJ", new int[]{2, 2, 2, 4});
        map.put("SK", new int[]{0, 1, 0, 0});
        map.put("SL", new int[]{4, 3, 3, 1});
        map.put("SM", new int[]{0, 0, 1, 2});
        map.put("SN", new int[]{4, 4, 4, 3});
        map.put("SO", new int[]{3, 4, 3, 4});
        map.put("SR", new int[]{2, 2, 2, 1});
        map.put("SS", new int[]{4, 4, 4, 4});
        map.put("ST", new int[]{2, 3, 1, 2});
        map.put("SV", new int[]{2, 2, 4, 4});
        map.put("SX", new int[]{2, 4, 1, 0});
        map.put("SY", new int[]{4, 3, 1, 1});
        map.put("SZ", new int[]{4, 4, 3, 4});
        map.put("TC", new int[]{1, 2, 1, 0});
        map.put("TD", new int[]{4, 4, 4, 3});
        map.put("TG", new int[]{3, 2, 1, 0});
        map.put("TH", new int[]{1, 3, 3, 3});
        map.put("TJ", new int[]{4, 4, 4, 4});
        map.put("TL", new int[]{4, 2, 4, 4});
        map.put("TM", new int[]{4, 2, 2, 2});
        map.put("TN", new int[]{2, 1, 1, 1});
        map.put("TO", new int[]{4, 3, 4, 4});
        map.put("TR", new int[]{1, 2, 1, 1});
        map.put("TT", new int[]{1, 3, 2, 4});
        map.put("TV", new int[]{4, 2, 3, 4});
        map.put("TW", new int[]{0, 0, 0, 0});
        map.put("TZ", new int[]{3, 4, 3, 3});
        map.put("UA", new int[]{0, 3, 1, 1});
        map.put("UG", new int[]{3, 2, 2, 3});
        map.put("US", new int[]{0, 1, 2, 2});
        map.put("UY", new int[]{2, 1, 2, 2});
        map.put("UZ", new int[]{2, 2, 3, 2});
        map.put("VA", new int[]{0, 2, 2, 2});
        map.put("VC", new int[]{2, 3, 0, 2});
        map.put("VE", new int[]{4, 4, 4, 4});
        map.put("VG", new int[]{3, 1, 2, 4});
        map.put("VI", new int[]{1, 4, 4, 3});
        map.put("VN", new int[]{0, 1, 3, 4});
        map.put("VU", new int[]{4, 0, 3, 3});
        map.put("WS", new int[]{3, 2, 4, 3});
        map.put("XK", new int[]{1, 2, 1, 0});
        map.put("YE", new int[]{4, 4, 4, 3});
        map.put("YT", new int[]{2, 2, 2, 3});
        map.put("ZA", new int[]{2, 3, 2, 2});
        map.put("ZM", new int[]{3, 2, 3, 3});
        map.put("ZW", new int[]{3, 3, 2, 3});
        return Collections.unmodifiableMap(map);
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(i);
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        try {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
        } catch (Throwable th) {
            throw th;
        }
        return singletonInstance;
    }

    private void maybeNotifyBandwidthSample(final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.dispatch(new EventDispatcher.Event(i, j, j2) { // from class: Ud

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f3517a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f3518b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f3519c;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.util.EventDispatcher.Event
            public final void sendTo(Object obj) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onConnectivityAction() {
        int networkType;
        try {
            if (this.networkTypeOverrideSet) {
                networkType = this.networkTypeOverride;
            } else {
                Context context = this.context;
                networkType = context == null ? 0 : Util.getNetworkType(context);
            }
            if (this.networkType == networkType) {
                return;
            }
            this.networkType = networkType;
            if (networkType != 1 && networkType != 0 && networkType != 8) {
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    @Nullable
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (z) {
            this.sampleBytesTransferred += (long) i;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            try {
                Assertions.checkState(this.streamCount > 0);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                int i = (int) (jElapsedRealtime - this.sampleStartTimeMs);
                this.totalElapsedTimeMs += (long) i;
                long j = this.totalBytesTransferred;
                long j2 = this.sampleBytesTransferred;
                this.totalBytesTransferred = j + j2;
                if (i > 0) {
                    this.slidingPercentile.addSample((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.totalElapsedTimeMs >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS || this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                    }
                    maybeNotifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
                    this.sampleStartTimeMs = jElapsedRealtime;
                    this.sampleBytesTransferred = 0L;
                }
                this.streamCount--;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            try {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.networkTypeOverride = i;
        this.networkTypeOverrideSet = true;
        onConnectivityAction();
    }

    private DefaultBandwidthMeter(@Nullable Context context, SparseArray<Long> sparseArray, int i, Clock clock, boolean z) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = sparseArray;
        this.eventDispatcher = new EventDispatcher<>();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        int networkType = context == null ? 0 : Util.getNetworkType(context);
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        if (context == null || !z) {
            return;
        }
        ConnectivityActionReceiver.getInstance(context).register(this);
    }
}
