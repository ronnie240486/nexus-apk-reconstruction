package p000;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: zZ */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC0879Ne(message = "Please use OptIn instead.", replaceWith = @InterfaceC5783yN(expression = "OptIn(*markerClass)", imports = {"kotlin.OptIn"}))
@InterfaceC4676kS(version = "1.2")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.PROPERTY, EnumC3013c3.LOCAL_VARIABLE, EnumC3013c3.VALUE_PARAMETER, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY_GETTER, EnumC3013c3.PROPERTY_SETTER, EnumC3013c3.EXPRESSION, EnumC3013c3.FILE, EnumC3013c3.TYPEALIAS})
@InterfaceC5652wO(EnumC2950b3.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface InterfaceC5865zZ {
    Class<? extends Annotation>[] markerClass();
}
