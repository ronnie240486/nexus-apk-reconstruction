package android.media.ViviTV.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LabelInfo implements Serializable {

    @SerializedName("bgImgUrl")
    private String bgImageUrl;

    @SerializedName("imgUrl")
    private String imageUrl;

    @SerializedName("labelID")
    private String labelId;

    @SerializedName("title")
    private String title;

    /* JADX INFO: renamed from: android.media.ViviTV.model.LabelInfo$a */
    public static class C2231a {

        /* JADX INFO: renamed from: a */
        @SerializedName("list")
        public List<LabelInfo> f8892a;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<LabelInfo> m13336a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13337b(List<LabelInfo> list) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public LabelInfo() {
    }

    /* JADX WARN: Invalid debug info offset */
    public LabelInfo(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LabelInfo(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String getBgImageUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getImageUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLabelId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTitle() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBgImageUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setImageUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLabelId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTitle(String str) {
    }
}
