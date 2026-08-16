package org.slf4j;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class MDC {

    /* JADX INFO: renamed from: a */
    public static final String f17174a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: b */
    public static final String f17175b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* JADX INFO: renamed from: c */
    public static MDCAdapter f17176c;

    public static class MDCCloseable implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f17177a;

        /* JADX WARN: Invalid debug info offset */
        public MDCCloseable(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ MDCCloseable(String str, C50801 c50801) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    static {
        try {
            f17176c = m25047a();
        } catch (Exception e) {
            Util.m25128d("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f17176c = new NOPMDCAdapter();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            Util.m25127c("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            Util.m25127c("Defaulting to no-operation MDCAdapter implementation.");
            Util.m25127c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private MDC() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static MDCAdapter m25047a() throws NoClassDefFoundError {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m25048b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m25049c(String str) throws IllegalArgumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static Map<String, String> m25050d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static MDCAdapter m25051e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static void m25052f(String str, String str2) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static MDCCloseable m25053g(String str, String str2) throws IllegalArgumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static void m25054h(String str) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m25055i(Map<String, String> map) {
    }
}
