package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: aO */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC4676kS(version = "1.3")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.ANNOTATION_CLASS})
@InterfaceC5652wO(EnumC2950b3.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1704aO {

    /* JADX INFO: renamed from: aO$a */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;

    String message() default "";
}
