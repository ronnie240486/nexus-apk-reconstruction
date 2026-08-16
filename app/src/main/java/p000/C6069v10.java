package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6069v10 {

    /* JADX INFO: renamed from: v10$a */
    public class AsyncTaskC5558a extends AsyncTask<Void, Integer, D00> {

        /* JADX INFO: renamed from: a */
        public DialogC1413Vv f19055a;

        /* JADX INFO: renamed from: b */
        public int f19056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f19057c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f19058d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC5561d f19059e;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC5558a(Context context, int i, InterfaceC5561d interfaceC5561d) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public D00 m28749a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m28750b(D00 d00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ D00 doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(D00 d00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: v10$b */
    public class C5559b implements InterfaceC5561d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f19060a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5561d f19061b;

        /* JADX INFO: renamed from: v10$b$a */
        public class a implements C6071v30.InterfaceC5567d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5559b f19062a;

            /* JADX WARN: Invalid debug info offset */
            public a(C5559b c5559b) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C6071v30.InterfaceC5567d
            /* JADX INFO: renamed from: a */
            public void mo2245a(DialogC1326Uc dialogC1326Uc) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.C6071v30.InterfaceC5567d
            /* JADX INFO: renamed from: b */
            public void mo2246b(DialogC1326Uc dialogC1326Uc) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C5559b(Context context, InterfaceC5561d interfaceC5561d) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C6069v10.InterfaceC5561d
        /* JADX INFO: renamed from: a */
        public void mo9919a(D00 d00) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C6069v10.InterfaceC5561d
        /* JADX INFO: renamed from: b */
        public void mo9920b(int i) {
        }
    }

    /* JADX INFO: renamed from: v10$c */
    public class C5560c extends TypeToken<List<N00>> {
    }

    /* JADX INFO: renamed from: v10$d */
    public interface InterfaceC5561d {
        /* JADX INFO: renamed from: a */
        void mo9919a(D00 d00);

        /* JADX INFO: renamed from: b */
        void mo9920b(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m28744a(Context context, int i, InterfaceC5561d interfaceC5561d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m28745b(Context context, int i, Executor executor, InterfaceC5561d interfaceC5561d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static C1216Sv<List<N00>> m28746c(HashMap<String, String> map, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m28747d(Context context, int i, InterfaceC5561d interfaceC5561d) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static p000.C1216Sv<p000.D00> m28748e(android.content.Context r3, int r4) {
        /*
            r0 = 0
            return r0
        L61:
        L9e:
        La3:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6069v10.m28748e(android.content.Context, int):Sv");
    }
}
