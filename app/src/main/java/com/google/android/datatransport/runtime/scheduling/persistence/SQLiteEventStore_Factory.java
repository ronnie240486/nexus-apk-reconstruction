package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final InterfaceC0735LL<Clock> clockProvider;
    private final InterfaceC0735LL<EventStoreConfig> configProvider;
    private final InterfaceC0735LL<String> packageNameProvider;
    private final InterfaceC0735LL<SchemaManager> schemaManagerProvider;
    private final InterfaceC0735LL<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(InterfaceC0735LL<Clock> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<EventStoreConfig> interfaceC0735LL3, InterfaceC0735LL<SchemaManager> interfaceC0735LL4, InterfaceC0735LL<String> interfaceC0735LL5) {
        this.wallClockProvider = interfaceC0735LL;
        this.clockProvider = interfaceC0735LL2;
        this.configProvider = interfaceC0735LL3;
        this.schemaManagerProvider = interfaceC0735LL4;
        this.packageNameProvider = interfaceC0735LL5;
    }

    public static SQLiteEventStore_Factory create(InterfaceC0735LL<Clock> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<EventStoreConfig> interfaceC0735LL3, InterfaceC0735LL<SchemaManager> interfaceC0735LL4, InterfaceC0735LL<String> interfaceC0735LL5) {
        return new SQLiteEventStore_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3, interfaceC0735LL4, interfaceC0735LL5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, InterfaceC0735LL<String> interfaceC0735LL) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, interfaceC0735LL);
    }

    @Override // p000.InterfaceC0735LL
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
