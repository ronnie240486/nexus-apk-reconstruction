package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: nV */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC4661kD
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.ANNOTATION_CLASS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC4876nV {
    EnumC3013c3[] allowedTargets();
}
