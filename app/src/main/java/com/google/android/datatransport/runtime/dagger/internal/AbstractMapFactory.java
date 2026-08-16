package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, InterfaceC0735LL<V>> contributingMap;

    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, InterfaceC0735LL<V>> map;

        public Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        public Builder<K, V, V2> put(K k, InterfaceC0735LL<V> interfaceC0735LL) {
            this.map.put((K) Preconditions.checkNotNull(k, "key"), (InterfaceC0735LL<V>) Preconditions.checkNotNull(interfaceC0735LL, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(InterfaceC0735LL<Map<K, V2>> interfaceC0735LL) {
            if (interfaceC0735LL instanceof DelegateFactory) {
                return putAll(((DelegateFactory) interfaceC0735LL).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) interfaceC0735LL).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, InterfaceC0735LL<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, InterfaceC0735LL<V>> contributingMap() {
        return this.contributingMap;
    }
}
