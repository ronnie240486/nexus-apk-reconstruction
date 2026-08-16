package android.media.ViviTV.model.persistent;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import p000.C1091Qv;
import p000.C4875nU;
import p000.C5984j00;
import p000.C6082x00;
import p000.InterfaceC5617vr;

/* JADX INFO: loaded from: classes.dex */
public class LiveChannelInfo extends C4875nU implements Serializable {
    public static final int VIDEO_TYPE_FREE = 0;
    public static final int VIDEO_TYPE_VIP = 1;

    @SerializedName("area")
    private String area;

    @SerializedName(C5984j00.f14672z)
    private long duration;

    @SerializedName("epgId")
    private String epgId;

    @SerializedName("favorite")
    private int favorite;

    @SerializedName(C5984j00.f14664r)
    private String huibo;

    @SerializedName("icon")
    private String icon;

    @SerializedName("ChannelTypeId")
    private String itemId;

    @SerializedName("lastSource")
    private int lastSource;

    @SerializedName("Url")
    @InterfaceC5617vr
    private C1091Qv[] liveSources;

    @SerializedName("MultiLang")
    @InterfaceC5617vr
    private List<LiveChannelMultiLang> mLangItems;

    @SerializedName("Name")
    private String name;

    @SerializedName("ChannelNum")
    private int num;

    @SerializedName(C5984j00.f14665s)
    private String pinyin;

    @SerializedName("HuiKanUrl")
    private String playbackMetaUrl;

    @SerializedName("Quality")
    private String quality;

    @SerializedName("SortNum")
    private int sortNum;

    @SerializedName("urllist")
    private String sourceText;

    @SerializedName("StationLogo")
    private String stationLogo;

    @InterfaceC5617vr
    private String[] tId;

    @SerializedName("Id")
    private int vId;

    @SerializedName(C6082x00.f19360b)
    private int vipType;

    /* JADX WARN: Invalid debug info offset */
    public String getArea() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getEpgId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getFavorite() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getHuibo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getIcon() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getItemId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<LiveChannelMultiLang> getLangItems() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLastSource() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public C1091Qv[] getLiveSources() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getNum() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPinyin() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlaybackMetaUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getQuality() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSimpleNameNumInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSortNum() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSourceCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSourceText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSourceText(C1091Qv[] c1091QvArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public C1091Qv getSourceUrl(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getStationLogo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTidText(String[] strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVipType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String gettId(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String[] gettId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getvId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasSameSourceWith(LiveChannelInfo liveChannelInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isBelongsToType(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isFavorite() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isPlayingLastSource() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean lessThanOneSource() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setArea(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDuration(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEpgId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFavorite(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFavorite(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHuibo(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setIcon(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setItemId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLangItems(List<LiveChannelMultiLang> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastSource(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLiveSources(C1091Qv[] c1091QvArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNum(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPinyin(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlaybackMetaUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setQuality(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSortNum(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSourceText(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStationLogo(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVipType(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void settId(String[] strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setvId(int i) {
    }
}
