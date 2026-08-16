package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class Action<T> {

    /* JADX INFO: renamed from: a */
    public final Picasso f12339a;

    /* JADX INFO: renamed from: b */
    public final Request f12340b;

    /* JADX INFO: renamed from: c */
    public final WeakReference<T> f12341c;

    /* JADX INFO: renamed from: d */
    public final boolean f12342d;

    /* JADX INFO: renamed from: e */
    public final int f12343e;

    /* JADX INFO: renamed from: f */
    public final int f12344f;

    /* JADX INFO: renamed from: g */
    public final int f12345g;

    /* JADX INFO: renamed from: h */
    public final Drawable f12346h;

    /* JADX INFO: renamed from: i */
    public final String f12347i;

    /* JADX INFO: renamed from: j */
    public final Object f12348j;

    /* JADX INFO: renamed from: k */
    public boolean f12349k;

    /* JADX INFO: renamed from: l */
    public boolean f12350l;

    public static class RequestWeakReference<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: a */
        public final Action f12351a;

        /* JADX WARN: Invalid debug info offset */
        public RequestWeakReference(Action action, M m, ReferenceQueue<? super M> referenceQueue) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Action(Picasso picasso, T t, Request request, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void mo18569a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo18570b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* JADX INFO: renamed from: c */
    public abstract void mo18571c();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public String m18572d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public int m18573e() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public int m18574f() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public Picasso m18575g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public Picasso.Priority m18576h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Request m18577i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public Object m18578j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public T mo18579k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public boolean m18580l() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public boolean m18581m() {
        return false;
    }
}
