package com.github.barteksc.pdfviewer.scroll;

import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.PDFView;
import p000.InterfaceC0355FP;

/* JADX INFO: loaded from: classes.dex */
public class DefaultScrollHandle extends RelativeLayout implements InterfaceC0355FP {

    /* JADX INFO: renamed from: h */
    public static final int f11004h = 65;

    /* JADX INFO: renamed from: i */
    public static final int f11005i = 40;

    /* JADX INFO: renamed from: j */
    public static final int f11006j = 16;

    /* JADX INFO: renamed from: k */
    public static PDFView f11007k;

    /* JADX INFO: renamed from: a */
    public float f11008a;

    /* JADX INFO: renamed from: b */
    public TextView f11009b;

    /* JADX INFO: renamed from: c */
    public Context f11010c;

    /* JADX INFO: renamed from: d */
    public boolean f11011d;

    /* JADX INFO: renamed from: e */
    public float f11012e;

    /* JADX INFO: renamed from: f */
    public Handler f11013f;

    /* JADX INFO: renamed from: g */
    public Runnable f11014g;

    /* JADX INFO: renamed from: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a */
    public class RunnableC3161a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DefaultScrollHandle f11015a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3161a(DefaultScrollHandle defaultScrollHandle) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultScrollHandle(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultScrollHandle(Context context, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    /* JADX INFO: renamed from: a */
    public void mo1831a() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    /* JADX INFO: renamed from: b */
    public void mo1832b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    /* JADX INFO: renamed from: c */
    public boolean mo1833c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m17418d() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final boolean m17419e() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m17420f(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    public void hide() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    public void setPageNum(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    public void setScroll(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTextColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTextSize(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    public void setupLayout(PDFView pDFView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0355FP
    public void show() {
    }
}
