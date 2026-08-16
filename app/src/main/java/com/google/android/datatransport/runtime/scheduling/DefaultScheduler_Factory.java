package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final InterfaceC0735LL<BackendRegistry> backendRegistryProvider;
    private final InterfaceC0735LL<EventStore> eventStoreProvider;
    private final InterfaceC0735LL<Executor> executorProvider;
    private final InterfaceC0735LL<SynchronizationGuard> guardProvider;
    private final InterfaceC0735LL<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(InterfaceC0735LL<Executor> interfaceC0735LL, InterfaceC0735LL<BackendRegistry> interfaceC0735LL2, InterfaceC0735LL<WorkScheduler> interfaceC0735LL3, InterfaceC0735LL<EventStore> interfaceC0735LL4, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL5) {
        this.executorProvider = interfaceC0735LL;
        this.backendRegistryProvider = interfaceC0735LL2;
        this.workSchedulerProvider = interfaceC0735LL3;
        this.eventStoreProvider = interfaceC0735LL4;
        this.guardProvider = interfaceC0735LL5;
    }

    public static DefaultScheduler_Factory create(InterfaceC0735LL<Executor> interfaceC0735LL, InterfaceC0735LL<BackendRegistry> interfaceC0735LL2, InterfaceC0735LL<WorkScheduler> interfaceC0735LL3, InterfaceC0735LL<EventStore> interfaceC0735LL4, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL5) {
        return new DefaultScheduler_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4, interfaceC0735LL5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // p000.InterfaceC0735LL
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
