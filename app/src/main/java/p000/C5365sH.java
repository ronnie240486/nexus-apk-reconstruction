package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: sH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5365sH {

    /* JADX INFO: renamed from: a */
    public static final Logger f18707a = Logger.getLogger(C5365sH.class.getName());

    /* JADX INFO: renamed from: sH$a */
    public class a implements InterfaceC4803mS {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5660wW f18708a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OutputStream f18709b;

        /* JADX WARN: Invalid debug info offset */
        public a(C5660wW c5660wW, OutputStream outputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS
        /* JADX INFO: renamed from: X */
        public void mo943X(C0910O7 c0910o7, long j) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS, java.io.Flushable
        public void flush() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS
        public C5660wW timeout() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX INFO: renamed from: sH$b */
    public class b implements InterfaceC5858zS {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5660wW f18710a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InputStream f18711b;

        /* JADX WARN: Invalid debug info offset */
        public b(C5660wW c5660wW, InputStream inputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5858zS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC5858zS
        public long read(p000.C0910O7 r4, long r5) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L3b:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5365sH.b.read(O7, long):long");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5858zS
        public C5660wW timeout() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX INFO: renamed from: sH$d */
    /* JADX INFO: loaded from: classes.dex */
    public class d extends C4589j5 {

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Socket f18712l;

        /* JADX WARN: Invalid debug info offset */
        public d(Socket socket) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4589j5
        /* JADX INFO: renamed from: q */
        public IOException mo5380q(@Nullable IOException iOException) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.C4589j5
        /* JADX INFO: renamed from: v */
        public void mo1563v() {
            /*
                r5 = this;
                return
            L8:
            La:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5365sH.d.mo1563v():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static InterfaceC4803mS m28131a(File file) throws FileNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static InterfaceC4803mS m28132b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static InterfaceC1103R7 m28133c(InterfaceC4803mS interfaceC4803mS) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static InterfaceC1166S7 m28134d(InterfaceC5858zS interfaceC5858zS) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static boolean m28135e(AssertionError assertionError) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static InterfaceC4803mS m28136f(File file) throws FileNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static InterfaceC4803mS m28137g(OutputStream outputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static InterfaceC4803mS m28138h(OutputStream outputStream, C5660wW c5660wW) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static InterfaceC4803mS m28139i(Socket socket) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: j */
    public static InterfaceC4803mS m28140j(Path path, OpenOption... openOptionArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static InterfaceC5858zS m28141k(File file) throws FileNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static InterfaceC5858zS m28142l(InputStream inputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static InterfaceC5858zS m28143m(InputStream inputStream, C5660wW c5660wW) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static InterfaceC5858zS m28144n(Socket socket) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: o */
    public static InterfaceC5858zS m28145o(Path path, OpenOption... openOptionArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static C4589j5 m28146p(Socket socket) {
        return null;
    }

    /* JADX INFO: renamed from: sH$c */
    public class c implements InterfaceC4803mS {
        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS
        /* JADX INFO: renamed from: X */
        public void mo943X(C0910O7 c0910o7, long j) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4803mS
        public C5660wW timeout() {
            return null;
        }

        @Override // p000.InterfaceC4803mS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        @Override // p000.InterfaceC4803mS, java.io.Flushable
        public void flush() throws IOException {
        }
    }
}
