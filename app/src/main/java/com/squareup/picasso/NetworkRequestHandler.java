package com.squareup.picasso;

import android.net.NetworkInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class NetworkRequestHandler extends RequestHandler {

    /* JADX INFO: renamed from: c */
    public static final int f12457c = 2;

    /* JADX INFO: renamed from: d */
    public static final String f12458d = "http";

    /* JADX INFO: renamed from: e */
    public static final String f12459e = "https";

    /* JADX INFO: renamed from: a */
    public final Downloader f12460a;

    /* JADX INFO: renamed from: b */
    public final Stats f12461b;

    public static class ContentLengthException extends IOException {
        /* JADX WARN: Invalid debug info offset */
        public ContentLengthException(String str) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public NetworkRequestHandler(Downloader downloader, Stats stats) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: c */
    public boolean mo9413c(Request request) {
        return false;
    }

    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: e */
    public int mo18660e() {
        return 2;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: f */
    public RequestHandler.Result mo9414f(Request request, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: h */
    public boolean mo18661h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: i */
    public boolean mo18662i() {
        return true;
    }
}
