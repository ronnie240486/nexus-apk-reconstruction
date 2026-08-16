package android.media.ViviTV.model.persistent;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import p000.C4875nU;
import p000.C6082x00;

/* JADX INFO: loaded from: classes.dex */
public class LiveTypeInfo extends C4875nU implements Serializable {

    @SerializedName("MultiLang")
    private List<LiveTypeMultiLang> mLangItems;

    @SerializedName("Password")
    private String password;

    @SerializedName("SortNum")
    private int sortNum;

    @SerializedName("Id")
    private String tId;

    @SerializedName("Name")
    private String tname;

    @SerializedName(C6082x00.f19360b)
    private int vipType;

    /* JADX WARN: Invalid debug info offset */
    public List<LiveTypeMultiLang> getLangItems() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPassword() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSortNum() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTname() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVipType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String gettId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isTidEqualsWith(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLangItems(List<LiveTypeMultiLang> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPassword(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSortNum(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTname(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVipType(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void settId(String str) {
    }
}
