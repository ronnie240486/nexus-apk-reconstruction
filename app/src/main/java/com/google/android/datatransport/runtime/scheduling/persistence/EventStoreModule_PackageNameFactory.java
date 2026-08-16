package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final InterfaceC0735LL<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(InterfaceC0735LL<Context> interfaceC0735LL) {
        this.contextProvider = interfaceC0735LL;
    }

    public static EventStoreModule_PackageNameFactory create(InterfaceC0735LL<Context> interfaceC0735LL) {
        return new EventStoreModule_PackageNameFactory(interfaceC0735LL);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.InterfaceC0735LL
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
