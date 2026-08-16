package org.xutils.http.app;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.HashSet;
import org.json.JSONException;
import org.xutils.common.Callback;
import org.xutils.http.request.UriRequest;
import org.xutils.p022ex.HttpException;

/* JADX INFO: loaded from: classes.dex */
public class HttpRetryHandler {

    /* JADX INFO: renamed from: b */
    public static HashSet<Class<?>> f18160b;

    /* JADX INFO: renamed from: a */
    public int f18161a;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        f18160b = hashSet;
        hashSet.add(HttpException.class);
        f18160b.add(Callback.CancelledException.class);
        f18160b.add(MalformedURLException.class);
        f18160b.add(URISyntaxException.class);
        f18160b.add(NoRouteToHostException.class);
        f18160b.add(PortUnreachableException.class);
        f18160b.add(ProtocolException.class);
        f18160b.add(NullPointerException.class);
        f18160b.add(FileNotFoundException.class);
        f18160b.add(JSONException.class);
        f18160b.add(UnknownHostException.class);
        f18160b.add(IllegalArgumentException.class);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public boolean m27104a(UriRequest uriRequest, Throwable th, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m27105b(int i) {
    }
}
