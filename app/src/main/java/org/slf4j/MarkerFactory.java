package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;

/* JADX INFO: loaded from: classes2.dex */
public class MarkerFactory {

    /* JADX INFO: renamed from: a */
    public static IMarkerFactory f17180a;

    static {
        try {
            f17180a = m25061a();
        } catch (Exception e) {
            Util.m25128d("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            f17180a = new BasicMarkerFactory();
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private MarkerFactory() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static IMarkerFactory m25061a() throws NoClassDefFoundError {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static Marker m25062b(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static IMarkerFactory m25063c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static Marker m25064d(String str) {
        return null;
    }
}
