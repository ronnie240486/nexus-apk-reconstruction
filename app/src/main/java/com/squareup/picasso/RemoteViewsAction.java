package com.squareup.picasso;

import android.app.Notification;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
abstract class RemoteViewsAction extends Action<RemoteViewsTarget> {

    /* JADX INFO: renamed from: m */
    public final RemoteViews f12507m;

    /* JADX INFO: renamed from: n */
    public final int f12508n;

    /* JADX INFO: renamed from: o */
    public RemoteViewsTarget f12509o;

    public static class AppWidgetAction extends RemoteViewsAction {

        /* JADX INFO: renamed from: p */
        public final int[] f12510p;

        /* JADX WARN: Invalid debug info offset */
        public AppWidgetAction(Picasso picasso, Request request, RemoteViews remoteViews, int i, int[] iArr, int i2, int i3, String str, Object obj, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ RemoteViewsTarget mo18579k() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RemoteViewsAction
        /* JADX INFO: renamed from: p */
        public void mo18722p() {
        }
    }

    public static class NotificationAction extends RemoteViewsAction {

        /* JADX INFO: renamed from: p */
        public final int f12511p;

        /* JADX INFO: renamed from: q */
        public final Notification f12512q;

        /* JADX WARN: Invalid debug info offset */
        public NotificationAction(Picasso picasso, Request request, RemoteViews remoteViews, int i, int i2, Notification notification, int i3, int i4, String str, Object obj, int i5) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ RemoteViewsTarget mo18579k() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RemoteViewsAction
        /* JADX INFO: renamed from: p */
        public void mo18722p() {
        }
    }

    public static class RemoteViewsTarget {

        /* JADX INFO: renamed from: a */
        public final RemoteViews f12513a;

        /* JADX INFO: renamed from: b */
        public final int f12514b;

        /* JADX WARN: Invalid debug info offset */
        public RemoteViewsTarget(RemoteViews remoteViews, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RemoteViewsAction(Picasso picasso, Request request, RemoteViews remoteViews, int i, int i2, int i3, int i4, Object obj, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Action
    /* JADX INFO: renamed from: b */
    public void mo18570b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Action
    /* JADX INFO: renamed from: c */
    public void mo18571c() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Action
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ RemoteViewsTarget mo18579k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public RemoteViewsTarget m18720n() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m18721o(int i) {
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo18722p();
}
