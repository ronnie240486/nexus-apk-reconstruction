package p000;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Y9 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.1")
public interface InterfaceC1555Y9<T extends Comparable<? super T>> extends InterfaceC1623Z9<T> {

    /* JADX INFO: renamed from: Y9$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static <T extends Comparable<? super T>> boolean m8060a(@NotNull InterfaceC1555Y9<T> interfaceC1555Y9, @NotNull T t) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static <T extends Comparable<? super T>> boolean m8061b(@NotNull InterfaceC1555Y9<T> interfaceC1555Y9) {
            return false;
        }
    }

    @Override // p000.InterfaceC1623Z9
    /* JADX INFO: renamed from: b */
    boolean mo4019b(@NotNull T t);

    /* JADX INFO: renamed from: c */
    boolean mo6725c(@NotNull T t, @NotNull T t2);

    @Override // p000.InterfaceC1623Z9
    boolean isEmpty();
}
