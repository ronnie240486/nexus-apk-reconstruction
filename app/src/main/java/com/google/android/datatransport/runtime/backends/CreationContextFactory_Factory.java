package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final InterfaceC0735LL<Context> applicationContextProvider;
    private final InterfaceC0735LL<Clock> monotonicClockProvider;
    private final InterfaceC0735LL<Clock> wallClockProvider;

    public CreationContextFactory_Factory(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<Clock> interfaceC0735LL3) {
        this.applicationContextProvider = interfaceC0735LL;
        this.wallClockProvider = interfaceC0735LL2;
        this.monotonicClockProvider = interfaceC0735LL3;
    }

    public static CreationContextFactory_Factory create(InterfaceC0735LL<Context> interfaceC0735LL, InterfaceC0735LL<Clock> interfaceC0735LL2, InterfaceC0735LL<Clock> interfaceC0735LL3) {
        return new CreationContextFactory_Factory(interfaceC0735LL, interfaceC0735LL2, interfaceC0735LL3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // p000.InterfaceC0735LL
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
