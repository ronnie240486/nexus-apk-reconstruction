package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpDownloader implements Downloader {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f12462a;

    /* JADX WARN: Invalid debug info offset */
    public OkHttpDownloader(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OkHttpDownloader(Context context, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OkHttpDownloader(OkHttpClient okHttpClient) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OkHttpDownloader(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public OkHttpDownloader(java.io.File r3, long r4) {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttpDownloader.<init>(java.io.File, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static OkHttpClient m18663b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.Downloader
    /* JADX INFO: renamed from: a */
    public Downloader.Response mo18643a(Uri uri, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final OkHttpClient m18664c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        /*
            r1 = this;
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttpDownloader.shutdown():void");
    }
}
