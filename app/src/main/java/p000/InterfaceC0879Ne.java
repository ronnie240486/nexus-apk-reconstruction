package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Ne */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC4661kD
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY, EnumC3013c3.ANNOTATION_CLASS, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.PROPERTY_SETTER, EnumC3013c3.PROPERTY_GETTER, EnumC3013c3.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0879Ne {
    EnumC1009Pe level() default EnumC1009Pe.WARNING;

    String message();

    InterfaceC5783yN replaceWith() default @InterfaceC5783yN(expression = "", imports = {});
}
