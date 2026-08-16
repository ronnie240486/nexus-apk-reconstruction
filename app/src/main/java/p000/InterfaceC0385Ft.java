package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Ft */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@InterfaceC4661kD
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY, EnumC3013c3.TYPE})
@InterfaceC5652wO(EnumC2950b3.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC0385Ft {
    boolean suppress() default true;
}
