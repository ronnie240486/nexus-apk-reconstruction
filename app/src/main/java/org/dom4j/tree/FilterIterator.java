package org.dom4j.tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FilterIterator implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f16894a;

    /* JADX INFO: renamed from: b */
    public Object f16895b;

    /* JADX INFO: renamed from: c */
    public boolean f16896c;

    /* JADX WARN: Invalid debug info offset */
    public FilterIterator(Iterator it) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public Object m24747a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo24746b(Object obj);

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public Object next() throws NoSuchElementException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public void remove() {
    }
}
