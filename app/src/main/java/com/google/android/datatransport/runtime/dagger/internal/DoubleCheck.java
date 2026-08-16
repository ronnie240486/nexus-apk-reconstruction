package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements InterfaceC0735LL<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile InterfaceC0735LL<T> provider;

    private DoubleCheck(InterfaceC0735LL<T> interfaceC0735LL) {
        this.provider = interfaceC0735LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P extends InterfaceC0735LL<T>, T> Lazy<T> lazy(P p) {
        return p instanceof Lazy ? (Lazy) p : new DoubleCheck((InterfaceC0735LL) Preconditions.checkNotNull(p));
    }

    public static <P extends InterfaceC0735LL<T>, T> InterfaceC0735LL<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || (obj instanceof MemoizedSentinel) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p000.InterfaceC0735LL
    public T get() {
        T t = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.instance;
                    if (t == obj) {
                        t = this.provider.get();
                        this.instance = reentrantCheck(this.instance, t);
                        this.provider = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t;
    }
}
