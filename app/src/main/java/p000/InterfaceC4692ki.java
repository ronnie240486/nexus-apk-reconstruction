package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC0879Ne(message = "Please use RequiresOptIn instead.")
@InterfaceC4676kS(version = "1.2")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.ANNOTATION_CLASS})
@InterfaceC5652wO(EnumC2950b3.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4692ki {

    /* JADX INFO: renamed from: ki$a */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;
}
