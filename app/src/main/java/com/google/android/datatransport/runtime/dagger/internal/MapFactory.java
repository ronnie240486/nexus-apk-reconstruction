package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {
    private static final InterfaceC0735LL<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        private Builder(int i) {
            super(i);
        }

        public MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k, InterfaceC0735LL<V> interfaceC0735LL) {
            super.put((Object) k, (InterfaceC0735LL) interfaceC0735LL);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(InterfaceC0735LL<Map<K, V>> interfaceC0735LL) {
            super.putAll((InterfaceC0735LL) interfaceC0735LL);
            return this;
        }
    }

    private MapFactory(Map<K, InterfaceC0735LL<V>> map) {
        super(map);
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    public static <K, V> InterfaceC0735LL<Map<K, V>> emptyMapProvider() {
        return (InterfaceC0735LL<Map<K, V>>) EMPTY;
    }

    @Override // p000.InterfaceC0735LL
    public Map<K, V> get() {
        LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (Map.Entry<K, InterfaceC0735LL<V>> entry : contributingMap().entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }
}
