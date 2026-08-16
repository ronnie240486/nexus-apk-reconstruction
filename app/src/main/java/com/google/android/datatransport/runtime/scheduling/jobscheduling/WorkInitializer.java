package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p000.InterfaceC4441gs;

/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    @InterfaceC4441gs
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        Iterator<TransportContext> it = this.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            this.scheduler.schedule(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureContextsScheduled$1() {
        this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this) { // from class: J50

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ WorkInitializer f1448a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return null;
            }
        });
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new Runnable(this) { // from class: I50

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ WorkInitializer f1158a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
