package p000;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.PROPERTY, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.FUNCTION, EnumC3013c3.TYPEALIAS})
@InterfaceC5652wO(EnumC2950b3.BINARY)
@Retention(RetentionPolicy.CLASS)
public @interface J30 {
    Class<? extends Annotation>[] markerClass();
}
