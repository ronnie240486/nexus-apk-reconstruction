package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.p013io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: S9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1168S9 implements InterfaceC0703Kt<Object>, InterfaceC1105R9 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final a f3079b = new a(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<Class<? extends InterfaceC0051Am<?>>, Integer> f3080c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HashMap<String, String> f3081d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<String, String> f3082e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final HashMap<String, String> f3083f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Map<String, String> f3084g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Class<?> f3085a;

    /* JADX INFO: renamed from: S9$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        public a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final String m5460a(@NotNull Class<?> cls) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m5461b(@NotNull Class<?> cls) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final boolean m5462c(@Nullable Object obj, @NotNull Class<?> cls) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List listM22123M = C4811ma.m22123M(InterfaceC4245dm.class, InterfaceC4958om.class, InterfaceC5396sm.class, InterfaceC5459tm.class, InterfaceC5541um.class, InterfaceC5612vm.class, InterfaceC5676wm.class, InterfaceC5743xm.class, InterfaceC5808ym.class, InterfaceC5878zm.class, InterfaceC4308em.class, InterfaceC4371fm.class, InterfaceC4435gm.class, InterfaceC4498hm.class, InterfaceC4561im.class, InterfaceC4632jm.class, InterfaceC4696km.class, InterfaceC4759lm.class, InterfaceC4830mm.class, InterfaceC4895nm.class, InterfaceC5199pm.class, InterfaceC5262qm.class, InterfaceC5325rm.class);
        ArrayList arrayList = new ArrayList(C4881na.m22415Z(listM22123M, 10));
        for (Object obj : listM22123M) {
            int i2 = i + 1;
            if (i < 0) {
                C4811ma.m22134X();
            }
            arrayList.add(new C5295rI((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3080c = C0062Ax.m342D0(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f3081d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f3082e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        C0574Is.m2756o(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C0574Is.m2756o(str, "kotlinName");
            C5295rI c5295rI = new C5295rI(C0786MA.m3668a(sb, C1710aU.m9086s5(str, FilenameUtils.f15632b, null, 2, null), "CompanionObject"), C0574Is.m2725C(str, ".Companion"));
            map3.put(c5295rI.f18598a, c5295rI.f18599b);
        }
        for (Map.Entry<Class<? extends InterfaceC0051Am<?>>, Integer> entry : f3080c.entrySet()) {
            map3.put(entry.getKey().getName(), C0574Is.m2725C("kotlin.Function", Integer.valueOf(entry.getValue().intValue())));
        }
        f3083f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5889zx.m30196j(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C1710aU.m9086s5((String) entry2.getValue(), FilenameUtils.f15632b, null, 2, null));
        }
        f3084g = linkedHashMap;
    }

    /* JADX WARN: Invalid debug info offset */
    public C1168S9(@NotNull Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ HashMap m5453p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ Map m5454q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ Map m5455r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0575It
    @NotNull
    /* JADX INFO: renamed from: L */
    public List<Annotation> mo2492L() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @Nullable
    /* JADX INFO: renamed from: S */
    public String mo3303S() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt, p000.InterfaceC0958Ot
    @NotNull
    /* JADX INFO: renamed from: T */
    public Collection<InterfaceC0638Jt<?>> mo3304T() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @NotNull
    /* JADX INFO: renamed from: U */
    public Collection<InterfaceC0703Kt<?>> mo3305U() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @NotNull
    /* JADX INFO: renamed from: V */
    public Collection<InterfaceC1024Pt<Object>> mo3306V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: W */
    public boolean mo3307W() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @NotNull
    /* JADX INFO: renamed from: X */
    public List<InterfaceC0703Kt<? extends Object>> mo3308X() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: Y */
    public boolean mo3309Y() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: Z */
    public boolean mo3310Z() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @Nullable
    /* JADX INFO: renamed from: a0 */
    public String mo3311a0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public List<InterfaceC4506hu> mo3312b0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public Object mo3313c0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: d */
    public boolean mo3314d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: d0 */
    public boolean mo3315d0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @NotNull
    /* JADX INFO: renamed from: e */
    public List<InterfaceC4640ju> mo3316e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: e0 */
    public boolean mo3317e0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: f */
    public boolean mo3318f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: f0 */
    public boolean mo3319f0(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    @Nullable
    public EnumC4838mu getVisibility() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    public boolean isOpen() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0703Kt
    /* JADX INFO: renamed from: n0 */
    public boolean mo3320n0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1105R9
    @NotNull
    /* JADX INFO: renamed from: o */
    public Class<?> mo4971o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final Void m5459u() {
        return null;
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m5443A() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m5444C() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m5445D() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m5446E() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m5447G() {
    }

    @InterfaceC4676kS(version = "1.4")
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m5448H() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m5449K() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m5450M() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m5451O() {
    }

    @InterfaceC4676kS(version = "1.5")
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m5452P() {
    }

    @InterfaceC4676kS(version = "1.3")
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5456v() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m5457y() {
    }

    @InterfaceC4676kS(version = "1.1")
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m5458z() {
    }
}
