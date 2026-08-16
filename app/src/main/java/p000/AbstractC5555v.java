package p000;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5555v<T> implements Iterator<T>, InterfaceC1089Qt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public EnumC4416gT f19052a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public T f19053b;

    /* JADX INFO: renamed from: v$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19054a;

        static {
            int[] iArr = new int[EnumC4416gT.values().length];
            iArr[EnumC4416gT.Done.ordinal()] = 1;
            iArr[EnumC4416gT.Ready.ordinal()] = 2;
            f19054a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1111b();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m28739c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m28740d(T t) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final boolean m28741f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public T next() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public void remove() {
    }
}
