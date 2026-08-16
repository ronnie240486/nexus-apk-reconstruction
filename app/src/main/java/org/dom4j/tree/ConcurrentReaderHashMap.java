package org.dom4j.tree;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class ConcurrentReaderHashMap extends AbstractMap implements Map, Cloneable, Serializable {

    /* JADX INFO: renamed from: j */
    public static int f16836j = 32;

    /* JADX INFO: renamed from: k */
    public static final int f16837k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f16838l = 1073741824;

    /* JADX INFO: renamed from: m */
    public static final float f16839m = 0.75f;

    /* JADX INFO: renamed from: a */
    public final BarrierLock f16840a;

    /* JADX INFO: renamed from: b */
    public transient Object f16841b;

    /* JADX INFO: renamed from: c */
    public transient Entry[] f16842c;

    /* JADX INFO: renamed from: d */
    public transient int f16843d;

    /* JADX INFO: renamed from: e */
    public int f16844e;

    /* JADX INFO: renamed from: f */
    public float f16845f;

    /* JADX INFO: renamed from: g */
    public transient Set f16846g;

    /* JADX INFO: renamed from: h */
    public transient Set f16847h;

    /* JADX INFO: renamed from: i */
    public transient Collection f16848i;

    public static class BarrierLock implements Serializable {
    }

    public static class Entry implements Map.Entry {

        /* JADX INFO: renamed from: a */
        public final int f16849a;

        /* JADX INFO: renamed from: b */
        public final Object f16850b;

        /* JADX INFO: renamed from: c */
        public final Entry f16851c;

        /* JADX INFO: renamed from: d */
        public volatile Object f16852d;

        /* JADX WARN: Invalid debug info offset */
        public Entry(int i, Object obj, Object obj2, Entry entry) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Map.Entry
        public Object getKey() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Map.Entry
        public Object getValue() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Map.Entry
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    public class EntrySet extends AbstractSet {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConcurrentReaderHashMap f16853a;

        /* JADX WARN: Invalid debug info offset */
        public EntrySet(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ EntrySet(ConcurrentReaderHashMap concurrentReaderHashMap, C50631 c50631) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 0;
        }
    }

    public class HashIterator implements Iterator, Enumeration {

        /* JADX INFO: renamed from: a */
        public final Entry[] f16854a;

        /* JADX INFO: renamed from: b */
        public int f16855b;

        /* JADX INFO: renamed from: c */
        public Entry f16856c;

        /* JADX INFO: renamed from: d */
        public Object f16857d;

        /* JADX INFO: renamed from: e */
        public Object f16858e;

        /* JADX INFO: renamed from: f */
        public Entry f16859f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ConcurrentReaderHashMap f16860g;

        /* JADX WARN: Invalid debug info offset */
        public HashIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Object mo24741a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public Object nextElement() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public class KeyIterator extends HashIterator {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ConcurrentReaderHashMap f16861h;

        /* JADX WARN: Invalid debug info offset */
        public KeyIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.dom4j.tree.ConcurrentReaderHashMap.HashIterator
        /* JADX INFO: renamed from: a */
        public Object mo24741a() {
            return null;
        }
    }

    public class KeySet extends AbstractSet {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConcurrentReaderHashMap f16862a;

        /* JADX WARN: Invalid debug info offset */
        public KeySet(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ KeySet(ConcurrentReaderHashMap concurrentReaderHashMap, C50631 c50631) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 0;
        }
    }

    public class ValueIterator extends HashIterator {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ConcurrentReaderHashMap f16863h;

        /* JADX WARN: Invalid debug info offset */
        public ValueIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.dom4j.tree.ConcurrentReaderHashMap.HashIterator
        /* JADX INFO: renamed from: a */
        public Object mo24741a() {
            return null;
        }
    }

    public class Values extends AbstractCollection {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConcurrentReaderHashMap f16864a;

        /* JADX WARN: Invalid debug info offset */
        public Values(ConcurrentReaderHashMap concurrentReaderHashMap) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Values(ConcurrentReaderHashMap concurrentReaderHashMap, C50631 c50631) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ConcurrentReaderHashMap() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ConcurrentReaderHashMap(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ConcurrentReaderHashMap(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ConcurrentReaderHashMap(Map map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static int m24725i(Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public synchronized int m24726b() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m24727c(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        /*
            r5 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.clear():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0036
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // java.util.AbstractMap
    public synchronized java.lang.Object clone() {
        /*
            r11 = this;
            r0 = 0
            return r0
        L2d:
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.clone():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Enumeration m24728d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public boolean m24729f(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public synchronized boolean m24730g(Map.Entry entry) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0037
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public final org.dom4j.tree.ConcurrentReaderHashMap.Entry[] m24731h() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.m24731h():org.dom4j.tree.ConcurrentReaderHashMap$Entry[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public synchronized boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public Enumeration m24732l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public float m24733m() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final int m24734n(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public final synchronized void m24735o(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
        /*
            r4 = this;
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.m24735o(java.io.ObjectInputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0023
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public synchronized void putAll(java.util.Map r3) {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.putAll(java.util.Map):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public final void m24736q(java.lang.Object r2) {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.m24736q(java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m24737r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public Object m24738s(Object obj, Object obj2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public synchronized int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public Object m24739t(Object obj, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    public final synchronized void m24740u(java.io.ObjectOutputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            return
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.m24740u(java.io.ObjectOutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        return null;
    }
}
