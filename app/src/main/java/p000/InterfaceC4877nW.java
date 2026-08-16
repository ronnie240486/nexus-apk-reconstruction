package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: nW */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY_GETTER, EnumC3013c3.PROPERTY_SETTER, EnumC3013c3.CONSTRUCTOR})
@InterfaceC5652wO(EnumC2950b3.SOURCE)
@Retention(RetentionPolicy.SOURCE)
public @interface InterfaceC4877nW {
    Class<? extends Throwable>[] exceptionClasses();
}
