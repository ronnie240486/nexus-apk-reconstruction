package p000;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yc */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4676kS(version = "1.3")
public interface InterfaceC5798yc {

    /* JADX INFO: renamed from: yc$a */
    public static final class a {

        /* JADX INFO: renamed from: yc$a$a, reason: collision with other inner class name */
        public static final class C5909a extends AbstractC0123Bu implements InterfaceC5396sm<InterfaceC5798yc, b, InterfaceC5798yc> {

            /* JADX INFO: renamed from: a */
            public static final C5909a f19600a = new C5909a();

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC5396sm
            /* JADX INFO: renamed from: G */
            public /* bridge */ /* synthetic */ InterfaceC5798yc mo679G(InterfaceC5798yc interfaceC5798yc, b bVar) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @NotNull
            /* JADX INFO: renamed from: a */
            public final InterfaceC5798yc m29855a(@NotNull InterfaceC5798yc interfaceC5798yc, @NotNull b bVar) {
                return null;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public static InterfaceC5798yc m29854a(@NotNull InterfaceC5798yc interfaceC5798yc, @NotNull InterfaceC5798yc interfaceC5798yc2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: yc$b */
    public interface b extends InterfaceC5798yc {

        /* JADX INFO: renamed from: yc$b$a */
        public static final class a {
            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public static <R> R m29856a(@NotNull b bVar, R r, @NotNull InterfaceC5396sm<? super R, ? super b, ? extends R> interfaceC5396sm) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Nullable
            /* JADX INFO: renamed from: b */
            public static <E extends b> E m29857b(@NotNull b bVar, @NotNull c<E> cVar) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @NotNull
            /* JADX INFO: renamed from: c */
            public static InterfaceC5798yc m29858c(@NotNull b bVar, @NotNull c<?> cVar) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @NotNull
            /* JADX INFO: renamed from: d */
            public static InterfaceC5798yc m29859d(@NotNull b bVar, @NotNull InterfaceC5798yc interfaceC5798yc) {
                return null;
            }
        }

        @Override // p000.InterfaceC5798yc
        @NotNull
        /* JADX INFO: renamed from: a */
        InterfaceC5798yc mo2646a(@NotNull c<?> cVar);

        @Override // p000.InterfaceC5798yc
        @Nullable
        /* JADX INFO: renamed from: b */
        <E extends b> E mo2647b(@NotNull c<E> cVar);

        @Override // p000.InterfaceC5798yc
        /* JADX INFO: renamed from: c */
        <R> R mo2648c(R r, @NotNull InterfaceC5396sm<? super R, ? super b, ? extends R> interfaceC5396sm);

        @NotNull
        c<?> getKey();
    }

    /* JADX INFO: renamed from: yc$c */
    public interface c<E extends b> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC5798yc mo2646a(@NotNull c<?> cVar);

    @Nullable
    /* JADX INFO: renamed from: b */
    <E extends b> E mo2647b(@NotNull c<E> cVar);

    /* JADX INFO: renamed from: c */
    <R> R mo2648c(R r, @NotNull InterfaceC5396sm<? super R, ? super b, ? extends R> interfaceC5396sm);

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC5798yc mo2649d(@NotNull InterfaceC5798yc interfaceC5798yc);
}
