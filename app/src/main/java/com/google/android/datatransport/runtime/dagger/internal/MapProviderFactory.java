package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import java.util.Map;
import p000.InterfaceC0735LL;

/* JADX INFO: loaded from: classes.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, InterfaceC0735LL<V>> implements Lazy<Map<K, InterfaceC0735LL<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, InterfaceC0735LL<V>> {
        private Builder(int i) {
            super(i);
        }

        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k, InterfaceC0735LL<V> interfaceC0735LL) {
            super.put((Object) k, (InterfaceC0735LL) interfaceC0735LL);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(InterfaceC0735LL<Map<K, InterfaceC0735LL<V>>> interfaceC0735LL) {
            super.putAll((InterfaceC0735LL) interfaceC0735LL);
            return this;
        }
    }

    private MapProviderFactory(Map<K, InterfaceC0735LL<V>> map) {
        super(map);
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    @Override // p000.InterfaceC0735LL
    public Map<K, InterfaceC0735LL<V>> get() {
        return contributingMap();
    }
}
