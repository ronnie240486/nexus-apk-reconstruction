package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p000.InterfaceC4441gs;

/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    @InterfaceC4441gs
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String str = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
            } else {
                final EventInternal eventInternalDecorate = transportBackend.decorate(eventInternal);
                this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, transportContext, eventInternalDecorate) { // from class: te

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ DefaultScheduler f18896a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ TransportContext f18897b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ EventInternal f18898c;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                });
                transportScheduleCallback.onSchedule(null);
            }
        } catch (Exception e) {
            LOGGER.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new Runnable(this, transportContext, transportScheduleCallback, eventInternal) { // from class: se

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultScheduler f18762a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TransportContext f18763b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ TransportScheduleCallback f18764c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ EventInternal f18765d;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
