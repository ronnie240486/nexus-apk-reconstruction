package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class UrlConnectionDownloader implements Downloader {

    /* JADX INFO: renamed from: b */
    public static final String f12604b = "X-Android-Response-Source";

    /* JADX INFO: renamed from: c */
    public static volatile Object f12605c = null;

    /* JADX INFO: renamed from: e */
    public static final String f12607e = "only-if-cached,max-age=2147483647";

    /* JADX INFO: renamed from: a */
    public final Context f12609a;

    /* JADX INFO: renamed from: d */
    public static final Object f12606d = new Object();

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<StringBuilder> f12608f = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.UrlConnectionDownloader.1
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public StringBuilder m18818a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return null;
        }
    };

    public static class ResponseCacheIcs {
        /* JADX WARN: Invalid debug info offset */
        private ResponseCacheIcs() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static void m18819a(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static Object m18820b(Context context) throws IOException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public UrlConnectionDownloader(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static void m18816b(android.content.Context r2) {
        /*
            return
        L12:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.UrlConnectionDownloader.m18816b(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Downloader
    /* JADX INFO: renamed from: a */
    public Downloader.Response mo18643a(Uri uri, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public HttpURLConnection m18817c(Uri uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
    }
}
