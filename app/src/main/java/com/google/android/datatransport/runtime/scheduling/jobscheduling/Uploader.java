package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.InterfaceC4441gs;

/* JADX INFO: loaded from: classes.dex */
public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    @InterfaceC4441gs
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$logAndUpdateState$2(TransportContext transportContext) {
        return Boolean.valueOf(this.eventStore.hasPendingEventsFor(transportContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable lambda$logAndUpdateState$3(TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$4(Iterable iterable, TransportContext transportContext, long j) {
        this.eventStore.recordFailure(iterable);
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$5(Iterable iterable) {
        this.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$6() {
        this.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$7(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.clientHealthMetricsStore.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$8(TransportContext transportContext, long j) {
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int i) {
        this.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$upload$1(final TransportContext transportContext, final int i, Runnable runnable) {
        try {
            try {
                SynchronizationGuard synchronizationGuard = this.guard;
                final EventStore eventStore = this.eventStore;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection(eventStore) { // from class: dZ

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ EventStore f13610a;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                });
                if (isNetworkAvailable()) {
                    logAndUpdateState(transportContext, i);
                } else {
                    this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, transportContext, i) { // from class: fZ

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Uploader f14019a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ TransportContext f14020b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ int f14021c;

                        /* JADX WARN: Invalid debug info offset */
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.workScheduler.schedule(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.guard;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.m17421of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection(clientHealthMetricsStore) { // from class: hZ

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ClientHealthMetricsStore f14337a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return null;
            }
        })).toByteArray())).build());
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        long jMax = 0;
        BackendResponse backendResponseM17425ok = BackendResponse.m17425ok(0L);
        while (true) {
            final long j = jMax;
            while (true) {
                if (!((Boolean) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, transportContext) { // from class: iZ

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Uploader f14546a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ TransportContext f14547b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                })).booleanValue()) {
                    this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, transportContext, j) { // from class: eZ

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Uploader f13756a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ TransportContext f13757b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ long f13758c;

                        /* JADX WARN: Invalid debug info offset */
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return null;
                        }
                    });
                    return backendResponseM17425ok;
                }
                final Iterable iterable = (Iterable) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, transportContext) { // from class: jZ

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Uploader f14799a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ TransportContext f14800b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return backendResponseM17425ok;
                }
                if (transportBackend == null) {
                    Logging.m17427d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                    backendResponseSend = BackendResponse.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PersistedEvent) it.next()).getEvent());
                    }
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        arrayList.add(createMetricsEvent(transportBackend));
                    }
                    backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
                }
                backendResponseM17425ok = backendResponseSend;
                if (backendResponseM17425ok.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, iterable, transportContext, j) { // from class: kZ

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Uploader f14939a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ Iterable f14940b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ TransportContext f14941c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ long f14942d;

                        /* JADX WARN: Invalid debug info offset */
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return null;
                        }
                    });
                    this.workScheduler.schedule(transportContext, i + 1, true);
                    return backendResponseM17425ok;
                }
                this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, iterable) { // from class: lZ

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Uploader f15055a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Iterable f15056b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                });
                if (backendResponseM17425ok.getStatus() == BackendResponse.Status.OK) {
                    break;
                }
                if (backendResponseM17425ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                        map.put(transportName, !map.containsKey(transportName) ? 1 : Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    }
                    this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this, map) { // from class: nZ

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Uploader f15340a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ Map f15341b;

                        /* JADX WARN: Invalid debug info offset */
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return null;
                        }
                    });
                }
            }
            jMax = Math.max(j, backendResponseM17425ok.getNextRequestWaitMillis());
            if (transportContext.shouldUploadClientHealthMetrics()) {
                this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this) { // from class: mZ

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Uploader f15138a;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return null;
                    }
                });
            }
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.executor.execute(new Runnable(this, transportContext, i, runnable) { // from class: gZ

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Uploader f14164a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TransportContext f14165b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f14166c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Runnable f14167d;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
