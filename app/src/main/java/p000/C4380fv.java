package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes2.dex */
public final class C4380fv {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4380fv f14062a = new C4380fv();

    /* JADX INFO: renamed from: b */
    public static final int f14063b = 32;

    /* JADX INFO: renamed from: c */
    public static CharsetDecoder f14064c;

    /* JADX INFO: renamed from: d */
    public static boolean f14065d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final byte[] f14066e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final char[] f14067f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final ByteBuffer f14068g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final CharBuffer f14069h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StringBuilder f14070i;

    static {
        byte[] bArr = new byte[32];
        f14066e = bArr;
        char[] cArr = new char[32];
        f14067f = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C0574Is.m2756o(byteBufferWrap, "wrap(bytes)");
        f14068g = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        C0574Is.m2756o(charBufferWrap, "wrap(chars)");
        f14069h = charBufferWrap;
        f14070i = new StringBuilder();
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final int m20686a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final int m20687b(boolean z) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final int m20688c(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final synchronized String m20689d(@NotNull InputStream inputStream, @NotNull Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m20690e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m20691f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m20692g(Charset charset) {
    }
}
