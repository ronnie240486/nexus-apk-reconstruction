package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Map;

/* JADX INFO: renamed from: MN */
/* JADX INFO: loaded from: classes.dex */
public class C0799MN implements Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static final String f2072e = "RMRetriever";

    /* JADX INFO: renamed from: f */
    public static final String f2073f = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: g */
    public static final C0799MN f2074g = new C0799MN();

    /* JADX INFO: renamed from: h */
    public static final int f2075h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f2076i = 2;

    /* JADX INFO: renamed from: a */
    public volatile C0671KN f2077a;

    /* JADX INFO: renamed from: b */
    public final Map<FragmentManager, FragmentC0737LN> f2078b;

    /* JADX INFO: renamed from: c */
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f2079c;

    /* JADX INFO: renamed from: d */
    public final Handler f2080d;

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public static void m3722a(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static C0799MN m3723h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    /* JADX INFO: renamed from: b */
    public C0671KN m3724b(Context context, FragmentManager fragmentManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    /* JADX INFO: renamed from: c */
    public C0671KN m3725c(Activity activity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public C0671KN m3726d(Fragment fragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public C0671KN m3727e(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public C0671KN m3728f(androidx.fragment.app.Fragment fragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public C0671KN m3729g(FragmentActivity fragmentActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public final p000.C0671KN m3730i(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0799MN.m3730i(android.content.Context):KN");
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    /* JADX INFO: renamed from: j */
    public FragmentC0737LN m3731j(FragmentManager fragmentManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public SupportRequestManagerFragment m3732k(androidx.fragment.app.FragmentManager fragmentManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public C0671KN m3733l(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return null;
    }
}
