package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final InterfaceC0735LL<Clock> eventClockProvider;
    private final InterfaceC0735LL<WorkInitializer> initializerProvider;
    private final InterfaceC0735LL<Scheduler> schedulerProvider;
    private final InterfaceC0735LL<Uploader> uploaderProvider;
    private final InterfaceC0735LL<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(InterfaceC0735LL<Clock> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<Scheduler> interfaceC0735LL3, InterfaceC0735LL<Uploader> interfaceC0735LL4, InterfaceC0735LL<WorkInitializer> interfaceC0735LL5) {
        this.eventClockProvider = interfaceC0735LL;
        this.uptimeClockProvider = interfaceC0735LL2;
        this.schedulerProvider = interfaceC0735LL3;
        this.uploaderProvider = interfaceC0735LL4;
        this.initializerProvider = interfaceC0735LL5;
    }

    public static TransportRuntime_Factory create(InterfaceC0735LL<Clock> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<Scheduler> interfaceC0735LL3, InterfaceC0735LL<Uploader> interfaceC0735LL4, InterfaceC0735LL<WorkInitializer> interfaceC0735LL5) {
        return new TransportRuntime_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4, interfaceC0735LL5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // p000.InterfaceC0735LL
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
