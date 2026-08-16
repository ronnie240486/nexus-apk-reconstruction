package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: va */
/* JADX INFO: loaded from: classes.dex */
public class C5600va extends C5447ta {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: va$a */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC1445WP<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f19169a;

        /* JADX WARN: Invalid debug info offset */
        public a(Iterable iterable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1445WP
        @NotNull
        public Iterator<T> iterator() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: va$b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class b<T> extends AbstractC0123Bu implements InterfaceC4958om<Integer, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19170a;

        /* JADX WARN: Invalid debug info offset */
        public b(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final T m29100a(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: va$c */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class c<K, T> implements InterfaceC2997bo<T, K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable<T> f19171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4958om<T, K> f19172b;

        /* JADX WARN: Invalid debug info offset */
        public c(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC2997bo
        /* JADX INFO: renamed from: a */
        public K mo14682a(T t) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC2997bo
        @NotNull
        /* JADX INFO: renamed from: b */
        public Iterator<T> mo14683b() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: va$d */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class d<T> extends AbstractC0123Bu implements InterfaceC4245dm<Iterator<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable<T> f19173a;

        /* JADX WARN: Invalid debug info offset */
        public d(Iterable<? extends T> iterable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Iterator<T> m29101a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4245dm
        public Object invoke() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: A1 */
    public static final <T> List<List<T>> m28848A1(@NotNull Iterable<? extends T> iterable, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A2 */
    public static final <T, R> R m28849A2(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5396sm<? super R, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: A3 */
    public static final <T> Float m28850A3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Float> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: A4 */
    public static final <S, T extends S> S m28851A4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5459tm<? super Integer, ? super S, ? super T, ? extends S> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: A5 */
    public static final char[] m28852A5(@NotNull Collection<Character> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: B1 */
    public static final <T, R> List<R> m28853B1(@NotNull Iterable<? extends T> iterable, int i, @NotNull InterfaceC4958om<? super List<? extends T>, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B2 */
    public static final <T, R> R m28854B2(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5459tm<? super Integer, ? super R, ? super T, ? extends R> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: B3 */
    public static final <T, R> R m28855B3(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: B4 */
    public static final <S, T extends S> S m28856B4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super S, ? super T, ? extends S> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: B5 */
    public static final <T, C extends Collection<? super T>> C m28857B5(@NotNull Iterable<? extends T> iterable, @NotNull C c2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: C1 */
    public static final <T> T m28858C1(List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C2 */
    public static final <T, R> R m28859C2(@NotNull List<? extends T> list, R r, @NotNull InterfaceC5396sm<? super T, ? super R, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: C3 */
    public static final <T, R> R m28860C3(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C4 */
    public static final <S, T extends S> S m28861C4(@NotNull List<? extends T> list, @NotNull InterfaceC5396sm<? super T, ? super S, ? extends S> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: C5 */
    public static final double[] m28862C5(@NotNull Collection<Double> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: D1 */
    public static final <T> T m28863D1(List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D2 */
    public static final <T, R> R m28864D2(@NotNull List<? extends T> list, R r, @NotNull InterfaceC5459tm<? super Integer, ? super T, ? super R, ? extends R> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: D3 */
    public static final <T extends Comparable<? super T>> T m28865D3(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D4 */
    public static final <S, T extends S> S m28866D4(@NotNull List<? extends T> list, @NotNull InterfaceC5459tm<? super Integer, ? super T, ? super S, ? extends S> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: D5 */
    public static final float[] m28867D5(@NotNull Collection<Float> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: E1 */
    public static final <T> T m28868E1(List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0633Jo
    /* JADX INFO: renamed from: E2 */
    public static final <T> void m28869E2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, C1003PY> interfaceC4958om) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: E3 */
    public static final Double m28870E3(@NotNull Iterable<Double> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: E4 */
    public static final <S, T extends S> S m28871E4(@NotNull List<? extends T> list, @NotNull InterfaceC5459tm<? super Integer, ? super T, ? super S, ? extends S> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: E5 */
    public static final <T> HashSet<T> m28872E5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: F1 */
    public static final <T> T m28873F1(List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F2 */
    public static final <T> void m28874F2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super Integer, ? super T, C1003PY> interfaceC5396sm) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: F3 */
    public static final Float m28875F3(@NotNull Iterable<Float> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: F4 */
    public static final <S, T extends S> S m28876F4(@NotNull List<? extends T> list, @NotNull InterfaceC5396sm<? super T, ? super S, ? extends S> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: F5 */
    public static final int[] m28877F5(@NotNull Collection<Integer> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: G1 */
    public static final <T> T m28878G1(List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: G2 */
    public static final <T> T m28879G2(List<? extends T> list, int i, InterfaceC4958om<? super Integer, ? extends T> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: G3 */
    public static final /* synthetic */ Object m28880G3(Iterable iterable, Comparator comparator) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: G4 */
    public static final <T> Iterable<T> m28881G4(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: G5 */
    public static <T> List<T> m28882G5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public static final <T> boolean m28883H1(@NotNull Iterable<? extends T> iterable, T t) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: H2 */
    public static final <T> T m28884H2(@NotNull List<? extends T> list, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: H3 */
    public static final <T> T m28885H3(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: H4 */
    public static final <T> List<T> m28886H4(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: H5 */
    public static final long[] m28887H5(@NotNull Collection<Long> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public static final <T> int m28888I1(@NotNull Iterable<? extends T> iterable) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: I2 */
    public static final <T, K> Map<K, List<T>> m28889I2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use minOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: I3 */
    public static final /* synthetic */ Comparable m28890I3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: I4 */
    public static <T> List<T> m28891I4(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: I5 */
    public static final <T> List<T> m28892I5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public static final <T> int m28893J1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: J2 */
    public static final <T, K, V> Map<K, List<V>> m28894J2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om, @NotNull InterfaceC4958om<? super T, ? extends V> interfaceC4958om2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use minOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: J3 */
    public static final /* synthetic */ Double m28895J3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: J4 */
    public static final <T, R> List<R> m28896J4(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5396sm<? super R, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: J5 */
    public static <T> List<T> m28897J5(@NotNull Collection<? extends T> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: K1 */
    public static final <T> int m28898K1(Collection<? extends T> collection) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: K2 */
    public static final <T, K, M extends Map<? super K, List<T>>> M m28899K2(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use minOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: K3 */
    public static final /* synthetic */ Float m28900K3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: K4 */
    public static final <T, R> List<R> m28901K4(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5459tm<? super Integer, ? super R, ? super T, ? extends R> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: K5 */
    public static final <T> Set<T> m28902K5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: L1 */
    public static final <T> List<T> m28903L1(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: L2 */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M m28904L2(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om, @NotNull InterfaceC4958om<? super T, ? extends V> interfaceC4958om2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use minByOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: L3 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m28905L3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: L4 */
    public static final <S, T extends S> List<S> m28906L4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super S, ? super T, ? extends S> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: L5 */
    public static final <T> Set<T> m28907L5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: M1 */
    public static final <T, K> List<T> m28908M1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.1")
    @NotNull
    /* JADX INFO: renamed from: M2 */
    public static final <T, K> InterfaceC2997bo<T, K> m28909M2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: M3 */
    public static final <T, R extends Comparable<? super R>> T m28910M3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: M4 */
    public static final <S, T extends S> List<S> m28911M4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5459tm<? super Integer, ? super S, ? super T, ? extends S> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: M5 */
    public static final short[] m28912M5(@NotNull Collection<Short> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: N1 */
    public static <T> List<T> m28913N1(@NotNull Iterable<? extends T> iterable, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N2 */
    public static final <T> int m28914N2(@NotNull Iterable<? extends T> iterable, T t) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: N3 */
    public static final <T> double m28915N3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: N4 */
    public static final <T, R> List<R> m28916N4(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5396sm<? super R, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: N5 */
    public static final <T> Set<T> m28917N5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: O1 */
    public static final <T> List<T> m28918O1(@NotNull List<? extends T> list, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O2 */
    public static final <T> int m28919O2(@NotNull List<? extends T> list, T t) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: O3 */
    public static final <T> float m28920O3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Float> interfaceC4958om) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: O4 */
    public static final <T, R> List<R> m28921O4(@NotNull Iterable<? extends T> iterable, R r, @NotNull InterfaceC5459tm<? super Integer, ? super R, ? super T, ? extends R> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: O5 */
    public static final <T> List<List<T>> m28922O5(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: P1 */
    public static final <T> List<T> m28923P1(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P2 */
    public static final <T> int m28924P2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: P3 */
    public static final <T, R extends Comparable<? super R>> R m28925P3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    /* JADX INFO: renamed from: P4 */
    public static final <T> void m28926P4(@NotNull List<T> list, @NotNull AbstractC5299rM abstractC5299rM) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: P5 */
    public static final <T, R> List<R> m28927P5(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z, @NotNull InterfaceC4958om<? super List<? extends T>, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: Q1 */
    public static final <T> List<T> m28928Q1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q2 */
    public static final <T> int m28929Q2(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: Q3 */
    public static final <T, R extends Comparable<? super R>> R m28930Q3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q4 */
    public static <T> T m28931Q4(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q5 */
    public static /* synthetic */ List m28932Q5(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public static final <T> T m28933R1(@NotNull Iterable<? extends T> iterable, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R2 */
    public static final <T> int m28934R2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: R3 */
    public static final <T> Double m28935R3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R4 */
    public static final <T> T m28936R4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R5 */
    public static /* synthetic */ List m28937R5(Iterable iterable, int i, int i2, boolean z, InterfaceC4958om interfaceC4958om, int i3, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: S1 */
    public static final <T> T m28938S1(List<? extends T> list, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S2 */
    public static final <T> int m28939S2(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: S3 */
    public static final <T> Float m28940S3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Float> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S4 */
    public static final <T> T m28941S4(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: S5 */
    public static final <T> Iterable<C1599Yr<T>> m28942S5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public static final <T> T m28943T1(@NotNull Iterable<? extends T> iterable, int i, @NotNull InterfaceC4958om<? super Integer, ? extends T> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: T2 */
    public static final <T> Set<T> m28944T2(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: T3 */
    public static final <T, R> R m28945T3(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: T4 */
    public static final <T> T m28946T4(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: T5 */
    public static <T, R> List<C5295rI<T, R>> m28947T5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: U1 */
    public static final <T> T m28948U1(List<? extends T> list, int i, InterfaceC4958om<? super Integer, ? extends T> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: U2 */
    public static final <T, A extends Appendable> A m28949U2(@NotNull Iterable<? extends T> iterable, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable InterfaceC4958om<? super T, ? extends CharSequence> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: U3 */
    public static final <T, R> R m28950U3(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: U4 */
    public static final <T> T m28951U4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: U5 */
    public static final <T, R, V> List<V> m28952U5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2, @NotNull InterfaceC5396sm<? super T, ? super R, ? extends V> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: V1 */
    public static final <T> T m28953V1(@NotNull Iterable<? extends T> iterable, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ Appendable m28954V2(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC4958om interfaceC4958om, int i2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: V3 */
    public static <T extends Comparable<? super T>> T m28955V3(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: V4 */
    public static <T> T m28956V4(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: V5 */
    public static final <T, R> List<C5295rI<T, R>> m28957V5(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: W1 */
    public static final <T> T m28958W1(List<? extends T> list, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: W2 */
    public static final <T> String m28959W2(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable InterfaceC4958om<? super T, ? extends CharSequence> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: W3 */
    public static final Double m28960W3(@NotNull Iterable<Double> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: W4 */
    public static final <T> List<T> m28961W4(@NotNull List<? extends T> list, @NotNull C5618vs c5618vs) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: W5 */
    public static final <T, R, V> List<V> m28962W5(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr, @NotNull InterfaceC5396sm<? super T, ? super R, ? extends V> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: X1 */
    public static final <T> List<T> m28963X1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ String m28964X2(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC4958om interfaceC4958om, int i2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: X3 */
    public static final Float m28965X3(@NotNull Iterable<Float> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: X4 */
    public static final <T> List<T> m28966X4(@NotNull List<? extends T> list, @NotNull Iterable<Integer> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: X5 */
    public static final <T> List<C5295rI<T, T>> m28967X5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public static final <T> List<T> m28968Y1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super Integer, ? super T, Boolean> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y2 */
    public static final <T> T m28969Y2(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: Y3 */
    public static final /* synthetic */ Object m28970Y3(Iterable iterable, Comparator comparator) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y4 */
    public static final <T, R extends Comparable<? super R>> void m28971Y4(@NotNull List<T> list, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.2")
    @NotNull
    /* JADX INFO: renamed from: Y5 */
    public static final <T, R> List<R> m28972Y5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super T, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public static final <T, C extends Collection<? super T>> C m28973Z1(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC5396sm<? super Integer, ? super T, Boolean> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z2 */
    public static final <T> T m28974Z2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public static final <T> T m28975Z3(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z4 */
    public static final <T, R extends Comparable<? super R>> void m28976Z4(@NotNull List<T> list, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public static final <R> List<R> m28977a2(Iterable<?> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a3 */
    public static <T> T m28978a3(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: a4 */
    public static final <T> List<T> m28979a4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a5 */
    public static final <T extends Comparable<? super T>> void m28980a5(@NotNull List<T> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b2 */
    public static final <R, C extends Collection<? super R>> C m28981b2(Iterable<?> iterable, C c2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b3 */
    public static final <T> T m28982b3(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b4 */
    public static final <T> List<T> m28983b4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b5 */
    public static final <T extends Comparable<? super T>> List<T> m28984b5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c2 */
    public static final <T> List<T> m28985c2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c3 */
    public static final <T> int m28986c3(@NotNull Iterable<? extends T> iterable, T t) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public static final <T> List<T> m28987c4(@NotNull Iterable<? extends T> iterable, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c5 */
    public static final <T, R extends Comparable<? super R>> List<T> m28988c5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: d2 */
    public static final <T> List<T> m28989d2(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d3 */
    public static final <T> int m28990d3(@NotNull List<? extends T> list, T t) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: d4 */
    public static final <T> List<T> m28991d4(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: d5 */
    public static final <T, R extends Comparable<? super R>> List<T> m28992d5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: e2 */
    public static final <C extends Collection<? super T>, T> C m28993e2(@NotNull Iterable<? extends T> iterable, @NotNull C c2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: e3 */
    public static final <T> T m28994e3(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: e4 */
    public static final <T> List<T> m28995e4(Iterable<? extends T> iterable, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: e5 */
    public static final <T extends Comparable<? super T>> List<T> m28996e5(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: f2 */
    public static final <T, C extends Collection<? super T>> C m28997f2(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: f3 */
    public static final <T> T m28998f3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f4 */
    public static final <T> boolean m28999f4(@NotNull Iterable<? extends T> iterable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: f5 */
    public static final <T> List<T> m29000f5(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: g2 */
    public static final <T, C extends Collection<? super T>> C m29001g2(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: g3 */
    public static final <T> T m29002g3(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g4 */
    public static final <T> boolean m29003g4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: g5 */
    public static final <T> Set<T> m29004g5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static final <T> boolean m29005h1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: h2 */
    public static final <T> T m29006h2(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: h3 */
    public static final <T> T m29007h3(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.1")
    @NotNull
    /* JADX INFO: renamed from: h4 */
    public static final <T, C extends Iterable<? extends T>> C m29008h4(@NotNull C c2, @NotNull InterfaceC4958om<? super T, C1003PY> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(warningSince = "1.5")
    @InterfaceC0879Ne(message = "Use sumOf instead.", replaceWith = @InterfaceC5783yN(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: h5 */
    public static final <T> int m29009h5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Integer> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static final <T> boolean m29010i1(@NotNull Iterable<? extends T> iterable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: i2 */
    public static final <T> T m29011i2(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: i3 */
    public static final <T, R> List<R> m29012i3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: i4 */
    public static final <T, C extends Iterable<? extends T>> C m29013i4(@NotNull C c2, @NotNull InterfaceC5396sm<? super Integer, ? super T, C1003PY> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(warningSince = "1.5")
    @InterfaceC0879Ne(message = "Use sumOf instead.", replaceWith = @InterfaceC5783yN(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: i5 */
    public static final <T> double m29014i5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static final <T> boolean m29015j1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: j2 */
    public static final <T> T m29016j2(List<? extends T> list, InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: j3 */
    public static final <T, R> List<R> m29017j3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super Integer, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: j4 */
    public static final <T> C5295rI<List<T>, List<T>> m29018j4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfByte")
    /* JADX INFO: renamed from: j5 */
    public static final int m29019j5(@NotNull Iterable<Byte> iterable) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: k1 */
    public static final <T> Iterable<T> m29020k1(Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public static <T> T m29021k2(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: k3 */
    public static final <T, R> List<R> m29022k3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super Integer, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: k4 */
    public static final <T> List<T> m29023k4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfDouble")
    /* JADX INFO: renamed from: k5 */
    public static final double m29024k5(@NotNull Iterable<Double> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: l1 */
    public static <T> InterfaceC1445WP<T> m29025l1(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l2 */
    public static final <T> T m29026l2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public static final <T, R, C extends Collection<? super R>> C m29027l3(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC5396sm<? super Integer, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: l4 */
    public static final <T> List<T> m29028l4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "sumOfDouble")
    /* JADX INFO: renamed from: l5 */
    public static final <T> double m29029l5(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: m1 */
    public static final <T, K, V> Map<K, V> m29030m1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends C5295rI<? extends K, ? extends V>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m2 */
    public static <T> T m29031m2(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: m3 */
    public static final <T, R, C extends Collection<? super R>> C m29032m3(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC5396sm<? super Integer, ? super T, ? extends R> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: m4 */
    public static final <T> List<T> m29033m4(@NotNull Iterable<? extends T> iterable, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfFloat")
    /* JADX INFO: renamed from: m5 */
    public static final float m29034m5(@NotNull Iterable<Float> iterable) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: n1 */
    public static final <T, K> Map<K, T> m29035n1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.5")
    /* JADX INFO: renamed from: n2 */
    public static final <T, R> R m29036n2(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: n3 */
    public static final <T, R> List<R> m29037n3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: n4 */
    public static final <T> List<T> m29038n4(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfInt")
    /* JADX INFO: renamed from: n5 */
    public static final int m29039n5(@NotNull Iterable<Integer> iterable) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: o1 */
    public static final <T, K, V> Map<K, V> m29040o1(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om, @NotNull InterfaceC4958om<? super T, ? extends V> interfaceC4958om2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.5")
    /* JADX INFO: renamed from: o2 */
    public static final <T, R> R m29041o2(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public static final <T, R, C extends Collection<? super R>> C m29042o3(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: o4 */
    public static final <T> List<T> m29043o4(@NotNull Collection<? extends T> collection, @NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "sumOfInt")
    /* JADX INFO: renamed from: o5 */
    public static final <T> int m29044o5(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Integer> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: p1 */
    public static final <T, K, M extends Map<? super K, ? super T>> M m29045p1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: p2 */
    public static <T> T m29046p2(@NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: p3 */
    public static final <T, R, C extends Collection<? super R>> C m29047p3(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: p4 */
    public static <T> List<T> m29048p4(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfLong")
    /* JADX INFO: renamed from: p5 */
    public static final long m29049p5(@NotNull Iterable<Long> iterable) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: q1 */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m29050q1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super T, ? extends K> interfaceC4958om, @NotNull InterfaceC4958om<? super T, ? extends V> interfaceC4958om2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: q2 */
    public static final <T> T m29051q2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use maxOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: q3 */
    public static final /* synthetic */ Comparable m29052q3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: q4 */
    public static final <T> List<T> m29053q4(@NotNull Collection<? extends T> collection, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "sumOfLong")
    /* JADX INFO: renamed from: q5 */
    public static final <T> long m29054q5(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Long> interfaceC4958om) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: r1 */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m29055r1(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super T, ? extends C5295rI<? extends K, ? extends V>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: r2 */
    public static <T> T m29056r2(@NotNull List<? extends T> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use maxOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: r3 */
    public static final /* synthetic */ Double m29057r3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: r4 */
    public static final <T> List<T> m29058r4(@NotNull Collection<? extends T> collection, @NotNull T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "sumOfShort")
    /* JADX INFO: renamed from: r5 */
    public static final int m29059r5(@NotNull Iterable<Short> iterable) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    @NotNull
    /* JADX INFO: renamed from: s1 */
    public static final <K, V> Map<K, V> m29060s1(@NotNull Iterable<? extends K> iterable, @NotNull InterfaceC4958om<? super K, ? extends V> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: s2 */
    public static final <T, R> List<R> m29061s2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends Iterable<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use maxOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: s3 */
    public static final /* synthetic */ Float m29062s3(Iterable iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: s4 */
    public static final <T> List<T> m29063s4(Iterable<? extends T> iterable, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC5321ri.class})
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.5")
    @InterfaceC0058At(name = "sumOfUInt")
    /* JADX INFO: renamed from: s5 */
    public static final <T> int m29064s5(Iterable<? extends T> iterable, InterfaceC4958om<? super T, C4484hY> interfaceC4958om) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    @NotNull
    /* JADX INFO: renamed from: t1 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m29065t1(@NotNull Iterable<? extends K> iterable, @NotNull M m, @NotNull InterfaceC4958om<? super K, ? extends V> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "flatMapIndexedIterable")
    /* JADX INFO: renamed from: t2 */
    public static final <T, R> List<R> m29066t2(Iterable<? extends T> iterable, InterfaceC5396sm<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC0879Ne(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC5783yN(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: t3 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m29067t3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: t4 */
    public static final <T> List<T> m29068t4(Collection<? extends T> collection, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC5321ri.class})
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.5")
    @InterfaceC0058At(name = "sumOfULong")
    /* JADX INFO: renamed from: t5 */
    public static final <T> long m29069t5(Iterable<? extends T> iterable, InterfaceC4958om<? super T, C5185pY> interfaceC4958om) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfByte")
    /* JADX INFO: renamed from: u1 */
    public static final double m29070u1(@NotNull Iterable<Byte> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "flatMapIndexedIterableTo")
    /* JADX INFO: renamed from: u2 */
    public static final <T, R, C extends Collection<? super R>> C m29071u2(Iterable<? extends T> iterable, C c2, InterfaceC5396sm<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: u3 */
    public static final <T, R extends Comparable<? super R>> T m29072u3(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.3")
    /* JADX INFO: renamed from: u4 */
    public static final <T> T m29073u4(Collection<? extends T> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: u5 */
    public static final <T> List<T> m29074u5(@NotNull Iterable<? extends T> iterable, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfDouble")
    /* JADX INFO: renamed from: v1 */
    public static final double m29075v1(@NotNull Iterable<Double> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "flatMapIndexedSequence")
    /* JADX INFO: renamed from: v2 */
    public static final <T, R> List<R> m29076v2(Iterable<? extends T> iterable, InterfaceC5396sm<? super Integer, ? super T, ? extends InterfaceC1445WP<? extends R>> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: v3 */
    public static final <T> double m29077v3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    /* JADX INFO: renamed from: v4 */
    public static final <T> T m29078v4(@NotNull Collection<? extends T> collection, @NotNull AbstractC5299rM abstractC5299rM) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: v5 */
    public static final <T> List<T> m29079v5(@NotNull List<? extends T> list, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfFloat")
    /* JADX INFO: renamed from: w1 */
    public static final double m29080w1(@NotNull Iterable<Float> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    @InterfaceC0058At(name = "flatMapIndexedSequenceTo")
    /* JADX INFO: renamed from: w2 */
    public static final <T, R, C extends Collection<? super R>> C m29081w2(Iterable<? extends T> iterable, C c2, InterfaceC5396sm<? super Integer, ? super T, ? extends InterfaceC1445WP<? extends R>> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: w3 */
    public static final <T> float m29082w3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Float> interfaceC4958om) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: w4 */
    public static final <T> T m29083w4(Collection<? extends T> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: w5 */
    public static final <T> List<T> m29084w5(@NotNull List<? extends T> list, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfInt")
    /* JADX INFO: renamed from: x1 */
    public static final double m29085x1(@NotNull Iterable<Integer> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    @InterfaceC0058At(name = "flatMapSequence")
    /* JADX INFO: renamed from: x2 */
    public static final <T, R> List<R> m29086x2(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, ? extends InterfaceC1445WP<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: x3 */
    public static final <T, R extends Comparable<? super R>> R m29087x3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @J30(markerClass = {InterfaceC4954oi.class})
    @InterfaceC4676kS(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public static final <T> T m29088x4(@NotNull Collection<? extends T> collection, @NotNull AbstractC5299rM abstractC5299rM) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: x5 */
    public static final <T> List<T> m29089x5(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC4958om<? super T, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfLong")
    /* JADX INFO: renamed from: y1 */
    public static final double m29090y1(@NotNull Iterable<Long> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    @InterfaceC0058At(name = "flatMapSequenceTo")
    /* JADX INFO: renamed from: y2 */
    public static final <T, R, C extends Collection<? super R>> C m29091y2(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, ? extends InterfaceC1445WP<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: y3 */
    public static final <T, R extends Comparable<? super R>> R m29092y3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, ? extends R> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y4 */
    public static final <S, T extends S> S m29093y4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5396sm<? super S, ? super T, ? extends S> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: y5 */
    public static final boolean[] m29094y5(@NotNull Collection<Boolean> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "averageOfShort")
    /* JADX INFO: renamed from: z1 */
    public static final double m29095z1(@NotNull Iterable<Short> iterable) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: z2 */
    public static final <T, R, C extends Collection<? super R>> C m29096z2(@NotNull Iterable<? extends T> iterable, @NotNull C c2, @NotNull InterfaceC4958om<? super T, ? extends Iterable<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1176SH
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: z3 */
    public static final <T> Double m29097z3(Iterable<? extends T> iterable, InterfaceC4958om<? super T, Double> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z4 */
    public static final <S, T extends S> S m29098z4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5459tm<? super Integer, ? super S, ? super T, ? extends S> interfaceC5459tm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: z5 */
    public static final byte[] m29099z5(@NotNull Collection<Byte> collection) {
        return null;
    }
}
