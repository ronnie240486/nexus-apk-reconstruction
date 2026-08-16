package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cj */
/* JADX INFO: loaded from: classes2.dex */
public final class C0184Cj implements InterfaceC1445WP<File> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final File f475a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final EnumC5610vk f476b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final InterfaceC4958om<File, Boolean> f477c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InterfaceC4958om<File, C1003PY> f478d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final InterfaceC5396sm<File, IOException, C1003PY> f479e;

    /* JADX INFO: renamed from: f */
    public final int f480f;

    /* JADX INFO: renamed from: Cj$a */
    public static abstract class a extends c {
        /* JADX WARN: Invalid debug info offset */
        public a(@NotNull File file) {
        }
    }

    /* JADX INFO: renamed from: Cj$b */
    public final class b extends AbstractC5555v<File> {

        /* JADX INFO: renamed from: c */
        @NotNull
        public final ArrayDeque<c> f481c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0184Cj f482d;

        /* JADX INFO: renamed from: Cj$b$a */
        public final class a extends a {

            /* JADX INFO: renamed from: b */
            public boolean f483b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public File[] f484c;

            /* JADX INFO: renamed from: d */
            public int f485d;

            /* JADX INFO: renamed from: e */
            public boolean f486e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ b f487f;

            /* JADX WARN: Invalid debug info offset */
            public a(@NotNull b bVar, File file) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C0184Cj.c
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo1114b() {
                return null;
            }
        }

        /* JADX INFO: renamed from: Cj$b$b, reason: collision with other inner class name */
        public final class C5892b extends c {

            /* JADX INFO: renamed from: b */
            public boolean f488b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ b f489c;

            /* JADX WARN: Invalid debug info offset */
            public C5892b(@NotNull b bVar, File file) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C0184Cj.c
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo1114b() {
                return null;
            }
        }

        /* JADX INFO: renamed from: Cj$b$c */
        public final class c extends a {

            /* JADX INFO: renamed from: b */
            public boolean f490b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public File[] f491c;

            /* JADX INFO: renamed from: d */
            public int f492d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ b f493e;

            /* JADX WARN: Invalid debug info offset */
            public c(@NotNull b bVar, File file) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C0184Cj.c
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo1114b() {
                return null;
            }
        }

        /* JADX INFO: renamed from: Cj$b$d */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f494a;

            static {
                int[] iArr = new int[EnumC5610vk.values().length];
                iArr[EnumC5610vk.TOP_DOWN.ordinal()] = 1;
                iArr[EnumC5610vk.BOTTOM_UP.ordinal()] = 2;
                f494a = iArr;
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public b(C0184Cj c0184Cj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5555v
        /* JADX INFO: renamed from: b */
        public void mo1111b() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final a m1112g(File file) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public final File m1113h() {
            return null;
        }
    }

    /* JADX INFO: renamed from: Cj$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final File f495a;

        /* JADX WARN: Invalid debug info offset */
        public c(@NotNull File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final File m1115a() {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public abstract File mo1114b();
    }

    /* JADX WARN: Invalid debug info offset */
    public C0184Cj(@NotNull File file, @NotNull EnumC5610vk enumC5610vk) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ C0184Cj(File file, EnumC5610vk enumC5610vk, int i, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0184Cj(File file, EnumC5610vk enumC5610vk, InterfaceC4958om<? super File, Boolean> interfaceC4958om, InterfaceC4958om<? super File, C1003PY> interfaceC4958om2, InterfaceC5396sm<? super File, ? super IOException, C1003PY> interfaceC5396sm, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ C0184Cj(File file, EnumC5610vk enumC5610vk, InterfaceC4958om interfaceC4958om, InterfaceC4958om interfaceC4958om2, InterfaceC5396sm interfaceC5396sm, int i, int i2, C1522Xd c1522Xd) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC5610vk m1101c(C0184Cj c0184Cj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int m1102d(C0184Cj c0184Cj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC4958om m1103e(C0184Cj c0184Cj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC5396sm m1104f(C0184Cj c0184Cj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC4958om m1105g(C0184Cj c0184Cj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ File m1106h(C0184Cj c0184Cj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: i */
    public final C0184Cj m1107i(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1445WP
    @NotNull
    public Iterator<File> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: j */
    public final C0184Cj m1108j(@NotNull InterfaceC4958om<? super File, Boolean> interfaceC4958om) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: k */
    public final C0184Cj m1109k(@NotNull InterfaceC5396sm<? super File, ? super IOException, C1003PY> interfaceC5396sm) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: l */
    public final C0184Cj m1110l(@NotNull InterfaceC4958om<? super File, C1003PY> interfaceC4958om) {
        return null;
    }
}
