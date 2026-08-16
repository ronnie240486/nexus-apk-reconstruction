package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final InterfaceC0735LL<Executor> executorProvider;
    private final InterfaceC0735LL<SynchronizationGuard> guardProvider;
    private final InterfaceC0735LL<WorkScheduler> schedulerProvider;
    private final InterfaceC0735LL<EventStore> storeProvider;

    public WorkInitializer_Factory(InterfaceC0735LL<Executor> interfaceC0735LL, InterfaceC0735LL<EventStore> interfaceC0735LL2, InterfaceC0735LL<WorkScheduler> interfaceC0735LL3, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL4) {
        this.executorProvider = interfaceC0735LL;
        this.storeProvider = interfaceC0735LL2;
        this.schedulerProvider = interfaceC0735LL3;
        this.guardProvider = interfaceC0735LL4;
    }

    public static WorkInitializer_Factory create(InterfaceC0735LL<Executor> interfaceC0735LL, InterfaceC0735LL<EventStore> interfaceC0735LL2, InterfaceC0735LL<WorkScheduler> interfaceC0735LL3, InterfaceC0735LL<SynchronizationGuard> interfaceC0735LL4) {
        return new WorkInitializer_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // p000.InterfaceC0735LL
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
