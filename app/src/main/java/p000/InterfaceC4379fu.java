package p000;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fu */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4379fu<T, V> extends InterfaceC4252du<V>, InterfaceC4958om<T, V> {

    /* JADX INFO: renamed from: fu$a */
    public interface a<T, V> extends InterfaceC4252du.c<V>, InterfaceC4958om<T, V> {
    }

    @Override // p000.InterfaceC4252du
    @NotNull
    /* JADX INFO: renamed from: b */
    a<T, V> mo142b();

    V get(T t);

    @InterfaceC4676kS(version = "1.1")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object mo934i(T t);
}
