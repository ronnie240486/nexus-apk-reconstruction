package info.guardianproject.netcipher.proxy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class SetFromMap<E> extends AbstractSet<E> implements Serializable {
    private static final long serialVersionUID = 2454657854757543876L;
    private transient Set<E> backingSet;

    /* JADX INFO: renamed from: m */
    private final Map<E, Boolean> f14586m;

    /* JADX WARN: Invalid debug info offset */
    public SetFromMap(Map<E, Boolean> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return false;
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
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection
    public String toString() {
        return null;
    }
}
