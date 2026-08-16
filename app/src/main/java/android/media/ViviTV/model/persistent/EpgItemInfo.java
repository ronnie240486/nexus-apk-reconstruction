package android.media.ViviTV.model.persistent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import p000.C4875nU;
import p000.InterfaceC5617vr;

/* JADX INFO: loaded from: classes.dex */
public class EpgItemInfo extends C4875nU implements Serializable {
    private static Date NOT_SET = new Date(0);

    @SerializedName("cid")
    private String channelId;

    @InterfaceC5617vr
    private int endHour;

    @InterfaceC5617vr
    private String endTime;

    @SerializedName("id")
    private String infoId;

    @InterfaceC5617vr
    private boolean isPlaceholder;

    @SerializedName("nameMulLang")
    @InterfaceC5617vr
    private Map<String, String> nameMultiLang;

    @Expose(deserialize = false, serialize = false)
    private String nameMultiLangJson;

    @SerializedName("date")
    private String playDate;

    @InterfaceC5617vr
    private Date playDateTime;

    @InterfaceC5617vr
    private int playDayOfWeek;

    @InterfaceC5617vr
    private String playMonthDay;

    @SerializedName("time")
    private String playTime;

    @SerializedName("url")
    private String playUrl;

    @InterfaceC5617vr
    private String playUrlNextHour;

    @SerializedName("name")
    private String programName;

    @InterfaceC5617vr
    private int startHour;

    /* JADX WARN: Invalid debug info offset */
    public EpgItemInfo() {
    }

    /* JADX WARN: Invalid debug info offset */
    public EpgItemInfo(EpgItemInfo epgItemInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String getChannelId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getEndHour() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getEndTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getInfoId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Map<String, String> getNameMultiLang() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getNameMultiLangJson() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getPlayDateTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPlayDayOfWeek() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayMonthDay() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayUrlNextHour() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getProgramName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getProgramNameForLang(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getStartHour() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void initPlayDateTime() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void initPlayMonDayWeekByPlayDateTime(boolean r9) {
        /*
            r8 = this;
            return
        L55:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.model.persistent.EpgItemInfo.initPlayMonDayWeekByPlayDateTime(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isPlaceholder() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void parseNameMultipleLanguage() {
        /*
            r5 = this;
            return
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.model.persistent.EpgItemInfo.parseNameMultipleLanguage():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChannelId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndHour(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInfoId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNameMultiLang(Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNameMultiLangJson(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlaceholder(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayDate(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayDateTime(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayDayOfWeek(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayMonthDay(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayUrlNextHour(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgramName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartHour(int i) {
    }
}
