package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.i18n.filter.Filter;

/* JADX INFO: loaded from: classes2.dex */
public class LocalizedMessage {
    public static final String DEFAULT_ENCODING = "ISO-8859-1";
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;

    /* JADX INFO: renamed from: id */
    protected final String f16361id;
    protected ClassLoader loader;
    protected final String resource;

    public class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected Object[] arguments;
        protected Filter filter;
        protected Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        final /* synthetic */ LocalizedMessage this$0;
        protected Object[] unpackedArgs;

        /* JADX WARN: Invalid debug info offset */
        public FilteredArguments(LocalizedMessage localizedMessage) {
        }

        /* JADX WARN: Invalid debug info offset */
        public FilteredArguments(LocalizedMessage localizedMessage, Object[] objArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        private Object filter(int i, Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object[] getArguments() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Filter getFilter() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object[] getFilteredArgs(Locale locale) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean isEmpty() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setFilter(Filter filter) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public LocalizedMessage(String str, String str2) throws NullPointerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LocalizedMessage(String str, String str2, String str3) throws UnsupportedEncodingException, NullPointerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LocalizedMessage(String str, String str2, String str3, Object[] objArr) throws UnsupportedEncodingException, NullPointerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public LocalizedMessage(String str, String str2, Object[] objArr) throws NullPointerException {
    }

    /* JADX WARN: Invalid debug info offset */
    public String addExtraArgs(String str, Locale locale) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String formatWithTimeZone(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object[] getArguments() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ClassLoader getClassLoader() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.String getEntry(java.lang.String r10, java.util.Locale r11, java.util.TimeZone r12) throws org.bouncycastle.i18n.MissingEntryException {
        /*
            r9 = this;
            r0 = 0
            return r0
        L18:
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.i18n.LocalizedMessage.getEntry(java.lang.String, java.util.Locale, java.util.TimeZone):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public Object[] getExtraArgs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Filter getFilter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getResource() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setClassLoader(ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtraArgument(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExtraArguments(Object[] objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFilter(Filter filter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
