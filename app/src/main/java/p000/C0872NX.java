package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.AsyncTask;
import java.util.HashMap;

/* JADX INFO: renamed from: NX */
/* JADX INFO: loaded from: classes.dex */
public class C0872NX {

    /* JADX INFO: renamed from: a */
    public static final String f2252a = "fonts";

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Typeface> f2253b = new HashMap<>();

    /* JADX INFO: renamed from: NX$a */
    public class a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f2254a;

        /* JADX WARN: Invalid debug info offset */
        public a(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m4015a(java.lang.Void... r14) {
            /*
                r13 = this;
                r0 = 0
                return r0
            L1a:
            L6a:
            La5:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0872NX.a.m4015a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m4013a(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final Typeface m4014b(Context context, String str) {
        return null;
    }
}
