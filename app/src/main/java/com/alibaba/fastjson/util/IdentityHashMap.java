package com.alibaba.fastjson.util;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class IdentityHashMap<V> {
    private final Entry<V>[] buckets;
    private final int indexMask;

    public static final class Entry<V> {
        public final int hashCode;
        public final Type key;
        public final Entry<V> next;
        public V value;

        /* JADX WARN: Invalid debug info offset */
        public Entry(Type type, V v, int i, Entry<V> entry) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public IdentityHashMap(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Class findClass(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final V get(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean put(Type type, V v) {
        return false;
    }
}
