package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final InterfaceC0735LL<BackendRegistry> backendRegistryProvider;
    private final InterfaceC0735LL<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final InterfaceC0735LL<Clock> clockProvider;
    private final InterfaceC0735LL<Context> contextProvider;
    private final InterfaceC0735LL<EventStore> eventStoreProvider;
    private final InterfaceC0735LL<Executor> executorProvider;
    private final InterfaceC0735LL<SynchronizationGuard> guardProvider;
    private final InterfaceC0735LL<Clock> uptimeClockProvider;
    private final InterfaceC0735LL<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<BackendRegistry> interfaceC0735LL2, InterfaceC0735LL<EventStore> interfaceC0735LL3, InterfaceC0735LL<WorkScheduler> interfaceC0735LL4, InterfaceC0735LL<Executor> interfaceC0735LL5, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL6, InterfaceC0735LL<Clock> interfaceC0735LL7, InterfaceC0735LL<Clock> interfaceC0735LL8, InterfaceC0735LL<ClientHealthMetricsStore> interfaceC0735LL9) {
        this.contextProvider = interfaceC0735LL;
        this.backendRegistryProvider = interfaceC0735LL2;
        this.eventStoreProvider = interfaceC0735LL3;
        this.workSchedulerProvider = interfaceC0735LL4;
        this.executorProvider = interfaceC0735LL5;
        this.guardProvider = interfaceC0735LL6;
        this.clockProvider = interfaceC0735LL7;
        this.uptimeClockProvider = interfaceC0735LL8;
        this.clientHealthMetricsStoreProvider = interfaceC0735LL9;
    }

    public static Uploader_Factory create(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<BackendRegistry> interfaceC0735LL2, InterfaceC0735LL<EventStore> interfaceC0735LL3, InterfaceC0735LL<WorkScheduler> interfaceC0735LL4, InterfaceC0735LL<Executor> interfaceC0735LL5, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL6, InterfaceC0735LL<Clock> interfaceC0735LL7, InterfaceC0735LL<Clock> interfaceC0735LL8, InterfaceC0735LL<ClientHealthMetricsStore> interfaceC0735LL9) {
        return new Uploader_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4, interfaceC0735LL5, interfaceC0735LL6, interfaceC0735LL7, interfaceC0735LL8, interfaceC0735LL9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // p000.InterfaceC0735LL
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
