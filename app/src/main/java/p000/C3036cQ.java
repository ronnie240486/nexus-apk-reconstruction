package p000;

import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cQ */
/* JADX INFO: loaded from: classes2.dex */
public class C3036cQ extends C2973bQ {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$a */
    public static final class a<T> implements InterfaceC1445WP<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4245dm<Iterator<T>> f10347a;

        /* JADX WARN: Invalid debug info offset */
        public a(InterfaceC4245dm<? extends Iterator<? extends T>> interfaceC4245dm) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1445WP
        @NotNull
        public Iterator<T> iterator() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$b */
    public static final class b<T> implements InterfaceC1445WP<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f10348a;

        /* JADX WARN: Invalid debug info offset */
        public b(Iterator it) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1445WP
        @NotNull
        public Iterator<T> iterator() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: cQ$c */
    @InterfaceC5799yd(m29860c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m29861f = "Sequences.kt", m29862i = {0, 0}, m29863l = {332}, m29864m = "invokeSuspend", m29865n = {"$this$sequence", "index"}, m29866s = {"L$0", "I$0"})
    public static final class c<R> extends AbstractC5301rO implements InterfaceC5396sm<AbstractC1571YP<? super R>, InterfaceC4813mc<? super C1003PY>, Object> {

        /* JADX INFO: renamed from: c */
        public Object f10349c;

        /* JADX INFO: renamed from: d */
        public int f10350d;

        /* JADX INFO: renamed from: e */
        public int f10351e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f10352f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC1445WP<T> f10353g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5396sm<Integer, T, C> f10354h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC4958om<C, Iterator<R>> f10355i;

