package org.apache.commons.p013io;

import com.tencent.smtt.sdk.TbsListener;
import java.io.Serializable;
import org.apache.commons.p013io.input.XmlStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class ByteOrderMark implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15572c = 1;

    /* JADX INFO: renamed from: d */
    public static final ByteOrderMark f15573d = new ByteOrderMark("UTF-8", TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 187, 191);

    /* JADX INFO: renamed from: e */
    public static final ByteOrderMark f15574e = new ByteOrderMark(XmlStreamReader.f15875g, 254, 255);

    /* JADX INFO: renamed from: f */
    public static final ByteOrderMark f15575f = new ByteOrderMark("UTF-16LE", 255, 254);

    /* JADX INFO: renamed from: g */
    public static final ByteOrderMark f15576g = new ByteOrderMark(XmlStreamReader.f15877i, 0, 0, 254, 255);

    /* JADX INFO: renamed from: h */
    public static final ByteOrderMark f15577h = new ByteOrderMark(XmlStreamReader.f15878j, 255, 254, 0, 0);

    /* JADX INFO: renamed from: i */
    public static final char f15578i = 65279;

    /* JADX INFO: renamed from: a */
    public final String f15579a;

    /* JADX INFO: renamed from: b */
    public final int[] f15580b;

    /* JADX WARN: Invalid debug info offset */
    public ByteOrderMark(String str, int... iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m22796a(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public byte[] m22797b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public String m22798c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public int m22799d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
