package org.bouncycastle.i18n;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MissingEntryException extends RuntimeException {
    private String debugMsg;
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;
    protected final String resource;

    /* JADX WARN: Invalid debug info offset */
    public MissingEntryException(String str, String str2, String str3, Locale locale, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MissingEntryException(String str, Throwable th, String str2, String str3, Locale locale, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ClassLoader getClassLoader() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDebugMsg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Locale getLocale() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getResource() {
        return null;
    }
}
