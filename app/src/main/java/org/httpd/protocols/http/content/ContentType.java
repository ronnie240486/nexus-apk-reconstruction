package org.httpd.protocols.http.content;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ContentType {

    /* JADX INFO: renamed from: d */
    public static final Pattern f16974d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: e */
    public static final Pattern f16975e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: f */
    public static final Pattern f16976f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: a */
    public final String f16977a;

    /* JADX INFO: renamed from: b */
    public final String f16978b;

    /* JADX INFO: renamed from: c */
    public final String f16979c;

    /* JADX WARN: Invalid debug info offset */
    public ContentType(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public String m24905a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final String m24906b(String str, Pattern pattern, String str2, int i) {
        return null;
    }
}
