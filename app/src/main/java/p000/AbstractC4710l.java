package p000;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC4710l<E> implements Collection<E>, InterfaceC1089Qt {

    /* JADX INFO: renamed from: l$a */
    public static final class a extends AbstractC0123Bu implements InterfaceC4958om<E, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC4710l<E> f14981a;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractC4710l<? extends E> abstractC4710l) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final CharSequence m21888a(E e) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean add(E e) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1574b();

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.List
    public boolean contains(E e) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public abstract Iterator<E> iterator();

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }
}
