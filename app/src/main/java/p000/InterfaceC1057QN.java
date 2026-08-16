package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: QN */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@InterfaceC4676kS(version = "1.2")
@InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.TYPEALIAS})
@InterfaceC5652wO(EnumC2950b3.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC5651wN
@Repeatable(a.class)
public @interface InterfaceC1057QN {

    /* JADX INFO: renamed from: QN$a */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InterfaceC4876nV(allowedTargets = {EnumC3013c3.CLASS, EnumC3013c3.FUNCTION, EnumC3013c3.PROPERTY, EnumC3013c3.CONSTRUCTOR, EnumC3013c3.TYPEALIAS})
    @InterfaceC5652wO(EnumC2950b3.SOURCE)
    @InterfaceC5718xN
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        InterfaceC1057QN[] value();
    }

    int errorCode() default -1;

    EnumC1009Pe level() default EnumC1009Pe.ERROR;

    String message() default "";

    String version();

    EnumC1119RN versionKind() default EnumC1119RN.LANGUAGE_VERSION;
}