        /* JADX WARN: Invalid debug info offset */
        public c(InterfaceC1445WP<? extends T> interfaceC1445WP, InterfaceC5396sm<? super Integer, ? super T, ? extends C> interfaceC5396sm, InterfaceC4958om<? super C, ? extends Iterator<? extends R>> interfaceC4958om, InterfaceC4813mc<? super c> interfaceC4813mc) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5396sm
        /* JADX INFO: renamed from: G */
        public /* bridge */ /* synthetic */ Object mo679G(Object obj, InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @NotNull
        /* JADX INFO: renamed from: l */
        public final InterfaceC4813mc<C1003PY> mo6813l(@Nullable Object obj, @NotNull InterfaceC4813mc<?> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @Nullable
        /* JADX INFO: renamed from: t */
        public final Object mo3302t(@NotNull Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: x */
        public final Object m16483x(@NotNull AbstractC1571YP<? super R> abstractC1571YP, @Nullable InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$d */
    public static final class d<T> extends AbstractC0123Bu implements InterfaceC4958om<InterfaceC1445WP<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: a */
        public static final d f10356a = new d();

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Iterator<T> m16484a(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$e */
    public static final class e<T> extends AbstractC0123Bu implements InterfaceC4958om<Iterable<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: a */
        public static final e f10357a = new e();

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Iterator<T> m16485a(@NotNull Iterable<? extends T> iterable) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$g */
    public static final class g<T> extends AbstractC0123Bu implements InterfaceC4958om<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4245dm<T> f10359a;

        /* JADX WARN: Invalid debug info offset */
        public g(InterfaceC4245dm<? extends T> interfaceC4245dm) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4958om
        @Nullable
        public final T invoke(@NotNull T t) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$h */
    public static final class h<T> extends AbstractC0123Bu implements InterfaceC4245dm<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ T f10360a;

        /* JADX WARN: Invalid debug info offset */
        public h(T t) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4245dm
        @Nullable
        public final T invoke() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$i */
    @InterfaceC5799yd(m29860c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m29861f = "Sequences.kt", m29862i = {}, m29863l = {69, TsExtractor.TS_SYNC_BYTE}, m29864m = "invokeSuspend", m29865n = {}, m29866s = {})
    public static final class i<T> extends AbstractC5301rO implements InterfaceC5396sm<AbstractC1571YP<? super T>, InterfaceC4813mc<? super C1003PY>, Object> {

        /* JADX INFO: renamed from: c */
        public int f10361c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f10362d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC1445WP<T> f10363e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC4245dm<InterfaceC1445WP<T>> f10364f;

        /* JADX WARN: Invalid debug info offset */
        public i(InterfaceC1445WP<? extends T> interfaceC1445WP, InterfaceC4245dm<? extends InterfaceC1445WP<? extends T>> interfaceC4245dm, InterfaceC4813mc<? super i> interfaceC4813mc) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5396sm
        /* JADX INFO: renamed from: G */
        public /* bridge */ /* synthetic */ Object mo679G(Object obj, InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @NotNull
        /* JADX INFO: renamed from: l */
        public final InterfaceC4813mc<C1003PY> mo6813l(@Nullable Object obj, @NotNull InterfaceC4813mc<?> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @Nullable
        /* JADX INFO: renamed from: t */
        public final Object mo3302t(@NotNull Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: x */
        public final Object m16486x(@NotNull AbstractC1571YP<? super T> abstractC1571YP, @Nullable InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$j */
    @InterfaceC5799yd(m29860c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m29861f = "Sequences.kt", m29862i = {0, 0}, m29863l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA}, m29864m = "invokeSuspend", m29865n = {"$this$sequence", "buffer"}, m29866s = {"L$0", "L$1"})
    public static final class j<T> extends AbstractC5301rO implements InterfaceC5396sm<AbstractC1571YP<? super T>, InterfaceC4813mc<? super C1003PY>, Object> {

        /* JADX INFO: renamed from: c */
        public Object f10365c;

        /* JADX INFO: renamed from: d */
        public int f10366d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f10367e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC1445WP<T> f10368f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AbstractC5299rM f10369g;

        /* JADX WARN: Invalid debug info offset */
        public j(InterfaceC1445WP<? extends T> interfaceC1445WP, AbstractC5299rM abstractC5299rM, InterfaceC4813mc<? super j> interfaceC4813mc) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5396sm
        /* JADX INFO: renamed from: G */
        public /* bridge */ /* synthetic */ Object mo679G(Object obj, InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @NotNull
        /* JADX INFO: renamed from: l */
        public final InterfaceC4813mc<C1003PY> mo6813l(@Nullable Object obj, @NotNull InterfaceC4813mc<?> interfaceC4813mc) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC1488X5
        @Nullable
        /* JADX INFO: renamed from: t */
        public final Object mo3302t(@NotNull Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: x */
        public final Object m16487x(@NotNull AbstractC1571YP<? super T> abstractC1571YP, @Nullable InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: g */
    public static final <T> InterfaceC1445WP<T> m16466g(InterfaceC4245dm<? extends Iterator<? extends T>> interfaceC4245dm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC1445WP<T> m16467h(@NotNull Iterator<? extends T> it) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: i */
    public static <T> InterfaceC1445WP<T> m16468i(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: j */
    public static <T> InterfaceC1445WP<T> m16469j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <T, C, R> InterfaceC1445WP<R> m16470k(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP, @NotNull InterfaceC5396sm<? super Integer, ? super T, ? extends C> interfaceC5396sm, @NotNull InterfaceC4958om<? super C, ? extends Iterator<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final <T> InterfaceC1445WP<T> m16471l(@NotNull InterfaceC1445WP<? extends InterfaceC1445WP<? extends T>> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static final <T, R> InterfaceC1445WP<R> m16472m(InterfaceC1445WP<? extends T> interfaceC1445WP, InterfaceC4958om<? super T, ? extends Iterator<? extends R>> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "flattenSequenceOfIterable")
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC1445WP<T> m16473n(@NotNull InterfaceC1445WP<? extends Iterable<? extends T>> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final <T> InterfaceC1445WP<T> m16474o(@NotNull InterfaceC4245dm<? extends T> interfaceC4245dm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: p */
    public static <T> InterfaceC1445WP<T> m16475p(@NotNull InterfaceC4245dm<? extends T> interfaceC4245dm, @NotNull InterfaceC4958om<? super T, ? extends T> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1282Tw
    @NotNull
    /* JADX INFO: renamed from: q */
    public static <T> InterfaceC1445WP<T> m16476q(@Nullable T t, @NotNull InterfaceC4958om<? super T, ? extends T> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final <T> InterfaceC1445WP<T> m16477r(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP, @NotNull InterfaceC4245dm<? extends InterfaceC1445WP<? extends T>> interfaceC4245dm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    @InterfaceC4676kS(version = "1.3")
    /* JADX INFO: renamed from: s */
    public static final <T> InterfaceC1445WP<T> m16478s(InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final <T> InterfaceC1445WP<T> m16479t(@NotNull T... tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final <T> InterfaceC1445WP<T> m16480u(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.4")
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final <T> InterfaceC1445WP<T> m16481v(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP, @NotNull AbstractC5299rM abstractC5299rM) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final <T, R> C5295rI<List<T>, List<R>> m16482w(@NotNull InterfaceC1445WP<? extends C5295rI<? extends T, ? extends R>> interfaceC1445WP) {
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cQ$f */
    public static final class f<T> extends AbstractC0123Bu implements InterfaceC4958om<T, T> {

        /* JADX INFO: renamed from: a */
        public static final f f10358a = new f();

        @Override // p000.InterfaceC4958om
        public final T invoke(T t) {
            return t;
        }
    }
}
