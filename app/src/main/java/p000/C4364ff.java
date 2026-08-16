package p000;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: renamed from: ff */
/* JADX INFO: loaded from: classes2.dex */
public class C4364ff implements InterfaceC0125Bw {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Handler f14025a;

    /* JADX INFO: renamed from: ff$a */
    public static class a extends Handler {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f14026a;

        /* JADX INFO: renamed from: b */
        public final int f14027b;

        /* JADX WARN: Invalid debug info offset */
        public a(@NonNull Looper looper, @NonNull String str, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final File m20572a(@NonNull String str, @NonNull String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final void m20573b(@NonNull FileWriter fileWriter, @NonNull String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r5) {
            /*
                r4 = this;
                return
            L1d:
            L20:
            L29:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4364ff.a.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4364ff(@NonNull Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0125Bw
    public void log(int i, @Nullable String str, @NonNull String str2) {
    }
}
