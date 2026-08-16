package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k, V v) {
        int iSizeOf = sizeOf(k, v);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    @Nullable
    public V create(@NonNull K k) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z, @NonNull K k, @NonNull V v, @Nullable V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    @Nullable
    public final V get(@NonNull K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.map.get(k);
                if (v != null) {
                    this.hitCount++;
                    return v;
                }
                this.missCount++;
                V vCreate = create(k);
                if (vCreate == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.createCount++;
                        vPut = this.map.put(k, vCreate);
                        if (vPut != null) {
                            this.map.put(k, vPut);
                        } else {
                            this.size += safeSizeOf(k, vCreate);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    entryRemoved(false, k, vCreate, vPut);
                    return vPut;
                }
                trimToSize(this.maxSize);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                vPut = this.map.put(k, v);
                if (vPut != null) {
                    this.size -= safeSizeOf(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, k, vPut, v);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    @Nullable
    public final V remove(@NonNull K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                vRemove = this.map.remove(k);
                if (vRemove != null) {
                    this.size -= safeSizeOf(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.hitCount;
            i2 = this.missCount + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public void trimToSize(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i && !this.map.isEmpty()) {
                        Map.Entry<K, V> next = this.map.entrySet().iterator().next();
                        key = next.getKey();
                        value = next.getValue();
                        this.map.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
