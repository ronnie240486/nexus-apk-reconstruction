package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface Flow {

    /* JADX INFO: renamed from: a */
    public static final String f17003a = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* JADX INFO: renamed from: b */
    public static final String f17004b = "this";

    /* JADX INFO: renamed from: c */
    public static final String f17005c = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* JADX INFO: renamed from: d */
    public static final String f17006d = "The return value of this method";

    /* JADX INFO: renamed from: e */
    public static final String f17007e = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
