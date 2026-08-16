package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: yd */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@InterfaceC4676kS(version = "1.3")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC5799yd {
    @InterfaceC0058At(name = "c")
    /* JADX INFO: renamed from: c */
    String m29860c() default "";

    @InterfaceC0058At(name = "f")
    /* JADX INFO: renamed from: f */
    String m29861f() default "";

    @InterfaceC0058At(name = "i")
    /* JADX INFO: renamed from: i */
    int[] m29862i() default {};

    @InterfaceC0058At(name = C5713xI.f19431f)
    /* JADX INFO: renamed from: l */
    int[] m29863l() default {};

    @InterfaceC0058At(name = "m")
    /* JADX INFO: renamed from: m */
    String m29864m() default "";

    @InterfaceC0058At(name = "n")
    /* JADX INFO: renamed from: n */
    String[] m29865n() default {};

    @InterfaceC0058At(name = "s")
    /* JADX INFO: renamed from: s */
    String[] m29866s() default {};

    @InterfaceC0058At(name = "v")
    /* JADX INFO: renamed from: v */
    int m29867v() default 1;
}
