package p000;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: Yp */
/* JADX INFO: loaded from: classes2.dex */
public final class C1597Yp {

    /* JADX INFO: renamed from: a */
    public static final long f4018a = 253402300799999L;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<DateFormat> f4019b = new a();

    /* JADX INFO: renamed from: c */
    public static final String[] f4020c;

    /* JADX INFO: renamed from: d */
    public static final DateFormat[] f4021d;

    /* JADX INFO: renamed from: Yp$a */
    public class a extends ThreadLocal<DateFormat> {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public DateFormat m8239a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ DateFormat initialValue() {
            return null;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f4020c = strArr;
        f4021d = new DateFormat[strArr.length];
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m8237a(Date date) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0028
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static java.util.Date m8238b(java.lang.String r10) {
        /*
            r0 = 0
            return r0
        L45:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1597Yp.m8238b(java.lang.String):java.util.Date");
    }
}
