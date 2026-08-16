package p000;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0058At(name = "ByteStreamsKt")
public final class C5159p8 {

    /* JADX INFO: renamed from: p8$a */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends AbstractC4853n8 {

        /* JADX INFO: renamed from: a */
        public int f18375a;

        /* JADX INFO: renamed from: b */
        public boolean f18376b;

        /* JADX INFO: renamed from: c */
        public boolean f18377c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BufferedInputStream f18378d;

        /* JADX WARN: Invalid debug info offset */
        public a(BufferedInputStream bufferedInputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC4853n8
        /* JADX INFO: renamed from: c */
        public byte mo2898c() {
            return (byte) 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final boolean m27400d() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final int m27401f() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final boolean m27402g() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public final void m27403h() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public final void m27404i(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public final void m27405j(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public final void m27406k(boolean z) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: a */
    public static final BufferedInputStream m27378a(InputStream inputStream, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: b */
    public static final BufferedOutputStream m27379b(OutputStream outputStream, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BufferedInputStream m27380c(InputStream inputStream, int i, int i2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BufferedOutputStream m27381d(OutputStream outputStream, int i, int i2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: e */
    public static final BufferedReader m27382e(InputStream inputStream, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ BufferedReader m27383f(InputStream inputStream, Charset charset, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: g */
    public static final BufferedWriter m27384g(OutputStream outputStream, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ BufferedWriter m27385h(OutputStream outputStream, Charset charset, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: i */
    public static final ByteArrayInputStream m27386i(String str, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ByteArrayInputStream m27387j(String str, Charset charset, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static final long m27388k(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ long m27389l(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: m */
    public static final ByteArrayInputStream m27390m(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: n */
    public static final ByteArrayInputStream m27391n(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final AbstractC4853n8 m27392o(@NotNull BufferedInputStream bufferedInputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4676kS(version = "1.3")
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final byte[] m27393p(@NotNull InputStream inputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC0943Oe(errorSince = "1.5", warningSince = "1.3")
    @InterfaceC0879Ne(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @InterfaceC5783yN(expression = "readBytes()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final byte[] m27394q(@NotNull InputStream inputStream, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ byte[] m27395r(InputStream inputStream, int i, int i2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: s */
    public static final InputStreamReader m27396s(InputStream inputStream, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ InputStreamReader m27397t(InputStream inputStream, Charset charset, int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: u */
    public static final OutputStreamWriter m27398u(OutputStream outputStream, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ OutputStreamWriter m27399v(OutputStream outputStream, Charset charset, int i, Object obj) {
        return null;
    }
}
