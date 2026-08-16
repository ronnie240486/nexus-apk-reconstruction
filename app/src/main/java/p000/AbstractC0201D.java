package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: D */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC0201D<E> extends AbstractList<E> implements List<E>, InterfaceC1343Ut {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    /* JADX INFO: renamed from: b */
    public abstract int mo1193b();

    /* JADX INFO: renamed from: c */
    public abstract E mo1194c(int i);

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return 0;
    }
}
