package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: H */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public abstract class AbstractC0455H<E> extends AbstractC4710l<E> implements Set<E>, InterfaceC1089Qt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final a f1014a = new a(null);

    /* JADX INFO: renamed from: H$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        public a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final boolean m2228a(@NotNull Set<?> set, @NotNull Set<?> set2) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final int m2229b(@NotNull Collection<?> collection) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.AbstractC4710l, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return null;
    }
}
