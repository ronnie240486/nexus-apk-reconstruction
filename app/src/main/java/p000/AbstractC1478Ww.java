package p000;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: Ww */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1478Ww implements InterfaceC4689kf {

    /* JADX INFO: renamed from: b */
    public static final Logger f3764b = LoggerFactory.m25035j("LruDiskUsage");

    /* JADX INFO: renamed from: a */
    public final ExecutorService f3765a;

    /* JADX INFO: renamed from: Ww$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final File f3766a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1478Ww f3767b;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractC1478Ww abstractC1478Ww, File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Void m6944a() throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6940c(AbstractC1478Ww abstractC1478Ww, File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4689kf
    /* JADX INFO: renamed from: a */
    public void mo5620a(File file) throws IOException {
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2584b(File file, long j, int i);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final long m6941d(List<File> list) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m6942e(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m6943f(List<File> list) {
    }
}
