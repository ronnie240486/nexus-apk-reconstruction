package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC5757y<K, V> implements Map<K, V>, InterfaceC1089Qt {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final a f19534c = new a(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public volatile Set<? extends K> f19535a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public volatile Collection<? extends V> f19536b;

    /* JADX INFO: renamed from: y$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        public a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final boolean m29725a(@NotNull Map.Entry<?, ?> entry, @Nullable Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final int m29726b(@NotNull Map.Entry<?, ?> entry) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m29727c(@NotNull Map.Entry<?, ?> entry) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y$b */
    public static final class b extends AbstractC0455H<K> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC5757y<K, V> f19537b;

        /* JADX INFO: renamed from: y$b$a */
        public static final class a implements Iterator<K>, InterfaceC1089Qt {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f19538a;

            /* JADX WARN: Invalid debug info offset */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public K next() {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public void remove() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public b(AbstractC5757y<K, ? extends V> abstractC5757y) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4710l
        /* JADX INFO: renamed from: b */
        public int mo1574b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4710l, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC0455H, p000.AbstractC4710l, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<K> iterator() {
            return null;
        }
    }

    /* JADX INFO: renamed from: y$c */
    public static final class c extends AbstractC0123Bu implements InterfaceC4958om<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5757y<K, V> f19539a;

        /* JADX WARN: Invalid debug info offset */
        public c(AbstractC5757y<K, ? extends V> abstractC5757y) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final CharSequence m29728a(@NotNull Map.Entry<? extends K, ? extends V> entry) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y$d */
    public static final class d extends AbstractC4710l<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5757y<K, V> f19540a;

        /* JADX INFO: renamed from: y$d$a */
        public static final class a implements Iterator<V>, InterfaceC1089Qt {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f19541a;

            /* JADX WARN: Invalid debug info offset */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public V next() {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.Iterator
            public void remove() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public d(AbstractC5757y<K, ? extends V> abstractC5757y) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4710l
        /* JADX INFO: renamed from: b */
        public int mo1574b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4710l, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4710l, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<V> iterator() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m29716b(AbstractC5757y abstractC5757y, Map.Entry entry) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final boolean m29717c(@Nullable Map.Entry<?, ?> entry) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract Set m29718d();

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: f */
    public Set<K> m29719f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public int m29720g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: h */
    public Collection<V> m29721h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final Map.Entry<K, V> m29722i(K k) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final String m29723j(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final String m29724k(Map.Entry<? extends K, ? extends V> entry) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public V put(K k, V v) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public V remove(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return null;
    }
}
