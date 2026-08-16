package p000;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yanzhenjie.permission.PermissionListener;
import com.yanzhenjie.permission.Rationale;
import com.yanzhenjie.permission.RationaleListener;
import java.util.List;

/* JADX INFO: renamed from: PI */
/* JADX INFO: loaded from: classes.dex */
public class C0987PI {

    /* JADX INFO: renamed from: PI$a */
    public class a implements PermissionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f2448a;

        /* JADX WARN: Invalid debug info offset */
        public a(c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.permission.PermissionListener
        public void onFailed(int i, @NonNull List<String> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.permission.PermissionListener
        public void onSucceed(int i, @NonNull List<String> list) {
        }
    }

    /* JADX INFO: renamed from: PI$b */
    public class b implements RationaleListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f2449a;

        /* JADX WARN: Invalid debug info offset */
        public b(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.permission.RationaleListener
        public void showRequestPermissionRationale(int i, Rationale rationale) {
        }
    }

    /* JADX INFO: renamed from: PI$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4389a();

        /* JADX INFO: renamed from: b */
        void mo4390b();
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m4388a(Context context, int i, c cVar) {
    }
}
