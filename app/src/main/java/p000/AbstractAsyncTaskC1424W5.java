package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import java.util.List;

/* JADX INFO: renamed from: W5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1424W5<ResultType> extends AsyncTask<Void, Integer, ResultType> {

    /* JADX INFO: renamed from: a */
    public Context f3677a;

    /* JADX INFO: renamed from: b */
    public String f3678b;

    /* JADX INFO: renamed from: c */
    public DialogC1413Vv f3679c;

    /* JADX INFO: renamed from: d */
    public a f3680d;

    /* JADX INFO: renamed from: e */
    public List<Pair<String, String>> f3681e;

    /* JADX INFO: renamed from: f */
    public Class<?> f3682f;

    /* JADX INFO: renamed from: g */
    public int f3683g;

    /* JADX INFO: renamed from: h */
    public String f3684h;

    /* JADX INFO: renamed from: W5$a */
    public enum a {
        POST,
        GET
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractAsyncTaskC1424W5(Context context, String str, a aVar, Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractAsyncTaskC1424W5(Context context, String str, a aVar, List<Pair<String, String>> list, Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public ResultType m6704a(Void... voidArr) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo6705b(ResultType resulttype);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final boolean m6706c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Pair<Boolean, ResultType> mo6707d(String str, String str2, int i) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public void onPostExecute(ResultType resulttype) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public void onPreExecute() {
    }
}
