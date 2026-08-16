package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.afollestad.materialdialogs.MaterialDialog;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAsyncTaskC4518i5<ParamType, ProgressType, ResultType> extends AsyncTask<ParamType, ProgressType, ResultType> {

    /* JADX INFO: renamed from: a */
    public MaterialDialog f14459a;

    /* JADX INFO: renamed from: b */
    public Context f14460b;

    /* JADX WARN: Invalid debug info offset */
    public AbstractAsyncTaskC4518i5(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.AsyncTask
    public void onCancelled(ResultType resulttype) {
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
