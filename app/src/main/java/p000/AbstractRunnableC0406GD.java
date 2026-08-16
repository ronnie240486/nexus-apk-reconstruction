package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Pair;
import com.afollestad.materialdialogs.MaterialDialog;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: GD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0406GD implements InterfaceC0591J8, Runnable {

    /* JADX INFO: renamed from: h */
    public static C4927oH f870h;

    /* JADX INFO: renamed from: a */
    public MaterialDialog f871a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0401G8 f872b;

    /* JADX INFO: renamed from: c */
    public Context f873c;

    /* JADX INFO: renamed from: d */
    public Exception f874d;

    /* JADX INFO: renamed from: e */
    public String f875e;

    /* JADX INFO: renamed from: f */
    public boolean f876f;

    /* JADX INFO: renamed from: g */
    public Handler f877g;

    /* JADX INFO: renamed from: GD$a */
    public class a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractRunnableC0406GD f878a;

        /* JADX WARN: Invalid debug info offset */
        public a(AbstractRunnableC0406GD abstractRunnableC0406GD) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: GD$b */
    public class b implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractRunnableC0406GD f879a;

        /* JADX WARN: Invalid debug info offset */
        public b(AbstractRunnableC0406GD abstractRunnableC0406GD) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: GD$c */
    public class c implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractRunnableC0406GD f880a;

        /* JADX WARN: Invalid debug info offset */
        public c(AbstractRunnableC0406GD abstractRunnableC0406GD) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: GD$d */
    public class d implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    static {
        C4927oH.b bVarM22650H = new C4927oH.b().m22673t(new d()).m22650H(C4538iP.m21360a());
        bVarM22650H.getClass();
        f870h = new C4927oH(bVarM22650H);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ MaterialDialog m2009q(AbstractRunnableC0406GD abstractRunnableC0406GD, MaterialDialog materialDialog) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static final C0186Cl m2010r(String str, List<Pair<String, String>> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static final C4597jD m2011s(String str, List<Pair<String, String>> list, List<Pair<String, File>> list2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static void m2012u(AbstractRunnableC0406GD abstractRunnableC0406GD) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static HostnameVerifier m2013v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m2014a(String str, Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m2015b(String str, Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m2016c(String str, Context context, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m2017d(String str, Context context, int i, int i2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m2018e(String str, Context context, MaterialDialog materialDialog) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m2019f(String str, Context context, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m2020g(String str, Context context, String str2, String str3, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m2021h(String str, Context context, List<Pair<String, String>> list, List<Pair<String, File>> list2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m2022i(String str, Context context, List<Pair<String, String>> list, List<Pair<String, File>> list2, MaterialDialog materialDialog) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m2023j(String str, Context context, List<Pair<String, String>> list, List<Pair<String, File>> list2, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m2024k(String str, Context context, List<Pair<String, String>> list, List<Pair<String, File>> list2, String str2, String str3, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m2025l(String str, Context context, List<Pair<String, String>> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m2026m(String str, Context context, List<Pair<String, String>> list, int i, int i2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m2027n(String str, Context context, List<Pair<String, String>> list, MaterialDialog materialDialog) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m2028o(String str, Context context, List<Pair<String, String>> list, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0591J8
    public final void onFailure(InterfaceC0401G8 interfaceC0401G8, IOException iOException) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0591J8
    public final void onResponse(InterfaceC0401G8 interfaceC0401G8, C4934oO c4934oO) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m2029p(String str, Context context, List<Pair<String, String>> list, String str2, String str3, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Runnable
    public void run() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m2030t() {
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo2032x(Exception exc, String str);

    /* JADX INFO: renamed from: w */
    public void m2031w() {
    }
}
