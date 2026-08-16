package p000;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pJ */
/* JADX INFO: loaded from: classes2.dex */
public class C5170pJ {

    /* JADX INFO: renamed from: pJ$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f18390a = new a();

        /* JADX INFO: renamed from: b */
        @Nullable
        @InterfaceC5750xt
        public static final Method f18391b;

        /* JADX INFO: renamed from: c */
        @Nullable
        @InterfaceC5750xt
        public static final Method f18392c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            C0574Is.m2756o(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                i2++;
                if (C0574Is.m2748g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C0574Is.m2756o(parameterTypes, "it.parameterTypes");
                    if (C0574Is.m2748g(C3015c5.m15536Xs(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
            }
            f18391b = method2;
            int length2 = methods.length;
            while (i < length2) {
                Method method3 = methods[i];
                i++;
                if (C0574Is.m2748g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f18392c = method;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m27419a(@NotNull Throwable th, @NotNull Throwable th2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC5299rM m27420b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: c */
    public C0642Jx m27421c(@NotNull MatchResult matchResult, @NotNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<Throwable> m27422d(@NotNull Throwable th) {
        return null;
    }
}
