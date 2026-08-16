package org.videolan.libvlc.util;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class HWDecoderUtil {

    /* JADX INFO: renamed from: a */
    public static final DecoderBySOC[] f17680a;

    /* JADX INFO: renamed from: b */
    public static final DecoderBySOC[] f17681b;

    /* JADX INFO: renamed from: c */
    public static final AudioOutputBySOC[] f17682c;

    /* JADX INFO: renamed from: d */
    public static final HashMap<String, String> f17683d;

    public enum AudioOutput {
        OPENSLES,
        AUDIOTRACK,
        ALL
    }

    public static class AudioOutputBySOC {

        /* JADX INFO: renamed from: a */
        public final String f17684a;

        /* JADX INFO: renamed from: b */
        public final String f17685b;

        /* JADX INFO: renamed from: c */
        public final AudioOutput f17686c;

        /* JADX WARN: Invalid debug info offset */
        public AudioOutputBySOC(String str, String str2, AudioOutput audioOutput) {
        }
    }

    public enum Decoder {
        UNKNOWN,
        NONE,
        OMX,
        MEDIACODEC,
        ALL
    }

    public static class DecoderBySOC {

        /* JADX INFO: renamed from: a */
        public final String f17687a;

        /* JADX INFO: renamed from: b */
        public final String f17688b;

        /* JADX INFO: renamed from: c */
        public final Decoder f17689c;

        /* JADX WARN: Invalid debug info offset */
        public DecoderBySOC(String str, String str2, Decoder decoder) {
        }
    }

    static {
        Decoder decoder = Decoder.NONE;
        f17680a = new DecoderBySOC[]{new DecoderBySOC("ro.product.board", "MSM8225", decoder), new DecoderBySOC("ro.product.board", "hawaii", decoder)};
        DecoderBySOC decoderBySOC = new DecoderBySOC("ro.product.brand", "SEMC", decoder);
        DecoderBySOC decoderBySOC2 = new DecoderBySOC("ro.board.platform", "msm7627", decoder);
        Decoder decoder2 = Decoder.MEDIACODEC;
        DecoderBySOC decoderBySOC3 = new DecoderBySOC("ro.product.brand", "Amazon", decoder2);
        Decoder decoder3 = Decoder.OMX;
        DecoderBySOC decoderBySOC4 = new DecoderBySOC("ro.board.platform", "omap3", decoder3);
        DecoderBySOC decoderBySOC5 = new DecoderBySOC("ro.board.platform", "rockchip", decoder3);
        DecoderBySOC decoderBySOC6 = new DecoderBySOC("ro.board.platform", "rk29", decoder3);
        DecoderBySOC decoderBySOC7 = new DecoderBySOC("ro.board.platform", "msm7630", decoder3);
        DecoderBySOC decoderBySOC8 = new DecoderBySOC("ro.board.platform", "s5pc", decoder3);
        DecoderBySOC decoderBySOC9 = new DecoderBySOC("ro.board.platform", "montblanc", decoder3);
        DecoderBySOC decoderBySOC10 = new DecoderBySOC("ro.board.platform", "exdroid", decoder3);
        DecoderBySOC decoderBySOC11 = new DecoderBySOC("ro.board.platform", "sun6i", decoder3);
        DecoderBySOC decoderBySOC12 = new DecoderBySOC("ro.board.platform", "exynos4", decoder2);
        Decoder decoder4 = Decoder.ALL;
        f17681b = new DecoderBySOC[]{decoderBySOC, decoderBySOC2, decoderBySOC3, decoderBySOC4, decoderBySOC5, decoderBySOC6, decoderBySOC7, decoderBySOC8, decoderBySOC9, decoderBySOC10, decoderBySOC11, decoderBySOC12, new DecoderBySOC("ro.board.platform", "omap4", decoder4), new DecoderBySOC("ro.board.platform", "tegra", decoder4), new DecoderBySOC("ro.board.platform", "tegra3", decoder4), new DecoderBySOC("ro.board.platform", "msm8660", decoder4), new DecoderBySOC("ro.board.platform", "exynos5", decoder4), new DecoderBySOC("ro.board.platform", "rk30", decoder4), new DecoderBySOC("ro.board.platform", "rk31", decoder4), new DecoderBySOC("ro.board.platform", "mv88de3100", decoder4), new DecoderBySOC("ro.hardware", "mt83", decoder4)};
        AudioOutput audioOutput = AudioOutput.OPENSLES;
        f17682c = new AudioOutputBySOC[]{new AudioOutputBySOC("ro.product.brand", "Amazon", audioOutput), new AudioOutputBySOC("ro.product.manufacturer", "Amazon", audioOutput)};
        f17683d = new HashMap<>();
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static AudioOutput m25548a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static Decoder m25549b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static java.lang.String m25550c(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            return r0
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.HWDecoderUtil.m25550c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static String m25551d(String str) {
        return null;
    }
}
