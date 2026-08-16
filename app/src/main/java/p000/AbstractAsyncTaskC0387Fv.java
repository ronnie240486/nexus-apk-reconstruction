package p000;

import android.content.Context;
import android.media.ViviTV.model.persistent.EpgItemReviewInfo;
import android.os.AsyncTask;
import android.util.LruCache;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Fv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAsyncTaskC0387Fv extends AsyncTask<Void, Integer, List<EpgItemReviewInfo>> {

    /* JADX INFO: renamed from: j */
    public static LruCache<String, Pair<Long, List<EpgItemReviewInfo>>> f840j = new LruCache<>(100);

    /* JADX INFO: renamed from: a */
    public Context f841a;

    /* JADX INFO: renamed from: b */
    public String f842b;

    /* JADX INFO: renamed from: c */
    public String f843c;

    /* JADX INFO: renamed from: d */
    public String[] f844d;

    /* JADX INFO: renamed from: e */
    public SimpleDateFormat f845e;

    /* JADX INFO: renamed from: f */
    public SimpleDateFormat f846f;

    /* JADX INFO: renamed from: g */
    public Calendar f847g;

    /* JADX INFO: renamed from: h */
    public Map<String, String> f848h;

    /* JADX INFO: renamed from: i */
    public int f849i;

    /* JADX INFO: renamed from: Fv$a */
    public class a implements Comparator<EpgItemReviewInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractAsyncTaskC0387Fv f850a;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractAsyncTaskC0387Fv abstractAsyncTaskC0387Fv) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m1966a(EpgItemReviewInfo epgItemReviewInfo, EpgItemReviewInfo epgItemReviewInfo2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(EpgItemReviewInfo epgItemReviewInfo, EpgItemReviewInfo epgItemReviewInfo2) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractAsyncTaskC0387Fv(Context context, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SimpleDateFormat m1955a(AbstractAsyncTaskC0387Fv abstractAsyncTaskC0387Fv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m1956b(Map<String, String> map, List<EpgItemReviewInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final EpgItemReviewInfo m1957c(String str, Date date, Map<String, String> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<EpgItemReviewInfo> doInBackground(Void[] voidArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public final java.util.List<android.media.ViviTV.model.persistent.EpgItemReviewInfo> m1959e(java.lang.Void... r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractAsyncTaskC0387Fv.m1959e(java.lang.Void[]):java.util.List");
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1960f(List<EpgItemReviewInfo> list);

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: g */
    public final List<String> m1961g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final Map<String, String> m1962h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m1963i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m1964j(List<EpgItemReviewInfo> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m1965k(List<EpgItemReviewInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<EpgItemReviewInfo> list) {
    }

    /* JADX INFO: renamed from: d */
    public void mo1958d(List<EpgItemReviewInfo> list, boolean z) {
    }
}
