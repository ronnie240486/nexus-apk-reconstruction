package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final InterfaceC0735LL<Context> applicationContextProvider;
    private final InterfaceC0735LL<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<CreationContextFactory> interfaceC0735LL2) {
        this.applicationContextProvider = interfaceC0735LL;
        this.creationContextFactoryProvider = interfaceC0735LL2;
    }

    public static MetadataBackendRegistry_Factory create(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<CreationContextFactory> interfaceC0735LL2) {
        return new MetadataBackendRegistry_Factory(interfaceC0735LL, interfaceC0735LL2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // p000.InterfaceC0735LL
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
