package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PdfiumCore {

    /* JADX INFO: renamed from: b */
    public static final String f12313b = "com.shockwave.pdfium.PdfiumCore";

    /* JADX INFO: renamed from: c */
    public static final Class f12314c = FileDescriptor.class;

    /* JADX INFO: renamed from: d */
    public static final String f12315d = "descriptor";

    /* JADX INFO: renamed from: e */
    public static final Object f12316e;

    /* JADX INFO: renamed from: f */
    public static Field f12317f;

    /* JADX INFO: renamed from: a */
    public int f12318a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e) {
            Log.e(f12313b, "Native libraries failed to load - " + e);
        }
        f12316e = new Object();
        f12317f = null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PdfiumCore(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0016
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: c */
    public static int m18525c(android.os.ParcelFileDescriptor r3) {
        /*
            r0 = 0
            return r0
        L14:
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18525c(android.os.ParcelFileDescriptor):int");
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native void nativeClosePages(long[] jArr);

    private native long nativeGetBookmarkDestIndex(long j, long j2);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j2);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j2);

    private native int nativeGetPageCount(long j);

    private native int nativeGetPageHeightPixel(long j, int i);

    private native int nativeGetPageHeightPoint(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i2);

    private native int nativeGetPageWidthPixel(long j, int i);

    private native int nativeGetPageWidthPoint(long j);

    private native Long nativeGetSiblingBookmark(long j, long j2);

    private native long nativeLoadPage(long j, int i);

    private native long[] nativeLoadPages(long j, int i, int i2);

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i2, int i3, int i4, int i5, double d, double d2);

    private native void nativeRenderPage(long j, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z);

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public void m18526a(com.shockwave.pdfium.C4033a r5) {
        /*
            r4 = this;
            return
        L29:
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18526a(com.shockwave.pdfium.a):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public com.shockwave.pdfium.C4033a.c m18527b(com.shockwave.pdfium.C4033a r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L5a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18527b(com.shockwave.pdfium.a):com.shockwave.pdfium.a$c");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public int m18528d(com.shockwave.pdfium.C4033a r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18528d(com.shockwave.pdfium.a):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public int m18529e(com.shockwave.pdfium.C4033a r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18529e(com.shockwave.pdfium.a, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public int m18530f(com.shockwave.pdfium.C4033a r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18530f(com.shockwave.pdfium.a, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public java.util.List<com.shockwave.pdfium.C4033a.b> m18531g(com.shockwave.pdfium.C4033a r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18531g(com.shockwave.pdfium.a, int):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public com.shockwave.pdfium.util.Size m18532h(com.shockwave.pdfium.C4033a r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18532h(com.shockwave.pdfium.a, int):com.shockwave.pdfium.util.Size");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public int m18533i(com.shockwave.pdfium.C4033a r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18533i(com.shockwave.pdfium.a, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public int m18534j(com.shockwave.pdfium.C4033a r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18534j(com.shockwave.pdfium.a, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public java.util.List<com.shockwave.pdfium.C4033a.a> m18535k(com.shockwave.pdfium.C4033a r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18535k(com.shockwave.pdfium.a):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public Point m18536l(C4033a c4033a, int i, int i2, int i3, int i4, int i5, int i6, double d, double d2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public RectF m18537m(C4033a c4033a, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public C4033a m18538n(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public com.shockwave.pdfium.C4033a m18539o(android.os.ParcelFileDescriptor r3, java.lang.String r4) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18539o(android.os.ParcelFileDescriptor, java.lang.String):com.shockwave.pdfium.a");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public C4033a m18540p(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public com.shockwave.pdfium.C4033a m18541q(byte[] r3, java.lang.String r4) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18541q(byte[], java.lang.String):com.shockwave.pdfium.a");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public long m18542r(com.shockwave.pdfium.C4033a r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18542r(com.shockwave.pdfium.a, int):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s */
    public long[] m18543s(com.shockwave.pdfium.C4033a r9, int r10, int r11) {
        /*
            r8 = this;
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18543s(com.shockwave.pdfium.a, int, int):long[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m18544t(List<C4033a.a> list, C4033a c4033a, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m18545u(C4033a c4033a, Surface surface, int i, int i2, int i3, int i4, int i5) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v */
    public void m18546v(com.shockwave.pdfium.C4033a r14, android.view.Surface r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r13 = this;
            return
        L27:
        L29:
        L2b:
        L2d:
        L30:
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18546v(com.shockwave.pdfium.a, android.view.Surface, int, int, int, int, int, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m18547w(C4033a c4033a, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: x */
    public void m18548x(com.shockwave.pdfium.C4033a r14, android.graphics.Bitmap r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r13 = this;
            return
        L27:
        L29:
        L2b:
        L2d:
        L30:
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.m18548x(com.shockwave.pdfium.a, android.graphics.Bitmap, int, int, int, int, int, boolean):void");
    }
}
