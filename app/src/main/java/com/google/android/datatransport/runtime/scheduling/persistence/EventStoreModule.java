package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import p000.InterfaceC4739lS;
import p000.InterfaceC5773yD;

/* JADX INFO: loaded from: classes.dex */
@Module
public abstract class EventStoreModule {
    @Provides
    @InterfaceC5773yD("SQLITE_DB_NAME")
    public static String dbName() {
        return "com.google.android.datatransport.events";
    }

    @Provides
    @InterfaceC4739lS
    @InterfaceC5773yD("PACKAGE_NAME")
    public static String packageName(Context context) {
        return context.getPackageName();
    }

    @Provides
    @InterfaceC5773yD("SCHEMA_VERSION")
    public static int schemaVersion() {
        return SchemaManager.SCHEMA_VERSION;
    }

    @Provides
    public static EventStoreConfig storeConfig() {
        return EventStoreConfig.DEFAULT;
    }

    @Binds
    public abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract EventStore eventStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore sQLiteEventStore);
}
