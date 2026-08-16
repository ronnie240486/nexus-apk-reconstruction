package com.google.android.datatransport.runtime.dagger.internal;

import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class SingleCheck<T> implements InterfaceC0735LL<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile InterfaceC0735LL<T> provider;

    private SingleCheck(InterfaceC0735LL<T> interfaceC0735LL) {
        this.provider = interfaceC0735LL;
    }

    public static <P extends InterfaceC0735LL<T>, T> InterfaceC0735LL<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((InterfaceC0735LL) Preconditions.checkNotNull(p));
    }

    @Override // p000.InterfaceC0735LL
    public T get() {
        T t = (T) this.instance;
        if (t != UNINITIALIZED) {
            return t;
        }
        InterfaceC0735LL<T> interfaceC0735LL = this.provider;
        if (interfaceC0735LL == null) {
            return (T) this.instance;
        }
        T t2 = interfaceC0735LL.get();
        this.instance = t2;
        this.provider = null;
        return t2;
    }
}
