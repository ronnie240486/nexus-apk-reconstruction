package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.C0028AP;
import p000.C0092BP;
import p000.C5785yP;
import p000.C5855zP;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000;
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    public static class Builder {
        private Clock clock;
        private Map<Priority, ConfigValue> values = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.values.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.clock == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.values.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<Priority, ConfigValue> map = this.values;
            this.values = new HashMap();
            return SchedulerConfig.create(this.clock, map);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.emptySet());
        }

        public abstract long getDelta();

        public abstract Set<Flag> getFlags();

        public abstract long getMaxAllowedDelay();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long adjustedExponentialBackoff(int i, long j) {
        int i2 = i - 1;
        double dMax = Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) i2)));
        double dPow = Math.pow(3.0d, i2);
        double d = j;
        Double.isNaN(d);
        return (long) (dPow * d * dMax);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchedulerConfig create(Clock clock, Map<Priority, ConfigValue> map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(TWENTY_FOUR_HOURS).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(TWENTY_FOUR_HOURS).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(TWENTY_FOUR_HOURS).setMaxAllowedDelay(TWENTY_FOUR_HOURS).setFlags(immutableSetOf(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    private static <T> Set<T> immutableSetOf(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    private void populateFlags(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            C5855zP.m29973a(builder, 2);
        } else {
            C5855zP.m29973a(builder, 1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            C0028AP.m163a(builder, true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            C0092BP.m486a(builder, true);
        }
    }

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        C5785yP.m29808a(builder, getScheduleDelay(priority, j, i));
        populateFlags(builder, getValues().get(priority).getFlags());
        return builder;
    }

    public abstract Clock getClock();

    public Set<Flag> getFlags(Priority priority) {
        return getValues().get(priority).getFlags();
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
        long time = j - getClock().getTime();
        ConfigValue configValue = getValues().get(priority);
        return Math.min(Math.max(adjustedExponentialBackoff(i, configValue.getDelta()), time), configValue.getMaxAllowedDelay());
    }

    public abstract Map<Priority, ConfigValue> getValues();
}
