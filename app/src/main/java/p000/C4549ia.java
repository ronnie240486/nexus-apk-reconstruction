package p000;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ia */
/* JADX INFO: loaded from: classes2.dex */
public final class C4549ia {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4549ia f14548a = new C4549ia();

    /* JADX INFO: renamed from: b */
    @InterfaceC5750xt
    public static final boolean f14549b;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        f14549b = property == null ? false : Boolean.parseBoolean(property);
    }
}
