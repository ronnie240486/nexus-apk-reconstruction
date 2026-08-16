package com.tencent.smtt.export.external;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class libwebp {
    private static final int BITMAP_ALPHA_8 = 1;
    private static final int BITMAP_ARGB_4444 = 3;
    private static final int BITMAP_ARGB_8888 = 4;
    private static final int BITMAP_RGB_565 = 2;
    private static final String LOGTAG = "[image]";
    private static boolean isMultiCore = false;
    private static libwebp mInstance = null;
    private static boolean mIsLoadLibSuccess = false;
    private static String mModle = "";
    private int mBitmapType;

    /* JADX INFO: renamed from: com.tencent.smtt.export.external.libwebp$1 */
    public static /* synthetic */ class C40581 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static int checkIsHuaModel() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.lang.String getCPUinfo() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.libwebp.getCPUinfo():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static libwebp getInstance(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isMultiCore() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void loadWepLibraryIfNeed(android.content.Context r1) {
        /*
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.libwebp.loadWepLibraryIfNeed(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void loadWepLibraryIfNeed(android.content.Context r0, java.lang.String r1) {
        /*
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.libwebp.loadWepLibraryIfNeed(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public int[] decodeBase(byte[] bArr, int[] iArr, int[] iArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int[] decodeBase_16bit(byte[] bArr, Bitmap.Config config) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int[] decodeInto(byte[] bArr, int[] iArr, int[] iArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getInfo(byte[] bArr, int[] iArr, int[] iArr2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int[] incDecode(byte[] bArr, int[] iArr, int[] iArr2) {
        return null;
    }

    public native int[] nativeDecode(byte[] bArr, boolean z, int[] iArr, int[] iArr2);

    public native int[] nativeDecodeInto(byte[] bArr, boolean z, int[] iArr, int[] iArr2);

    public native int[] nativeDecode_16bit(byte[] bArr, boolean z, int i);

    public native int nativeGetInfo(byte[] bArr, int[] iArr, int[] iArr2);

    public native int[] nativeIDecode(byte[] bArr, boolean z, int[] iArr, int[] iArr2);
}
