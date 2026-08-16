package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC5626w<E> extends AbstractC4710l<E> implements List<E>, InterfaceC1089Qt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final a f19235a = new a(null);

    /* JADX INFO: renamed from: w$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        public a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final void m29203a(int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m29204b(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final void m29205c(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final void m29206d(int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final boolean m29207e(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final int m29208f(@NotNull Collection<?> collection) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: w$b */
    public class b implements Iterator<E>, InterfaceC1089Qt {

        /* JADX INFO: renamed from: a */
        public int f19236a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC5626w<E> f19237b;

        /* JADX WARN: Invalid debug info offset */
        public b(AbstractC5626w abstractC5626w) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final int m29209b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final void m29210c(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public E next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: renamed from: w$c */
    public class c extends AbstractC5626w<E>.b implements ListIterator<E>, InterfaceC1089Qt {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC5626w<E> f19238c;

        /* JADX WARN: Invalid debug info offset */
        public c(AbstractC5626w abstractC5626w, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public void add(E e) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return false;
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
        @Override // java.util.ListIterator
        public void set(E e) {
        }
    }

    /* JADX INFO: renamed from: w$d */
    public static final class d<E> extends AbstractC5626w<E> implements RandomAccess {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final AbstractC5626w<E> f19239b;

        /* JADX INFO: renamed from: c */
        public final int f19240c;

        /* JADX INFO: renamed from: d */
        public int f19241d;

        /* JADX WARN: Invalid debug info offset */
        public d(@NotNull AbstractC5626w<? extends E> abstractC5626w, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5626w, p000.AbstractC4710l
        /* JADX INFO: renamed from: b */
        public int mo1574b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5626w, java.util.List
        public E get(int i) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public void add(int i, E e) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override // p000.AbstractC4710l
    /* JADX INFO: renamed from: b */
    public abstract int mo1574b();

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    public abstract E get(int i);

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int indexOf(E e) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC4710l, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int lastIndexOf(E e) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public E remove(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public E set(int i, E e) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return null;
    }
}
