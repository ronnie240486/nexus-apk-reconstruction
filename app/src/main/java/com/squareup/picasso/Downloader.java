package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Downloader {

    public static class Response {

        /* JADX INFO: renamed from: a */
        public final InputStream f12434a;

        /* JADX INFO: renamed from: b */
        public final Bitmap f12435b;

        /* JADX INFO: renamed from: c */
        public final boolean f12436c;

        /* JADX INFO: renamed from: d */
        public final long f12437d;

        /* JADX WARN: Invalid debug info offset */
        @Deprecated
        public Response(Bitmap bitmap, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Deprecated
        public Response(Bitmap bitmap, boolean z, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Deprecated
        public Response(InputStream inputStream, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Response(InputStream inputStream, boolean z, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Deprecated
        /* JADX INFO: renamed from: a */
        public Bitmap m18644a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public long m18645b() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public InputStream m18646c() {
            return null;
        }
    }

    public static class ResponseException extends IOException {

        /* JADX INFO: renamed from: a */
        public final boolean f12438a;

        /* JADX INFO: renamed from: b */
        public final int f12439b;

        /* JADX WARN: Invalid debug info offset */
        public ResponseException(String str, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: a */
    Response mo18643a(Uri uri, int i) throws IOException;

    void shutdown();
}
