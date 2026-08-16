package info.guardianproject.netcipher.client;

import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class StrongConnectionBuilder extends StrongBuilderBase<StrongConnectionBuilder, HttpURLConnection> {
    private URL url;

    /* JADX WARN: Invalid debug info offset */
    public StrongConnectionBuilder(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StrongConnectionBuilder(StrongConnectionBuilder strongConnectionBuilder) {
    }

    /* JADX WARN: Invalid debug info offset */
    private HttpURLConnection buildForUrl(Intent intent, URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static StrongConnectionBuilder forMaxSecurity(Context context) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String slurp(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public /* bridge */ /* synthetic */ Object build(Intent intent) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilder
    public HttpURLConnection build(Intent intent) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public StrongConnectionBuilder connectTo(String str) throws MalformedURLException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public StrongConnectionBuilder connectTo(URL url) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // info.guardianproject.netcipher.client.StrongBuilderBase
    public /* bridge */ /* synthetic */ String get(Intent intent, HttpURLConnection httpURLConnection, String str) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public String get2(Intent intent, HttpURLConnection httpURLConnection, String str) throws Exception {
        return null;
    }
}
