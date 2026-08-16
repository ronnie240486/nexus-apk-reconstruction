package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.instance;
                    if (t == obj) {
                        t = this.provider.get();
                        this.instance = t;
                        this.provider = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t;
    }

    @VisibleForTesting
    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }

    public Lazy(T t) {
        this.instance = UNINITIALIZED;
        this.instance = t;
    }
}
