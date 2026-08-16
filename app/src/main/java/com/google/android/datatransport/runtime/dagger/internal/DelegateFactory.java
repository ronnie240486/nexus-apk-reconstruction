package com.google.android.datatransport.runtime.dagger.internal;

import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private InterfaceC0735LL<T> delegate;

    public static <T> void setDelegate(InterfaceC0735LL<T> interfaceC0735LL, InterfaceC0735LL<T> interfaceC0735LL2) {
        Preconditions.checkNotNull(interfaceC0735LL2);
        DelegateFactory delegateFactory = (DelegateFactory) interfaceC0735LL;
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = interfaceC0735LL2;
    }

    @Override // p000.InterfaceC0735LL
    public T get() {
        InterfaceC0735LL<T> interfaceC0735LL = this.delegate;
        if (interfaceC0735LL != null) {
            return interfaceC0735LL.get();
        }
        throw new IllegalStateException();
    }

    public InterfaceC0735LL<T> getDelegate() {
        return (InterfaceC0735LL) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(InterfaceC0735LL<T> interfaceC0735LL) {
        setDelegate(this, interfaceC0735LL);
    }
}
