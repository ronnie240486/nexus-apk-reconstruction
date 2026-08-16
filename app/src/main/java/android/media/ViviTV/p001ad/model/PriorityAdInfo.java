package android.media.ViviTV.p001ad.model;

import android.media.ViviTV.p001ad.view.PictureVideoAdView;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import java.text.SimpleDateFormat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PriorityAdInfo extends MultimediaAdInfo implements Comparable<PriorityAdInfo>, PictureVideoAdView.InterfaceC1938d {

    @JSONField(name = "EndTime")
    private String endTime;

    @JSONField(deserialize = false, serialize = false)
    private long endTimestamp;

    @JSONField(deserialize = false, serialize = false)
    private long instanceCreateTime;

    @JSONField(deserialize = false, serialize = false)
    private List<PriorityAdInfo> mergedList;

    @JSONField(name = "Level")
    private int priority;

    @JSONField(name = "ServerTime")
    private String serverTime;

    @JSONField(name = "StartTime")
    private String startTime;

    @JSONField(deserialize = false, serialize = false)
    private long startTimestamp;

    @JSONField(name = "InformType")
    private String type;

    @JSONField(deserialize = false, serialize = false)
    private Type typeEnum;
    private static final String FMT_STR = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat FMT = new SimpleDateFormat(FMT_STR);

    public enum Type {
        NONE("none", false),
        TEXT("urgentMsg", true),
        IMAGE("image", false),
        VIDEO("video", false);

        private boolean canMerged;
        private String strValue;

        Type(String str, boolean z) {
            this.strValue = str;
            this.canMerged = z;
        }

        public static Type from(String str) {
            for (Type type : values()) {
                if (type.strValue().equals(str)) {
                    return type;
                }
            }
            return NONE;
        }

        public boolean canMerged() {
            return this.canMerged;
        }

        public String strValue() {
            return this.strValue;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private final long parseToTimestamp(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.p001ad.model.PriorityAdInfo.parseToTimestamp(java.lang.String):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@NonNull PriorityAdInfo priorityAdInfo) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull PriorityAdInfo priorityAdInfo) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getEndTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getEndTimestamp() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getInstanceCreateTime() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<PriorityAdInfo> getMergedList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPriority() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getServerTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getStartTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getStartTimestamp() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.p001ad.view.PictureVideoAdView.InterfaceC1938d
    public String getTextAdItemContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.p001ad.view.PictureVideoAdView.InterfaceC1938d
    public int getTextAdItemDuration() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Type getTypeEnum() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndTimestamp(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInstanceCreateTime(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMergedList(List<PriorityAdInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPriority(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setServerTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartTimestamp(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setType(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTypeEnum(Type type) {
    }
}
