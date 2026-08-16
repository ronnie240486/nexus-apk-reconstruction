package org.intellij.lang.annotations;

/* JADX INFO: loaded from: classes2.dex */
class PrintFormatPattern {

    /* JADX INFO: renamed from: a */
    @Language("RegExp")
    public static final String f17008a = "(?:\\d+\\$)?";

    /* JADX INFO: renamed from: b */
    @Language("RegExp")
    public static final String f17009b = "(?:[-#+ 0,(<]*)?";

    /* JADX INFO: renamed from: c */
    @Language("RegExp")
    public static final String f17010c = "(?:\\d+)?";

    /* JADX INFO: renamed from: d */
    @Language("RegExp")
    public static final String f17011d = "(?:\\.\\d+)?";

    /* JADX INFO: renamed from: e */
    @Language("RegExp")
    public static final String f17012e = "(?:[tT])?(?:[a-zA-Z%])";

    /* JADX INFO: renamed from: f */
    @Language("RegExp")
    public static final String f17013f = "[^%]|%%";

    /* JADX INFO: renamed from: g */
    @Language("RegExp")
    public static final String f17014g = "(?:[^%]|%%|(?:%(?:\\d+\\$)?(?:[-#+ 0,(<]*)?(?:\\d+)?(?:\\.\\d+)?(?:[tT])?(?:[a-zA-Z%])))*";
}
