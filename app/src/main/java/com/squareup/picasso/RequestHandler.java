package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestHandler {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Result {

        /* JADX INFO: renamed from: a */
        public final Picasso.LoadedFrom f12562a;

        /* JADX INFO: renamed from: b */
        public final Bitmap f12563b;

        /* JADX INFO: renamed from: c */
        public final InputStream f12564c;

        /* JADX INFO: renamed from: d */
        public final int f12565d;

        /* JADX WARN: Invalid debug info offset */
        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Result(Bitmap bitmap, InputStream inputStream, Picasso.LoadedFrom loadedFrom, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Result(InputStream inputStream, Picasso.LoadedFrom loadedFrom) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Bitmap m18792a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public int m18793b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public Picasso.LoadedFrom m18794c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public InputStream m18795d() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18788a(int i, int i2, int i3, int i4, BitmapFactory.Options options, Request request) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m18789b(int i, int i2, BitmapFactory.Options options, Request request) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static BitmapFactory.Options m18790d(Request request) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static boolean m18791g(BitmapFactory.Options options) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo9413c(Request request);

    /* JADX INFO: renamed from: e */
    public int mo18660e() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public abstract Result mo9414f(Request request, int i) throws IOException;

    /* JADX INFO: renamed from: h */
    public boolean mo18661h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo18662i() {
        return false;
    }
}
