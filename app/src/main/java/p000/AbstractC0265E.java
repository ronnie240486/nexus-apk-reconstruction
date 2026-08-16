package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: E */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC0265E<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC1475Wt {
    /* JADX INFO: renamed from: b */
    public abstract Set m1498b();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public /* bridge */ Set<Object> m1499c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public /* bridge */ int m1500d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public /* bridge */ Collection<Object> m1501f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public abstract V put(K k, V v);

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return null;
    }
}
