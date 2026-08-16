package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class ProviderOfLazy<T> implements InterfaceC0735LL<Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final InterfaceC0735LL<T> provider;

    private ProviderOfLazy(InterfaceC0735LL<T> interfaceC0735LL) {
        this.provider = interfaceC0735LL;
    }

    public static <T> InterfaceC0735LL<Lazy<T>> create(InterfaceC0735LL<T> interfaceC0735LL) {
        return new ProviderOfLazy((InterfaceC0735LL) Preconditions.checkNotNull(interfaceC0735LL));
    }

    @Override // p000.InterfaceC0735LL
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
