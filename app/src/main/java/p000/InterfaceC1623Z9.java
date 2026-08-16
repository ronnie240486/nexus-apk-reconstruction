package p000;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Z9 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1623Z9<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: Z9$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static <T extends Comparable<? super T>> boolean m8641a(@NotNull InterfaceC1623Z9<T> interfaceC1623Z9, @NotNull T t) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static <T extends Comparable<? super T>> boolean m8642b(@NotNull InterfaceC1623Z9<T> interfaceC1623Z9) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    T mo4017F0();

    @NotNull
    /* JADX INFO: renamed from: G0 */
    T mo4018G0();

    /* JADX INFO: renamed from: b */
    boolean mo4019b(@NotNull T t);

    boolean isEmpty();
}
