package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class DeferredRequestCreator implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final RequestCreator f12391a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<ImageView> f12392b;

    /* JADX INFO: renamed from: c */
    public Callback f12393c;

    /* JADX WARN: Invalid debug info offset */
    public DeferredRequestCreator(RequestCreator requestCreator, ImageView imageView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DeferredRequestCreator(RequestCreator requestCreator, ImageView imageView, Callback callback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18614a() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return false;
    }
}
