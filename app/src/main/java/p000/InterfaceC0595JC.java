package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: JC */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@InterfaceC4676kS(version = "1.3")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS})
@InterfaceC5652wO(EnumC2950b3.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0595JC {
    @InterfaceC0058At(name = "bv")
    /* JADX INFO: renamed from: bv */
    int[] m2918bv() default {1, 0, 3};

    @InterfaceC0058At(name = "d1")
    /* JADX INFO: renamed from: d1 */
    String[] m2919d1() default {};

    @InterfaceC0058At(name = "d2")
    /* JADX INFO: renamed from: d2 */
    String[] m2920d2() default {};

    @InterfaceC0058At(name = "k")
    /* JADX INFO: renamed from: k */
    int m2921k() default 1;

    @InterfaceC0058At(name = "mv")
    /* JADX INFO: renamed from: mv */
    int[] m2922mv() default {};

    @InterfaceC0058At(name = "pn")
    /* JADX INFO: renamed from: pn */
    String m2923pn() default "";

    @InterfaceC0058At(name = "xi")
    /* JADX INFO: renamed from: xi */
    int m2924xi() default 0;

    @InterfaceC0058At(name = "xs")
    /* JADX INFO: renamed from: xs */
    String m2925xs() default "";

    /* JADX INFO: renamed from: JC$a */
    public static final class a {
        @InterfaceC0879Ne(level = EnumC1009Pe.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2926a() {
        }

        @InterfaceC4676kS(version = "1.2")
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2927b() {
        }

        @InterfaceC4676kS(version = "1.1")
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m2928c() {
        }
    }
}
