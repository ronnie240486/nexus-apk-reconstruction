package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: kS */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC4661kD
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.PROPERTY, EnumC3013c3.FIELD, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY_GETTER, EnumC3013c3.PROPERTY_SETTER, EnumC3013c3.TYPEALIAS})
@InterfaceC5652wO(EnumC2950b3.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4676kS {
    String version();
}
