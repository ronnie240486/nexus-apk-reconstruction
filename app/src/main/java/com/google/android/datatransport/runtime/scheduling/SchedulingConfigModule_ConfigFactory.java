package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final InterfaceC0735LL<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(InterfaceC0735LL<Clock> interfaceC0735LL) {
        this.clockProvider = interfaceC0735LL;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(InterfaceC0735LL<Clock> interfaceC0735LL) {
        return new SchedulingConfigModule_ConfigFactory(interfaceC0735LL);
    }

    @Override // p000.InterfaceC0735LL
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
