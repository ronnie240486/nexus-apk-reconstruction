package p000;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0058At(name = "JvmClassMappingKt")
public final class C5548ut {
    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends Annotation> InterfaceC0703Kt<? extends T> m28722a(@NotNull T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "getJavaClass")
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Class<T> m28723b(@NotNull InterfaceC0703Kt<T> interfaceC0703Kt) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> Class<T> m28724c(@NotNull T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> Class<T> m28726e(@NotNull InterfaceC0703Kt<T> interfaceC0703Kt) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <T> Class<T> m28727f(@NotNull InterfaceC0703Kt<T> interfaceC0703Kt) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "getKotlinClass")
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> InterfaceC0703Kt<T> m28728g(@NotNull Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <T> Class<InterfaceC0703Kt<T>> m28729h(@NotNull InterfaceC0703Kt<T> interfaceC0703Kt) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static final boolean m28731j(Object[] objArr) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m28725d(InterfaceC0703Kt interfaceC0703Kt) {
    }

    @InterfaceC0879Ne(level = EnumC1009Pe.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @InterfaceC5783yN(expression = "(this as Any).javaClass", imports = {}))
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m28730i(InterfaceC0703Kt interfaceC0703Kt) {
    }
}
