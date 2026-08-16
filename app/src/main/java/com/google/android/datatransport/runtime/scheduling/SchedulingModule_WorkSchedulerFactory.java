package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final InterfaceC0735LL<Clock> clockProvider;
    private final InterfaceC0735LL<SchedulerConfig> configProvider;
    private final InterfaceC0735LL<Context> contextProvider;
    private final InterfaceC0735LL<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<EventStore> interfaceC0735LL2, InterfaceC0735LL<SchedulerConfig> interfaceC0735LL3, InterfaceC0735LL<Clock> interfaceC0735LL4) {
        this.contextProvider = interfaceC0735LL;
        this.eventStoreProvider = interfaceC0735LL2;
        this.configProvider = interfaceC0735LL3;
        this.clockProvider = interfaceC0735LL4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<EventStore> interfaceC0735LL2, InterfaceC0735LL<SchedulerConfig> interfaceC0735LL3, InterfaceC0735LL<Clock> interfaceC0735LL4) {
        return new SchedulingModule_WorkSchedulerFactory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.InterfaceC0735LL
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
