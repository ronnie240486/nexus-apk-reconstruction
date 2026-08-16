package org.videolan.libvlc;

import android.os.Handler;
import androidx.annotation.MainThread;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public abstract class Dialog {

    /* JADX INFO: renamed from: e */
    public static final int f17306e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f17307f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f17308g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f17309h = 3;

    /* JADX INFO: renamed from: i */
    public static Handler f17310i;

    /* JADX INFO: renamed from: j */
    public static Callbacks f17311j;

    /* JADX INFO: renamed from: a */
    public final int f17312a;

    /* JADX INFO: renamed from: b */
    public final String f17313b;

    /* JADX INFO: renamed from: c */
    public String f17314c;

    /* JADX INFO: renamed from: d */
    public Object f17315d;

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$1 */
    public class RunnableC50871 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ErrorMessage f17316a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50871(ErrorMessage errorMessage) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$2 */
    public class RunnableC50882 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoginDialog f17317a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50882(LoginDialog loginDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$3 */
    public class RunnableC50893 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ QuestionDialog f17318a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50893(QuestionDialog questionDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$4 */
    public class RunnableC50904 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProgressDialog f17319a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50904(ProgressDialog progressDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$5 */
    public class RunnableC50915 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f17320a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50915(Dialog dialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.Dialog$6 */
    public class RunnableC50926 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f17321a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f17322b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17323c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50926(Dialog dialog, float f, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface Callbacks {
        @MainThread
        /* JADX INFO: renamed from: a */
        void m25230a(ErrorMessage errorMessage);

        @MainThread
        /* JADX INFO: renamed from: b */
        void m25231b(QuestionDialog questionDialog);

        @MainThread
        /* JADX INFO: renamed from: c */
        void m25232c(ProgressDialog progressDialog);

        @MainThread
        /* JADX INFO: renamed from: d */
        void m25233d(LoginDialog loginDialog);

        @MainThread
        /* JADX INFO: renamed from: e */
        void m25234e(Dialog dialog);

        @MainThread
        /* JADX INFO: renamed from: f */
        void m25235f(ProgressDialog progressDialog);
    }

    public static class ErrorMessage extends Dialog {
        /* JADX WARN: Invalid debug info offset */
        public ErrorMessage(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public ErrorMessage(String str, String str2, RunnableC50871 runnableC50871) {
        }
    }

    public static abstract class IdDialog extends Dialog {

        /* JADX INFO: renamed from: k */
        public long f17324k;

        /* JADX WARN: Invalid debug info offset */
        public IdDialog(long j, int i, String str, String str2) {
        }

        private native void nativeDismiss(long j);

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.Dialog
        @MainThread
        /* JADX INFO: renamed from: c */
        public void mo25224c() {
        }
    }

    public static class LoginDialog extends IdDialog {

        /* JADX INFO: renamed from: l */
        public final String f17325l;

        /* JADX INFO: renamed from: m */
        public final boolean f17326m;

        /* JADX WARN: Invalid debug info offset */
        public LoginDialog(long j, String str, String str2, String str3, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ LoginDialog(long j, String str, String str2, String str3, boolean z, RunnableC50871 runnableC50871) {
        }

        private native void nativePostLogin(long j, String str, String str2, boolean z);

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @MainThread
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ void mo25224c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: o */
        public boolean m25236o() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: p */
        public String m25237p() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: q */
        public void m25238q(String str, String str2, boolean z) {
        }
    }

    public static class ProgressDialog extends IdDialog {

        /* JADX INFO: renamed from: l */
        public final boolean f17327l;

        /* JADX INFO: renamed from: m */
        public float f17328m;

        /* JADX INFO: renamed from: n */
        public final String f17329n;

        /* JADX WARN: Invalid debug info offset */
        public ProgressDialog(long j, String str, String str2, boolean z, float f, String str3) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ ProgressDialog(long j, String str, String str2, boolean z, float f, String str3, RunnableC50871 runnableC50871) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public static void m25239o(ProgressDialog progressDialog, float f, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @MainThread
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ void mo25224c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: p */
        public String m25240p() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: q */
        public float m25241q() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: r */
        public boolean m25242r() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: s */
        public boolean m25243s() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t */
        public final void m25244t(float f, String str) {
        }
    }

    public static class QuestionDialog extends IdDialog {

        /* JADX INFO: renamed from: p */
        public static final int f17330p = 0;

        /* JADX INFO: renamed from: q */
        public static final int f17331q = 1;

        /* JADX INFO: renamed from: r */
        public static final int f17332r = 2;

        /* JADX INFO: renamed from: l */
        public final int f17333l;

        /* JADX INFO: renamed from: m */
        public final String f17334m;

        /* JADX INFO: renamed from: n */
        public final String f17335n;

        /* JADX INFO: renamed from: o */
        public final String f17336o;

        /* JADX WARN: Invalid debug info offset */
        public QuestionDialog(long j, String str, String str2, int i, String str3, String str4, String str5) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ QuestionDialog(long j, String str, String str2, int i, String str3, String str4, String str5, RunnableC50871 runnableC50871) {
        }

        private native void nativePostAction(long j, int i);

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @MainThread
        /* JADX INFO: renamed from: c */
        public /* bridge */ /* synthetic */ void mo25224c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: o */
        public String m25245o() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: p */
        public String m25246p() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: q */
        public String m25247q() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: r */
        public int m25248r() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @MainThread
        /* JADX INFO: renamed from: s */
        public void m25249s(int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Dialog(int i, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Callbacks m25216a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m25217b(Dialog dialog) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m25218d(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static Dialog m25219e(long j, String str, String str2, String str3, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static Dialog m25220f(long j, String str, String str2, boolean z, float f, String str3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static Dialog m25221g(long j, String str, String str2, int i, String str3, String str4, String str5) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: l */
    public static void m25222l(ILibVLC iLibVLC, Callbacks callbacks) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static void m25223n(Dialog dialog, float f, String str) {
    }

    private static native void nativeSetCallbacks(ILibVLC iLibVLC, boolean z);

    @MainThread
    /* JADX INFO: renamed from: c */
    public void mo25224c() {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: h */
    public Object m25225h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: i */
    public String m25226i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: j */
    public String m25227j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: k */
    public int m25228k() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: m */
    public void m25229m(Object obj) {
    }
}
