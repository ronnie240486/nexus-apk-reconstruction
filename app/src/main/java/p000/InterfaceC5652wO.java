package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: wO */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.ANNOTATION_CLASS})
public @interface InterfaceC5652wO {
    EnumC2950b3 value() default EnumC2950b3.RUNTIME;
}
