package com.squareup.picasso;

import android.content.Context;
import java.io.IOException;
import p000.C4525iC;

/* JADX INFO: loaded from: classes2.dex */
class MediaStoreRequestHandler extends ContentStreamRequestHandler {

    /* JADX INFO: renamed from: b */
    public static final String[] f12456b = {"orientation"};

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, C4525iC.f14486j),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaStoreRequestHandler(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static int m18658k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            return r0
        L1e:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.m18658k(android.content.ContentResolver, android.net.Uri):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static PicassoKind m18659l(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: c */
    public boolean mo9413c(Request request) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: f */
    public RequestHandler.Result mo9414f(Request request, int i) throws IOException {
        return null;
    }
}
