package tv.danmaku.ijk.media.player;

import android.media.MediaCodecInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static synchronized java.util.Map<java.lang.String, java.lang.Integer> getKnownCodecList() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.getKnownCodecList():java.util.Map");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getLevelName(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getProfileLevelName(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getProfileName(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0078
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(16)
    public static tv.danmaku.ijk.media.player.IjkMediaCodecInfo setupCandidate(android.media.MediaCodecInfo r3, java.lang.String r4) {
        /*
            r0 = 0
            return r0
        L80:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.setupCandidate(android.media.MediaCodecInfo, java.lang.String):tv.danmaku.ijk.media.player.IjkMediaCodecInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(16)
    public void dumpProfileLevels(java.lang.String r10) {
        /*
            r9 = this;
            return
        L3f:
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.IjkMediaCodecInfo.dumpProfileLevels(java.lang.String):void");
    }
}
