package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mv */
/* JADX INFO: loaded from: classes2.dex */
public final class C4839mv<E> extends AbstractC0201D<E> implements List<E>, RandomAccess, Serializable, InterfaceC1343Ut {

    /* JADX INFO: renamed from: a */
    @NotNull
    public E[] f15215a;

    /* JADX INFO: renamed from: b */
    public int f15216b;

    /* JADX INFO: renamed from: c */
    public int f15217c;

    /* JADX INFO: renamed from: d */
    public boolean f15218d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C4839mv<E> f15219e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C4839mv<E> f15220f;

    /* JADX INFO: renamed from: mv$a */
    public static final class a<E> implements ListIterator<E>, InterfaceC1411Vt {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C4839mv<E> f15221a;

        /* JADX INFO: renamed from: b */
        public int f15222b;

        /* JADX INFO: renamed from: c */
        public int f15223c;

        /* JADX WARN: Invalid debug info offset */
        public a(@NotNull C4839mv<E> c4839mv, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public void add(E e) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public int nextIndex() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public E previous() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public int previousIndex() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public void set(E e) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4839mv() {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4839mv(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4839mv(E[] eArr, int i, int i2, boolean z, C4839mv<E> c4839mv, C4839mv<E> c4839mv2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Object[] m22226d(C4839mv c4839mv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int m22227f(C4839mv c4839mv) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int m22228g(C4839mv c4839mv) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    private final void m22229m(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC0201D, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC0201D
    /* JADX INFO: renamed from: b */
    public int mo1193b() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC0201D
    /* JADX INFO: renamed from: c */
    public E mo1194c(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m22230h(int i, Collection<? extends E> collection, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m22231i(int i, E e) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<E> m22232j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m22233k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final boolean m22234l(List<?> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m22235n(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m22236o(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final boolean m22237p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final E m22238q(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m22239r(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final int m22240s(int i, int i2, Collection<? extends E> collection, boolean z) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC0201D, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final Object m22241t() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return null;
    }
}
