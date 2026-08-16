package p000;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ld */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4954oi
@InterfaceC4676kS(version = "1.4")
@InterfaceC5372sO
public abstract class AbstractC0752Ld<T, R> {
    /* JADX WARN: Invalid debug info offset */
    public AbstractC0752Ld() {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC0752Ld(C1522Xd c1522Xd) {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract <U, S> Object mo3554a(@NotNull C0622Jd<U, S> c0622Jd, U u, @NotNull InterfaceC4813mc<? super S> interfaceC4813mc);

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo3555b(T t, @NotNull InterfaceC4813mc<? super R> interfaceC4813mc);

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0879Ne(level = EnumC1009Pe.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @InterfaceC5783yN(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Void m3556c(@NotNull C0622Jd<?, ?> c0622Jd, @Nullable Object obj) {
        return null;
    }
}
