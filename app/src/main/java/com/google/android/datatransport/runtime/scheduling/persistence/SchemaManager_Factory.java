package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final InterfaceC0735LL<Context> contextProvider;
    private final InterfaceC0735LL<String> dbNameProvider;
    private final InterfaceC0735LL<Integer> schemaVersionProvider;

    public SchemaManager_Factory(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<String> interfaceC0735LL2, InterfaceC0735LL<Integer> interfaceC0735LL3) {
        this.contextProvider = interfaceC0735LL;
        this.dbNameProvider = interfaceC0735LL2;
        this.schemaVersionProvider = interfaceC0735LL3;
    }

    public static SchemaManager_Factory create(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<String> interfaceC0735LL2, InterfaceC0735LL<Integer> interfaceC0735LL3) {
        return new SchemaManager_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // p000.InterfaceC0735LL
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
