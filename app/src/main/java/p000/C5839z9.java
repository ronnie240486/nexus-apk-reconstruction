package p000;

import java.nio.charset.Charset;
import org.apache.commons.p013io.input.XmlStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5839z9 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5839z9 f19673a = new C5839z9();

    /* JADX INFO: renamed from: b */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19674b;

    /* JADX INFO: renamed from: c */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19675c;

    /* JADX INFO: renamed from: d */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19676d;

    /* JADX INFO: renamed from: e */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19677e;

    /* JADX INFO: renamed from: f */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19678f;

    /* JADX INFO: renamed from: g */
    @NotNull
    @InterfaceC5750xt
    public static final Charset f19679g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public static Charset f19680h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static Charset f19681i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static Charset f19682j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C0574Is.m2756o(charsetForName, "forName(\"UTF-8\")");
        f19674b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        C0574Is.m2756o(charsetForName2, "forName(\"UTF-16\")");
        f19675c = charsetForName2;
        Charset charsetForName3 = Charset.forName(XmlStreamReader.f15875g);
        C0574Is.m2756o(charsetForName3, "forName(\"UTF-16BE\")");
        f19676d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        C0574Is.m2756o(charsetForName4, "forName(\"UTF-16LE\")");
        f19677e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        C0574Is.m2756o(charsetForName5, "forName(\"US-ASCII\")");
        f19678f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        C0574Is.m2756o(charsetForName6, "forName(\"ISO-8859-1\")");
        f19679g = charsetForName6;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "UTF32")
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Charset m29953a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "UTF32_BE")
    @NotNull
    /* JADX INFO: renamed from: b */
    public final Charset m29954b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0058At(name = "UTF32_LE")
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Charset m29955c() {
        return null;
    }
}
