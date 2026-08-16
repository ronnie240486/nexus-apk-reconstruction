package p000;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5592vS {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vS$a */
    @InterfaceC5799yd(m29860c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m29861f = "SlidingWindow.kt", m29862i = {0, 0, 0, 2, 2, 3, 3}, m29863l = {34, 40, 49, CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA}, m29864m = "invokeSuspend", m29865n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m29866s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class a<T> extends AbstractC5301rO implements InterfaceC5396sm<AbstractC1571YP<? super List<? extends T>>, InterfaceC4813mc<? super C1003PY>, Object> {

        /* JADX INFO: renamed from: c */
        public Object f19141c;

        /* JADX INFO: renamed from: d */
        public Object f19142d;

        /* JADX INFO: renamed from: e */
        public int f19143e;

        /* JADX INFO: renamed from: f */
        public int f19144f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f19145g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f19146h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f19147i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Iterator<T> f19148j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ boolean f19149k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ boolean f19150l;

        /* JADX WARN: Invalid debug info offset */
        public a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, InterfaceC4813mc<? super a> interfaceC4813mc) {
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
        public final Object m28829x(@NotNull AbstractC1571YP<? super List<? extends T>> abstractC1571YP, @Nullable InterfaceC4813mc<? super C1003PY> interfaceC4813mc) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vS$b */
    public static final class b<T> implements InterfaceC1445WP<List<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1445WP f19151a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19152b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f19153c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f19154d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f19155e;

        /* JADX WARN: Invalid debug info offset */
        public b(InterfaceC1445WP interfaceC1445WP, int i, int i2, boolean z, boolean z2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1445WP
        @NotNull
        public Iterator<List<? extends T>> iterator() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m28826a(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Iterator<List<T>> m28827b(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC1445WP<List<T>> m28828c(@NotNull InterfaceC1445WP<? extends T> interfaceC1445WP, int i, int i2, boolean z, boolean z2) {
        return null;
    }
}
